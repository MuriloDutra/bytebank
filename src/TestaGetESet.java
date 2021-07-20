
public class TestaGetESet {
	public static void main(String args[]) {
		Conta conta = new Conta();
		conta.setNumero(1237);
		System.out.println(conta.getNumero());
		
		Cliente murilo = new Cliente();
		conta.setTitular(murilo);
	}
}
