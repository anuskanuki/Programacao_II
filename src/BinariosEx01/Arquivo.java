package BinariosEx01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private FileSystem fs;
    private Path arquivo;

    public Arquivo(String diretorioNomeArquivo) {
        fs = FileSystems.getDefault();

        //Local onde o arquivo ser� manipulado
        arquivo = fs.getPath(diretorioNomeArquivo);

        if (!Files.exists(arquivo)) {
            try {
                Files.createFile(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void inserirAluno(Aluno aluno, boolean manterArquivo) throws IOException {
        FileOutputStream fos = new FileOutputStream(
                arquivo.toFile(), manterArquivo);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream data = new DataOutputStream(bos);

        data.writeInt(aluno.getCodigoPessoa());
        data.writeUTF(aluno.getNome());
        data.writeFloat(aluno.getNota1());
        data.writeFloat(aluno.getNota2());
        data.writeFloat(aluno.getNota3());

        data.close();
    }

    public void removerAluno(int codigo) throws Exception {
        int alunoRemover = 0;

        List<Aluno> alunos = listarAlunos();
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigoPessoa() == codigo) {
                alunoRemover = i;
                break;
            }
        }

        alunos.remove(alunoRemover);

        boolean manter = false;

        for (Aluno a : alunos) {
            inserirAluno(a, manter);
            manter = true;
        }
    }

    public void alterarAluno(int codigoAlterar,
            Aluno novoAluno) throws Exception {

        List<Aluno> alunos = listarAlunos();

        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigoPessoa() == codigoAlterar) {
                alunos.get(i).setNome(novoAluno.getNome());
                alunos.get(i).setNota1(novoAluno.getNota1());
                alunos.get(i).setNota2(novoAluno.getNota2());
                alunos.get(i).setNota3(novoAluno.getNota3());
                break;
            }
        }

        boolean manter = false;

        for (Aluno a : alunos) {
            inserirAluno(a, manter);
            manter = true;
        }

    }

    public Aluno buscarAluno(int codigo) throws Exception {
        List<Aluno> alunos = listarAlunos();

        for (Aluno a : alunos) {
            if (a.getCodigoPessoa() == codigo) {
                return a;
            }
        }

        return null;
    }

    public List<Aluno> listarAlunos() throws Exception {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        FileInputStream fis = new FileInputStream(arquivo.toFile());
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream data = new DataInputStream(bis);

        try {
            while (true) {
                int codigo = data.readInt();
                String nome = data.readUTF();
                float n1 = data.readFloat();
                float n2 = data.readFloat();
                float n3 = data.readFloat();

                Aluno aluno = new Aluno(codigo, nome,
                        n1, n2, n3);

                alunos.add(aluno);
            }
        } catch (EOFException e) {
        }

        return alunos;
    }
}
