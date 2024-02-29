package Loja;

public class Vendedor extends Funcionario {
	
	private int vendas;
	private double valor;

	public Vendedor(String nome, String rg, float salariobase, int vendas) {
		super(nome, rg, salariobase);
		this.vendas = vendas;
	}

	public int getVendas() {
		return vendas;
	}
	
	public void venda(double valor) {
		this.vendas++;
		this.valor += valor;
	}
	public double calculasalario() {
		setSalariofinal(super.calculasalario()+(valor*0.05));
		return getSalariofinal();
	}
	public void zeravenda() {
		vendas = 0;
		valor = 0;
	}
	
	

}
