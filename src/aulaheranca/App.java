package aulaheranca;

public class App {
    public static void main(String[] args) {

        Animal gato = new Animal();

        gato.setNome("Charlotte");
        System.out.println(gato.getNome());

        Pessoa fulano = new Pessoa();
        fulano.setNome("Fulano");
        System.out.println(fulano.getNome());

        Ave pinguim = new Ave();
        pinguim.setNome("Pingu");
        System.out.println(pinguim.getNome());
    }
}
