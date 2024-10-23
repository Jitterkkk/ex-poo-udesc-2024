package exercicio3oo;
import java.util.Scanner;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidadeAtual;

    // Construtor padrão
    public Carro() {
        this.modelo = "";
        this.marca = "";
        this.ano = 0;
        this.velocidadeAtual = 0.0;
    }

    // Construtor com parâmetros
    public Carro(String modelo, String marca, int ano) {
        this();
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidadeAtual = 0.0; // O carro começa parado
    }

    // Métodos de acesso (getters e setters)
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

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Método para acelerar (aumenta 10 km/h)
    public void acelerar() {
        this.velocidadeAtual += 10;
        System.out.println("O carro acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    // Método para frear (diminui 10 km/h, mas não pode ser menor que 0)
    public void frear() {
        if (this.velocidadeAtual >= 10) {
            this.velocidadeAtual -= 10;
        } else {
            this.velocidadeAtual = 0;
        }
        System.out.println("O carro freou. Velocidade atual: " + velocidadeAtual + " km/h");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Modelo='" + modelo + '\'' +
                ", Marca='" + marca + '\'' +
                ", Ano=" + ano +
                ", Velocidade Atual=" + velocidadeAtual + " km/h" +
                '}';
    }
}
