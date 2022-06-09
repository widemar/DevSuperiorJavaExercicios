import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiroRecebido = scanner.nextDouble();

        double total = quantidadeComprada * preco;

        String troco = dinheiroRecebido < total ?
                String.format("Dinheiro Insuficiente faltam R$%.2f reais", total - dinheiroRecebido) :
                String.format("Troco = %.2f", dinheiroRecebido - total);

        System.out.println(troco);


        scanner.close();
    }
}
