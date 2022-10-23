package com.Slayer.loja.domain.enuns;

public enum Category {
	ELETRONICOS(0,"ROLE_ELETRONICOS"),ROUPAS(1,"ROLE_ROUPAS"),ALIMENTOS(2,"ROLE_ALIMENTOS");
	
	private Integer codigo;
	private String tipo;
	private Category(Integer codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}
	


	
}
