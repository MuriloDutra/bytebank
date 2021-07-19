public class CriaConta {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		System.out.println("Segunda conta: " + segundaConta.saldo);
		
		System.out.println("Agência primeira conta: " + primeiraConta.agencia);
		System.out.println("Agência segunda conta: " + segundaConta.agencia);
		System.out.println("Titular primeira conta: " + primeiraConta.titular);
		
		System.out.println("primeiraConta: " + primeiraConta);
		System.out.println("segundaConta: " + segundaConta);
	}
}