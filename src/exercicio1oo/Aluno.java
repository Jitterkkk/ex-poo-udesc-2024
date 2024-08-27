package exercicio1oo;

public class Aluno {
    public String nome;
    public int idade;
    public double n1, n2, n3, n4;

    public double calcularMedia(){
        double media = (n1+n2+n3+n4)/4;
        return media;

    }
    public void imprimirSituacao(){
        double media = this.calcularMedia();
        if (media>=7){
            System.out.println(this.nome + "está aprovado");
            }else{
            System.out.println(this.nome +"esta reprovado");
        }



    }
}
