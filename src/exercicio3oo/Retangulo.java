package exercicio3oo;

public class Retangulo {

    private double largura;
    private double altura;

    // Contrutor padrão
    public Retangulo(){
        this.largura = 0.0;
        this.altura = 0.0;
    }

    // Construtor parametrizado
    public Retangulo(double largura, double altura) {
        setAltura(altura);
        setLargura(largura);

    }

    // Métodos
    public double calcularArea(){
        return largura * altura;
    }

    public void setLargura(double largura){
        if(largura >= 0) {
            this.largura = largura;
        }
    }

    public void setAltura(double altura){
        if (altura >= 0) {
            this.altura = altura;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Retângulo: Largura = " + largura + ", Altura = " + altura + ", Área = " + calcularArea();
    }

}
