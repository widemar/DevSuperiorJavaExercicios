package cambio.aplicacao;

import cambio.utilitarios.ConversorDeMoeda;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do dólar: ");
        double valorDolar = scanner.nextDouble();

        System.out.print("Quantos dólares serão comprados: ");
        double qtdDeDolares = scanner.nextDouble();

        double total = ConversorDeMoeda.converter(valorDolar, qtdDeDolares);

        System.out.printf("Valor a ser pago em reais = %.2f", total);

        scanner.close();
    }
}
