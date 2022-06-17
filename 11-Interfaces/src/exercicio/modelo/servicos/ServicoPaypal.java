package exercicio.modelo.servicos;

public class ServicoPaypal implements ServicoDePagamentoOnline {

    @Override
    public Double formaDePagamento(double quantia) {
        return quantia * 0.02 + quantia;
    }

    @Override
    public Double interesse(double quantia, int meses) {
        return quantia * 0.01 * meses + quantia;
    }
}
