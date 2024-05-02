package br.com.maratonajava.javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{

	@Override
	public void load() {
		System.out.println("Imprimindo do banco de dados");
		
	}

	@Override
	public void remove() {
		System.out.println("Removendo do banco de dados");
		
	}

	@Override
	public void checkPermission() {
		System.out.println("Metodo sobrescrito do metodo concreto da Interface");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Metodo não é sobrescrito da Interface e pertence a classe DatabaseLoader");
	}
	
	

}
