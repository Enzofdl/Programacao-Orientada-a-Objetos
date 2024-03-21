package EmpresaA;

public abstract class Funcionario implements Imprimivel {
	
	private final String nome;
	private final String matricula;
	private double salariobase;
	
	
	
	public abstract double calculasalario();
	
	public void mostrarDados() {
		System.out.print("\n" + nome + "\n" + matricula + "\n" + salariobase + "\nSalarioFinal:" + calculasalario() + "\n");
	}



	public double getSalariobase() {
		return salariobase;
	}



	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}



	public String getNome() {
		return nome;
	}



	public String getMatricula() {
		return matricula;
	}



	public Funcionario(String nome, String matricula, double salariobase) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.salariobase = salariobase;
	}
	
	
	
	
	
	

}
