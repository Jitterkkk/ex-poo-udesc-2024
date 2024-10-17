package exercicio3oo;

public class Circulo {
    private double raio;

    public Circulo() {
        this.raio = 0;
    }

    public Circulo(double raio) {
        this();
        setRaio(raio);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        }
    }
    @Override
    public String toString() {
        return "Círculo: Raio = " + raio + ", Área = " + calcularArea() + ", Perímetro = " + calcularPerimetro();
    }
}