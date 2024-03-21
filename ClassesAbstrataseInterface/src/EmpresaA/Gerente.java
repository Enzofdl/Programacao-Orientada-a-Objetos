package EmpresaA;

public class Gerente extends Funcionario{
	
	public double calculasalario() {
		return getSalariobase()*2.0;
	}

	public Gerente(String nome, String matricula, double salariobase) {
		super(nome, matricula, salariobase);
		// TODO Auto-generated constructor stub
	}

	
	
	

}
