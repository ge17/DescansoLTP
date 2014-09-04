package br.com.fiap.beans;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private int falta;
	private int idade;
	private double media;
	
	public int comparaTo(Aluno outroAluno){
		if (media < outroAluno.getMedia()){
			return -1;
			
		}
		else if (media > outroAluno.getMedia()){
			return 1; 
			
		} else {
			return 0;
		}
		
	}

	
	public Aluno() {
		super();
		
	}
	public Aluno(String nome, double media, int falta, int idade) {
		super();
		this.nome = nome;
		this.falta = falta;
		this.idade = idade;
		this.media = media;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}


	@Override
	public int compareTo(Aluno o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	
}
