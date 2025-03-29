from abc import ABC, abstractmethod
from sae import Percepcao, Accao

class Comportamento(ABC):

    @abstractmethod
    def activar(self, percepcao: Percepcao):
        return Accao