package desafio.aplicacao;

import desafio.entidades.Contribuinte;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar: ");
        int qtdDeContribuintes = scanner.nextInt();

        for (int i = 1; i <= qtdDeContribuintes; i++) {
            System.out.printf("Digite os dados do %d° contribuintes:\n", i);
            System.out.print("Renda anual com salário: ");
            double rendaComSalario = scanner.nextDouble();
            System.out.print("Renda anual com prestação de servico: ");
            double rendaComServico = scanner.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double rendaComCapital = scanner.nextDouble();
            System.out.print("Gastos médicos: ");
            double gastosMedicos = scanner.nextDouble();
            System.out.print("Gastos educacionais: ");
            double gastosEducacionais = scanner.nextDouble();

            contribuintes.add(
                    new Contribuinte(rendaComSalario, rendaComServico, rendaComCapital, gastosMedicos, gastosEducacionais)
            );
        }

        int contador = 1;
        for (Contribuinte contribuinte : contribuintes) {
            System.out.printf("Resumo do %d° contribuinte\n", contador);
            contador++;
            System.out.println(contribuinte);
        }

        scanner.close();
    }
}
