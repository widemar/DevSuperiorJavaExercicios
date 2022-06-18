package desafio.entidades;

public class Venda {
    private Integer mes;
    private Integer ano;
    private String vendedor;
    private Integer itens;
    private Double total;

    public Venda(Integer mes, Integer ano, String vendedor, Integer itens, Double total) {
        this.mes = mes;
        this.ano = ano;
        this.vendedor = vendedor;
        this.itens = itens;
        this.total = total;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getItens() {
        return itens;
    }

    public void setItens(Integer itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double precoMedio() {
        return total / itens;
    }

    @Override
    public String toString() {
        return String.format(
                "%d/%d, %s, %d, %.2f, pm = %.2f",
                mes, ano, vendedor, itens, total, precoMedio()
        );
    }
}
