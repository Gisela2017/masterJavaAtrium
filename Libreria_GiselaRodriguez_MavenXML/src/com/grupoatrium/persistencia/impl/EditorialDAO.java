package com.grupoatrium.persistencia.impl;

import java.util.List;

import com.grupoatrium.persistencia.ConnectionMgr;

public class EditorialDAO implements ItfzDAO{
	
	private ConnectionMgr connectionMgr;
	
	public EditorialDAO() {
	}

	public ConnectionMgr getConnectionMgr() {
		System.out.println("Conexion a base de datos " + connectionMgr.toString());
		return connectionMgr;
	}

	public void setConnectionMgr(ConnectionMgr connectionMgr) {
		this.connectionMgr = connectionMgr;
	}
	
	@Override
	public void connection() {
		getConnectionMgr();
	}
	
	@Override
	public void insert(Object object) {
		System.out.println("Insertar editorial en base de datos");
		System.out.println(object.toString());
	}

	@Override
	public void update(Object object) {
		System.out.println("Modificar editorial en base de datos");
	}

	@Override
	public void delete(Object object) {
		System.out.println("Eliminar editorial en base de datos");
	}

	@Override
	public Object getOne(String key) {
		System.out.println("Obtener editorial de base de datos" + key);
		return null;
	}

	@Override
	public List<Object> getAll() {
		System.out.println("Obtener editoriales de base de datos");
		return null;
	}

}
