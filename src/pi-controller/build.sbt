name := "PiController"

version := "0.1"

scalaVersion := "2.13.3"
libraryDependencies += "com.pi4j" % "pi4j-core" % "1.1"
unmanagedJars in Compile += file("lib/pi-ws2812-1.0-SNAPSHOT.jar")