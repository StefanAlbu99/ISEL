from typing import List
from sae import Accao

class prioridade:

    # Metodo que seleciona acao de acordo com a prioridade
    def seleccionar_acao(self, accoes: List[Accao]):
        # Metodo que seleciona o metodo com if/for loop
        # if accoes:
        #     prioridade = accoes[0]
        #     for accao in accoes:
        #         if accao.prioridade > prioridade.prioridade:
        #             prioridade = accao
        #     return prioridade

        # Metodo que seleciona o metodo com max + lambda
        if accoes:
            # Retorna a accao com maior prioridade
            # key = lambda accao: accao.prioridade -> extrai a prioridade de cada accao
            # Lambda retorna a prioridade da accao, e o max avalia a prioridade de cada accao, retornando o objeto com maior prioridade
            accao_prioritaria = max(accoes, key = lambda accao: accao.prioridade)
            return accao_prioritaria
        return None