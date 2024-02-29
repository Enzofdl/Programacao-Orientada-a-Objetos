package Loja;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Funcionario> Vet = new ArrayList <Funcionario>();
		Vendedor A =  new Vendedor("Moacir", "123123", 1000, 0);
		Administrador B =  new Administrador("Joao", "45555", 4444, 0);
		Administrador C =  new Administrador("junior", "120398", 5000, 5);
		Vendedor D =  new Vendedor("Heitor", "717273", 1000, 0);
		Vendedor E =  new Vendedor("Cleber", "12737123", 1000, 0);
		Vet.add(A);
		Vet.add(B);
		Vet.add(C);
		Vet.add(D);
		Vet.add(E);
		((Vendedor)Vet.get(0)).venda(1000);
		System.out.println(Vet.get(0).calculasalario());
		System.out.println(Vet.get(1).calculasalario());
		System.out.println(Vet.get(2).calculasalario());
		System.out.println(Vet.get(3).calculasalario());
		System.out.println(Vet.get(4).calculasalario());
		
		
		
		
	}

}
