package br.com.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader{

	@Override
	public void load() {
		System.out.println("Imprimindo do arquivo");
	}

}
