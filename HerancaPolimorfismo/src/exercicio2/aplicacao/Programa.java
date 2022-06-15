package exercicio2.aplicacao;

import exercicio2.entidades.Companhia;
import exercicio2.entidades.Contribuinte;
import exercicio2.entidades.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Informe o número de contribuintes: ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Dados do contribuinte n°%d:\n", i);
            System.out.print("Individual ou companhia? i ou c: ");
            char escolha = scanner.next().charAt(0);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = scanner.nextDouble();

            switch (escolha) {
                case 'i' -> {
                    System.out.print("Gastos com saúde: ");
                    double gastosComSaude = scanner.nextDouble();
                    contribuintes.add(new Individual(nome, rendaAnual, gastosComSaude));
                }
                case 'c' -> {
                    System.out.print("Número de empregados: ");
                    int qtdDeEmpregados = scanner.nextInt();
                    contribuintes.add(new Companhia(nome, rendaAnual, qtdDeEmpregados));
                }
                default -> System.out.println("Contribuinte inválido");
            }
        }

        System.out.println("Impostos pagos: ");
        for (Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte);
        }

        scanner.close();
    }
}
