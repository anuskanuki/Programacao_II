package BinariosEx02;

public class Pessoa {

    private char sexo;
    private int idade;
    private char fumante;

    public Pessoa(char sexo, int idade, char fumante) {
        this.sexo = sexo;
        this.idade = idade;
        this.fumante = fumante;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getFumante() {
        return fumante;
    }

    public void setFumante(char fumante) {
        this.fumante = fumante;
    }

    public String toString() {
        return "Dados: " + "\n" + "Sexo: " + sexo + "\n" + "Idade: " + idade + "\n" + "Fumante: " + fumante;
    }

}
