package BinariosEx01;

public class Aluno {

    private int codigoPessoa;
    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;

    public Aluno(int codigoPessoa, String nome,
            float nota1, float nota2, float nota3)
            throws Exception {
        this.setCodigoPessoa(codigoPessoa);
        this.setNome(nome);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
    }

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) throws Exception {
        if (codigoPessoa <= 0) {
            throw new Exception("C�digo de pessoa inv�lido");
        }
        this.codigoPessoa = codigoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null || nome.trim().equals("")) {
            throw new Exception("Nome n�o pode "
                    + "estar em branco");
        }
        if (nome.trim().length() < 3) {
            throw new Exception("Nome deve possuir 3 ou "
                    + "mais caracteres");
        }

        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String toString() {
        return "Aluno " + nome
                + "(" + codigoPessoa + "): \n"
                + "Notas: " + nota1 + ", " + nota2 + ", "
                + nota3;

    }

}
