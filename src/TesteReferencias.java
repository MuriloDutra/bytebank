public class TesteReferencias {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(300);
		System.out.println("Saldo PRIMEIRA conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo SEGUNDA conta: " + primeiraConta.getSaldo());
		
		
		segundaConta.deposita(100);
		System.out.println("Novo saldo da SEGUNDA conta: " + segundaConta.getSaldo());
		System.out.println("Novo saldo da PRIMEIRA conta: " + primeiraConta.getSaldo());

		System.out.println("primeiraConta: " + primeiraConta);
		System.out.println("segundaConta: " + segundaConta);
	}
}