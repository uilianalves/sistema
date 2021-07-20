package com.uilian.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilian.model.Categoria;
import com.uilian.repository.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

	@Service
	  public class CategoriaService {
	      
	      @Autowired
	      private CategoriaRepository repo;
	      
	      /**
	       * 
	       * http://davifelipe.com.br/spring-boot-rest-update-delete
	       * 
	       * Find Category by id
	       * @param Integer id of the object
	       * @return object found or null if the object were not found
	       * */
	      public Categoria findById(Integer id) {
	          Optional<Categoria> obj = this.repo.findById(id);
	          return obj.orElse(null);
	      }
	      
	      /**
	       * Insert a new category
	       * @param Category category to be inserted
	       * @return Category object inserted 
	       * */
	      public Categoria insert(Categoria obj) {
	          obj.setId(null);
	          return this.repo.save(obj);
	      }
	      
	      /**
	       * Update a category object
	       * @param Category category to be updated
	       * @return Category object updated 
	     * @throws ObjectNotFoundException 
	       * */
	      public Categoria update(Categoria obj) throws ObjectNotFoundException {
	          if(this.findById(obj.getId()) == null) {
	              throw new ObjectNotFoundException("Obeject "+Categoria.class.getName()+" no found! ID "+obj.getId());
	          }
	          return this.repo.save(obj);
	      }
	      
	      /**
	       * Delete a category object by id
	       * @param category id
	     * @throws ObjectNotFoundException 
	       * */
	      public void delete(Integer id) throws ObjectNotFoundException {
	          
	    	  if(this.findById(id) == null) {
	              throw new ObjectNotFoundException("Obeject "+Categoria.class.getName()+" no found! ID "+id);
	          }
	          repo.deleteById(id);
	      }


}

