package br.com.maratonajava.javacore.enumeracao.dominio;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Juridica");
	
	private final int ID;
	private final String TIPO;
	
	private TipoCliente(int id, String tipo) {
		this.ID = id;
		this.TIPO = tipo;
	}
	
	public static TipoCliente tipoClientePorNomeRelatorio(String tipo) {
		for (TipoCliente tipoCliente : values()) {
			if (tipoCliente.getTIPO().equals(tipo)) {
				return tipoCliente;
			}
		}
		return null;
	}

	public int getID() {
		return ID;
	}

	public String getTIPO() {
		return TIPO;
	}	
	
}
