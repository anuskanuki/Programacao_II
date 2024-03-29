package Ex02_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private Set<Conta> contas;

    public Banco() {
        this.contas = new LinkedHashSet<>();
    }

    public boolean addConta(Conta conta) {
        if (!contas.contains(conta)) {
            contas.add(conta);
            return true;
        }
        return false;
    }

    public boolean removeConta(Conta conta) {
        if (contas.contains(conta)) {
            contas.remove(conta);
            return true;
        }
        return false;
    }

    public Set<Conta> listarContas() {
        return contas;
    }

    public String toString() {
        String info = "";
        Iterator<Conta> it = contas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta: " + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$" + c.getSaldo() + "\n";
        }
        return info;
    }

    public Conta alterarConta(int numero, Conta novaConta) {
        Iterator<Conta> it = contas.iterator();
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

    public Conta buscarConta(String nome) {
        Iterator<Conta> it = contas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            if (c.getNomeUsuario().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Conta buscarConta(int conta) {
        Iterator<Conta> it = contas.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            if (c.getNumero() == conta) {
                return c;
            }
        }
        return null;
    }

    public String imprimirCrescente() {
        List<Conta> list = new ArrayList<Conta>(contas);
//		Collections.sort(list);

        String info = "";
        Iterator<Conta> it = list.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta: " + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$" + c.getSaldo() + "\n";
        }
        return info;
    }

    public String imprimirDecrescente() {
        List<Conta> list = new ArrayList<Conta>(contas);
//		Collections.sort(list, Collections.reverseOrder());

        String info = "";
        Iterator<Conta> it = list.iterator();
        while (it.hasNext()) {
            Conta c = it.next();
            info += "Conta: " + c.getNumero() + " (" + c.getNomeUsuario() + ") - Saldo: R$" + c.getSaldo() + "\n";
        }
        return info;
    }
}
