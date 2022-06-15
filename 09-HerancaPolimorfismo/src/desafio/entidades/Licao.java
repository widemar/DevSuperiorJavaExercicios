package desafio.entidades;

public abstract class Licao {
    private String titulo;

    public Licao(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract Integer duracao();
}
