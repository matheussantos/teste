package br.com.maratonajava.introducao;

public class Aula05 {

	public static void main(String[] args) {
		double salario = 70000;
		double taxa;
		double valorImposto;
		
		
		if (salario <= 34712) {
			taxa = 9.7 / 100;
			valorImposto = salario * taxa;
		} else if (salario > 34712 && salario <= 68507) {
			taxa = 37.35 / 100;
			valorImposto = salario * taxa;
		}else {
			taxa = 49.5 / 100;
			valorImposto = salario * taxa;
		}
		
		System.out.println("Para o salário " + salario + " a taxa é de: " + taxa + "% e o imposto: " + valorImposto);

	}

}
