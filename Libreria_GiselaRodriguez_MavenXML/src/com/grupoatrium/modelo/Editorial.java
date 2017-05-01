package com.grupoatrium.modelo;

public class Editorial {
	
	public String nombre;
	public Direccion direccion;
	public String nif;
	
	public Editorial() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}

	@Override
	public String toString() {
		return "Editorial [nombre=" + nombre + ", direccion=" + direccion + ", nif=" + nif + "]";
	}
	
}
