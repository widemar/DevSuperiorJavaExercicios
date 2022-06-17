package exercicio.modelo.servicos;

public interface ServicoDePagamentoOnline {
    Double formaDePagamento(double quantia);

    Double interesse(double quantia, int meses);
}
