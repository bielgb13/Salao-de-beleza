public class PagamentoCartao implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado no cartão.");
    }
}