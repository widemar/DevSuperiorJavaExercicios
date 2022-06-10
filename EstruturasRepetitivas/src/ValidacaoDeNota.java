import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Valor inválido! tente novamento: ");
            nota1 = scanner.nextDouble();
        }
        soma += nota1;

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Valor inválido! tente novamento: ");
            nota2 = scanner.nextDouble();
        }
        soma += nota2;

        double media = soma / 2;
        System.out.printf("Media = %.2f", media);

        scanner.close();
    }
}
