package exercicio.aplicacao;

import exercicio.modelo.entidades.Contrato;
import exercicio.modelo.entidades.Parcela;
import exercicio.modelo.servicos.ContratoDeServico;
import exercicio.modelo.servicos.ServicoPaypal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Informe os dados do contrato: ");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Data no formato dd/MM/yyyy: ");
        LocalDate data = LocalDate.parse(scanner.next(), formatter);
        System.out.print("Valor do contrato: ");
        double valorTotal = scanner.nextDouble();

        Contrato contrato = new Contrato(numero, data, valorTotal);

        System.out.print("Informe o número de parcelas: ");
        int qtdDeParcelas = scanner.nextInt();

        ContratoDeServico contratoDeServico = new ContratoDeServico(new ServicoPaypal());
        contratoDeServico.contratoDeProcesso(contrato, qtdDeParcelas);

        System.out.println("Parcelas:");
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela);
        }

        scanner.close();
    }
}
