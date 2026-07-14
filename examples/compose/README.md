# DSF Process Plugin Tutorial
This repository contains scripts to generate a test environment for the Data Sharing Process and Transit plugins.
The main documentation for the DSF can be found under [dsf.dev](https://dsf.dev).

## Prerequisites
In order to be able to compile this tutorial a software development environment with GIT, 
Java 17, Maven 3.8, Docker, Docker-Compose, a Java IDE like Eclipse or IntelliJ, 
Camunda Modeler as a BPMN Editor and a minimum of 16GB of RAM is needed. 

# Development using Docker Setup

Build the project from the root directory of this repository by executing the following command.
This will create the necessary certificates.
```sh
mvn clean package
```

Add entries to your hosts file
```
127.0.0.1	cos
127.0.0.1	dic
127.0.0.1	hrp
```

The following plugins are necessary to test the Transit process and can be downloaded from the following links:

Transit
https://github.com/medizininformatik-initiative/dsf-plugin-transit-dmu/releases/download/v1.0.0.2/mii-transit-dmst-1.0.0.2.jar

Store Controller
https://github.com/medizininformatik-initiative/dsf-plugin-transit-fhirstorecontroller/releases/download/v1.0.0.3/mii-store-controller-1.0.0.3.jar

Data Sharing
https://github.com/medizininformatik-initiative/mii-process-data-sharing/releases/download/v1.1.0.0/mii-process-data-sharing-1.1.0.0.jar

After downloading they have to be copied into the bpe/process folder of each role.

HRP
Data Sharing

DMS
Data Sharing<br />
Store Controller<br />
Transit<br />

DIC
Data Sharing

