package com.ejemplo.springwebmvc.dto;

public class Coche {

	private String nombre;
	private float precio;
	
	public Coche() {
		super();
	}
	public Coche(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
