package funcionarios.entidades;

public class Funcionario {
    private final String nome;
    private Double salarioBruto;
    private final Double imposto;

    public Funcionario(String nome, Double salarioBruto, Double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public Double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * (porcentagem / 100);
    }

    @Override
    public String toString() {
        return String.format("%s, R$ %.2f", nome, salarioLiquido());
    }
}
