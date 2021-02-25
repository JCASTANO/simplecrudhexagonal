package com.unac.hexagonal.dominio.modelo;

import com.unac.hexagonal.dominio.excepcion.ExcepcionValorObligatorio;

public class ValidadorArgumento {

	public static void validarObligatorio(Object valor, String mensaje) {
		if(valor == null || valor.toString().isEmpty()) {
			throw new ExcepcionValorObligatorio(mensaje);
		}
	}
}
