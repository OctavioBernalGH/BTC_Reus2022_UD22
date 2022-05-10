package com.example.ud22_models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class ModelDDBB {

	/**
	 * Se crean los atributos de clase correspondiente a las columnas de la tablas.
	 */
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String fecha;


	
	/** Se crea constructor vacío
	 */
	public ModelDDBB() {
	}

	/** Se crea constructor completo
	 * 
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param fecha
	 */
	public ModelDDBB(String nombre, String apellido, String direccion, String fecha) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fecha = fecha;
	}

	// Se crean los getters y setters de las diferentes columnas.
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
