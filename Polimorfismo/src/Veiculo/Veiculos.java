package Veiculo;

public class Veiculos {
	
	
	
	private String placa;
	private int ano;
	
	
	
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void setAno(String ano) {
		this.ano = Integer.valueOf(ano);
	}
	
	public Veiculos() {
		
	}
	public Veiculos(String placa, int ano) {
	this.placa = placa; 
	this.ano = ano;
	}
	
	
	public void exibirdados() {
		System.out.println("Placa: " + placa + "\nAno: " + ano);
	}
	

}
