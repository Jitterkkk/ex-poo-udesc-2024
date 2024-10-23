package exercicio3oo;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String materia;
    private String serie;
    private double nota1;
    private double nota2;
    private double nota3;

    //Construtor padrão
    public Aluno() {
        this.nome = "";
        this.materia = "";
        this.serie = "";
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
    }

    //Construtor parametrizado
    public Aluno(String nome, String materia, String serie, double nota1, double nota2, double nota3) {


        this();
        this.nome = nome;
        this.materia = materia;
        this.serie = serie;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;


    }

    //Métodos de acesso
    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota2 <=10){
            this.nota3 = nota3;
        } else {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <=10){
            this.nota2 = nota2;
        } else {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <=10){
            this.nota1 = nota1;
        } else {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        }
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para calcular a média
    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3;
    }
    // Método para verificar a situação
    public String verificarSituacao(){
        double media = calcularMedia();
        return media >= 6 ? "Aprovado" : "Reprovado";
    }

    //toString
    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + nome + '\'' +
                ", Matéria='" + materia + '\'' +
                ", Série='" + serie + '\'' +
                ", Nota 1=" + nota1 +
                ", Nota 2=" + nota2 +
                ", Nota 3=" + nota3 +
                ", Média=" + calcularMedia() +
                ", Situação='" + verificarSituacao() + '\'' +
                '}';
    }
}
