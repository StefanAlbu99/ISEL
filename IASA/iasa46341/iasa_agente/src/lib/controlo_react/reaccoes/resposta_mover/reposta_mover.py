from sae import Accao, Direccao


class RespostaMover:

    # ransforma a direccao em accao
    # Se o contrutor nao tiver Dirrecao, entao nao retorna accao
    def __init__(self, direccao : Direccao = None):
        
        self.direccao = direccao

        if self.direccao:
            # Cria uma Accao com a direccao fornecida
            return Accao(self.direccao)
        return None