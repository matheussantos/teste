package br.com.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto {
	public static final double IMPOSTO = 0.21;

	public Computador(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do Computador");
		return this.valor * IMPOSTO;
	}

}
