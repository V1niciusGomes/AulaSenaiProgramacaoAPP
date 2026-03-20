package Interface;

public class Pix implements Pagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando pagamento com Pix no valor de: R$ " + valor);
    }
    
}
