import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a quantidade de linhas da matriz? ");
        int linha = scanner.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        int coluna = scanner.nextInt();

        double[][] matriz = new double[linha][coluna];
        double[] somaLinha = new double[linha];

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("Digite os elementos da %d° linha:\n", i + 1);
            for (int j = 0; j < matriz[i].length; j++) {
                double num = scanner.nextDouble();
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            double soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
                somaLinha[i] = soma;
            }
        }

        System.out.println("Vetor gerado:");
        for (double v : somaLinha) {
            System.out.println(v);
        }

        scanner.close();
    }
}
