
public class TestaContaSemCliente {
	public static void main (String []args) {
		Conta novaConta = new Conta(915, 7354);
		System.out.println(novaConta.getSaldo());
		novaConta.setTitular(new Cliente());
		System.out.println(novaConta.getTitular());
		
		novaConta.getTitular().setNome("Murilo");
		System.out.println(novaConta.getTitular().getNome());
	}
}
