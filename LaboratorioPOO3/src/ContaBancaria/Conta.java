package ContaBancaria;

public class Conta {
	private final String cpf;
	private final String nro;
	private double saldo;
	
	public boolean sacar(double a) {
		if(saldo >= a) saldo-=a;
		else return false;
		return true;
	}
	public void depositar(double a) {
		saldo+= a;
	}
	
	
	public Conta(String cpf, String nro) {
		this.cpf = cpf;
		this.nro = nro;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getCpf() {
		return cpf;
	}
	public String getNro() {
		return nro;
	}
}
