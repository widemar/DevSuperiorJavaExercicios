package exercicio2.entidades;

public class Companhia extends Contribuinte {
    private Integer qtdDeEmpregados;

    public Companhia(String nome, Double rendaAnual, Integer qtdDeEmpregados) {
        super(nome, rendaAnual);
        this.qtdDeEmpregados = qtdDeEmpregados;
    }

    public Integer getQtdDeEmpregados() {
        return qtdDeEmpregados;
    }

    public void setQtdDeEmpregados(Integer qtdDeEmpregados) {
        this.qtdDeEmpregados = qtdDeEmpregados;
    }

    @Override
    public Double imposto() {
        return qtdDeEmpregados <= 10 ?
                getRendaAnual() * 0.16 :
                getRendaAnual() * 0.14;
    }

    @Override
    public String toString() {
        return String.format(
                "%s: R$ %.2f",
                getNome(), imposto()
        );
    }
}
