package maisvelho.aplicacao;

import maisvelho.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Quantas pessoas você vai digitar? ");
        int qtdDePessoas = scanner.nextInt();

        for (int i = 1; i <= qtdDePessoas; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            pessoas.add(new Pessoa(nome, idade));
        }

        String pessoaMaisVelha = "";
        int maiorIdade = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > maiorIdade) {
                maiorIdade = pessoa.getIdade();
                pessoaMaisVelha = pessoa.getNome();
            }
        }
        System.out.printf("Pessoa mais velha: %s", pessoaMaisVelha);

        scanner.close();
    }
}
