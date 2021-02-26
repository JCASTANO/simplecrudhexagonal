package com.unac.hexagonal.dominio.modelo;

import static com.unac.hexagonal.dominio.modelo.ValidadorArgumento.validarObligatorio;

//entity - design pattern en ddd (domain driver design)
public class Usuario {

	private static final String MENSAJE_CLAVE_OBLIGATORIA = "La clave es obligatoria.";
	private static final String MENSAJE_CORREO_OBLIGATORIO = "El correo electrónico es obligatorio.";
	
	private String correoElectronico;
	private String clave;

	public Usuario(String correoElectronico, String clave) {
		
		validarObligatorio(correoElectronico, MENSAJE_CORREO_OBLIGATORIO);
		validarObligatorio(clave, MENSAJE_CLAVE_OBLIGATORIA);
		
		this.correoElectronico = correoElectronico;
		this.clave = clave;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public String getClave() {
		return clave;
	}
}
