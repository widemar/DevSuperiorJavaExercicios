package desafio.entidades;

public class Tarefa extends Licao {
    private String descricao;
    private Integer contagemDePerguntas;

    public Tarefa(String titulo, String descricao, Integer contagemDePerguntas) {
        super(titulo);
        this.descricao = descricao;
        this.contagemDePerguntas = contagemDePerguntas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getContagemDePerguntas() {
        return contagemDePerguntas;
    }

    public void setContagemDePerguntas(Integer contagemDePerguntas) {
        this.contagemDePerguntas = contagemDePerguntas;
    }

    @Override
    public Integer duracao() {
        return contagemDePerguntas * 5 * 60;
    }
}
