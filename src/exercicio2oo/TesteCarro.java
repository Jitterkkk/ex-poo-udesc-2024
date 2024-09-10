package exercicio2oo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.acelerar();
        carro.acelerar();
        carro.frear();

        System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual() + " km/h");
    }
}
