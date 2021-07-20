package com.uilian.resource;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias",method = RequestMethod.GET)
public class CategoriaResource {

	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public String listar() {
		return "Esta funcionando";
	}
}
