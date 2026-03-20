package Animais;
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String tamanho, String raca) {

        this.raca = raca;
    }

    public void emitirSom() {
        System.out.println("O cachorro está latindo: Au Au!");
    }

 

    @Override
    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    public String getRaca() {
        return raca;
    }
}
