package com.example.ud22_models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class Model {

	// Se crean los atributos de clase correspondiente a las columnas de la tablas.
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private String fecha;
	static Connection mysqlConn = null;

	// Se crean los constructores

	public Model() {
	}

	public Model(String nombre, String apellido, String direccion, String fecha) {
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

	// Función para abrir la conexión a la BBDD

	public static Connection createConnection(String address, String userMysql, String passwordMysql)
			throws ClassNotFoundException {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			mysqlConn = DriverManager.getConnection("jdbc:mysql://" + address + ":3306?useTimezone=UTC", userMysql,
					passwordMysql);
			System.out.println("Conectado");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("No se ha podido connectar a la base de datos");
			System.out.println(e);
		}

		return mysqlConn;
	}

	// Función para cerrar la conexión a la BBDD.

	public static void closeConnection() {
		try {
			mysqlConn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
