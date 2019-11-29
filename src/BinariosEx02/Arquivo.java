package BinariosEx02;

import BinariosEx01.Aluno;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Arquivo {

    //FileOutputStream fos = null;//cria o arquivo
    //BufferedOutputStream bos = null;//buffer de saída(alocar na memoria)
    //DataOutputStream data = null;//p usar o buffer
    private FileSystem fs;
    private Path arquivo;

    public Arquivo(String diretorioNomeArquivo) throws FileNotFoundException {

        fs = FileSystems.getDefault();
        arquivo = fs.getPath(diretorioNomeArquivo);

        if (!Files.exists(arquivo)) {
            try {
                Files.createFile(arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void inserir(Pessoa pessoa) throws IOException {

        FileOutputStream fos = new FileOutputStream(
                arquivo.toFile(), true);;
        BufferedOutputStream bos = bos = new BufferedOutputStream(fos);
        DataOutputStream data = data = new DataOutputStream(bos);

        fos = new FileOutputStream(
                arquivo.toFile(), true);

        data.writeChar(pessoa.getSexo());
        data.writeInt(pessoa.getIdade());
        data.writeChar(pessoa.getFumante());

        data.close();
    }

    public List<Pessoa> lerPessoa() throws FileNotFoundException, IOException {
        List<Pessoa> retorno = null;

        FileInputStream fis = new FileInputStream(arquivo.toFile());
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream data = new DataInputStream(bis);

        try {
            while (true) {
                char sexo = data.readChar();
                int idade = data.readInt();
                char fumante = data.readChar();

                Pessoa pessoa = new Pessoa(sexo, idade,
                        fumante);

                retorno.add(pessoa);
            }
        } catch (EOFException e) {
        }
        return retorno;
    }
}
