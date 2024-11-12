package geometria;

public class App {
    public static void main(String[] args) {


        Quadrado quadrado = new Quadrado();
        quadrado.setLado(4);
        quadrado.setDescricao("Tenho todos os lados iguais");
        quadrado.setCor("Verde");
        quadrado.identificar();
        System.out.println("\n-------------------\n");

        Retangulo retangulo = new Retangulo();
        retangulo.setBase(4);
        retangulo.setAltura(8);
        retangulo.setDescricao("Sou um paralelepipedo");
        retangulo.setCor("Rosa");
        retangulo.identificar();
        System.out.println("\n-------------------\n");

        Circulo circulo = new Circulo();
        circulo.setRaio(4);
        circulo.setDescricao("Sou redondo");
        circulo.setCor("Azul");
        circulo.identificar();
        System.out.println("\n-------------------\n");

    }


}
