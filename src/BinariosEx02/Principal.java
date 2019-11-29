package BinariosEx02;

import BinariosEx01.Aluno;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

public class Principal {

    private Arquivo arquivo;

    public static void main(String[] args) throws FileNotFoundException {

        new Principal();

    }

    public Principal() throws FileNotFoundException {

        int opcao = 0;
        arquivo = new Arquivo("C:\\Users\\akrehn\\Documents\\prog2_teste\\binarioEx02.bin");
        try {
            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opcao:" + "\n1 - Inseir"
                        + "\n2 - Mostrar dados" + "\n3 - Sair"));

                switch (opcao) {
                    case 1:
                        inserirPessoa();
                        break;
                    case 2:
                        mostraDados();
                        break;

                }
            } while (opcao != 3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void inserirPessoa() throws IOException {

        Pessoa pessoaInserir;
        pessoaInserir = new Pessoa('F', 20, 'N');
        arquivo.inserir(pessoaInserir);

    }

    public void mostraDados() throws IOException {

        String pessoas = "";
        List<Pessoa> listaPessoas = arquivo.lerPessoa();

        for (Pessoa p : listaPessoas) {
            pessoas += p.toString() + "\n"
                    + "Percentual de fumantes em relação ao total:"
                    + percentualFumantes()
                    + "\nPercentual de homens não fumantes abaixo "
                    + "de 40 anos em relação ao número total ";
        }

        JOptionPane.showMessageDialog(null, pessoas);
    }

    public int percentualFumantes() {
        return 0;
    }

    public void percentualHomensFumantes() {

    }

    public void percentualMulheresFumantes() {

    }

}
