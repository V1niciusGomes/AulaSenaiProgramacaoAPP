package Interface;

class Boleto implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando pagamento com boleto no valor de: R$ " + valor);
    }
}
