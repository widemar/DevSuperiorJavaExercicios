package exercicio1.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataDeFabricacao;

    public ProdutoUsado(String nome, Double preco, LocalDate dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return String.format(
                "%s (usado) R$ %.2f (Data de fabricação: %s)",
                getNome(), getPreco(), dataDeFabricacao.format(formatter)
        );
    }
}
