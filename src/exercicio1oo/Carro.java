package exercicio1oo;

public class Carro {
    public String modelo;
    public double velocidadeAtual;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidadeAtual = 0.0;
    }
    public void acelerar(){
        velocidadeAtual += 10.0;
    }
    public void frear(){
        if (velocidadeAtual >= 10.0) {
            velocidadeAtual -= 10.0;
        } else {
            velocidadeAtual = 0.0;
        }
    }
    public double exibirVelocidade(){
        return velocidadeAtual;
    }
    @Override
    public String toString(){
        return "Carro{" +
                "modelo=' " + modelo + '\'' +
                ", velocidade atual=" + velocidadeAtual +
                '}';
    }
}

