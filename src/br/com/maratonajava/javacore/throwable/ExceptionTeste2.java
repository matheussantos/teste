package br.com.maratonajava.javacore.throwable;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste2 {

	public static void main(String[] args) {
		criarNovoArquivo();

	}
	
	public static void criarNovoArquivo() {
		File file = new File("arquivo\\teste.txt");
		
		try {
			boolean isCriado = file.createNewFile();
			System.out.println("Arquivo criado " + isCriado);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
