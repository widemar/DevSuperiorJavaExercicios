package exercicio1.entidades;

import exercicio1.entidades.enums.StatusDoPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private final List<ItemDoPedido> itemsDoPedido;
    private LocalDateTime momento;
    private StatusDoPedido statusDoPedido;
    private Cliente cliente;

    public Pedido(LocalDateTime momento, StatusDoPedido statusDoPedido, Cliente cliente) {
        this.momento = momento;
        this.statusDoPedido = statusDoPedido;
        this.cliente = cliente;
        itemsDoPedido = new ArrayList<>();
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
        this.statusDoPedido = statusDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemDoPedido> getItemsDoPedido() {
        return itemsDoPedido;
    }

    public void adicionarItem(ItemDoPedido itemDoPedido) {
        itemsDoPedido.add(itemDoPedido);
    }

    public void removerItem(ItemDoPedido itemDoPedido) {
        itemsDoPedido.remove(itemDoPedido);
    }

    public Double total() {
        double total = 0.0;
        for (ItemDoPedido itemDoPedido : itemsDoPedido) {
            total += itemDoPedido.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Momento do pedido: ").append(momento.format(formatter)).append("\n");
        builder.append("Status do pedido: ").append(statusDoPedido).append("\n");
        builder.append(cliente).append("\n");
        builder.append("Itens do pedido: ").append("\n");
        for (ItemDoPedido itemDoPedido : itemsDoPedido) {
            builder.append(itemDoPedido).append("\n");
        }
        builder.append("Preço total: ").append(String.format("R$%.2f", total()));
        return builder.toString();
    }
}
