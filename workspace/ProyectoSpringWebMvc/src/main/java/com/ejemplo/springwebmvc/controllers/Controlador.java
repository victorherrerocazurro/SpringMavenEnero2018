package com.ejemplo.springwebmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ejemplo.springwebmvc.dto.Coche;

@Controller
@RequestMapping(path="/Coche")
public class Controlador {

	//Filtramos la request
	@RequestMapping(path="/Alta", method=RequestMethod.POST)
	public void alta(Coche coche, Model model) {
		model.addAttribute("identificador", 1);
	}
	
	@RequestMapping(path="/consultaPorId/{id}")
	public void baja(@PathVariable int id) {
		
	}
	
	// /consultaPorNombre?name=Victor
	@RequestMapping(path="/consultaPorNombre")
	public void baja(@RequestParam("name") String nombre) {
		new ModelAndView();
	}
	
}
