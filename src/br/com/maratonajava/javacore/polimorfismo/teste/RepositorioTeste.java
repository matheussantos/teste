package br.com.maratonajava.javacore.polimorfismo.teste;

import br.com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import br.com.maratonajava.javacore.polimorfismo.servico.RepositorioBandoDados;

public class RepositorioTeste {

	public static void main(String[] args) {
		Repositorio repositorio = new RepositorioBandoDados();
		
		repositorio.salvar();

	}

}
