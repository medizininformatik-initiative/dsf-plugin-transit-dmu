package de.fraunhofer.isst.health.transit.utils;

import de.fraunhofer.isst.health.transit.utils.gpas.GpasManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainConfig;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainInDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainOutDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.GetOrCreatePseudonymForListResponse;
import org.apache.commons.codec.digest.DigestUtils;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Property;
import org.hl7.fhir.r4.model.StringType;

import java.util.List;

public class HashIDsUtil {

    private static final int SALT_LENGTH = 64;
    private static final String SALT_DOMAIN_NAME = "SALT_DOMAIN";

    public static void hashIDs(Bundle bundleObject, String salt) {

        //Iterate over all entries of inner Bundle
        for (int i = 0; i < bundleObject.getEntry().size(); i++) {

            //Check entry for ID
            if (bundleObject.getEntry().get(i).getResource().hasId()) {
                //Hash ID
                bundleObject.getEntry().get(i).getResource().setId(
                        DigestUtils.sha3_256Hex(
                                bundleObject.getEntry().get(i).getResource().getIdElement().getIdPart() + salt));
            }

            //Check for fullURL
            if (bundleObject.getEntry().get(i).hasFullUrl()) {
                //Hash fullUrl
                String[] fullUrlSplit = bundleObject.getEntry().get(i).getFullUrl().split("/");
                String fullUrl = fullUrlSplit[0] + "/" + DigestUtils.sha3_256Hex(fullUrlSplit[1] + salt);

                //Update fullUrl
                bundleObject.getEntry().get(i).setFullUrl(fullUrl);
            }

            //Hash References
            searchForReference(bundleObject.getEntry().get(i).getResource().children(), salt);

            //Hash PUT-Requests if Bundle
            if (bundleObject.getEntry().get(i).getRequest().getMethod() == Bundle.HTTPVerb.PUT) {

                String[] urlSplit = bundleObject.getEntry().get(i).getRequest().getUrl().split("/");
                String ref = urlSplit[0] + "/" + DigestUtils.sha3_256Hex(urlSplit[1] + salt);
                bundleObject.getEntry().get(i).getRequest().setUrl(ref);
            }

        }
    }

    //Recursive function to find all filled references of a FHIR-Resource
    private static void searchForReference(List<Property> values, String salt) {

        for (Property value : values) {
            if (value.hasValues() && value.getTypeCode().startsWith("Reference")) {

                //Check that Reference is not via Identifier
                if (value.getValues().get(0).getChildByName("reference").hasValues()) {
                    String ref = value.getValues().get(0)
                            .getChildByName("reference").getValues().get(0).toString();

                    String[] refSplit = ref.split("/");
                    ref = refSplit[0] + "/" + DigestUtils.sha3_256Hex(refSplit[1] + salt);

                    value.getValues().get(0)
                            .setProperty("reference", new StringType(ref));
                }
            } else if (value.hasValues()) {
                for (int j = 0; j < value.getValues().size(); j++) {
                    searchForReference(value.getValues().get(j).children(), salt);
                }
            }
        }
    }

    public static String getOrCreateSaltString(String dupId) {
        GpasManager gpasManager = new GpasManager();

        //Check if Domain exists
        DomainOutDTO domainOut = gpasManager.getDomain(SALT_DOMAIN_NAME);

        //Create Domain if not already existing
        if  (domainOut == null) {
            DomainInDTO domainInDTO = new DomainInDTO();

            DomainConfig domainConfig = new DomainConfig();
            domainConfig.setPsnLength(SALT_LENGTH);
            domainConfig.setIncludePrefixInCheckDigitCalculation(false);
            domainConfig.setIncludeSuffixInCheckDigitCalculation(false);
            domainConfig.setMaxDetectedErrors(1);
            domainConfig.setPsnsDeletable(true);
            domainConfig.setUseLastCharAsDelimiterAfterXChars(0);
            domainConfig.setSendNotificationsWeb(false);

            domainInDTO.setAlphabet("org.emau.icmvc.ganimed.ttp.psn.alphabets.Symbol32");
            domainInDTO.setCheckDigitClass("org.emau.icmvc.ganimed.ttp.psn.generator.HammingCode");
            domainInDTO.setName(SALT_DOMAIN_NAME);
            domainInDTO.setLabel(SALT_DOMAIN_NAME);
            domainInDTO.setConfig(domainConfig);

            gpasManager.createDomain(domainInDTO);
        }

        //Create or Get Salt-String for dupId
        List<GetOrCreatePseudonymForListResponse.Return.Entry> saltStringList =
                gpasManager.getOrCreatePseudonymForList(List.of(dupId), SALT_DOMAIN_NAME);

        //Check if Salt-String is available
        if (saltStringList.isEmpty()) {
            throw new RuntimeException("Could not GET or CREATE a alt string!");
        } else {
            return saltStringList.get(0).getValue();
        }
    }

}
