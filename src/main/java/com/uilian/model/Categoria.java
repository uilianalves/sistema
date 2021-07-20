package com.uilian.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table
@Entity(name = "CATEGORIA")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private Integer id;
		
		private String nomeCategoria;

		public Categoria() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNomeCategoria() {
			return nomeCategoria;
		}

		public void setNomeCategoria(String nomeCategoria) {
			this.nomeCategoria = nomeCategoria;
		}

		public Categoria(Integer id, String nomeCategoria) {
			super();
			this.id = id;
			this.nomeCategoria = nomeCategoria;
		}

		@Override
		public String toString() {
			return "Categoria [id=" + id + ", nomeCategoria=" + nomeCategoria + "]";
		}
		
		
		
}
