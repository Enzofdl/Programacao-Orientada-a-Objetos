package Sociedade;

public class Pessoa {

		protected String nome;
		protected String sobrenome;
		protected String rg;
		protected String lugarnascimento;
		protected int idade;
		
		public Pessoa(String nome, String sobrenome, String rg, String lugarnascimento, int idade) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.rg = rg;
			this.lugarnascimento = lugarnascimento;
			this.idade = idade;
		}
		public void infoPessoa() {
			System.out.println(nome + " " + sobrenome + " " + idade + " " + rg + " " + lugarnascimento);
		}
		
		
		
		
		
		
}
