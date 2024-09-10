package exercicio2oo;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Emprestado: " + livro.isEmprestado());

        livro.emprestar();
        System.out.println("Emprestado após emprestar: " + livro.isEmprestado());

        livro.devolver();
        System.out.println("Emprestado após devolver: " + livro.isEmprestado());
    }
}
