package br.com.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
	int MAX_DATA_SIZE = 10;
	
	void load();
	
	default void checkPermission() {
		System.out.println("Metodo concreto da interface");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Metodo estatico da interface");
	}

}
