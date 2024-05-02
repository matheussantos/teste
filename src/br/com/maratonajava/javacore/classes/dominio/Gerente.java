package br.com.maratonajava.javacore.classes.dominio;

public class Gerente extends Funcionario{

	public Gerente(String nome, int idade, double[] salarios) {
		super(nome, idade, salarios);
	}
	
	public static void metodoEstatico() {
		System.out.println("Metodo estatico não sobrescrito na classe herdada");
	}

}
