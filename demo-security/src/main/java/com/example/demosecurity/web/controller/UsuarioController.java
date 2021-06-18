package com.example.demosecurity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demosecurity.domain.Usuario;

@Controller
@RequestMapping("usuarios")
public class UsuarioController {

	// abrir pagina home
	@GetMapping("/novo/cadastro")
	public String cadastroPorAdminParaAdminMedicoPaciente(Usuario usuario) {
		return "usuario/cadastro";
	}
}