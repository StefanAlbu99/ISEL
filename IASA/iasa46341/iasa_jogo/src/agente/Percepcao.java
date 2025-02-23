package agente;

import ambiente.Evento;

public class Percepcao {

    private Evento evento;

    public Percepcao(Evento evento) {
        this.evento = evento;
    }

    public Evento getEvento() {
        return evento;
    }
}
