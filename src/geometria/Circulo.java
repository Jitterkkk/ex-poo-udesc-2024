package geometria;

public class Circulo extends FormaGeometrica {
    private int raio;

    public Circulo(){

    }

    public Circulo(String cor, String descricao, int raio) {
        super(cor, descricao);
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public void identificar(){
        System.out.println("Eu sou um Circulo");
        super.identificar();
    }
}
