package br.com.maratonajava.javacore.polimorfismo.dominio;

public class Smartv extends Produto {
	public static final double IMPOSTO = 0.06;
	private String polegadas;

	public Smartv(String nome, double valor, String polegadas) {
		super(nome, valor);
		this.polegadas = polegadas;
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto da Smartv");
		return this.valor * IMPOSTO;
	}

	public String getPolegadas() {
		return polegadas;
	}

}
