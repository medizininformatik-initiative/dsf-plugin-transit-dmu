package de.fraunhofer.isst.health.transit.utils;

import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import org.hl7.fhir.r4.model.*;

import java.util.Optional;
import java.util.logging.Logger;

public class InboxManager {
    private static final Logger LOGGER = Logger.getLogger(InboxManager.class.getName());

    public void deleteFromInbox(ProcessPluginApi api, DocumentReference documentReference, String inboxUrl){

        deleteAttachments(api, documentReference);
        DsfClient client = api.getDsfClientProvider().getByEndpointUrl(inboxUrl);
        client.delete(DocumentReference.class, documentReference.getIdPart());

    }

    private void deleteAttachments(ProcessPluginApi api, DocumentReference documentReference)
    {
        documentReference.getContent().stream()
                .filter(DocumentReference.DocumentReferenceContentComponent::hasAttachment)
                .map(DocumentReference.DocumentReferenceContentComponent::getAttachment)
                .filter(Attachment::hasUrl)
                .forEach(attachment -> deleteAttachment(api, attachment));
    }

    private void deleteAttachment(ProcessPluginApi api, Attachment attachment)
    {
        IdType attachmentId = new IdType(attachment.getUrl());

        DsfClient client = api.getDsfClientProvider().getByEndpointUrl(attachmentId.getBaseUrl());

        String mimetype = getAttachmentMimeType(attachment);
        if (!isMimetypeFhir(mimetype))
        {
            client.delete(Binary.class, attachmentId.getIdPart());
        }
        else
        {
            client.delete(Bundle.class, attachmentId.getIdPart());
        }
    }

    private String getAttachmentMimeType(Attachment attachment)
    {
        return Optional.of(attachment).filter(Attachment::hasContentType).map(Attachment::getContentType)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Could not find any attachment contentType (mimeType) in DocumentReference"));
    }

    private boolean isMimetypeFhir(String mimetype)
    {
        return "application/fhir+xml".equals(mimetype) || "application/fhir+json".equals(mimetype);
    }
}
