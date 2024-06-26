#!/bin/sh

echo Start compilation
javac -d build/classes -sourcepath src/ -cp ./libs/commons-lang3-3.14.0.jar src/ua/com/alevel/StartProject.java
echo Finish compilation
echo Start build jar
mkdir build/jar
jar -cfvm build/jar/print_lib.jar resources/MANIFEST.MF -C build/classes .
echo Finish build jar
echo Start Programm
java -jar build/jar/print_lib.jar