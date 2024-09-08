package exercicio1oo;

public class Circulo {
    public double raio;
    public static final double PI = 3.141592653589793;


    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularDiametro() {
        return 2 * raio;
    }
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
    public double calcularArea() {
        return PI * raio * raio;
    }
    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", diâmetro=" + calcularDiametro() +
                ", perímetro=" + calcularPerimetro() +
                ", área=" + calcularArea() +
                '}';
    }
}
