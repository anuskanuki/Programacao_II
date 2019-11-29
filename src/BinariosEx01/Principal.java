package BinariosEx01;

import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcao = 0;
        int codigo = 1;
        Arquivo arquivo = new Arquivo("C:\\Users\\akrehn\\Documents\\prog2_teste\\arquivobinarioteste.bin");
        try {
            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma op��o:" + "\n1 - Inseir"
                        + "\n2 - Remover" + "\n3 - Alterar" + "\n4 - Mostrar todos" + "\n5 - Sair"));

                switch (opcao) {
                    case 1:
                        Aluno alunoInserir;
                        alunoInserir = new Aluno(codigo, "Joao",
                                10f, 9f, 9.5f);
                        codigo++;
                        arquivo.inserirAluno(alunoInserir,
                                true);
                        break;
                    case 2:
                        int codigoRemover = Integer.parseInt(
                                JOptionPane.showInputDialog("C�digo para remover"));
                        arquivo.removerAluno(codigoRemover);
                        break;
                    case 3:
                        Aluno aAlterar = new Aluno(1, "Jo�o da Silva",
                                10f, 9f, 9.5f);
                        int codigoAlt = Integer.parseInt(
                                JOptionPane.showInputDialog("C�digo para alterar"));
                        arquivo.alterarAluno(codigoAlt, aAlterar);
                        break;
                    case 4:
                        String alunos = "";
                        List<Aluno> listaAlunos = arquivo.listarAlunos();

                        for (Aluno a : listaAlunos) {
                            alunos += a.toString() + "\n";
                        }

                        JOptionPane.showMessageDialog(null,
                                alunos);
                        break;

                }
            } while (opcao != 5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
