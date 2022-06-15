package desafio.entidades;

public class Endereco {
    private String email;
    private String telefone;

    public Endereco(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return String.format(
                "Para dúvidas favor entrar em contato: %s ou %s ",
                email, telefone
        );
    }
}
