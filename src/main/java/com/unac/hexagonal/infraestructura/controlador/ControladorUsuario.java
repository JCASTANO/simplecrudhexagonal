package com.unac.hexagonal.infraestructura.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unac.hexagonal.aplicacion.servicio.ServicioAplicacionGuardarUsuario;
import com.unac.hexagonal.aplicacion.servicio.ServicioAplicacionListarUsuarios;
import com.unac.hexagonal.dominio.dto.DtoUsuario;

@RestController
//design pattern controller
public class ControladorUsuario {
	
	private final ServicioAplicacionListarUsuarios servicioAplicacionListarUsuarios;
	private final ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario;

	public ControladorUsuario(ServicioAplicacionListarUsuarios servicioAplicacionListarUsuarios,
			ServicioAplicacionGuardarUsuario servicioAplicacionGuardarUsuario) {
		this.servicioAplicacionListarUsuarios = servicioAplicacionListarUsuarios;
		this.servicioAplicacionGuardarUsuario = servicioAplicacionGuardarUsuario;
	}
	
	@RequestMapping("/usuarios")
	public List<DtoUsuario> listar() {
		return this.servicioAplicacionListarUsuarios.ejecutar();
	}
	
	@PostMapping("/usuarios")
	public void guardar(@RequestBody Map<String, Object> json) {
		this.servicioAplicacionGuardarUsuario.ejecutar(obtenerValor(json, "correoElectronico"), 
													   obtenerValor(json, "clave"));
	}

	private String obtenerValor(Map<String, Object> json, String llave) {
		return json.get(llave).toString();
	}
}
