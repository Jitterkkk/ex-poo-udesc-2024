package exercicio2oo;

public class TesteCirculo {
    public static void main(String[] args){
        Circulo circulo = new Circulo(5.0);

        System.out.println("Raio: "+ circulo.getRaio());
        System.out.println("Diâmetro: "+ circulo.diametro());
        System.out.println("Perimetro: "+ circulo.perimetro());
        System.out.println("Area: "+ circulo.area());
    }
}
