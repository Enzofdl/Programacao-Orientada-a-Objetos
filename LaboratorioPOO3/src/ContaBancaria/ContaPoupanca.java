package ContaBancaria;

public class ContaPoupanca extends Conta {
	private static double rendimento;
	
	public ContaPoupanca(String cpf, String nro) {
		super(cpf, nro);
	}
	public static void mudarrendimento(double b) {
		rendimento = b;
	}
	
	public void calcularNovoSaldo() {
		double s = getSaldo()*rendimento;
		setSaldo(s);
	}

}
