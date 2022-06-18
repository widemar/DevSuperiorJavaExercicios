package exercicio.entidades;

public class ItemDoPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItemDoPedido(Integer quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double subTotal() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return String.format(
                "%s, Quantidade: %d, Subtotal: R$%.2f",
                produto, quantidade, subTotal()
        );
    }
}
