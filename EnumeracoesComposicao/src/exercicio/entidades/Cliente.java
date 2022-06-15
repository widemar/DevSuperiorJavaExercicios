package exercicio.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nome;
    private String email;
    private LocalDate dataDeNascimento;

    public Cliente(String nome, String email, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return String.format(
                "Cliente: %s (%s) - %s",
                nome, dataDeNascimento.format(formatter), email
        );
    }
}
