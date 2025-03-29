from typing import List
from sae import Accao

class Hierarquia:

   # Metodo que seleciona acao de acordo com a hierarquia
    def seleccionar_acao(self, accoes: List[Accao]):
        if accoes:
            return accoes[0]
        return None