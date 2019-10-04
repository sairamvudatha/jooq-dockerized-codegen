# jooq-dockerized-codegen
Maven project for jOOQ code generation using docker containers

We use [mysql docker image](https://hub.docker.com/_/mysql), [maven docker image](https://hub.docker.com/_/maven), [flyway-maven-plugin](https://flywaydb.org/documentation/maven/), [jooq-codegen-maven](https://www.jooq.org/doc/3.12/manual/code-generation/codegen-maven/) and [docker-maven-plugin](https://github.com/fabric8io/docker-maven-plugin) to generate jOOQ code off of docker images.

# What?
First we spin up mysql container followed by maven container. Inside the maven container we apply schema migrations to mysql container using flyway-maven-plugin. And generate the jOOQ code off of the mysql container using jooq-codegen-maven. docker-maven-plugin is used to orchestrate the containers.

# How to?
## add schema migrations
Add a new schema file to `src/main/resources/db/migrations`. After adding new schema migration we should re-generate jOOQ models.

## generate jOOQ code
`mvn generate-sources -Pgenerate_models` to generate jOOQ code on demand. We can see the generate code under `src/main/java/com/sairam/books/internal/access/models/jooq/`

# Prerequisites
Needless to mention but we need java and maven installed. Also docker should be running. (Ex: [Docker Desktop](https://docs.docker.com/docker-for-mac/install/))
