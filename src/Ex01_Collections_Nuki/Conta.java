package Ex01_Collections_Nuki;

public class Conta implements Comparable {

    private int numero;
    private String nomeUsuario;
    private double saldo;

    public Conta(int numero, String nomeUsuario, int saldo) {
        setNumero(numero);
        setNomeUsuario(nomeUsuario);
        setSaldo(saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Object outraConta) {
        Conta outra = (Conta) outraConta;
        if (this.getSaldo() < outra.getSaldo()) {
            return -1;
        }
        if (this.getSaldo() > outra.getSaldo()) {
            return 1;
        }
        return 0;
    }

}

//public class Conta implements Comparable {
//
//    private int numero;
//    private String nomeUsuario;
//    private double saldo;
//
//    public Conta(int numero, String nomeUsuario, double saldo) {
//        setNumero(this.numero);
//        setNomeUsuario(this.nomeUsuario);
//        setSaldo(this.saldo);
//    }
//
//    public int getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        if (numero == null || numero.length() <= 1) {
//            throw new IllegalArgumentException("Nome inválido.");
//        }
//        this.numero = numero;
//    }
//
//    public String getNomeUsuario() {
//        return nomeUsuario;
//    }
//
//    public void setNomeUsuario(String nomeUsuario) {
//        if (nomeUsuario == null || nomeUsuario.length() <= 1) {
//            throw new IllegalArgumentException("Nome inválido.");
//        }
//        this.nomeUsuario = nomeUsuario;
//    }
//
//    public double getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(double saldo) {
//        this.saldo = saldo;
//    }
//
//    @Override
//    public int compareTo(Object outraConta) {
//        Conta outra = (Conta) outraConta;
//        if (this.getSaldo() < outra.getSaldo()) {
//            return -1;
//        }
//        if (this.getSaldo() > outra.getSaldo()) {
//            return 1;
//        }
//        return 0;
//    }
//
//}
