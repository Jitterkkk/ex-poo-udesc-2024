package exercicio3oo;

public class Circulo {
    private double raio;

    // Construtor padrão
    public Circulo() {
        this.raio = 0.0;
    }

    // Construtor com parâmetros
    public Circulo(double raio) {
        this();
        setRaio(raio);
    }

    // Método de acesso (getter e setter)
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        } else {
            System.out.println("O raio não pode ser negativo.");
        }
    }

    // Método para calcular a área
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Método para calcular o perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para calcular o diâmetro
    public double calcularDiametro() {
        return 2 * raio;
    }

    @Override
    public String toString() {
        return "Círculo{" +
                "Raio=" + raio +
                ", Área=" + calcularArea() +
                ", Perímetro=" + calcularPerimetro() +
                ", Diâmetro=" + calcularDiametro() +
                '}';
    }
}
