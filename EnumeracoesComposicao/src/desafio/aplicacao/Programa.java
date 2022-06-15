package desafio.aplicacao;

import desafio.entidades.Departamento;
import desafio.entidades.Endereco;
import desafio.entidades.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String nomeDoDepartamento = scanner.nextLine();
        System.out.print("Dia do pagamento: ");
        int dia = scanner.nextInt();
        System.out.print("Email: ");
        scanner.nextLine();
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Departamento departamento = new Departamento(nomeDoDepartamento, dia, new Endereco(email, telefone));

        System.out.print("Quantos funcionários tem o departamento? ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            System.out.printf("Dados do funcionário %d:\n", i);
            System.out.print("Nome: ");
            scanner.nextLine();
            String nome = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            departamento.adicionarFuncionario(new Funcionario(nome, salario));
        }

        mostrarRelatorio(departamento);

        scanner.close();
    }

    private static void mostrarRelatorio(Departamento departamento) {
        System.out.println(departamento);
    }
}
