package com.grupoatrium.persistencia.impl;

import java.util.List;

public interface ItfzDAO {
	
	public void connection();
	
	public void insert(Object object);
	
	public void update(Object object);
	
	public void delete(Object object);
	
	public Object getOne(String key);
	
	public List<Object> getAll();

}
