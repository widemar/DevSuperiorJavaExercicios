import java.util.Locale;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        do {
            System.out.print("Digite dois números: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if (num1 != num2) {
                System.out.println(num1 < num2 ? "Crescente!!!" : "Decrescente!!!");
            }
        } while (num1 != num2);

        scanner.close();
    }
}
