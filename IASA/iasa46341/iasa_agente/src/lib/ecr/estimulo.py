from abc import ABC, abstractmethod

class Estimulo:
    @abstractmethod
    def detectar(self, percepcao):
        """Detectar estimulo"""