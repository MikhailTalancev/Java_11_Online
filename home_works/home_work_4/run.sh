#!/bin/sh

echo Clear project
mvn clean
echo Start generation jar
mvn package
echo Run program
java -jar target/home_work_4.jar