import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = scanner.nextDouble();

        double novoSalario, aumento, porcentagem;
        if (salario <= 1000.00) {
            porcentagem = 20;
            aumento = salario * (porcentagem / 100);
            novoSalario = salario + aumento;
        } else if (salario <= 3000.00) {
            porcentagem = 15;
            aumento = salario * (porcentagem / 100);
            novoSalario = salario + aumento;
        } else if (salario <= 8000.00) {
            porcentagem = 10;
            aumento = salario * (porcentagem / 100);
            novoSalario = salario + aumento;
        } else {
            porcentagem = 5;
            aumento = salario * (porcentagem / 100);
            novoSalario = salario + aumento;
        }

        System.out.printf("Novo salário = R$%.2f\n", novoSalario);
        System.out.printf("Aumento = R$%.2f\n", aumento);
        System.out.printf("Porcentagem = %d%%", (int) porcentagem);

        scanner.close();
    }
}
