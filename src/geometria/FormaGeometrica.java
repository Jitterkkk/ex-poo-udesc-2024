package geometria;

public class FormaGeometrica {
    protected String cor;
    protected String descricao;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void identificar(){
        System.out.println("Eu sou uma Forma Geometrica");
        System.out.println("Minha cor é: " + this.cor);
        System.out.println("Minha descrição é: " + this.descricao);
    }
}
