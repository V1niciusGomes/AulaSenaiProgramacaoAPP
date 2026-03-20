package Animais;
public class Gato extends Animal {
    private String cor;

    public Gato(String nome, String tamanho, String cor) {
        this.cor = cor;
    }

    public void emitirSom() {
        System.out.println("O gato está miando: Miau Miau!");
    }

    public Gato(String nome, String tamanho) {
    }

    @Override
    public void dormir() {
        System.out.println("O gato está dormindo.");
    }

    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
