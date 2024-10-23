package exercicio3oo;
public class Retangulo {
    private double largura;
    private double altura;

    // Construtor padrão
    public Retangulo() {
        this.largura = 0.0;
        this.altura = 0.0;
    }

    // Construtor com parâmetros
    public Retangulo(double largura, double altura) {
        this();
        setLargura(largura);
        setAltura(altura);
    }

    // Métodos de acesso (getters e setters)
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura >= 0) {
            this.largura = largura;
        } else {
            System.out.println("A largura não pode ser negativa.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura >= 0) {
            this.altura = altura;
        } else {
            System.out.println("A altura não pode ser negativa.");
        }
    }

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "Largura=" + largura +
                ", Altura=" + altura +
                ", Área=" + calcularArea() +
                '}';
    }
}
