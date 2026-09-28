public class Agendamento {
    private String dataHora;
    private Cliente cliente;
    private Profissional profissional;
    private Servico servico;
    private StatusAgendamento status;

    public Agendamento(String dataHora, Cliente cliente, Profissional profissional, Servico servico) {
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.profissional = profissional;
        this.servico = servico;
        this.status = StatusAgendamento.MARCADO; 
    }

    public void avancarStatus(StatusAgendamento novoStatus) {
        this.status = novoStatus;
        System.out.println("Status alterado para: " + novoStatus);
    }

    public void realizarPagamento(FormaPagamento formaPagamento) {
        formaPagamento.processarPagamento(this.servico.getPreco());
    }
}