package br.com.maratonajava.javacore.classes.teste;

import br.com.maratonajava.javacore.classes.dominio.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.marca= "Volkswagen";
		carro.modelo= "Virtus";
		carro.ano= 2023;
		
		System.out.println(carro.marca + carro.modelo + carro.ano);

	}

}
