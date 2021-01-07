# HomeController
Personal project to control peripherals and provide services around my house.


## Project Breakdown ##

### [web-server](https://github.com/RaymanRJ/HomeController/tree/development/src/web-server) ###

This is the backend and main controller of all services. It is a RestAPI built with Flask that can be accessed from within my LAN. It faciliates communication between the [frontend](https://github.com/RaymanRJ/HomeController/tree/development/src/frontend),
database, and [peripherals](https://github.com/RaymanRJ/HomeController/tree/development/src/pi-controller).

### [pi-controller](https://github.com/RaymanRJ/HomeController/tree/development/src/pi-controller) ###

This is the controller for periphrerals being used. It communicates directly with the web-server project through Kafka messages. At the moment, it controls [WS2812B LED strips](https://www.btf-lighting.com/collections/pixels-led-strip-1/products/ws2812b-led-pixel-strip-30-60-74-96-100-144-pixels-leds-m),
but there are future plans to also have it control a camera to take pictures of an outdoor scene at scheduled intervals.

### [frontend](https://github.com/RaymanRJ/HomeController/tree/development/src/frontend) ###

A simple front end build using React. This will be able to communicate with the actual internet and act as the go-between with external calls and the internal web-server.
This will probably be the last thing to get built cause .. frontend.
