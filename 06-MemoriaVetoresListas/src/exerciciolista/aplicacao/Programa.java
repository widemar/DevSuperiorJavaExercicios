package exerciciolista.aplicacao;

import exerciciolista.entidades.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão cadastrados? ");
        int qtdDeFuncionarios = scanner.nextInt();

        for (int i = 1; i <= qtdDeFuncionarios; i++) {
            System.out.printf("Funcionário #%d:\n", i);
            System.out.print("Id: ");
            int id = scanner.nextInt();
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salario: ");
            double salario = scanner.nextDouble();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
        int id = scanner.nextInt();

        Funcionario func = funcionarios
                .stream()
                .filter(funcionario -> funcionario.getId() == id)
                .findFirst()
                .orElse(null);

        if (func != null) {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = scanner.nextDouble();
            func.aumentarSalario(porcentagem);
        } else {
            System.out.println("Esse ID não existe!!!");
        }

        System.out.println("Lista de funcionários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        scanner.close();
    }
}
