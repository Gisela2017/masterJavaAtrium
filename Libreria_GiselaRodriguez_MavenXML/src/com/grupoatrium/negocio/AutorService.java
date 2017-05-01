package com.grupoatrium.negocio;

import java.util.List;

import com.grupoatrium.persistencia.impl.ItfzDAO;

public class AutorService {

		// Inyeccion de dependencia
		private ItfzDAO dao;
		
		// Spring necesita de un constructor sin argumentos
		private AutorService()
		{
		
		}
		
		// Metodo que Spring necesita para que se inyecte la propiedad dao
		public void setDao(ItfzDAO dao) {
			this.dao = dao;
		}
		
		public void connectar(){
			dao.connection();
		}
		
		public void altaAutor(Object autor) {
			dao.insert(autor);
		}
		
		public void modificarAutor(Object autor) {
			dao.update(autor);
		}
		
		public void eliminarAutor(Object autor) {
			dao.delete(autor);
		}
		
		public Object obtenerAutor(String key) {
			return (Object) dao.getOne(key);
		}
		
		public List<Object> obtenerTodos() {
			return dao.getAll();
		}
}
