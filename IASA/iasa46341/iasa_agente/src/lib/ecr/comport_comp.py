from lib.ecr.comportamento import Comportamento
from sae import Percepcao
from sae import Accao
from typing import List

class ComportComp(Comportamento):

    def __init__(self, comportamentos: List[Comportamento]):
        """ Lista de comportamentos"""
        self.__comportamentos = comportamentos

    def activar(self, percepcao : Percepcao):
        """Iniciar uma lista de accoes vazia"""
        accoes = []
        for comportamento in self.__comportamentos:
            """ Retornar a accao de cada comportamento """
            accao = comportamento.activar(percepcao)
            """ Se a accao for diferente de None, adiciona a accao a lista de accoes"""
            if accao:
                accoes.append(accao)
        return self.seleccionar_accao(accoes)
    
    def seleccionar_accao(self, accoes):
        """ Avalia a accao baseando se em hierarquia || prioridade"""