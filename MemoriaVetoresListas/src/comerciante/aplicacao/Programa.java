package comerciante.aplicacao;

import comerciante.entidades.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Serão digitados dados de quantos produtos? ");
        int qtdDeProdutos = scanner.nextInt();

        for (int i = 1; i <= qtdDeProdutos; i++) {
            System.out.printf("Produto %d:\n", i);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Preço de compra: ");
            double precoDeCompra = scanner.nextDouble();
            System.out.print("Preço de venda: ");
            double precoDeVenda = scanner.nextDouble();

            produtos.add(new Produto(nome, precoDeCompra, precoDeVenda));
        }

        double totalDeCompra = Produto.valorTotalDaCompra(produtos);
        double totalDeVenda = Produto.valorTotalDaVenda(produtos);
        double lucroTotal = Produto.lucroTotal(produtos);
        List<Double> porcentagemDeLucros = Produto.porcentagemDeLucros(produtos);

        int contaAbaixoDe10 = 0, contaEntre10And20 = 0, contaAcimaDe20 = 0;

        for (Double porcentagemDeLucro : porcentagemDeLucros) {
            if (porcentagemDeLucro < 10) {
                contaAbaixoDe10++;
            } else if (porcentagemDeLucro >= 10 && porcentagemDeLucro <= 20) {
                contaEntre10And20++;
            } else {
                contaAcimaDe20++;
            }
        }

        System.out.printf("Lucro abaixo de 10%%: %d\n", contaAbaixoDe10);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", contaEntre10And20);
        System.out.printf("Lucro acima de 20%%: %d\n", contaAcimaDe20);
        System.out.printf("Valor total de compra: %.2f\n", totalDeCompra);
        System.out.printf("Valor total de venda: %.2f\n", totalDeVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

        scanner.close();
    }
}
