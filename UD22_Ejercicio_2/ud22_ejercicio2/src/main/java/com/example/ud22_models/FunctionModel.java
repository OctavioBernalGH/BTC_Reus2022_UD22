/**
 * Clase ConnectorModel.
 */
package com.example.ud22_models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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

	private ClienteClass modelo = new ClienteClass();
	private VideosClass modeloVideos = new VideosClass();

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

	public static java.sql.Date formatStringToSQLDate(String strDate) throws Exception {
		Date utilDate = new Date(); // DateFormat
		SimpleDateFormat dfFormat = new SimpleDateFormat("dd/MM/yyyy"); // parse string into a DATE format
		utilDate = dfFormat.parse(strDate); // convert a util.Date to milliseconds via its getTime() method
		long time = utilDate.getTime(); // get the long value of java.sql.Date
		java.sql.Date sqlDate = new java.sql.Date(time);
		return sqlDate;
	}

	/**
	 * Función para añadir una persona nueva al registro.
	 * 
	 * @throws Throwable
	 */
	public void createCliente(String nombre, String apellido, String direccion, int dni, Date fecha) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();

		// Se crea una sentencia sql.
		System.out.println("capturando fecha" + fecha);
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO `cliente` (nombre, apellido, direccion, dni, fecha)VALUES(\"" + nombre + "\", \""
				+ apellido + "\", \"" + direccion + "\", " + dni + ", '" + fecha + "');";

		System.out.println(insert);
		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(insert);
	}

	/**
	 * Función para eliminar un registro de la tabla.
	 * 
	 * @throws Throwable
	 */

	public static void deleteCliente(int dni) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();

		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE FROM `cliente` WHERE dni = " + dni + ";";

		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(delete);
	}

	/**
	 * Función para actualizar un registro de la tabla.
	 * 
	 * @throws Throwable
	 */

	public static void updateCliente(String nombre, String apellido, String direccion, int dni, Date fecha)
			throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();

		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE `cliente` SET nombre = \"" + nombre + "\", apellido = \"" + apellido
				+ "\", direccion = \"" + direccion + "\", fecha = '" + fecha + "' WHERE dni = " + dni + ";";
		System.out.println(update);

		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(update);
	}

	/**
	 * Función para crear un Video
	 * 
	 * @param titulo
	 * @param director
	 * @throws Throwable
	 */
	public static void createVideo(String title, String director) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();
		
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO `videos` (title, director)VALUES(\"" + title + "\", \"" + director + "\");";
		System.out.println(insert);
		
		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(insert);
	}

	/**
	 * Método para eliminar un video.
	 * 
	 * @param mysqlConn
	 * @throws Throwable 
	 */
	public void deleteVideo(String title) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();

		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE FROM `videos` WHERE title = \"" + title + "\";";

		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(delete);
	}

	/**
	 * Método para actualizar un video.
	 * 
	 * @param mysqlConn
	 * @throws Throwable 
	 */
	public static void updateVideo(String title, String director) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_2;";
		Statement st = (Statement) mysqlConn.createStatement();

		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE `videos` SET director = \"" + director + "\" WHERE title = \"" + title + "\";";
		System.out.println(update);
		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(update);
	}
}
