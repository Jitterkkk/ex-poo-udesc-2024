package exercicio3oo;
import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o carro
        Carro carro = new Carro();

        int opcao;
        do {
            System.out.println("\n--- Menu Carro ---");
            System.out.println("1. Definir modelo, marca e ano");
            System.out.println("2. Acelerar");
            System.out.println("3. Frear");
            System.out.println("4. Exibir informações do carro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Modelo do carro: ");
                    carro.setModelo(scanner.nextLine());
                    System.out.print("Marca: ");
                    carro.setMarca(scanner.nextLine());
                    System.out.print("Ano: ");
                    carro.setAno(scanner.nextInt());
                    break;

                case 2:
                    carro.acelerar();
                    break;

                case 3:
                    carro.frear();
                    break;

                case 4:
                    System.out.println(carro);
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
