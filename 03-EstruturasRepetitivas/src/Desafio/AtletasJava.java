package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class AtletasJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de atletas: ");
        int qtdAtletas = scanner.nextInt();

        double somaPesos = 0, somaAlturasFemininas = 0;
        double maiorAltura = 0;
        double contaHomem = 0, contaMulher = 0;
        String atletaMaisAlto = "";
        for (int i = 0; i < qtdAtletas; i++) {
            System.out.printf("Digite os dados do atleta número %d:\n", i + 1);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Sexo: ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Valor inválido! Favor digitar F ou M: ");
                sexo = scanner.next().toUpperCase().charAt(0);
            }

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                altura = scanner.nextDouble();
            }

            if (sexo == 'M') {
                contaHomem++;
            } else {
                somaAlturasFemininas += altura;
                contaMulher++;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                atletaMaisAlto = nome;
            }

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                peso = scanner.nextDouble();
            }
            somaPesos += peso;
        }

        double pesoMedio = somaPesos / qtdAtletas;
        double porcentagemDeHomens = contaHomem / qtdAtletas * 100;
        double alturaMediaMulheres = somaAlturasFemininas / contaMulher;
        System.out.println("Relatório".toUpperCase());
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.printf("Atleta mais alto: %s\n", atletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%\n", porcentagemDeHomens);
        if (contaMulher == 0) {
            System.out.println("Não há mulheres cadastradas");
        } else {
            System.out.printf("Altura médias das mulheres: %.2f\n", alturaMediaMulheres);
        }

        scanner.close();
    }
}
