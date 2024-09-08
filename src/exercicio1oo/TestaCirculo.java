package exercicio1oo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);

        System.out.println(circulo);

        System.out.println("Diâmetro: " + circulo.calcularDiametro());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Área: " + circulo.calcularArea());
    }
}
