package exercicio1oo;

public class TestaAluno {
    public static void main(String[] arg){
        Aluno felipe = new Aluno();
        felipe.nome = "ManoLipe ";
        felipe.n1 = 8;
        felipe.n2 = 9;
        felipe.n3 = 4;
        felipe.n3 = 6;
        double media = felipe.calcularMedia();
        System.out.println("Média: " + media);
        felipe.imprimirSituacao();
    }
}

