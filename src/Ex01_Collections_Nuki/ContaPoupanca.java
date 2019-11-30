package Ex01_Collections_Nuki;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String nomeUsuario, int saldo) {
        super(numero, nomeUsuario, saldo);
    }

    public void debito(double valor) {
        setSaldo(getSaldo() - valor);
    }
    //OU:
//public float debito(int valor) {
//		super.setSaldo(super.getSaldo() - valor);
//		return super.getSaldo();
//	}

    public void credito(double valor) {
        setSaldo(getSaldo() + valor);
    }

}
