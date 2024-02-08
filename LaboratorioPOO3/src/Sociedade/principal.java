package Sociedade;

public class principal {

	public static void main(String[] args) {
		Cliente A = new Cliente("junior", "da silva", "8172983710823", "paraiba", 112, "126387", "rua dos mao na mesa");
		Fornecedor B = new Fornecedor("vendo coisinhas da anitta", " e sou fa da anitta", "198263", "uberlandia", 28, "1222223/0001-22",
				"casa da julia");

		B.info();
		A.infoPessoa();
		
	}

}
