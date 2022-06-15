import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Valor por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scanner.nextInt();

        double pagamento = valorPorHora * horasTrabalhadas;

        System.out.printf("O pagamento para %s deve ser R$%.2f reais", nome, pagamento);

        scanner.close();
    }
}
