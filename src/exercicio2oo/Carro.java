package exercicio2oo;

public class Carro {
    private int velocidadeAtual;

    public Carro(){
        this.velocidadeAtual = 0;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    public void acelerar() {
        velocidadeAtual += 10;
    }


    public void frear() {
        velocidadeAtual = Math.max(0, velocidadeAtual - 10);
    }
}
