package funcionarios.entidades;

public class Funcionario {
    private String nome;
    private Double salarioBruto;
    private Double imposto;

    public Funcionario(String nome, Double salarioBruto, Double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
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
