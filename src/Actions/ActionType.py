from enum import Enum


class ActionType(Enum):
    START_LED_SEQUENCE = 1
    STOP_LED_SEQUENCE = 2
    START_HEARTBEAT = 3
    STOP_HEARTBEAT = 4
    START_FILE_UPLOAD = 5
