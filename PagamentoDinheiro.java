public class PagamentoDinheiro implements FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " recebido em dinheiro.");
    }
}