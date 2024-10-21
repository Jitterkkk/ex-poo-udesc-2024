package exercicio3oo;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o livro
        Livro livro = new Livro("O senhor dos Anéis", "J.R.R. Tolkien", false);

        int opcao;
        do {
            System.out.println("\n--- Menu Livro ---");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Consultar estado do livro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    livro.emprestar();
                    break;
                case 2:
                    livro.devolver();
                    break;
                case 3:
                    System.out.println(livro);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

}
