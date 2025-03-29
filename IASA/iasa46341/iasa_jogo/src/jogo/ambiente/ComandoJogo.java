package jogo.ambiente;

import ambiente.Comando;

public enum ComandoJogo implements Comando {
    PROCURAR, APROXIMAR, OBSERVAR, FOTOGRAFAR;

    @Override
    public void mostrar(){
        System.out.printf("\n Acção: %s\n", this);
    }
}

