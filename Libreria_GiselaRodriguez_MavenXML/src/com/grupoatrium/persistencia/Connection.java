package com.grupoatrium.persistencia;


public class Connection {

	// Propiedad que almacena la unica instancia de la clase
	private static Connection instance;
	
	private Connection() {
		System.out.println("Crea la instancia de la conexion");
	}
	
	// Metodo que devuelve la unica instancia
	public static Connection getInstance() {
		
		if(instance== null){
			instance = new Connection();
		}
		return instance;
	}
	
	public void metodoCualquiera(){
		System.out.println("Hemos entrado a un metodo cualquiera");
	}

}
