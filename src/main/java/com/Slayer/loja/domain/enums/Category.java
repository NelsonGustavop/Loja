package com.Slayer.loja.domain.enums;

public enum Category {
	ELETRONICOS(0, "ROLE_ELETRONICOS"), ROUPAS(1, "ROLE_ROUPAS"), ALIMENTOS(2, "ROLE_ALIMENTOS");

	private Integer codigo;
	private String tipo;

	private Category(Integer codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public static Category toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		} 
		for(Category x: Category.values()) {
			if(codigo.equals(x.getCodigo())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Invalid type");
	}
}
