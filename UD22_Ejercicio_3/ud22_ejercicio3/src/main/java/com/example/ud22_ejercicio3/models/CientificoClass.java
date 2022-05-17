package com.example.ud22_ejercicio3.models;

import java.util.Date;

public class CientificoClass {
	/* Atributos de clase ClienteClass */
	private String dni;
	private String nomApels;
	
	
	public CientificoClass() {
		
	}
	
	public CientificoClass(String dni, String nomApels) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
}
