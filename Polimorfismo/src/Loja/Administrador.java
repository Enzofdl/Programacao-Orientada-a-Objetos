package Loja;

public class Administrador extends Funcionario{
	private int horascompl;

	public Administrador(String nome, String rg, float salariobase, int horascompl) {
		super(nome, rg, salariobase);
		this.horascompl = horascompl;
	}

	public int getHorascompl() {
		return horascompl;
	}
	public void horacomp() {
		horascompl ++;
	}
	public double calculasalario() {
		setSalariofinal(super.calculasalario()+((getSalariobase()/100.0)*horascompl));
		return getSalariofinal();
	}
	public void zerahoras(){
		horascompl = 0;
	}
	

}


