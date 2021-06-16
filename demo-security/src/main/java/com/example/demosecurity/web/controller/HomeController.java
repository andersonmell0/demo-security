package com.example.demosecurity.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// abrir pagina home
	@GetMapping({"/", "/home"})
	public String home() {
		return "home";
	}
	
	// abrir pagina login
	@GetMapping({"/login"})
	public String login() {
		return "login";
	}
	
	// exibir erro login
	@GetMapping({"/login-error"})
	public String loginError(ModelMap model) {
		model.addAttribute("alerta","error");
		model.addAttribute("titulo","Credenciais inválidas");
		model.addAttribute("texto","Login ou senha incorretos, tente novamente.");
		model.addAttribute("subtexto","Acesso restrito para usuarios ativados.");
		return "login";
	}
}