package br.com.maratonajava.javacore.polimorfismo.servico;

import br.com.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

	@Override
	public void salvar() {
		System.out.println("Salvando em Arquivo");
	}

}
