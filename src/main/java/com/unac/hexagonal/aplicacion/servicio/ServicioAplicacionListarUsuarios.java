package com.unac.hexagonal.aplicacion.servicio;

import java.util.List;

import org.springframework.stereotype.Component;

import com.unac.hexagonal.dominio.dto.DtoUsuario;
import com.unac.hexagonal.dominio.puerto.repositorio.RepositorioUsuario;

@Component
//service application - design pattern
public class ServicioAplicacionListarUsuarios {

	private final RepositorioUsuario repositorioUsuario;

	public ServicioAplicacionListarUsuarios(RepositorioUsuario repositorioUsuario) {
		this.repositorioUsuario = repositorioUsuario;
	}
	
	public List<DtoUsuario> ejecutar() {
		return this.repositorioUsuario.listar();
	}
}
