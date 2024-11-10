package geometria;

public class Retangulo extends FormaGeometrica {
    private int base;
    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void identificar(){
        System.out.println("Eu sou um Retangulo");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição é: " + this.descricao);
    }
}
