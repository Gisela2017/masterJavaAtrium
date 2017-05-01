package com.grupoatrium.negocio;

import java.util.List;

import com.grupoatrium.persistencia.ConnectionMgr;
import com.grupoatrium.persistencia.impl.ItfzDAO;

public class LibroService {

		// Inyeccion de dependencia
		private ItfzDAO dao;

		// Spring necesita de un constructor sin argumentos
		private LibroService()
		{
		
		}
				
		// Metodo que Spring necesita para que se inyecte la propiedad dao
		public void setDao(ItfzDAO dao) {
			this.dao = dao;
		}
		
		public void connectar(){
			dao.connection();
		}

		public void altaLibro(Object libro) {
			dao.insert(libro);
		}
		
		public void modificarLibro(Object libro) {
			dao.update(libro);
		}
		
		public void eliminarLibro(Object libro) {
			dao.delete(libro);
		}
		
		public Object obtenerAutor(String key) {
			return (Object) dao.getOne(key);
		}
				
		public List<Object> obtenerTodos() {
			return dao.getAll();
		}
}
