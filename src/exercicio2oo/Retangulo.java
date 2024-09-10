package exercicio2oo;

public class Retangulo {
    private double altura;
    private double largura;

    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getLargura(){
        return largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(){
        this.altura = altura;
    }

    public double area(){
        return altura * largura;
    }
}

