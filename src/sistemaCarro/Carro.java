package sistemaCarro;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private Dono dono;

    public Carro(String modelo, String marca, int ano, Dono dono) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.dono = dono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
        
    
}
