package br.com.maratonajava.javacore.exercicios.dominio;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Local local;		

	public Seminario(String titulo) {
		this.titulo = titulo;
	}
	
	public void imprime() {
		System.out.println("Seminario");
		System.out.println(this.titulo);
		
		if (this.alunos == null) return;
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno.getNome());
		}
		
		System.out.println(this.local.getEndereco());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

}
