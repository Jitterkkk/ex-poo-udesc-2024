package geometria;

public class Retangulo extends FormaGeometrica {
    private int base;
    private int altura;

    public Retangulo(){

    }

    public Retangulo(String cor, String descricao, int base, int altura) {
        super(cor, descricao);
        this.base = base;
        this.altura = altura;
    }

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
        super.identificar();
    }
}
