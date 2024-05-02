package br.com.maratonajava.introducao;

public class Aula06 {

	public static void main(String[] args) {
		byte dia = 6;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo dia não util!");
			break;
		case 2:
			System.out.println("Segunda dia útil!");
			break;
		case 3:
			System.out.println("Terça dia útil!");
			break;
		case 4:
			System.out.println("Quarta dia útil!");
			break;
		case 5:
			System.out.println("Quinta dia útil!");
			break;
		case 6:
			System.out.println("Sexta dia útil!");
			break;
		case 7:
			System.out.println("Sábado dia não util!");
			break;
		default:
			System.out.println("Data inválida!");
			break;
		}
		
		for(int i = 0; i < 1000 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i = 0; i < 50; i++) {
			if (i <= 25) {
				System.out.println(i);
			}else {
				break;
			}
		}
		
		double valorCarro = 87000;
		
		for(int i = 1; i <= valorCarro; i++) {
			
			if (valorCarro / i >= 1000) {
				System.out.println(i);
			} else {
				break;
			}
		}

	}

}
