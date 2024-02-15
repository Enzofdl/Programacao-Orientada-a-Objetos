package Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Veiculos a = new Veiculos("monza", 2002);
		Caminhao b = new Caminhao("scania", 2012, 6);
		Onibus c = new Onibus("Volvo", 2005, 15);
		a.setAno("1995");
		a.exibirdados();
		b.exibirdados();
		c.exibirdados();

	}

}
