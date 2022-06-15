package comerciante.entidades;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private Double precoDaCompra;
    private Double precoDaVenda;

    public Produto(String nome, Double precoDaCompra, Double precoDaVenda) {
        this.nome = nome;
        this.precoDaCompra = precoDaCompra;
        this.precoDaVenda = precoDaVenda;
    }

    public static double valorTotalDaCompra(List<Produto> produtos) {
        double somaCompra = 0.0;
        for (Produto produto : produtos) {
            somaCompra += produto.precoDaCompra;
        }
        return somaCompra;
    }

    public static double valorTotalDaVenda(List<Produto> produtos) {
        double somaVenda = 0.0;
        for (Produto produto : produtos) {
            somaVenda += produto.precoDaVenda;
        }
        return somaVenda;
    }

    public static double lucroTotal(List<Produto> produtos) {
        return valorTotalDaVenda(produtos) - valorTotalDaCompra(produtos);
    }

    public static List<Double> porcentagemDeLucros(List<Produto> produtos) {
        List<Double> listaPorcentagemDeLucros = new ArrayList<>();
        for (Produto produto : produtos) {
            double porcentagemDeLucros = (produto.precoDaVenda - produto.precoDaCompra) / produto.precoDaCompra * 100;
            listaPorcentagemDeLucros.add(porcentagemDeLucros);
        }
        return listaPorcentagemDeLucros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoDaCompra() {
        return precoDaCompra;
    }

    public void setPrecoDaCompra(Double precoDaCompra) {
        this.precoDaCompra = precoDaCompra;
    }

    public Double getPrecoDaVenda() {
        return precoDaVenda;
    }

    public void setPrecoDaVenda(Double precoDaVenda) {
        this.precoDaVenda = precoDaVenda;
    }
}
