package com.grupoatrium.persistencia.impl;

import java.util.List;

import com.grupoatrium.persistencia.ConnectionMgr;

public class AutorDAO implements ItfzDAO{
	
	private ConnectionMgr connectionMgr;
	
	public AutorDAO() {
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
		System.out.println("Insertar autor en base de datos");
		System.out.println(object.toString());
	}

	@Override
	public void update(Object object) {
		System.out.println("Modificar autor en base de datos");
	}

	@Override
	public void delete(Object object) {
		System.out.println("Eliminar autor en base de datos");
	}

	@Override
	public Object getOne(String key) {
		System.out.println("Obtener autor de base de datos" + key);
		return null;
	}

	@Override
	public List<Object> getAll() {
		System.out.println("Obtener autores de base de datos");
		return null;
	}
}
