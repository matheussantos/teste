package br.com.maratonajava.javacore.polimorfismo.dominio;

public class ConsoleGame extends Produto {
	public static final double IMPOSTO = 0.12;

	public ConsoleGame(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do Console");
		return this.valor * IMPOSTO;
	}

}
