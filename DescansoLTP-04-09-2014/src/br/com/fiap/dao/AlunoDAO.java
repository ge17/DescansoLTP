package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.beans.Aluno;

public class AlunoDAO {
	
	private List<Aluno> lstAlunos = new ArrayList<Aluno>();
	
	public void exibirAlunosOrdemCrescenteMedia(){
		
		Collections.sort(lstAlunos);
		
		for (Aluno alu : lstAlunos){
			
			System.out.println("Nome: " + alu.getNome() + "\nMédia: " + alu.getMedia());
			
		}
		
	}
	
	public void gravar(String nome, double media, int falta, int idade){
		Aluno aluno = new Aluno(nome, media, falta, idade);
		lstAlunos.add(aluno);
		
	}
	public int exibirTotal(){
		return lstAlunos.size();
		
	}
	
	public double exibirMediaNotas(){
		double total=0;
		
		for (Aluno a : lstAlunos){
			total += a.getMedia();
		}
		return total/lstAlunos.size();
	}

}
