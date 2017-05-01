package com.grupoatrium.persistencia.impl;

import java.util.List;

import com.grupoatrium.persistencia.ConnectionMgr;

public class LibroDAO implements ItfzDAO{
	
	private ConnectionMgr connectionMgr;
	
	public LibroDAO() {
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
		System.out.println("Insertar libro en base de datos");
		System.out.println(object.toString());
	}

	@Override
	public void update(Object object) {
		System.out.println("Modificar libro en base de datos");
	}

	@Override
	public void delete(Object object) {
		System.out.println("Eliminar libro en base de datos");
	}

	@Override
	public Object getOne(String key) {
		System.out.println("Obtener libro de base de datos" + key);
		return null;
	}
	
	@Override
	public List<Object> getAll() {
		System.out.println("Obtener libros de base de datos");
		return null;
	}
	
}
