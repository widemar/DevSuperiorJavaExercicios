package desafio.entidades;

public class Conta {
    private final Character genero;
    private final Integer cerveja;
    private final Integer espetinho;
    private final Integer refrigerante;

    public Conta(Character genero, Integer cerveja, Integer espetinho, Integer refrigerante) {
        this.genero = genero;
        this.cerveja = cerveja;
        this.espetinho = espetinho;
        this.refrigerante = refrigerante;
    }

    public Double consumo() {
        double somaCerveja = cerveja * 5;
        double somaEspetinho = espetinho * 7;
        double somaRefrigerante = refrigerante * 3;
        return somaCerveja + somaEspetinho + somaRefrigerante;
    }

    public Double couvert() {
        return consumo() > 30 ? 0.0 : 4.0;
    }

    public Double ingresso() {
        return genero == 'M' ? 10.0 : 8.0;

    }

    public Double total() {
        return consumo() + couvert() + ingresso();
    }

    @Override
    public String toString() {
        String couvert = couvert() == 0.0 ? "Isento de Couvert" : String.format("Couvert = R$ %.2f", couvert());
        return String.format(
                "Relatório:\nConsumo = R$ %.2f\n%s\nIngresso = R$ %.2f\n\nValor a pagar = R$ %.2f ",
                consumo(), couvert, ingresso(), total()
        );
    }
}
