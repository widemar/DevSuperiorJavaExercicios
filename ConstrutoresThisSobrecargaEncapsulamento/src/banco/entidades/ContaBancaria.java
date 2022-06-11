package banco.entidades;

public class ContaBancaria {
    private final Integer numeroDaConta;
    private String titular;
    private Double saldo;

    public ContaBancaria(Integer numeroDaConta, String titular) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        saldo = 0.0;
    }

    public ContaBancaria(Integer numeroDaConta, String titular, Double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
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

    public void depositar(double quantia) {
        if (saldo == null) {
            saldo = 0.0;
        }
        saldo += quantia;
    }

    public void sacar(double quantia) {
        saldo -= (quantia + 5.00);
    }

    @Override
    public String toString() {
        return String.format(
                "Conta: %d, Titular: %s, Saldo: R$ %.2f",
                numeroDaConta, titular, saldo
        );
    }
}
