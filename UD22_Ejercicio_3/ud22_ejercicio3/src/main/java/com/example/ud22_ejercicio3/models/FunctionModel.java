package com.example.ud22_ejercicio3.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class FunctionModel {

	// Se crea una conexion del tipo Connection.
	public static Connection mysqlConn = null;
	// Atributos para completar la String de conexión al servidor.
	static String address;
	static String userSQL;
	static String password;

	private CientificoClass modeloCientificos = new CientificoClass();
	private ProyectoClass modeloProyecto = new ProyectoClass();
	private Asignado_aClass modeloAsignado_a = new Asignado_aClass();

	/**
	 * Función para seleccionar el servidor.
	 * 
	 * @throws Throwable
	 */
	/*
	 * public static void selectorVistas() throws ClassNotFoundException {
	 * 
	 * // Panel de seleccion mediante showOptionalDialog. int seleccion =
	 * JOptionPane.showOptionDialog(null, "Seleccione opcion",
	 * "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION,
	 * JOptionPane.QUESTION_MESSAGE, null, new Object[] { "IP Uri", "IP David",
	 * "IP Octavio", "IP Manual", "Exit" }, " 1"); }
	 */

	public static void selectServer(int option) throws Throwable {

		mysqlConn = null;

		switch (option) {
		case 0:// uri
			address = "192.168.56.102";
			userSQL = "remote";
			password = "Reus_2022";
			createStringConnection(address, userSQL, password);
			break;
		case 1:// David
			address = "192.168.1.69";
			userSQL = "remote";
			password = "Reus_2022";
			createStringConnection(address, userSQL, password);
			break;
		case 2:// Octavio
			address = "192.168.1.123";
			userSQL = "remote";
			password = "Reus_2022";
			System.out.println("Parametros selectServer 2");
			createStringConnection(address, userSQL, password);
			break;
		case 3:
			// exercute manual view
			break;
		case 4:// Exit
			System.exit(0);
			break;
		}
	}

	/**
	 * Funcion para crear la cadena de conexión SQL y establecer conexión.
	 * 
	 * @param adress
	 * @param userSQL
	 * @param password
	 * @return
	 * @throws Throwable
	 */
	public static Connection createStringConnection(String adress, String userSQL, String password) throws Throwable {

		System.out.println("Create String Connection: " + adress + " " + userSQL + " " + password);
		mysqlConn = createConnection(adress, userSQL, password);
		System.out.println(mysqlConn.toString());
		System.out.println("Funcion CreateStringConnection");

		return mysqlConn;
	}

	/**
	 * Función para crear la conexión a la BBDD.
	 * 
	 * @param address
	 * @param userMysql
	 * @param passwordMysql
	 * @return
	 * @throws ClassNotFoundException
	 */
	public static Connection createConnection(String address, String userMysql, String passwordMysql)
			throws ClassNotFoundException {

		System.out.println("Create connection: " + address + " " + userMysql + " " + passwordMysql);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			mysqlConn = DriverManager.getConnection("jdbc:mysql://" + address + ":3306?useTimezone=UTC", userMysql,
					passwordMysql);
			System.out.println("Conectado");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e);
			// errorView.frameErrorConection.setVisible(true);
			// JOptionPane.showMessageDialog( null, "No se ha podido establecer conexión" +
			// e.getLocalizedMessage());
		}

		return mysqlConn;
	}

	/**
	 * Función para cerrar la conexión a la BBDD.
	 */
	public static void closeConnection() {
		try {
			mysqlConn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static boolean checkConnection() {
		boolean flag = false;
		try {
			if (!mysqlConn.isClosed()) {
				flag = true;
			}
		} catch (SQLException e) {
			// ViewErrorConnection errorView = new ViewErrorConnection();
			// errorView.frameErrorConection.setVisible(true);
		}
		System.out.println(flag);
		return flag;
	}

	/**
	 * Función para añadir una persona nueva al registro.
	 * 
	 * @throws Throwable
	 */
	public void crearCientifico(String dni, String nombreApels) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_3;";
		Statement stdb = (Statement) mysqlConn.createStatement();

		// Se crea una sentencia sql.
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO `cientificos` (dni, nombreApels)VALUES(\""
				+ dni + "\", \"" + nombreApels + "\");";

		System.out.println(insert);
		// Ejecutamos la sentencia.
		stdb.execute(Querydb);
		stdb.execute(insert);
	}
}