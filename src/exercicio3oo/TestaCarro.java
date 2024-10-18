package exercicio3oo;
import java.util.Scanner;

public class TestaCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando o carango
        Carro carro = new Carro("Lancer Evolution", "Mitsubichi", 1998, 0);

        int opcao;
        do {
            System.out.println("\n--- Menu Carro ---");
            System.out.println("1. Acelerar");
            System.out.println("2. Frear");
            System.out.println("3. Exibir informações do carro");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    System.out.println(carro);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                case 5:
                    System.out.println("Opção Inválid!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
