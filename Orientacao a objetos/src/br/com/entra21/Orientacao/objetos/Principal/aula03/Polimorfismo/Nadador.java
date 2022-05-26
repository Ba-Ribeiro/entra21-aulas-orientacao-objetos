package br.com.entra21.orientacao.a.objetos.principal.aula03.Polimorfismo;

public class Nadador extends Atleta {
	
	private String modalidade;
	public Nadador() {
		
	}
	public Nadador(String modalidade) {
		super();
		this.modalidade = modalidade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	 

}