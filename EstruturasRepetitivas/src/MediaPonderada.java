import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos casos você vai digitar: ");
        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            System.out.println("Digite três números: ");
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double nota3 = scanner.nextDouble();

            int somaPesos = 2 + 3 + 5;
            double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / somaPesos;
            System.out.printf("Media = %.1f\n", mediaPonderada);
        }

        scanner.close();
    }
}
