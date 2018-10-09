# Evaluating Micronaut as framework for containerized microservices

## Contents

- Micronaut hello-world web app
- Dockerfile to build Docker container
- docker-compose.yml to test app locally 

## Goals

- Evaluate Micronaut Java microframework
- Assess Micronaut performance
- Observe container size

## Observations so far

- Everything just worked as advertised
- JAR file is 11MB, which feels efficient, but the final container (based on the java:8 Docker image) is 655MB.
- Azure Web App for Containers makes it trivially easy to get a containerized web app up and running on a public end point

## Process

- Cloned Micronaut
- Built from source (https://docs.micronaut.io/latest/guide/index.html#buildSource)
- Used CLI to instantiate empty project, add "Hello World" functionality, and build a JAR file(https://docs.micronaut.io/latest/guide/index.html#buildSource)
- Built the Docker files (currently requires jar file to be copied to `docker` directory)
- Uploaded the container to Docker Hub
- Deployed the container in an Azure Web App for Containers
- Tested the resulting web app