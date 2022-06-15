import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = scanner.nextDouble();

        double troco = dinheiroRecebido - preco * quantidade;

        System.out.printf("Troco = %.2f", troco);

        scanner.close();
    }
}
