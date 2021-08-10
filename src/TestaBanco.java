
public class TestaBanco {
	public static void main(String []args) {
		Cliente murilo = new Cliente();
		murilo.setNome("Murilo Dutra Alves");
		murilo.setCpf("222.222.222-22");
		murilo.setProfissao("Programador");
		
		Conta contaDoMurilo = new Conta(123, 9878);
		contaDoMurilo.deposita(100);
		
		contaDoMurilo.setTitular(murilo);
		System.out.println(contaDoMurilo.getTitular().getNome());
	}
}
