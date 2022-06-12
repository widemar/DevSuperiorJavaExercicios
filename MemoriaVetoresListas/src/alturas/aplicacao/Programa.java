package alturas.aplicacao;

import alturas.entidades.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i + 1);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double alturaMedia = alturaMedia(pessoas);
        double porcentagemMenorDe16 = porcentagemMenorDe16(pessoas);
        String nomeMenorDe16 = nomesMenorDe16(pessoas);

        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenorDe16);
        System.out.println(nomeMenorDe16);

        scanner.close();
    }

    public static Double alturaMedia(Pessoa[] pessoas) {
        double soma = 0.0;
        for (Pessoa pessoa : pessoas) {
            soma += pessoa.altura();
        }
        return soma / pessoas.length;
    }

    public static Double porcentagemMenorDe16(Pessoa[] pessoas) {
        int qtdMenorDe16 = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.idade() < 16) {
                qtdMenorDe16++;
            }
        }
        return (double) qtdMenorDe16 / pessoas.length * 100;
    }

    public static String nomesMenorDe16(Pessoa[] pessoas) {
        StringBuilder mensagem = new StringBuilder();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.idade() < 16) {
                mensagem.append(pessoa.nome()).append("\n");
            }
        }
        return mensagem.toString();
    }
}
