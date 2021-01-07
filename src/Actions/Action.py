from abc import ABC, abstractmethod

from src.Actions.ActionType import ActionType


class Action(ABC):

    __action_type: ActionType

    def __init__(self, action_type: ActionType):
        self.__action_type = action_type

    @abstractmethod
    def run(self):
        pass
