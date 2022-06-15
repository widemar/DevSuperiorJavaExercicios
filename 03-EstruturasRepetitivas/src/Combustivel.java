import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        boolean diferenteDeQuatro = true;
        int contaAlcool = 0, contaGasolina = 0, contaDiesel = 0;
        while (diferenteDeQuatro) {
            System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
            int codigo = scanner.nextInt();

            if (codigo < 1 || codigo > 4) {
                System.out.println("Código inválido");
            } else {
                switch (codigo) {
                    case 1 -> contaAlcool++;
                    case 2 -> contaGasolina++;
                    case 3 -> contaDiesel++;
                    case 4 -> diferenteDeQuatro = false;
                }
            }
        }

        System.out.println("Muito Obrigado");
        System.out.printf("Álcool: %d\n", contaAlcool);
        System.out.printf("Gasolina: %d\n", contaGasolina);
        System.out.printf("Diesel: %d\n", contaDiesel);

        scanner.close();
    }
}
