package EmpresaA;

public class Vendedor extends Funcionario{
	
	private double comissao;
	public double calculasalario() {
		return getSalariobase()+comissao;
	}
	public Vendedor(String nome, String matricula, double salariobase, double comissao) {
		super(nome, matricula, salariobase);
		this.comissao = comissao;
		// TODO Auto-generated constructor stub
	}
	public void mostrarDados() {
		super.mostrarDados();
		System.out.print(comissao + "\n");
	}
	

}
