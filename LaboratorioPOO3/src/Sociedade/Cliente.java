package Sociedade;

public class Cliente extends Pessoa {
	private String cpf;
	private String endereco;
	
	public Cliente(String nome, String sobrenome, String rg, String lugarnascimento, int idade, String cpf, String endereco) {
		super(nome, sobrenome, rg, lugarnascimento, idade);
		this.cpf = cpf;
		this.endereco= endereco; 

	}
	public void info() {
		infoPessoa();
		System.out.println(cpf + " " + endereco);
	}
	

}
