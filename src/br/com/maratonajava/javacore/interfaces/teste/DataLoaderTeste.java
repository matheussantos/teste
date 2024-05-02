package br.com.maratonajava.javacore.interfaces.teste;

import br.com.maratonajava.javacore.interfaces.dominio.DataLoader;
import br.com.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import br.com.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTeste {

	public static void main(String[] args) {
		DatabaseLoader dbl = new DatabaseLoader();
		FileLoader fl = new FileLoader();
		
		dbl.load();
		fl.load();
		
		dbl.remove();
		
		dbl.checkPermission();
		fl.checkPermission();
		
		DataLoader.retrieveMaxDataSize();
		DatabaseLoader.retrieveMaxDataSize();

	}

}
