package funcionarios.aplicacao;

import funcionarios.entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        System.out.print("Imposto: ");
        double imposto = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
        System.out.printf("Funcionário: %s\n", funcionario);

        System.out.print("Qual a porcentagem para aumentar o salário: ");
        double porcentagem = scanner.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.printf("Dados atualizados: %s", funcionario);

        scanner.close();
    }
}
