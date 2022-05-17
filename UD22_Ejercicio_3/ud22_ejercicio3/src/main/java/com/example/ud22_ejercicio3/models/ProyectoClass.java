package com.example.ud22_ejercicio3.models;

public class ProyectoClass {
	/* Atributos de clase ClienteClass */
	private String id;
	private String nombre;
	private int horas;
	
	public ProyectoClass() {
		
	}
	
	public ProyectoClass(String id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
}
