package HashEx02;

public class Aluno implements Comparable<Aluno> {

    private int registroAcademico;
    private String nome;
    private String curso;
    private String semestreAtual;
    private String dataDeNascimento;

    public Aluno(int registroAcademico, String nome, String curso, String semestreAtual, String dataDeNascimento) {
        setRegistroAcademico(registroAcademico);
        setNome(nome);
        setCurso(curso);
        setSemestreAtual(semestreAtual);
        setDataDeNascimento(dataDeNascimento);
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        if (registroAcademico < 0) {
            throw new IllegalArgumentException("Registro Acadêmico inválido");
        }
        this.registroAcademico = registroAcademico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso inválido");
        }
        this.curso = curso;
    }

    public String getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(String semestreAtual) {
        if (semestreAtual == null) {
            throw new IllegalArgumentException("Semestre inválido");
        }
        this.semestreAtual = semestreAtual;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        if (dataDeNascimento == null) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public int compareTo(Aluno aluno) {//armazena todos os estudantes ordenados pelo registro academico
        if (this.getRegistroAcademico() > aluno.getRegistroAcademico()) {
            return -1;
        }
        if (this.getRegistroAcademico() < aluno.getRegistroAcademico()) {
            return 1;
        }
        return 0;
    }
}
