from lib.ecr.comportamento import Comportamento
from sae import Accao, Direccao
from sae import Rodar
from sae import Percepcao
from random import random

# DENTRO DE ATIVAR
# IF RANDOM() MENOR taxa_rotacao=0.1 THEN choice(list(Direccao)) -> OU SEJA ESCOLHER DIRRECAO ALEATORIA
# ELSE Avancar() -> OU SEJA AVANCAR NA DIRECCAO DO AGENTE


class Explorar:

    def __init__(self, taxa_rotacao : float = 0.1):
        self.taxa_rotacao = taxa_rotacao

    def activar(self, percepcao : Percepcao ):
        if self.taxa_rotacao > random():
            return Rodar()
        else:
            return 


        return Accao
