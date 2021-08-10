public class CriaConta {
	public static void main(String [] args) {
		Conta primeiraConta = new Conta(456, 1236);
		primeiraConta.deposita(200);
		primeiraConta.deposita(100);
		
		Conta segundaConta = new Conta(789, 4152);
		segundaConta.deposita(50);
		
		System.out.println("Primeira conta: " + primeiraConta.getSaldo());
		System.out.println("Segunda conta: " + segundaConta.getSaldo());
		
		System.out.println("Agência primeira conta: " + primeiraConta.getAgencia());
		System.out.println("Agência segunda conta: " + segundaConta.getAgencia());
		System.out.println("Titular primeira conta: " + primeiraConta.getAgencia());
		
		System.out.println("primeiraConta: " + primeiraConta);
		System.out.println("segundaConta: " + segundaConta);
	}
}