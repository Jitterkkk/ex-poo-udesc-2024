package exercicio1oo;

public class TestaLivro {
    public static void main(String[] args){
        Livro livro = new Livro("Diario de um banana", "Jeff Kinney");


        livro.emprestar();
        System.out.println("Após emprestar: " + livro);

        livro.emprestar();
        livro.devolver();
        System.out.println("Após devolver: " + livro);

        livro.devolver();
        System.out.println("Disponivel: " + livro.verificarDisponibilidade());
    }
}
