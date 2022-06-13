package dadospessoas.aplicacao;

import dadospessoas.entidades.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Quantas pessoas serão digitadas: ");
        int qtdDePessoas = scanner.nextInt();

        for (int i = 1; i <= qtdDePessoas; i++) {
            System.out.printf("Altura da %d° pessoa: ", i);
            double altura = scanner.nextDouble();
            System.out.printf("Sexo da %d° pessoa: ", i);
            char sexo = scanner.next().toLowerCase().charAt(0);
            while (sexo != 'f' && sexo != 'm') {
                System.out.println("Sexo Inválido.");
                System.out.printf("Sexo da %d° pessoa: ", i);
                sexo = scanner.next().toLowerCase().charAt(0);
            }
            pessoas.add(new Pessoa(altura, sexo));
        }

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        for (Pessoa pessoa : pessoas) {
            // Verifica Menor altura
            if (pessoa.getAltura() < menorAltura) {
                menorAltura = pessoa.getAltura();
            }
            // Verifica Maior altura
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            }
        }

        double somaAlturaMulheres = 0.0;
        int contaMulheres = 0, contaHomens = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() == 'f') {
                somaAlturaMulheres += pessoa.getAltura();
                contaMulheres++;
            } else {
                contaHomens++;
            }
        }

        double mediaAlturaMulheres = somaAlturaMulheres / contaMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturaMulheres);
        System.out.printf("Número de homens = %d\n", contaHomens);

        scanner.close();
    }
}
