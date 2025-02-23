package agente;

import ambiente.Ambiente;
import ambiente.Evento;

public class Agente {
    
    private Ambiente ambiente;
    private Controlo controlo;

    public Agente(Ambiente ambiente, Controlo controlo) {
        this.ambiente = ambiente;
        this.controlo = controlo;
    }

    public void executar() {
        Percepcao percepcao = percepcionar();
        Accao accao = controlo.processar(percepcao);
        actuar(accao);
    }

    protected Percepcao percepcionar() {
        Evento evento = ambiente.observar();
        return new Percepcao(evento);
    }

    protected void actuar(Accao accao) {
        if(accao != null) {
            ambiente.executar(accao.getComando());
        }
    }
}