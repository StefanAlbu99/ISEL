package ambiente;

public interface Ambiente {

    public void evoluir();

    public Evento observar();

    public void executar(Comando comando);
}
