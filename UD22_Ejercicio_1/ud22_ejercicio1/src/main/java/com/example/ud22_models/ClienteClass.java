package com.example.ud22_models;

import java.util.Date;

public class ClienteClass {
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private Date fecha;
	
	//Constructor without id (id should be controled by the dataBase Server)
	public ClienteClass(String nombre, String apellido, String direccion, int dni, Date fecha) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}
	
}
