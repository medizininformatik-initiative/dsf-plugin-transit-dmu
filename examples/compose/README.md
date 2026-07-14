# DSF Process Plugin Tutorial
This repository contains scripts to generate a test environment for the Data Sharing Process and Transit plugins.
The main documentation for the DSF can be found under [dsf.dev](https://dsf.dev).

## Prerequisites
In order to be able to compile this tutorial a software development environment with GIT, 
Java 17, Maven 3.8, Docker, Docker-Compose, a Java IDE like Eclipse or IntelliJ, 
Camunda Modeler as a BPMN Editor and a minimum of 16GB of RAM is needed. 

# Development using Docker Setup

Build the project from the root directory of this repository by executing the following command.

```sh
mvn clean package
```

Add entries to your hosts file
```
127.0.0.1	cos
127.0.0.1	dic
127.0.0.1	hrp
```
