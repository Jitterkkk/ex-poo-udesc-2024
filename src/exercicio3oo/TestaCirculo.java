package exercicio3oo;

public class TestaCirculo {
    public static void main(String[] args) {

        // Teste 1: Criando um círculo com raio válido
        Circulo circ1 = new Circulo(5.0);
        System.out.println(circ1); // Deve exibir o raio, diâmetro, perímetro e área do círculo

        // Teste 2: Tentando criar um círculo com raio negativo (não deve aceitar)
        Circulo circ2 = new Circulo(-3.0);
        System.out.println(circ2); // O raio negativo deve ser ignorado, área e perímetro devem ser 0

        // Teste 3: Atualizando o raio para um valor válido
        circ2.setRaio(7.0);
        System.out.println(circ2); // Deve exibir o novo raio, diâmetro, perímetro e área

        // Teste 4: Verificando um círculo com raio igual a zero
        Circulo circ3 = new Circulo(0);
        System.out.println(circ3); // A área e perímetro devem ser zero

    }
}
