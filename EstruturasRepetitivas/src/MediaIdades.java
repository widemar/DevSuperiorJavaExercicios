import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean idadePositiva = true;
        double somaIdade = 0;
        int contaIdade = 0;
        System.out.println("Digite as idades: ");
        while (idadePositiva) {
            int idade = scanner.nextInt();
            if (idade < 0) {
                idadePositiva = false;
                if (contaIdade == 0) {
                    System.out.println("Impossível calcular");
                }
            } else {
                somaIdade += idade;
                contaIdade++;
            }
        }
        double mediaIdade = somaIdade / contaIdade;
        if (somaIdade != 0) {
            System.out.printf("Média = %.2f", mediaIdade);
        }

        scanner.close();
    }
}
