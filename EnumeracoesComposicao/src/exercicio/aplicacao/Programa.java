package exercicio.aplicacao;

import exercicio.entidades.Cliente;
import exercicio.entidades.ItemDoPedido;
import exercicio.entidades.Pedido;
import exercicio.entidades.Produto;
import exercicio.entidades.enums.StatusDoPedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Data de nascimento: ");
        LocalDate dataDeNascimento = LocalDate.parse(scanner.next(), formatter);

        Cliente cliente = new Cliente(nome, email, dataDeNascimento);

        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        scanner.nextLine();
        String statusDoPedido = scanner.nextLine().toUpperCase();

        Pedido pedido = new Pedido(LocalDateTime.now(), StatusDoPedido.valueOf(statusDoPedido), cliente);

        System.out.print("Quantos itens para este pedido? ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Insira os dados do %d° item:\n", i);
            System.out.print("Nome do produto: ");
            scanner.nextLine();
            String nomeDoProduto = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double precoDoProduto = scanner.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            Produto produto = new Produto(nomeDoProduto, precoDoProduto);

            pedido.adicionarItem(new ItemDoPedido(quantidade, precoDoProduto, produto));
        }

        System.out.println(pedido);

        scanner.close();
    }
}
