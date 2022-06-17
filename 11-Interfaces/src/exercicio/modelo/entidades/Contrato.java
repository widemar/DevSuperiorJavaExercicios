package exercicio.modelo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private final Integer numero;
    private LocalDate data;
    private Double valorTotal;
    private final List<Parcela> parcelas;

    public Contrato(Integer numero, LocalDate data, Double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.parcelas = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void adicionarParcela(Parcela parcela) {
        parcelas.add(parcela);
    }

    public void removerParcela(Parcela parcela) {
        parcelas.remove(parcela);
    }
}
