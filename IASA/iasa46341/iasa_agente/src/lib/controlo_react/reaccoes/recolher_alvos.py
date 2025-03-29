from lib.ecr.comport_comp import ComportComp
from lib.controlo_react.reaccoes import AproximarAlvos, EvitarObst, Explorar

class RecolherAlvos(ComportComp):
    def __init__(self):
        """
        Inicializa a classe RecolherAlvos chamando o construtor da classe ComportComp
        com uma lista de comportamentos
        """
        super().__init__([
            AproximarAlvos(),  # Comportamento para aproximar-se de alvos
            EvitarObst(),      # Comportamento para evitar obstáculos
            Explorar(0.7)      # Comportamento para explorar o ambiente
        ])