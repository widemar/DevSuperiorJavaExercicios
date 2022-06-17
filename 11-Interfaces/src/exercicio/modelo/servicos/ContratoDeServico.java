package exercicio.modelo.servicos;

import exercicio.modelo.entidades.Contrato;
import exercicio.modelo.entidades.Parcela;

import java.time.LocalDate;

public class ContratoDeServico {
    private ServicoDePagamentoOnline servicoDePagamentoOnline;

    public ContratoDeServico(ServicoDePagamentoOnline servicoDePagamentoOnline) {
        this.servicoDePagamentoOnline = servicoDePagamentoOnline;
    }

    public ServicoDePagamentoOnline getServicoDePagamentoOnline() {
        return servicoDePagamentoOnline;
    }

    public void setServicoDePagamentoOnline(ServicoDePagamentoOnline servicoDePagamentoOnline) {
        this.servicoDePagamentoOnline = servicoDePagamentoOnline;
    }

    public void contratoDeProcesso(Contrato contrato, int meses) {
        double valorParcela = contrato.getValorTotal() / meses;

        for (int i = 1; i <= meses; i++) {
            LocalDate dataDeVencimento = contrato.getData().plusMonths(i);
            double quota = servicoDePagamentoOnline.interesse(valorParcela, i);
            double finalQuota = servicoDePagamentoOnline.formaDePagamento(quota);
            contrato.adicionarParcela(new Parcela(dataDeVencimento, finalQuota));
        }
    }

}
