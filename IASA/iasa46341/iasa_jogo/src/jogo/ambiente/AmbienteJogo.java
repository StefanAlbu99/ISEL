package jogo.ambiente;

import ambiente.Ambiente;
import ambiente.Comando;
import ambiente.Evento;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmbienteJogo implements Ambiente {

    public EventoJogo evento;
    private final Scanner scanner = new Scanner(System.in);

    // Interação via consola
    // Conjunto de Eventos
    // Como introduzir uma string para mapear para cada Evento
    private Map<String, EventoJogo> eventos;

    public AmbienteJogo() {

        eventos = new HashMap<String, EventoJogo>();
        eventos.put("s", EventoJogo.SILENCIO);
        eventos.put("r", EventoJogo.RUIDO);
        eventos.put("f", EventoJogo.FUGA);
        eventos.put("a", EventoJogo.ANIMAL);
        eventos.put("f", EventoJogo.FOTOGRAFIA);
        eventos.put("t", EventoJogo.TERMINAR);

    }

    //Evoluir o evento (obter o proximo evento)
    @Override
    public void evoluir() {
        evento = gerarEvento();
    }
    
    @Override
    public Evento observar() {
        evento.mostrar();
        return evento;
    }

    //Mostrar o comando que o personagem executa
    @Override
    public void executar(Comando comando) {
        comando.mostrar();
    }

    // Perguntar ao Ambiente qual o proximo Evento
    private EventoJogo gerarEvento(){
        System.out.print("\nEvento? ");
        String comando = scanner.next();
        return eventos.get(comando);
    }

    //Metodo que disponibiliza a leitura do evento
    public Evento getEvento() {
        return evento;
    }
}