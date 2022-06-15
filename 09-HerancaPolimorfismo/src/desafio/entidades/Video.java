package desafio.entidades;

public class Video extends Licao {
    private String url;
    private Integer segundos;

    public Video(String titulo, String url, Integer segundos) {
        super(titulo);
        this.url = url;
        this.segundos = segundos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    @Override
    public Integer duracao() {
        return segundos;
    }
}
