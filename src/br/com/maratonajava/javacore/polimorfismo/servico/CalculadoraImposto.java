package br.com.maratonajava.javacore.polimorfismo.servico;

import br.com.maratonajava.javacore.polimorfismo.dominio.Computador;
import br.com.maratonajava.javacore.polimorfismo.dominio.Produto;
import br.com.maratonajava.javacore.polimorfismo.dominio.Smartv;

public class CalculadoraImposto {

	public static void calcularImpostoComputador(Computador computador) {
		System.out.println("Relatório Computador");
		double imposto = computador.calcularImposto();
		System.out.println("Computador: " + computador.getNome());
		System.out.println("Valor: " + computador.getValor());
		System.out.println("Imposto: " + imposto);
	}
	
	public static void calcularImpostoSmartv(Smartv smartv) {
		System.out.println("Relatório Computador");
		double imposto = smartv.calcularImposto();
		System.out.println("Computador: " + smartv.getNome());
		System.out.println("Valor: " + smartv.getValor());
		System.out.println("Imposto: " + imposto);
	}
	
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatório imposto");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto: " + imposto);
		if(produto instanceof Smartv) {
			String polegadas = ((Smartv)produto).getPolegadas();
			System.out.println("Polegadas: " + polegadas);			
		}
	}

}
