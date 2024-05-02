package br.com.maratonajava.javacore.polimorfismo.teste;

import br.com.maratonajava.javacore.polimorfismo.dominio.Computador;
import br.com.maratonajava.javacore.polimorfismo.dominio.Smartv;
import br.com.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste {

	public static void main(String[] args) {
		Computador computador = new Computador("Lenovo", 9000);
		Smartv smartv = new Smartv("Samsung", 2500, "50");
		
		CalculadoraImposto.calcularImpostoComputador(computador);
		CalculadoraImposto.calcularImpostoSmartv(smartv);
	}

}
