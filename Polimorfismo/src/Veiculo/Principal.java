package Veiculo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Veiculos a = new Veiculos("monza", 2002);
		Caminhao b = new Caminhao("scania", 2012, 6);
		Onibus c = new Onibus("Volvo", 2005, 15);
		
		ArrayList <Veiculos> vet = new ArrayList <Veiculos>();
		vet.add(a);
		vet.add(b);
		vet.add(c);
		
		
		vet.get(0).setAno("1995");
		vet.get(0).exibirdados();
		vet.get(1).exibirdados();
		vet.get(2).exibirdados();

	}

}
