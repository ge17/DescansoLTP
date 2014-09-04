package br.com.fiap.bo;

import br.com.fiap.dao.AlunoDAO;

public class AlunoBO {
	
	
	private AlunoDAO dao = new AlunoDAO();
	
	public void ordenaMedia(){
		dao.exibirAlunosOrdemCrescenteMedia();
	}
		
	public String inserir(String n, double m, int f, int i) throws Exception{
		if (i<2){
			throw new Exception("Idade inválida");
		}
		if (m>10 || m<0){
			throw new Exception("Média deve estar entre 0 e 10");
		}
		dao.gravar(n, m, f, i);
		return "Adicionado com sucesso!";
	}
	public int totalAlunos(){
		return dao.exibirTotal();
		
	}
	public double mediaNotas(){
		return dao.exibirMediaNotas();
	}

}
