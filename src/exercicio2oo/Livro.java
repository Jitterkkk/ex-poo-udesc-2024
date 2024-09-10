package exercicio2oo;

public class Livro {
    private String titulo;
    private boolean emprestado;


    public Livro(String titulo) {
        this.titulo = titulo;
        this.emprestado = false;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }


    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
        }
    }


    public void devolver() {
        emprestado = false;
    }
}
