package Sociedade;

public class Fornecedor extends Pessoa{
	private String cnpj;
	private String endereco;
	
	
	public Fornecedor(String nome, String sobrenome, String rg, String lugarnascimento, int idade, String cnpj,
			String endereco) {
		super(nome, sobrenome, rg, lugarnascimento, idade);
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	public void info() {
		infoPessoa();
		System.out.println(cnpj + " " + endereco);
	}
	

}
