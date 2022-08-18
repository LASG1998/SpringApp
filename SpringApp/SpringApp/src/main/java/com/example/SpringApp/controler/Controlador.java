package com.example.SpringApp.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.SpringApp.interfaceService.IAlumnoService;
import com.example.SpringApp.modelo.Alumno;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IAlumnoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Alumno>alumnos=service.listar();
		model.addAttribute("alumnos", alumnos);
		return "index";
	}
	
	@GetMapping(value="/new")
	public String agregar(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Alumno a, Model model) {
		service.save(a);
		return "redirect:/listar";
		
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Alumno>alumno=service.listarId(id);
		model.addAttribute("alumno", alumno);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
