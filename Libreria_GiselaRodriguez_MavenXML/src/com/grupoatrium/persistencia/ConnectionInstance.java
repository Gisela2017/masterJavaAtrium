package com.grupoatrium.persistencia;

public class ConnectionInstance {

	private ConnectionInstance() {
		
	}
	
	public Connection createFactoryInstance(){
		return Connection.getInstance();
	}

}
