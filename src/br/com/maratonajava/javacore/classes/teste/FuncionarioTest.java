package br.com.maratonajava.javacore.classes.teste;

import br.com.maratonajava.javacore.classes.dominio.Funcionario;
import br.com.maratonajava.javacore.classes.dominio.Gerente;

public class FuncionarioTest {

	public static void main(String[] args) {
//		Funcionario funcionario = new Funcionario();
		
		//Utilizando construtor
		Funcionario funcionario = new Funcionario("Matheus", 31, new double[] {5300.45,5500.30,5742.70});
		
		Funcionario funcionario2 = new Funcionario("Luis", 65, new double[] {5300.45,5500.30,5742.70});
		
		//utilizando metodo set
//		funcionario.setNome("Matheus");
//		funcionario.setIdade(31);
//		funcionario.setSalarios(new double[] {5300.45,5500.30,5742.70});
		
		//utilizando metodo para sobrecarga
//		funcionario.init("Matheus", 31, new double[] {5300.45,5500.30,5742.70});
		
		funcionario.imprimeDados();
		funcionario.imprimeMediaSalario();
		
		funcionario2.imprimeDados();
		
		Funcionario.metodoEstatico();
		Gerente.metodoEstatico();

	}

}
