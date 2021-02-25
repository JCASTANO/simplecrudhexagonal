package com.unac.hexagonal.dominio.dto;

//data transfer object(dto) - design pattern
public class DtoUsuario {

	private String correoElectronico;
	
	public DtoUsuario(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}
}
