package Ex02_Collections;
public class Conta {// implements Comparable<Conta> {

    private int numero;
    private String nomeUsuario;
    private int saldo;

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

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

//	@Override
//	public int compareTo(Conta outraConta) {
//		Conta outra = outraConta;
//		if (this.getSaldo() < outra.getSaldo()) {
//            return -1;
//        }
//        if (this.getSaldo() > outra.getSaldo()) {
//            return 1;
//        }
//        return 0;
//	}
}
