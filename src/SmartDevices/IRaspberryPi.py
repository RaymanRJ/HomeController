from queue import Queue

from src.SmartDevices.INetworkDevice import INetworkDevice


class IRaspberryPi(INetworkDevice):

    __actions: Queue = Queue()

    def __init__(self, ip_address: str, port: int = 22):
        super().__init__(ip_address=ip_address, port=port)

