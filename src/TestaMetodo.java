public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta(173, 8945);
		conta.deposita(50);
		System.out.println("Saldo de Conta: " + conta.getSaldo());
		boolean operacaoRealizada = conta.saca(20);
		System.out.println("Novo saldo de Conta: " + conta.getSaldo());
		System.out.println("BOOLEAN: " + operacaoRealizada);
		
		Conta segundaConta = new Conta(852, 4658);
		segundaConta.deposita(1000);
		System.out.println("Saldo de Segunda Conta: " + segundaConta.getSaldo());
		segundaConta.transfere(300, conta);
		System.out.println("Novo saldo de Segunda Conta: " + segundaConta.getSaldo());
		System.out.println("Novo saldo de Conta: " + conta.getSaldo());
	}
}
