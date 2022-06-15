package exercicio2.entidades;

public class Individual extends Contribuinte {
    private Double gastosComSaude;

    public Individual(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double imposto() {
        return getRendaAnual() < 20000.00 ?
                (getRendaAnual() * 0.15) - (gastosComSaude * 0.50) :
                (getRendaAnual() * 0.25) - (gastosComSaude * 0.50);
    }

    @Override
    public String toString() {
        return String.format(
                "%s: R$ %.2f",
                getNome(), imposto()
        );
    }
}
