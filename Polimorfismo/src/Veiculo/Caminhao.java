package Veiculo;

public class Caminhao extends Veiculos{
	private int eixos;
	
	Caminhao(String placa, int ano, int eixos){
		super(placa, ano);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	public void exibirdados() {
		super.exibirdados();
		System.out.println("Nro de eixos: " + eixos);
	}

}
