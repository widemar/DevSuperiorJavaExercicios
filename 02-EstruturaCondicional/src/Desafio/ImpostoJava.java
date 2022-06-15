package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Renda anual com salário: ");
        double raComSalario = scanner.nextDouble();
        double rendaMensalSalario = raComSalario / 12;
        System.out.print("Renda Anual com prestação de serviço: ");
        double raComPrestacaoDeServico = scanner.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        double raComGanhoDeCapital = scanner.nextDouble();
        System.out.print("Gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();

        System.out.println();
        System.out.println("--------Relatório imposto de renda---------".toUpperCase());
        System.out.println();

        double impostoSobreSalario = 0;
        if (rendaMensalSalario <= 3000) {
            System.out.println("Isento");
        } else if (rendaMensalSalario <= 5000) {
            impostoSobreSalario = raComSalario * 0.10;
        } else {
            impostoSobreSalario = raComSalario * 0.20;
        }

        double impostoSobreServicos = 0;
        if (raComPrestacaoDeServico > 0) {
            impostoSobreServicos = raComPrestacaoDeServico * 0.15;
        }

        double impostoSobreCapital = 0;
        if (raComGanhoDeCapital > 0) {
            impostoSobreCapital = raComGanhoDeCapital * 0.20;
        }

        System.out.println("Consolidado de renda:".toUpperCase());
        System.out.printf("Imposto sobre salário: R$%.2f\n", impostoSobreSalario);
        System.out.printf("Imposto sobre serviços: R$%.2f\n", impostoSobreServicos);
        System.out.printf("Imposto sobre ganho de capital: R$%.2f\n", impostoSobreCapital);

        double impostoBruto = impostoSobreSalario + impostoSobreServicos + impostoSobreCapital;
        double maximoDedutivel = impostoBruto * 0.30;
        double gastoDedutivel = gastosEducacionais + gastosMedicos;

        System.out.println();
        System.out.println("Deduções:".toUpperCase());
        System.out.printf("Máximo dedutível: R$%.2f\n", maximoDedutivel);
        System.out.printf("Gastos dedutíveis: R$%.2f\n", gastoDedutivel);

        double abatimento = Math.min(maximoDedutivel, gastoDedutivel);

        double impostoDevido = impostoBruto - abatimento;

        System.out.println();
        System.out.println("Resumo:".toUpperCase());
        System.out.printf("Imposto bruto total: R$%.2f\n", impostoBruto);
        System.out.printf("Abatimento: R$%.2f\n", abatimento);
        System.out.printf("Imposto devido: R$%.2f\n", impostoDevido);

        scanner.close();

    }
}
