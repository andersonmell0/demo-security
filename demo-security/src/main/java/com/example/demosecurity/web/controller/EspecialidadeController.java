package com.example.demosecurity.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demosecurity.domain.Especialidade;
import com.example.demosecurity.service.EspecialidadeService;

@Controller      
@RequestMapping("especialidades")
public class EspecialidadeController {
	
	@Autowired
	private EspecialidadeService service;
	
	// abrir pagina especialidade
	@GetMapping({"","/"})
	public String abrir(Especialidade especialidade) {
		return "especialidade/especialidade";
	}
	
	// abrir para preEditar
	@GetMapping({"/editar/{id}"})
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("especialidade", service.buscarPorId(id));
		return "especialidade/especialidade";
	}
	
	//abrir excluir especialidade
	@GetMapping({"/excluir/{id}"})
	public String abrir(@PathVariable("id") Long id, RedirectAttributes redirect) {
		service.remover(id);
		redirect.addFlashAttribute("sucesso","Operação realizada!");
		return "redirect:/especialidades";
	}
	
	// salvar especialidade
	@PostMapping("/salvar")
	public String salvar(Especialidade especialidade, RedirectAttributes redirect) {
		service.salvar(especialidade);
		redirect.addFlashAttribute("sucesso", "Operação realizada!");
		return "redirect:/especialidades";
	}
	
	// listar pagina especialidade
	@GetMapping({"/datatables/server"})
	public ResponseEntity<?> getEspecialidades(HttpServletRequest request) {
		return ResponseEntity.ok(service.buscarEspecialidades(request));
	}
}