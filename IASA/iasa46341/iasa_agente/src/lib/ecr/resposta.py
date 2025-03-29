from sae import Accao, Percepcao

class Resposta:

    def __init__(self, accao : Accao = None):
        self._accao = accao
        """Acção a executar"""

    def activar(self, percepcao : Percepcao, intensidade : float = 0):
        return Accao