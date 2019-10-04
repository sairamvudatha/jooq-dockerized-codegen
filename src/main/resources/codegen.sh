#!/bin/sh
echo 'Beginning flyway migrations'

project_root_dir=$1 # The root directory of the project

cd $project_root_dir

mvn org.flywaydb:flyway-maven-plugin:migrate -Pjooq_codegen

echo 'Starting jOOQ code generation'

mvn org.jooq:jooq-codegen-maven:generate -Pjooq_codegen

echo 'jOOQ code generation Completed'
