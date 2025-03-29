package ambiente;

//interface que cria a estrutura base do ambiente
public interface Ambiente {

    public void evoluir();

    public Evento observar();

    public void executar(Comando comando);
}
