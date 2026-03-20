package Animais;
public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro("Rex", "Médio", "Labrador");
        cachorro.emitirSom();
        cachorro.dormir();

        Gato gato = new Gato("Mia", "Pequeno", "Preto");
        gato.emitirSom();
        gato.dormir();
    }
}