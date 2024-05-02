package br.com.maratonajava.javacore.throwable;

public class ErroTeste {
	public static void main(String[] args) {
		System.out.println("Simulando StackOverFlowError");
		recursividade();
	}
	
	public static void recursividade() {
		recursividade();		
	}

}
