from lib.ecr.comportamento import Comportamento
from sae import Percepcao
from lib.ecr.estimulo import Estimulo
from lib.ecr.resposta import Resposta

class Reaccao:
    
    """ Inicia construtor com estimulo e resposta """
    def __init__(self, estimulo : Estimulo , resposta : Resposta):
        self.__estimulo = estimulo
        self.__resposta = resposta


    def activar(self, percepcao : Percepcao):
        if percepcao is not None:
            intensidade = self.__estimulo.detectar(percepcao)
            if intensidade > 0:
                accao = self.__resposta.activar(percepcao, intensidade)
                return accao
        return None