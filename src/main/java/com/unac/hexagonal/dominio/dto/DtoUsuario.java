package com.unac.hexagonal.dominio.dto;

//Patrón data transfer object
public class DtoUsuario {

	private String correoElectronico;
	
	public DtoUsuario(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}
}
