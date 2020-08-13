from abc import ABC

from src.SmartDevices.INetworkDevice import INetworkDevice


class ISSHConnection(ABC, INetworkDevice):
    """Used as an Interface for SSH-able devices. Doubt this will actually be used."""

    __username: str
    __password: str

    def __init__(self, username: str, password: str, ip_address: str, port: int = 22):
        self.__username = username
        self.__password = password
        super().__init__(ip_address=ip_address, port=port)

    @property
    def username(self) -> str:
        return self.__username
