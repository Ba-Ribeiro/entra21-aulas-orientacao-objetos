package br.com.entra21.Orientacao.objetos.Principal.aula02.heranca;

	public class Pessoa {
		private String nome;
		private byte idade;
		private String cpf;
		
		
		
		public Pessoa() {
			super();
		}

		public Pessoa(String nome, byte idade, String cpf) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
		}

		public String getName() {
			return nome;
		}

		public void setName(String name) {
			this.nome = name;
		}

		public byte getIdade() {
			return idade;
		}

		public void setIdade(byte idade) {
			this.idade = idade;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		

}
