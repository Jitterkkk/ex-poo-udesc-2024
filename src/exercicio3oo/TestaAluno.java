package exercicio3oo;
import java.util.Scanner;
public class TestaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o aluno
        Aluno aluno = new Aluno();

        int opcao;
        do {
            System.out.println("\n--- Menu Aluno ---");
            System.out.println("1. Definir nome, matéria e série");
            System.out.println("2. Inserir notas");
            System.out.println("3. Exibir média e situação");
            System.out.println("4. Exibir informações completas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    aluno.setNome(scanner.nextLine());
                    System.out.print("Matéria: ");
                    aluno.setMateria(scanner.nextLine());
                    System.out.print("Série: ");
                    aluno.setSerie(scanner.nextLine());
                    break;

                case 2:
                    System.out.print("Digite a nota 1: ");
                    aluno.setNota1(scanner.nextDouble());
                    System.out.print("Digite a nota 2: ");
                    aluno.setNota2(scanner.nextDouble());
                    System.out.print("Digite a nota 3: ");
                    aluno.setNota3(scanner.nextDouble());
                    break;

                case 3:
                    System.out.println("Média: " + aluno.calcularMedia());
                    System.out.println("Situação: " + aluno.verificarSituacao());
                    break;

                case 4:
                    System.out.println(aluno);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();

    }

}
