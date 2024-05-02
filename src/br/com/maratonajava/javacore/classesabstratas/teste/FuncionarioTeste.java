package br.com.maratonajava.javacore.classesabstratas.teste;

import br.com.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import br.com.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTeste {

	public static void main(String[] args) {
		//Classe Funcionario abstrata não pode ser instanciada
//		Funcionario funcionario = new Funcionario("Matheus", 10000);
		
		Gerente gerente = new Gerente("Marcela", 5000);
		Desenvolvedor desenvolvedor = new Desenvolvedor("Luis", 15500);
		
//		System.out.println(funcionario);
		
		System.out.println(gerente);
		System.out.println(desenvolvedor);
		
		gerente.imprime();
		desenvolvedor.imprime();

	}

}
