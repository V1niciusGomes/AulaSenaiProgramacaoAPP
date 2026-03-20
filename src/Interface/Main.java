package Interface;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Pix();
        pagamento1.realizarPagamento(150.00);

        Pagamento pagamento2 = new Boleto();
        pagamento2.realizarPagamento(200.00);
    }
}
