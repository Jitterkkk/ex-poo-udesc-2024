package aulaheranca;

public class Animal {
    private boolean vivo;
    private boolean respira;
    private String nome;
    private int idade;
    private String cor;
    private boolean sexo;

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isRespira() {
        return respira;
    }

    public void setRespira(boolean respira) {
        this.respira = respira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
}
