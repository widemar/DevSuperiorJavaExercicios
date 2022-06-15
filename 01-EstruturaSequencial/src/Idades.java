import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");

        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();

        System.out.print("Idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Dados da segunda pessoa: ");

        System.out.print("Nome: ");
        scanner.nextLine();
        String nome2 = scanner.nextLine();

        System.out.print("Idade: ");
        int idade2 = scanner.nextInt();

        double idadeMedia = (double) (idade1 + idade2) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, idadeMedia);

        scanner.close();
    }
}
