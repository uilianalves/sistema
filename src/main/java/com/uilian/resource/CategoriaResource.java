package com.uilian.resource;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uilian.model.Categoria;
import com.uilian.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoria;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
	//	public ResponseEntity<?> listar() {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritoria");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		return lista;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Categoria cat = categoria.findById(id);
		
		return ResponseEntity.ok().body(cat);
	}
	
}
