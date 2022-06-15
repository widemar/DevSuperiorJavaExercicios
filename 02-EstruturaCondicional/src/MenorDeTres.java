import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int valor2 = scanner.nextInt();

        System.out.print("Terceiro valor: ");
        int valor3 = scanner.nextInt();

        int menor = valor1 < valor2 && valor1 < valor3 ? valor1 : Math.min(valor2, valor3);

        System.out.printf("Menor = %d", menor);

        scanner.close();
    }
}
