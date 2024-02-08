package ContaBancaria;

public class ContaEspecial extends Conta{
	private static double limite = -1000;
	
	public boolean sacar(double a) {
		if(limite>getSaldo()-a) return false;
		double s;
		s = getSaldo() - a;
		setSaldo(s);
		return true;
	}
	public ContaEspecial(String cpf, String nro) {
		super(cpf, nro);
	}

}
