package com.tecsup.javawebavanzado.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.javawebavanzado.sesion04.modelo.Usuario;

@Controller
@RequestMapping("/usuariopractica")
public class UsuarioPractica {

	private static final Logger logger = LoggerFactory.getLogger(UsuarioPractica.class);


	@GetMapping()
	public ModelAndView iniciar() {

		ModelAndView t = 
				new ModelAndView("usuario/formulario", "usuario", new Usuario());

		return t;
	}

	@PostMapping("/crear")
	public String crear(@ModelAttribute Usuario usuario, ModelMap model) {

		model.addAttribute("codigo", usuario.getCodigo());
		model.addAttribute("nombre", usuario.getNombre());
		model.addAttribute("descripcion", usuario.getDireccion());

		return "usuario/resultado";
	}

}