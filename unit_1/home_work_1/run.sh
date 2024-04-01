#!/bin/sh

echo Start compilation
javac -d build/classes -sourcepath src/ -cp ./libs/commons-lang3-3.14.0.jar src/ua/com/alevel/StartProject.java
echo Finish compilation
echo Start Programm
java -cp build/classes/:./libs/commons-lang3-3.14.0.jar ua.com.alevel.StartProject