package exercicio3oo;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;

    //Construtor padrão
    public Carro(){
        this.modelo = "";
        this.marca = "";
        this.velocidade = 0.0;

    }

    //Construtor parametrizado
    public Carro(String modelo, String marca, int ano, double velocidade){
        this();
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Getters e Setters - Métodos de Entrada
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Métodos principais
    public void acelerar(){
        this.velocidade += 10;
        System.out.println("Você acelerou. Velocidade atual: " + velocidade + " km/h");
    }

    public void frear(){
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
        System.out.println("Você freou. Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public String toString(){
        return "Carro{" +
                "modelo = '" + modelo + '\'' +
                ", marca= '" + marca + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}
