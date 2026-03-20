package sistemaCarro;

public class Main {

    public static void main(String[] args) {
        Dono dono1 = new Dono("João");
        Carro carro1 = new Carro("Civic", "Honda", 2020, dono1);

        Dono dono2 = new Dono("José");
        Carro carro2 = new Carro("Corolla", "Toyota", 2019, dono2);
        System.out.println("\n\n--------------------------------");
        System.out.println("\nDono: " + carro1.getDono().getNome());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("\nMarca: " + carro1.getMarca());
        System.out.println("\nAno: " + carro1.getAno());

        System.out.println("-----------------------------");
        System.out.println("\nDono: " + carro2.getDono().getNome());
        System.out.println("\nModelo: " + carro2.getModelo());
        System.out.println("\nMarca: " + carro2.getMarca());
        System.out.println("\nAno: " + carro2.getAno());

        System.out.println("================================");
    }

}
