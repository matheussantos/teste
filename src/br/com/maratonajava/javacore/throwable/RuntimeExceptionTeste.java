package br.com.maratonajava.javacore.throwable;

public class RuntimeExceptionTeste {

	public static void main(String[] args) {
		Object object = null;
		System.out.println("Lançando NullPointerException");
		System.out.println(object.toString());
		
		int[] num = {1,2};
		System.out.println("ArrayIndexOutOfBoundsException");
		System.out.println(num[2]);
	}

}
