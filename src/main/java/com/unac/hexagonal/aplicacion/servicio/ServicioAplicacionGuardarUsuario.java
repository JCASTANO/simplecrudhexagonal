package com.unac.hexagonal.aplicacion.servicio;

import org.springframework.stereotype.Component;

import com.unac.hexagonal.dominio.modelo.Usuario;
import com.unac.hexagonal.dominio.servicio.ServicioGuardarUsuario;

@Component
//service application - design pattern
public class ServicioAplicacionGuardarUsuario {

	private final ServicioGuardarUsuario servicioGuardarUsuario;

	public ServicioAplicacionGuardarUsuario(ServicioGuardarUsuario servicioGuardarUsuario) {
		this.servicioGuardarUsuario = servicioGuardarUsuario;
	}
	
	public void ejecutar(String correoElectronico, String clave) {
		this.servicioGuardarUsuario.guardar(new Usuario(correoElectronico, clave));
	}
}
