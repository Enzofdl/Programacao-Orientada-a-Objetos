package Relógio;

public class teste {

	public static void main(String[] args) {
		Tempo a = new Tempo(23, 59, 00);
		String aux = a.retornaTempo();
		System.out.print(aux);
		a.decrementaM();
		aux = a.retornaTempo();
		System.out.print(aux);
		a.incrementaM();
		a.incrementaM();
		aux = a.retornaTempo();
		System.out.print(aux);
	
	}

}
