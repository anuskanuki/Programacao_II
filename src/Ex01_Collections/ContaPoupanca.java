public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, String nomeUsuario, int saldo) {
		super(numero, nomeUsuario, saldo);
	}

	public float debito(int valor) {
		super.setSaldo(super.getSaldo() - valor);
		return super.getSaldo();
	}
	
	public float credito(int valor) {
		super.setSaldo(super.getSaldo() + valor);
		return super.getSaldo();
	}
	
}
