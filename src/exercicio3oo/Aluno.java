package exercicio3oo;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    //Construtor padrão
    public Aluno() {
        this.nome = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    //Construtor parametrizado
    public Aluno(String nome, double nota1, double nota2) {


        this();
        setNota1(nota1);
        setNota2(nota2);
        this.nome = nome;

    }

    //Métodos
    public double calcularMedia(){
        return (nota1 + nota2) / 2;
    }
    public String verificarSituacao(){
        return calcularMedia() >= 6 ? "Aprovado" : "Reprovado";
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    //toString
    @Override
    public String toString() {
        return "Aluno: " + nome + ", Média: " + calcularMedia() + ", Situação: " + verificarSituacao();
    }
}
