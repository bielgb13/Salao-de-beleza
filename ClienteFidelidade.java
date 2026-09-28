public class ClienteFidelidade extends Cliente {
    private int pontos;

    public ClienteFidelidade(String nome, String telefone) {
        super(nome, telefone);
        this.pontos = 0;
    }

    public void adicionarPontos(int pontosGanhos) {
        this.pontos += pontosGanhos;
    }
}