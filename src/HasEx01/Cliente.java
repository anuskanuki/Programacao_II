package HasEx01;

public class Cliente {

    private String email;
    private String nome;
    private String dataDeNascimento;

    public Cliente(String email, String nome, String dataDeNascimento) {
        setEmail(email);
        setNome(nome);
        setDataDeNascimento(dataDeNascimento);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
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

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        if (dataDeNascimento == null) {
            throw new IllegalArgumentException("Data inválida");
        }
        this.dataDeNascimento = dataDeNascimento;
    }
}
