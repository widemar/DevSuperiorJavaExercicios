package exercicio1.entidades;

public class ProdutoImportado extends Produto {
    private Double taxaAlfandegaria;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandegaria) {
        super(nome, preco);
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double getTaxaAlfandegaria() {
        return taxaAlfandegaria;
    }

    public void setTaxaAlfandegaria(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }

    public Double precoTotal() {
        return getPreco() + taxaAlfandegaria;
    }

    @Override
    public String etiquetaDePreco() {
        return String.format(
                "%s R$ %.2f (Taxa alfandegária: R$ %.2f)",
                getNome(), precoTotal(), taxaAlfandegaria
        );
    }
}
