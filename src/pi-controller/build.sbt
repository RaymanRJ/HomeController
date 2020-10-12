name := "PiController"

version := "0.1"

scalaVersion := "2.13.3"
unmanagedJars in Compile += file("lib/pi-ws2812-1.0-SNAPSHOT.jar")
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.13.3"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.13.3"