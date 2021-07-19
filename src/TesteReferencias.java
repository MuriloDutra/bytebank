public class TesteReferencias {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		System.out.println("Saldo PRIMEIRA conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo SEGUNDA conta: " + primeiraConta.saldo);
		
		
		segundaConta.saldo += 100;
		System.out.println("Novo saldo da SEGUNDA conta: " + segundaConta.saldo);
		System.out.println("Novo saldo da PRIMEIRA conta: " + primeiraConta.saldo);

		System.out.println("primeiraConta: " + primeiraConta);
		System.out.println("segundaConta: " + segundaConta);
	}
}