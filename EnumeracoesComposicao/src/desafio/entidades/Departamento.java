package desafio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private final List<Funcionario> funcionarios;
    private String nome;
    private Integer diaDoPagamento;
    private Endereco endereco;

    public Departamento(String nome, Integer diaDoPagamento, Endereco endereco) {
        this.nome = nome;
        this.diaDoPagamento = diaDoPagamento;
        this.endereco = endereco;
        funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDiaDoPagamento() {
        return diaDoPagamento;
    }

    public void setDiaDoPagamento(Integer diaDoPagamento) {
        this.diaDoPagamento = diaDoPagamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public Double folhaDePagamento() {
        double somaFolha = 0.0;
        for (Funcionario funcionario : funcionarios) {
            somaFolha += funcionario.getSalario();
        }
        return somaFolha;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Folha de pagamento:").append("\n");
        builder.append("Departamento ").append(nome).append(" = ").append(String.format("R$ %.2f\n", folhaDePagamento()));
        builder.append("Pagamento realizado no dia ").append(diaDoPagamento).append("\n");
        builder.append("Funcionários e seus salários:").append("\n");
        for (Funcionario funcionario : funcionarios) {
            builder.append(funcionario).append("\n");
        }
        builder.append(endereco);
        return builder.toString();
    }
}
