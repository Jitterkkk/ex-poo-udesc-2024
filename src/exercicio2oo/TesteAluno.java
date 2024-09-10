package exercicio2oo;

public class TesteAluno {
    public static void main (String[] args){
        Aluno aluno = new Aluno("Bernardo", 8.0, 9.5, 7.0);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.situacao());
    }
}
