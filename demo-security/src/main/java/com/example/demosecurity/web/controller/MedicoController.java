package com.example.demosecurity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demosecurity.domain.Medico;

@Controller
@RequestMapping("medicos")
public class MedicoController {

	// abrir pagina home
	@GetMapping("/dados")
	public String abrirPorMedico(Medico medico, ModelMap model) {
		
		return "medico/cadastro";
	}
	
}