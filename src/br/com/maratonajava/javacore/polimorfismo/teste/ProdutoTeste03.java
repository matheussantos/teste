package br.com.maratonajava.javacore.polimorfismo.teste;

import br.com.maratonajava.javacore.polimorfismo.dominio.Computador;
import br.com.maratonajava.javacore.polimorfismo.dominio.Smartv;
import br.com.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {

	public static void main(String[] args) {
		Computador computador = new Computador("Lenovo", 9000);
		Smartv smartv = new Smartv("Samsung", 9000, "50");

		CalculadoraImposto.calcularImposto(computador);
		CalculadoraImposto.calcularImposto(smartv);
	}

}
