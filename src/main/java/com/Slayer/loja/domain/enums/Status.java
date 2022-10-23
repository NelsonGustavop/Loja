package com.Slayer.loja.domain.enums;

public enum Status {
	ELETRONICOS(0, "ABERTO"), ROUPAS(1, "ANDAMENTO"), ALIMENTOS(2, "ENCERRADO");

	private Integer codigo;
	private String tipo;

	private Status(Integer codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public static Status toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		} 
		for(Status x: Status.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid type");
	}
}
