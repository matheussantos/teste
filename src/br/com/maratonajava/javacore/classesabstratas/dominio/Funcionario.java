package br.com.maratonajava.javacore.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	
	@Override
	public void imprime() {	
		System.out.println("Metodo concreto sobrescrito de metodo abstrato");
	}

	public abstract void calculaBonus();

}
