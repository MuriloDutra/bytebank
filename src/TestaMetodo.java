public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		System.out.println("Saldo de Conta: " + conta.saldo);
		boolean operacaoRealizada = conta.saca(20);
		System.out.println("Novo saldo de Conta: " + conta.saldo);
		System.out.println("BOOLEAN: " + operacaoRealizada);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);
		System.out.println("Saldo de Segunda Conta: " + segundaConta.saldo);
		segundaConta.transfere(300, conta);
		System.out.println("Novo saldo de Segunda Conta: " + segundaConta.saldo);
		System.out.println("Novo saldo de Conta: " + conta.saldo);
	}
}
