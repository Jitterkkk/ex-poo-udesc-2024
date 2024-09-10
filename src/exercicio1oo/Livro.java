package exercicio1oo;

public class Livro {
    public String titulo;
    public String autor;
    public boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
    public void emprestar(){
        if (!emprestado) {
            emprestado = true;
        } else {
            System.out.println("O livro já está emprestado");
        }
    }
    public void devolver(){
        if (emprestado){
            emprestado = false;
        } else {
            System.out.println("O livro já está disponivel");
        }
    }
    public boolean verificarDisponibilidade(){
        return !emprestado;
    }
    @Override
    public String toString(){
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}
