package br.com.maratonajava.javacore.classes.dominio;

public class Funcionario {
	private String nome;
	private int idade;
	private double[] salarios;
	private double mediaSalario;
	
	{
		System.out.println("Bloco Inicialização");
	}
	
	public Funcionario(String nome, int idade, double[] salarios) {
		this.nome = nome;
		this.idade = idade;
		this.salarios = salarios;
		
		System.out.println("Construtor");
	}
	
	public void init(String nome, int idade, double[] salarios) {
		this.nome = nome;
		this.idade = idade;
		this.salarios = salarios;
	}
	
	public void imprimeDados() {
		System.out.println("Nome: "+ this.nome);
		System.out.println("Idade: "+ this.idade);
		
		if (salarios == null) {
			return;
		}
		
		for (double salario : this.salarios) {
			System.out.print(salario + " ");
		}
	}
	
	public void imprimeMediaSalario() {
		if (salarios == null) {
			return;
		}		
				
		for (double salario : salarios) {
			this.mediaSalario +=  salario;
		}
		
		this.mediaSalario /= salarios.length;
		System.out.println(this.mediaSalario);
	}
	
	public static void metodoEstatico() {
		System.out.println("Metodo estatico");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double[] getSalarios() {
		return salarios;
	}

	public void setSalarios(double[] salarios) {
		this.salarios = salarios;
	}

	public double getMediaSalario() {
		return mediaSalario;
	}

}
