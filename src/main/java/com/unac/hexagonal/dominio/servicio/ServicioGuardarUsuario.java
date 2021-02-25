package com.unac.hexagonal.dominio.servicio;

import org.springframework.stereotype.Service;

import com.unac.hexagonal.dominio.excepcion.ExcepcionUsuarioRepetido;
import com.unac.hexagonal.dominio.modelo.Usuario;
import com.unac.hexagonal.dominio.puerto.repositorio.RepositorioUsuario;

@Service
//service domain ddd - design pattern
public class ServicioGuardarUsuario {

	private static final String MENSAJE_USUARIO_REPETIDO = "El usuario ya existe en el sistema.";
	
	private final RepositorioUsuario repositorioUsuario;

	public ServicioGuardarUsuario(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}
	
	public void guardar(Usuario usuario) {
		
		garantizarNoUsuarioRepetido(usuario);
		
		this.repositorioUsuario.guardar(usuario);
	}

	private void garantizarNoUsuarioRepetido(Usuario usuario) {
		if(this.repositorioUsuario.existe(usuario.getCorreoElectronico())) {
			throw new ExcepcionUsuarioRepetido(MENSAJE_USUARIO_REPETIDO);
		}
	}
}
