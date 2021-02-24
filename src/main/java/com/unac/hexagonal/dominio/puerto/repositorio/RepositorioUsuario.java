package com.unac.hexagonal.dominio.puerto.repositorio;

import java.util.List;

import com.unac.hexagonal.dominio.dto.DtoUsuario;
import com.unac.hexagonal.dominio.modelo.Usuario;

//Port - Arquitectura hexagonal
public interface RepositorioUsuario {

	List<DtoUsuario> listar();
	
	void guardar(Usuario usuario);
	boolean existe(String correoElectronico);
}
