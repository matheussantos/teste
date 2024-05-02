package br.com.maratonajava.javacore.enumeracao.teste;

import br.com.maratonajava.javacore.enumeracao.dominio.Cliente;
import br.com.maratonajava.javacore.enumeracao.dominio.TipoCliente;
import br.com.maratonajava.javacore.enumeracao.dominio.TipoPagamento;

public class ClienteTeste {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Matheus", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Valdelisa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
		
		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		
		TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
		System.out.println(tipoCliente);

	}

}
