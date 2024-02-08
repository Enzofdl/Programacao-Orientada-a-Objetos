package ContaBancaria;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<ContaEspecial> A = new ArrayList<ContaEspecial>();
		ArrayList<ContaPoupanca> B = new ArrayList<ContaPoupanca>();
		
		A.add(new ContaEspecial("123098", "12398"));
		A.add(new ContaEspecial("312", "321"));
		B.add(new ContaPoupanca("111", "111"));
		B.add(new ContaPoupanca("0909", "0909"));
		
		A.get(0).depositar(1000);
		A.get(1).depositar(1000);
		B.get(0).depositar(1000);
		B.get(1).depositar(1000);
		
		System.out.println(A.get(0).sacar(2100));
		System.out.println(A.get(1).sacar(2000));
		System.out.println(B.get(0).sacar(1000));
		System.out.println(B.get(1).sacar(1900));

	}

}
