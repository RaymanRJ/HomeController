# web-server #

RestAPI built using Flask. It provides a central point of communication between all other services.


## Responsibilities ##

1. Receives requests for information from front-end and responds accordingly.
2. Receives requests for information from Android App and responds accordingly.
3. Monitors peripheral devices using a heartbeat system, and pings me if something goes down.
4. Provides database access to front-end and peripheral devices.

## Run ##

To start the RestAPI:
`python3 Main.py`
