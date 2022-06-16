package exercicio.modelo.entidades;

import exercicio.modelo.excecoes.DominioExcecao;

public class Conta {
    private final Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteDeRetirada;

    public Conta(Integer numero, String titular, Double saldo, Double limiteDeRetirada) {
        this.numero = numero;
        this.titular = titular;
        depositar(saldo);
        this.limiteDeRetirada = limiteDeRetirada;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeRetirada() {
        return limiteDeRetirada;
    }

    public void setLimiteDeRetirada(Double limiteDeRetirada) {
        this.limiteDeRetirada = limiteDeRetirada;
    }

    public void depositar(double quantia) {
        if (saldo == null) {
            saldo = 0.0;
        }
        saldo += quantia;
    }

    public void sacar(double quantia) throws DominioExcecao {
        if (quantia > limiteDeRetirada) {
            throw new DominioExcecao("O valor excede o limite de saque.");
        }
        if (quantia > saldo) {
            throw new DominioExcecao("Saldo insuficiente.");
        }
        saldo -= quantia;
    }

    @Override
    public String toString() {
        return String.format("Novo saldo: R$ %.2f", saldo);
    }
}
