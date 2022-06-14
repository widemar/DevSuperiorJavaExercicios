package desafio.entidades;

public record Contribuinte(Double rendaComSalario, Double rendaComServico, Double rendaComCapital, Double gastosMedicos,
                           Double gastosEducacionais) {

    public double impostoSalarial() {
        double imposto;
        double rendaMensalSalario = rendaComSalario / 12;
        if (rendaMensalSalario < 3000) {
            imposto = 0.0;
        } else if (rendaMensalSalario >= 3000 && rendaMensalSalario < 5000) {
            imposto = rendaComSalario * 0.10;
        } else {
            imposto = rendaComSalario * 0.20;
        }
        return imposto;
    }

    public double taxaDeServico() {
        return rendaComServico * 0.15;
    }

    public double impostaDeCapital() {
        return rendaComCapital * 0.20;
    }

    public double impostoBruto() {
        return impostoSalarial() + taxaDeServico() + impostaDeCapital();
    }

    public double restituicaoDeImposto() {
        double taxaDeImposto = impostoBruto() * 0.30;
        double gastos = gastosEducacionais + gastosMedicos;
        return Math.min(taxaDeImposto, gastos);
    }

    public double impostoLiquido() {
        return impostoBruto() - restituicaoDeImposto();
    }

    @Override
    public String toString() {
        return String.format(
                "Imposto bruto total: %.2f\nAbatimento: %.2f\nImposto devido: %.2f\n",
                impostoBruto(), restituicaoDeImposto(), impostoLiquido());
    }
}
