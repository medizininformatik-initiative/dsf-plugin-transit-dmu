package de.fraunhofer.isst.health.transit.fhir;

import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Task;
import org.hl7.fhir.r4.model.UrlType;
import org.junit.Test;

import java.util.List;

public class ReadStoreUrlTest {

    @Test
    public void readStoreValues() {
        String rawTask = "{\n" +
                "  \"resourceType\": \"Task\",\n" +
                "  \"meta\": {\n" +
                "    \"profile\": [\n" +
                "      \"http://datamanagementunit.eu/fhir/StructureDefinition/task-created-store\"\n" +
                "    ],\n" +
                "    \"tag\": [\n" +
                "      {\n" +
                "        \"system\": \"http://dsf.dev/fhir/CodeSystem/read-access-tag\",\n" +
                "        \"code\": \"ALL\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"instantiatesCanonical\": \"http://datamanagementunit.eu/bpe/Process/storeControllerCreate|1.0.0\",\n" +
                "  \"status\": \"requested\",\n" +
                "  \"intent\": \"order\",\n" +
                "  \"authoredOn\": \"2025-11-10T10:00:00Z\",\n" +
                "  \"requester\": {\n" +
                "    \"identifier\": {\n" +
                "      \"system\": \"http://example.org/fhir/organization-identifier\",\n" +
                "      \"value\": \"DMU\"\n" +
                "    },\n" +
                "    \"display\": \"Data Management Unit\"\n" +
                "  },\n" +
                "  \"input\": [\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"text\": \"message-name\"\n" +
                "      },\n" +
                "      \"valueString\": \"createdStore\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"text\": \"business-key\"\n" +
                "      },\n" +
                "      \"valueString\": \"store-create-12345\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://medizininformatik-initiative.de/fhir/CodeSystem/data-sharing\",\n" +
                "            \"code\": \"project-identifier\",\n" +
                "            \"display\": \"Project Identifier\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"valueIdentifier\": {\n" +
                "        \"system\": \"http://medizininformatik-initiative.de/sid/project-identifier\",\n" +
                "        \"value\": \"MI-I-DEMO-PROJECT\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://datamanagementunit.eu/fhir/CodeSystem/dmu-tools\",\n" +
                "            \"code\": \"store-url\",\n" +
                "            \"display\": \"Store URL\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"valueUrl\": \"https://datamanagementunit.eu/store/created/12345\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        String SYSTEM = "http://datamanagementunit.eu/fhir/CodeSystem/dmu-tools";
        String CODE = "store-url";

        Task task = FhirContext.forR4().newJsonParser().parseResource(Task.class, rawTask);

        List<Task.ParameterComponent> params = task.getInput();

        for (Task.ParameterComponent param : params) {
            if (!param.isEmpty() && param.getType().hasCoding(SYSTEM, CODE)) {
                UrlType urlType = ((UrlType) param.getValue());
                System.out.println(urlType.getValue());
                return;
            }
        }

    }

    @Test
    public void readDataValues() {
        String rawTask = "{\n" +
                "  \"resourceType\": \"Task\",\n" +
                "  \"meta\": {\n" +
                "    \"profile\": [\n" +
                "      \"http://datamanagementunit.eu/fhir/StructureDefinition/task-inbox-data-set\"\n" +
                "    ],\n" +
                "    \"tag\": [\n" +
                "      {\n" +
                "        \"system\": \"http://dsf.dev/fhir/CodeSystem/read-access-tag\",\n" +
                "        \"code\": \"ALL\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"instantiatesCanonical\": \"http://datamanagementunit.eu/bpe/Process/transit|1.0.0\",\n" +
                "  \"status\": \"in-progress\",\n" +
                "  \"intent\": \"order\",\n" +
                "  \"authoredOn\": \"2025-11-10T10:30:00Z\",\n" +
                "  \"requester\": {\n" +
                "    \"identifier\": {\n" +
                "      \"system\": \"http://example.org/fhir/organization-identifier\",\n" +
                "      \"value\": \"DMU\"\n" +
                "    },\n" +
                "    \"display\": \"Data Management Unit\"\n" +
                "  },\n" +
                "  \"input\": [\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"text\": \"message-name\"\n" +
                "      },\n" +
                "      \"valueString\": \"inboxDataSet\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"text\": \"business-key\"\n" +
                "      },\n" +
                "      \"valueString\": \"transit-dataset-7890\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"text\": \"correlation-key\"\n" +
                "      },\n" +
                "      \"valueString\": \"corr-456\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"type\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://datamanagementunit.eu/fhir/CodeSystem/data-sharing\",\n" +
                "            \"code\": \"data-set-reference\",\n" +
                "            \"display\": \"Data Set Reference\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"valueReference\": {\n" +
                "        \"reference\": \"Binary/1234\",\n" +
                "        \"type\": \"Binary\",\n" +
                "        \"display\": \"Incoming data set file\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"output\": [\n" +
                "    {\n" +
                "      \"extension\": [\n" +
                "        {\n" +
                "          \"url\": \"http://datamanagementunit.eu/fhir/StructureDefinition/extension-data-set-status-error\",\n" +
                "          \"extension\": [\n" +
                "            {\n" +
                "              \"url\": \"errorCode\",\n" +
                "              \"valueCode\": \"none\"\n" +
                "            },\n" +
                "            {\n" +
                "              \"url\": \"errorMessage\",\n" +
                "              \"valueString\": \"No errors detected\"\n" +
                "            }\n" +
                "          ]\n" +
                "        }\n" +
                "      ],\n" +
                "      \"type\": {\n" +
                "        \"coding\": [\n" +
                "          {\n" +
                "            \"system\": \"http://datamanagementunit.eu/fhir/CodeSystem/data-sharing\",\n" +
                "            \"code\": \"data-set-status\",\n" +
                "            \"display\": \"Data Set Status\"\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      \"valueCoding\": {\n" +
                "        \"system\": \"http://datamanagementunit.eu/fhir/CodeSystem/data-set-status\",\n" +
                "        \"code\": \"received\",\n" +
                "        \"display\": \"Data set received successfully\"\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        String SYSTEM = "http://datamanagementunit.eu/fhir/CodeSystem/data-sharing";
        String CODE = "data-set-reference";

        Task task = FhirContext.forR4().newJsonParser().parseResource(Task.class, rawTask);

        List<Task.ParameterComponent> params = task.getInput();

        for (Task.ParameterComponent param : params) {
            if (!param.isEmpty() && param.getType().hasCoding(SYSTEM, CODE)) {
                Reference dataRef = ((Reference) param.getValue());
                System.out.println(dataRef.getType());
                System.out.println(dataRef.getReference());
                System.out.println(dataRef.getReference().substring(dataRef.getReference().indexOf("/") + 1));
                return;
            }
        }
    }

}
