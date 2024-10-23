package exercicio3oo;
import java.util.Scanner;

public class TestaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        int opcao;
        do {
            System.out.println("\n--- Menu Retângulo ---");
            System.out.println("1. Definir largura e altura");
            System.out.println("2. Calcular área");
            System.out.println("3. Exibir informações do retângulo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Largura: ");
                    retangulo.setLargura(scanner.nextDouble());
                    System.out.print("Altura: ");
                    retangulo.setAltura(scanner.nextDouble());
                    break;

                case 2:
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    break;

                case 3:
                    System.out.println(retangulo);
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
