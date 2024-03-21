package EmpresaA;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Funcionario> vet = new ArrayList<Funcionario>();
		vet.add(new Gerente("João", "123123", 1000));
		vet.add(new Vendedor("Caca", "2222", 600, 1203));
		vet.add(new Gerente("adao", "4444", 1000));
		vet.add(new Assistente("aaa", "912837", 100));
		vet.add(new Vendedor("matias", "7373", 1203, 0));
		
		
		for(int i =0 ; i<5; i++) {
			
			vet.get(i).mostrarDados();
			
			
		}
		
	}
}
