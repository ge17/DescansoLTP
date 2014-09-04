package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.bo.AlunoBO;

public class Teste {
	
	public static void main(String[] args) {
		
		AlunoBO aluno = new AlunoBO();
		
		int resp = 0, intFaltas=0, intIdade=0;
		double dblMedia = 0;
		String strNome = null;
		
		try {
			
			while (resp == 0){
				
				strNome = JOptionPane.showInputDialog("Digite o nome do aluno");
				
			dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a média"));
			
			intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas"));
			
			intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			aluno.inserir(strNome, dblMedia, intFaltas, intIdade);
			
			resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?" , "Camadas" ,
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					
			
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		aluno.ordenaMedia();
		
		System.out.println("Total: " + aluno.totalAlunos());
		
	}
	
	

}
