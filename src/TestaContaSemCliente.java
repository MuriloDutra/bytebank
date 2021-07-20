
public class TestaContaSemCliente {
	public static void main (String []args) {
		Conta novaConta = new Conta();
		System.out.println(novaConta.getSaldo());
		novaConta.titular = new Cliente();
		System.out.println(novaConta.titular);
		
		novaConta.titular.nome = "Murilo";
		System.out.println(novaConta.titular.nome);
	}
}
