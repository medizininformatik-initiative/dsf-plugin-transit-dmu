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
        String rawTask = """
                {
                  "resourceType": "Task",
                  "meta": {
                    "profile": [
                      "http://datamanagementunit.eu/fhir/StructureDefinition/task-created-store"
                    ],
                    "tag": [
                      {
                        "system": "http://dsf.dev/fhir/CodeSystem/read-access-tag",
                        "code": "ALL"
                      }
                    ]
                  },
                  "instantiatesCanonical": "http://datamanagementunit.eu/bpe/Process/storeControllerCreate|1.0.0",
                  "status": "requested",
                  "intent": "order",
                  "authoredOn": "2025-11-10T10:00:00Z",
                  "requester": {
                    "identifier": {
                      "system": "http://example.org/fhir/organization-identifier",
                      "value": "DMU"
                    },
                    "display": "Data Management Unit"
                  },
                  "input": [
                    {
                      "type": {
                        "text": "message-name"
                      },
                      "valueString": "createdStore"
                    },
                    {
                      "type": {
                        "text": "business-key"
                      },
                      "valueString": "store-create-12345"
                    },
                    {
                      "type": {
                        "coding": [
                          {
                            "system": "http://medizininformatik-initiative.de/fhir/CodeSystem/data-sharing",
                            "code": "project-identifier",
                            "display": "Project Identifier"
                          }
                        ]
                      },
                      "valueIdentifier": {
                        "system": "http://medizininformatik-initiative.de/sid/project-identifier",
                        "value": "MI-I-DEMO-PROJECT"
                      }
                    },
                    {
                      "type": {
                        "coding": [
                          {
                            "system": "http://datamanagementunit.eu/fhir/CodeSystem/dmu-tools",
                            "code": "store-url",
                            "display": "Store URL"
                          }
                        ]
                      },
                      "valueUrl": "https://datamanagementunit.eu/store/created/12345"
                    }
                  ]
                }""";

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
        String rawTask = """
                {
                  "resourceType": "Task",
                  "meta": {
                    "profile": [
                      "http://datamanagementunit.eu/fhir/StructureDefinition/task-inbox-data-set"
                    ],
                    "tag": [
                      {
                        "system": "http://dsf.dev/fhir/CodeSystem/read-access-tag",
                        "code": "ALL"
                      }
                    ]
                  },
                  "instantiatesCanonical": "http://datamanagementunit.eu/bpe/Process/transit|1.0.0",
                  "status": "in-progress",
                  "intent": "order",
                  "authoredOn": "2025-11-10T10:30:00Z",
                  "requester": {
                    "identifier": {
                      "system": "http://example.org/fhir/organization-identifier",
                      "value": "DMU"
                    },
                    "display": "Data Management Unit"
                  },
                  "input": [
                    {
                      "type": {
                        "text": "message-name"
                      },
                      "valueString": "inboxDataSet"
                    },
                    {
                      "type": {
                        "text": "business-key"
                      },
                      "valueString": "transit-dataset-7890"
                    },
                    {
                      "type": {
                        "text": "correlation-key"
                      },
                      "valueString": "corr-456"
                    },
                    {
                      "type": {
                        "coding": [
                          {
                            "system": "http://datamanagementunit.eu/fhir/CodeSystem/data-sharing",
                            "code": "data-set-reference",
                            "display": "Data Set Reference"
                          }
                        ]
                      },
                      "valueReference": {
                        "reference": "Binary/1234",
                        "type": "Binary",
                        "display": "Incoming data set file"
                      }
                    }
                  ],
                  "output": [
                    {
                      "extension": [
                        {
                          "url": "http://datamanagementunit.eu/fhir/StructureDefinition/extension-data-set-status-error",
                          "extension": [
                            {
                              "url": "errorCode",
                              "valueCode": "none"
                            },
                            {
                              "url": "errorMessage",
                              "valueString": "No errors detected"
                            }
                          ]
                        }
                      ],
                      "type": {
                        "coding": [
                          {
                            "system": "http://datamanagementunit.eu/fhir/CodeSystem/data-sharing",
                            "code": "data-set-status",
                            "display": "Data Set Status"
                          }
                        ]
                      },
                      "valueCoding": {
                        "system": "http://datamanagementunit.eu/fhir/CodeSystem/data-set-status",
                        "code": "received",
                        "display": "Data set received successfully"
                      }
                    }
                  ]
                }""";

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
