package br.com.maratonajava.javacore.exercicios.dominio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;	
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
	}
	
	public void imprime() {
		System.out.println("Professor: " + this.nome);
		System.out.println("Especialidade: "+ this.especialidade);
		if (this.seminarios == null)return;
		for (Seminario seminario : this.seminarios) {
			System.out.println("Seminario: "+seminario.getTitulo());
			System.out.println("Endereço: "+seminario.getLocal().getEndereco());
			if (seminario.getAlunos() == null) continue;
			for (Aluno aluno : seminario.getAlunos()) {
				System.out.println("Aluno: " + aluno.getNome());
			}
		}		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

}
