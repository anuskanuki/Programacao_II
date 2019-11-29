package CollectionsExercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private LinkedHashSet<Conta> listaDeContas;

    public Banco() {
        this.listaDeContas = (LinkedHashSet<Conta>) new HashSet();
    }

    public boolean addConta(Conta conta) {
        if (!listaDeContas.contains(conta)) {
            listaDeContas.add(conta);//poderia ser um void só com isso ou um boolean q fizesse isso só e retornasse true
            return true;
        }
        return false;
    }

    public boolean deleteConta(Conta conta) {
        if (listaDeContas.contains(conta)) {
            listaDeContas.remove(conta);
            return true;
        }
        return false;
    }

    public Set<Conta> listarContas() {
        return listaDeContas;
    }

    public String toString() {
        String info = "";

        Iterator<Conta> it = listaDeContas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta" + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$"
                    + c.getSaldo();
        }
        return info;
    }

    public Conta alterarConta(int numero, Conta novaConta) {
        Iterator<Conta> it = listaDeContas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            if (c.getNumero() == numero) {
                c.setNomeUsuario(novaConta.getNomeUsuario());
                c.setSaldo(novaConta.getSaldo());
                return c;
            }
        }
        return null;
    }

    public Conta buscarConta(int conta) {
        Iterator<Conta> it = listaDeContas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            if (c.getNumero() == conta) {
                return c;
            }
        }
        return null;
    }

    public String imprimirCrescente() {
        List<Conta> list = new ArrayList<Conta>(listaDeContas);
        Collections.sort(list);

        String info = "";
        Iterator<Conta> it = list.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta: " + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$" + c.getSaldo() + "\n";
        }
        return info;
    }

    public String imprimirDecrescente() {
        List<Conta> list = new ArrayList<Conta>(listaDeContas);
        Collections.sort(list, Collections.reverseOrder());

        String info = "";
        Iterator<Conta> it = list.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta: " + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$" + c.getSaldo() + "\n";
        }
        return info;
    }

}
