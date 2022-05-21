package br.com.entra21.Orientacao.objetos.classes;

import java.util.Scanner;

public class Aluno {
	
	// definir atributos de uma aluno e cada objeto aluno tera essas variaveis, chamadas de atributos
	public String nome;
	public byte idade;
	public byte quantidadePresencas;
	
	// declaração so tem, acesso e tipo de retorno.
	public Aluno() {// construtor vazio que ao utilizar o (new Aluno) ele é executado
	}
	
	public byte responderChamada() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("O aluno "+this.nome+"está ai?");
		String resposta = entrada.next();
		if(resposta.equalsIgnoreCase("SIMMM")) {
			this.quantidadePresencas++;
			
		}
		return this.quantidadePresencas;
		}
		
	}


