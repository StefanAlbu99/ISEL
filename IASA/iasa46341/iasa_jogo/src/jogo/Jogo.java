package jogo;

import ambiente.Comando;
import jogo.ambiente.AmbienteJogo;
import jogo.ambiente.EventoJogo;
import jogo.personagem.Personagem;

public class Jogo {


    public static void main(String[] args) {

        //evoluir o AmbienteJogo
        //personagem -> executar
        
        //Inicializar Ambiente
        AmbienteJogo ambiente = new AmbienteJogo();
        //Inicializar Personagem
        Personagem personagem = new Personagem(ambiente);
        
        //ambiente.evoluir();
        ambiente.executar(comando);

        //do while loop que executa até o EventoJogo 'Terminar' ser inserido
        do {
            
            ambiente.evoluir();
            personagem.executar(comando);
            
        } while (ambiente.evento != EventoJogo.TERMINAR);
        
    }
}
