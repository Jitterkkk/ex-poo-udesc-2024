package exercicio3oo;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    // Construtor padrão
    public Livro(){
        this.titulo = "";
        this.autor = "";
        this.emprestado = false;
    }

    // Construtor parametrizado
    public Livro(String titulo, String autor, Boolean emprestado){
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = emprestado;
    }

    // Métodos de acesso (getters e setters)

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos principais
    public void emprestar(){
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void devolver(){
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está emprestado.");
        }
    }

    @Override
    public String toString(){
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", emprestado= " + (emprestado ? "Sim" : "Não") +
                '}';
    }
}
