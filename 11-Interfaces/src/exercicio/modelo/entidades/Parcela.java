package exercicio.modelo.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataDeVencimento;
    private Double quantia;

    public Parcela(LocalDate dataDeVencimento, Double quantia) {
        this.dataDeVencimento = dataDeVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - R$ %.2f",
                dataDeVencimento.format(formatter), quantia
        );
    }
}
