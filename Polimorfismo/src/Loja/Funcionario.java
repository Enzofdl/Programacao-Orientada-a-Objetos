package Loja;

public class Funcionario {
	private String nome;
	private final String rg;
	private double salariobase;
	private double salariofinal;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	
	public double getSalariobase() {
		return salariobase;
	}
	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}
	public double getSalariofinal() {
		return salariofinal;
	}
	public void setSalariofinal(double salariofinal) {
		this.salariofinal = salariofinal;
	}
	
	public Funcionario(String nome, String rg, float salariobase) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.salariobase = salariobase;
	}
	
	public void zerasalario() {
		setSalariofinal(0);
	}
	public double calculasalario() {
		salariofinal = salariobase;
		return salariobase;
	}
	
}
