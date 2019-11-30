
public class Teste {
	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		ContaPoupanca c1 = new ContaPoupanca(123, "Ana", 10);
		ContaPoupanca c2 = new ContaPoupanca(456, "Antonio", 50);
		ContaPoupanca c3 = new ContaPoupanca(789, "Joaquim", 30);
		
		
		b.addConta(c1);
		b.addConta(c2);
		b.addConta(c3);
		System.out.println(b.addConta(c1));
		
		
		System.out.println(b.toString());
		System.out.println(b.imprimirCrescente());
		System.out.println(b.imprimirDecrescente());
		
		b.alterarConta(123, new ContaPoupanca(123, "Ana Caroline", 10));
		System.out.println(b.toString());
		
		b.removeConta(c2);
		System.out.println(b.toString());
		
		
		c1.credito(100);
		c3.debito(2);
		System.out.println(b.imprimirDecrescente());
		
		
		
//		
		
		
		
	}
}
