package br.com.fiap.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;

public class AlunoDAO {
	
	private List<Aluno> lstAlunos = new ArrayList<Aluno>();
	
	public void gravar(String nome, double media, int falta, int idade){
		Aluno aluno = new Aluno(nome, media, falta, idade);
		lstAlunos.add(aluno);
		
	}

}
