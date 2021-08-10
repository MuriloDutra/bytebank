
public class TestaGetESet {
	public static void main(String args[]) {
		Conta conta = new Conta(1345, 7845);
		conta.setNumero(1237);
		System.out.println(conta.getNumero());
		
		Cliente murilo = new Cliente();
		conta.setTitular(murilo);
	}
}
