package geometria;

public class Quadrado extends FormaGeometrica{
    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void identificar(){
        System.out.println("Eu sou um Quadrado");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição é: " + this.descricao);
    }
}
