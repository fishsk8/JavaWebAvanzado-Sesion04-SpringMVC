package com.tecsup.javawebavanzado.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ejercicio1")
public class Mapeo1Controller {

	private static final Logger logger = LoggerFactory.getLogger(Mapeo1Controller.class);

	@RequestMapping(method = RequestMethod.GET)
	public Map<String, String> get() {
		
		HashMap<String, String> persona = new HashMap<String, String>();
		persona.put("nombre", "Junior");
		persona.put("paterno", "Guzman");
		
		return persona;
	}


}
