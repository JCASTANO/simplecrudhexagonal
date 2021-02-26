package com.unac.hexagonal.infraestructura.adaptador.repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.unac.hexagonal.dominio.dto.DtoUsuario;
import com.unac.hexagonal.dominio.modelo.Usuario;
import com.unac.hexagonal.dominio.puerto.repositorio.RepositorioUsuario;

@Repository
//Adapter - Arquitectura Hexagonal - Repository - design pattern
public class RepositorioUsuarioEnMemoria implements RepositorioUsuario {
	
	private List<Usuario> usuarios = new ArrayList<Usuario>(); 

	@Override
	public List<DtoUsuario> listar() {
		return usuarios.stream()
					   .map(usuario -> new DtoUsuario(usuario.getCorreoElectronico()))
					   .collect(Collectors.toList());
	}

	@Override
	public void guardar(Usuario usuario) {
		usuarios.add(usuario);
	}

	@Override
	public boolean existe(String correoElectronico) {
		return usuarios.stream()
					   .filter(usuario -> usuario.getCorreoElectronico()
					   .equals(correoElectronico))
					   .findFirst()
					   .isPresent();
	}
}
