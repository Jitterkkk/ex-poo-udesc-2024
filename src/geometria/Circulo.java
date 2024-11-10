package geometria;

public class Circulo extends FormaGeometrica {
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public void identificar(){
        System.out.println("Eu sou um Circulo");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição é: " + this.descricao);
    }
}
