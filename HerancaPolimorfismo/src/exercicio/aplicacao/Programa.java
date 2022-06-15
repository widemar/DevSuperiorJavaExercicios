package exercicio.aplicacao;

import exercicio.entidades.Produto;
import exercicio.entidades.ProdutoImportado;
import exercicio.entidades.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite o número de produtos: ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Dados do produto %d:\n", i);
            System.out.print("Comum, usado ou importado? ");
            scanner.nextLine();
            String tipoDeProduto = scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Preço: ");
            Double preco = scanner.nextDouble();

            switch (tipoDeProduto) {
                case "importado" -> {
                    System.out.print("Taxa alfandegária: ");
                    double taxaAlfandegaria = scanner.nextDouble();
                    produtos.add(new ProdutoImportado(nome, preco, taxaAlfandegaria));
                }
                case "usado" -> {
                    System.out.print("Data de fabricação: ");
                    LocalDate dataDeFabricacao = LocalDate.parse(scanner.next(), formatter);
                    produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                }
                default -> produtos.add(new Produto(nome, preco));
            }
        }

        System.out.println("Preços das etiquetas: ");
        for (Produto produto : produtos) {
            System.out.println(produto.etiquetaDePreco());
        }

        scanner.close();
    }
}
