package Ex04_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EntradaPalavras {

    private List<String> palavras;

    public EntradaPalavras(String texto) {
        palavras = new LinkedList<>(Arrays.asList(texto.split(" ")));

        System.out.println(retornaPalavras());

        System.out.println(qtdCadaPalavra());

        System.out.println("Lista Somente Uma Palavra de Cada:");
        System.out.println(umaOcorrencia());

    }

    public String retornaPalavras() {
        String retorno = "";

        Iterator<String> it = palavras.iterator();
        while (it.hasNext()) {
            retorno += it.next() + "\n";
        }

        return retorno;
    }

    public String qtdCadaPalavra() {
        Set<String> listaUmaPalavra = new HashSet<>(palavras);
        Iterator<String> itUma = listaUmaPalavra.iterator();
        String retorno = "";

        while (itUma.hasNext()) {
            String palavra = itUma.next();

            int cont = 0;
            Iterator<String> itTodas = palavras.iterator();
            while (itTodas.hasNext()) {
                if (palavra.equalsIgnoreCase(itTodas.next())) {
                    cont++;
                }
            }

            retorno += "Palavra " + palavra + " Quantidade: " + cont + "\n";
        }

        return retorno;
    }

    public String umaOcorrencia() {
        String retorno = "";

        Set<String> listaUmaPalavra = new HashSet<>(palavras);
        Iterator<String> it = listaUmaPalavra.iterator();

        while (it.hasNext()) {
            retorno += it.next() + "\n";
        }

        return retorno;
    }

    public static void main(String[] args) {
        new EntradaPalavras("Boa noite tudo teste bem Boa noite tudo oi teste teste");
    }

}
