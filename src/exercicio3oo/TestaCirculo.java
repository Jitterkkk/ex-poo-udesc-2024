package exercicio3oo;

import java.util.Scanner;

public class TestaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Circulo circulo = new Circulo();

        int opcao;
        do {
            System.out.println("\n--- Menu Círculo ---");
            System.out.println("1. Definir raio");
            System.out.println("2. Calcular área");
            System.out.println("3. Calcular perímetro");
            System.out.println("4. Calcular diâmetro");
            System.out.println("5. Exibir informações do círculo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Raio: ");
                    circulo.setRaio(scanner.nextDouble());
                    break;

                case 2:
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    break;

                case 3:
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;

                case 4:
                    System.out.println("Diâmetro do círculo: " + circulo.calcularDiametro());
                    break;

                case 5:
                    System.out.println(circulo);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }
}