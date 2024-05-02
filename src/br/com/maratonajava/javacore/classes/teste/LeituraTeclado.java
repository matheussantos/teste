package br.com.maratonajava.javacore.classes.teste;

import java.awt.im.InputContext;
import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String pergunta = input.nextLine();
		
		System.out.println(pergunta);
	}

}
