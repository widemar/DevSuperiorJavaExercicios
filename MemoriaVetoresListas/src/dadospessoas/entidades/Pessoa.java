package dadospessoas.entidades;

public class Pessoa {
    private Double altura;
    private Character sexo;

    public Pessoa(Double altura, Character sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }



}
