package jogo.ambiente;

import ambiente.Evento;

public enum EventoJogo implements Evento{
    SILENCIO, RUIDO, ANIMAL, FUGA, FOTOGRAFIA, TERMINAR;
    
    @Override
    public void mostrar(){
        System.out.printf("\n Evento: %s\n", this);
    }
}

