package EmpresaA;

public class Assistente extends Funcionario{
	public double calculasalario() {
		return getSalariobase();
	}

	public Assistente(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
	} 
	

}
