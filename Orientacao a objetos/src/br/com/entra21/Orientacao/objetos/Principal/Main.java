package br.com.entra21.Orientacao.objetos.Principal;

import java.util.Scanner;

import br.com.entra21.Orientacao.objetos.classes.Aluno;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
	
		Aluno alunoTeste=new Aluno();
		
		Aluno outroAluno=new Aluno();
		
		Aluno alunoNovato=new Aluno();
		
		Aluno alunoObjeto=new Aluno();
		
		alunoObjeto.idade=18;
		
		alunoTeste.nome="Bárbara";
		alunoTeste.idade=30;
		
		outroAluno.idade=34;
		outroAluno.nome="Visitante";
		
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome=entrada.next();
		
		System.out.println("Qual a idade do "+alunoNovato.nome+"?");
		alunoNovato.idade=entrada.nextByte();
		
		

	}

}
