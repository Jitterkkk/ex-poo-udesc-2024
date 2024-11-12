package geometria;

public class Quadrado extends FormaGeometrica{
    private int lado;

   public Quadrado(){

   }

    public Quadrado(String cor, String descricao, int lado) {
        super(cor, descricao);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public void identificar(){
        System.out.println("Eu sou um Quadrado");
        super.identificar();
    }
}
