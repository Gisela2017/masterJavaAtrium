package com.grupoatrium.negocio;

import java.util.List;

import com.grupoatrium.persistencia.impl.ItfzDAO;

public class EditorialService {

		// Inyeccion de dependencia
		private ItfzDAO dao;

		// Spring necesita de un constructor sin argumentos
		private EditorialService()
		{
		
		}
				
		// Metodo que Spring necesita para que se inyecte la propiedad dao
		public void setDao(ItfzDAO dao) {
			this.dao = dao;
		}
		
		public void connectar(){
			dao.connection();
		}

		public void altaEditorial(Object editorial) {
			dao.insert(editorial);
		}
		
		public void modificarEditorial(Object editorial) {
			dao.update(editorial);
		}
		
		public void eliminarEditorial(Object editorial) {
			dao.delete(editorial);
		}
		
		public Object obtenerEditorial(String key) {
			return (Object) dao.getOne(key);
		}
				
		public List<Object> obtenerTodos() {
			return dao.getAll();
		}
}
