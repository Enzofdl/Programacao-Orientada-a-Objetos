package Veiculo;

public class Onibus extends Veiculos{
	
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	
	

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	
	
	public void exibirdados() {
		super.exibirdados();
		System.out.println("Nro de assentos: " + assentos);
	}
	

}
