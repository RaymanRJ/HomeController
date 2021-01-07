# pi-controller #

Controls peripherals around the house.

## Responsibilities ##

1. Control WS2812B LED Strips (addressable).
2. Control attached camera.
3. Take commands from RestAPI (through Kafka) and act on them.
4. Constantly provide heartbeats to ensure it is still operational (1 every 15 minutes).

## Run ##

To build the project, you must create the jar file:

`sbt assembly` 

When running the project, it's responsibility must be passed as a command line arg:

`java -jar PiController LED_CONTROLLER`
