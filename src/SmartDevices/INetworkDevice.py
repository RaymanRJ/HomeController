from abc import ABC


class INetworkDevice(ABC):
    __local_ip: str
    __local_port: int

    def __init__(self, ip_address: str, port: int):
        self.__local_ip = ip_address
        self.__local_port = port

    @property
    def ip_address(self) -> str:
        return self.__local_ip

    @property
    def port(self) -> int:
        return self.__local_port

    @property
    def socket_address(self) -> str:
        return f"{self.__local_ip}:{self.__local_port}"
