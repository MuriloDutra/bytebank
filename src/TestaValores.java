
public class TestaValores {
	public static void main(String args []) {
		Conta conta01 = new Conta(544, 85202);
		Conta conta02 = new Conta(456, 7845);
		Conta conta03 = new Conta(456, 7845);

		System.out.println("Total de contas: " + Conta.getTotal());
	}
}
