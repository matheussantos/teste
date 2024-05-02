package br.com.maratonajava.javacore.throwable;

public class RuntimeExceptionTeste2 {

	public static void main(String[] args) {
		try {
			divisao(1, 0);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 
	 * @param a
	 * @param b - não pode ser 0
	 * @return valor inteiro
	 * @throws IllegalArgumentException se valor b for 0
	 */
	public static int divisao(int a, int b) throws IllegalArgumentException{
		if (b == 0) {
			throw new IllegalArgumentException("Argumento Ilegal, não pode ser 0");
		}
		
		return a/b;
		
		
	}

}
