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

	private ClienteClass modelo 			= new ClienteClass();
	private VideosClass modeloVideos 		= new VideosClass();

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

		mysqlConn = createConnection(adress, userSQL, password);

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

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			mysqlConn = DriverManager.getConnection("jdbc:mysql://" + address + ":3306?useTimezone=UTC", userMysql,
					passwordMysql);


		} catch (SQLException | ClassNotFoundException e) {

			//errorView.frameErrorConection.setVisible(true);
			//JOptionPane.showMessageDialog( null, "No se ha podido establecer conexión" + e.getLocalizedMessage());
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
			if(!mysqlConn.isClosed()) {
				flag = true;
			}
		} catch (SQLException e) {
			//ViewErrorConnection errorView 	= new ViewErrorConnection();
			//errorView.frameErrorConection.setVisible(true);
		}
		System.out.println(flag);
		return flag;
	}


	public static java.sql.Date formatStringToSQLDate(String strDate) throws Exception{             
		Date utilDate = new Date(); //DateFormat             
		SimpleDateFormat dfFormat = new SimpleDateFormat("dd/MM/yyyy"); // parse string into a DATE format                   
		utilDate = dfFormat.parse(strDate); // convert a util.Date to milliseconds via its getTime() method                      
		long time = utilDate.getTime(); // get the long value of java.sql.Date              
		java.sql.Date sqlDate = new java.sql.Date(time);             
		return sqlDate;            
	}


	/**
	 * Función para añadir una persona nueva al registro.
	 * @throws Throwable 
	 */
	public void crearCliente(String nombre, String apellido, String direccion, int dni, Date fecha) throws Throwable {
		selectServer(2);
		String Querydb = "USE UD22_Ejercicio_1;";             
		Statement stdb = (Statement)mysqlConn.createStatement();             

		// Se crea una sentencia sql.
		System.out.println("capturando fecha" + fecha);
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO `UD22_Ejecicio_1.cliente` (nombre, apellido, direccion, dni, fecha)VALUES(\""+
				nombre + "\", \"" + apellido + "\", \""+ direccion + "\", " + dni + ", '" + fecha + "');";	

		System.out.println(insert);
		// Ejecutamos la sentencia.
		stdb.execute(Querydb);
		stdb.execute(insert);
	}

	/**
	 * Función para eliminar un registro de la tabla.
	 * 
	 * @throws SQLException
	 */

	public static void borrarPersona(int dni) throws SQLException {
		String Querydb = "USE UD22_Ejercicio_1;";             
		Statement stdb = (Statement)mysqlConn.createStatement();

		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE FROM `UD22_Ejecicio_1.cliente` WHERE dni = " + dni + ";";

		// Ejecutamos la sentencia.
		stdb.execute(Querydb);
		stdb.execute(delete);
	}



	/**
	 * Función para actualizar un registro de la tabla.
	 * 
	 * @throws SQLException
	 */

	public static void updatePersona(String nombre, String apellido, String direccion, int dni, Date fecha) throws SQLException {
		String Querydb = "USE UD22_Ejercicio_1;";             
		Statement stdb = (Statement)mysqlConn.createStatement();  

		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE `UD22_Ejecicio_1.cliente` SET nombre = \"" + nombre +"\", apellido = \""+ apellido + "\", direccion = \"" + direccion + "\", fecha = '" + fecha + "' WHERE dni = "+ dni + ";";
		System.out.println(update);

		// Ejecutamos la sentencia.
		stdb.execute(Querydb);
		stdb.execute(update);
	}
	
	public void crearVideo(Connection mysqlConn) throws SQLException {

		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO videos (title, director, cli_id "+");";
		modeloVideos.setTitle(modeloVideos.getTitle());
		modeloVideos.setDirector(modeloVideos.getDirector());
		modeloVideos.setCli_id(modelo.getId());
		// Ejecutamos la sentencia.
		st.execute(insert);
	}

	/**
	 * Método para eliminar un video.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void borrarVideo(Connection mysqlConn) throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE " + "FROM videos " + "WHERE id=" + modeloVideos.getId() + ");";
		// Ejecutamos la sentencia.
		st.execute(delete);
	}


	/**
	 * Método para actualizar un video.
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void actualizarVideo(Connection mysqlConn) throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE videos SET title, director, cli_id WHERE id=" + modeloVideos.getId() + ");";
		modeloVideos.setTitle(modeloVideos.getTitle());
		modeloVideos.setDirector(modeloVideos.getDirector());
		modeloVideos.setCli_id(modelo.getId());
		// Ejecutamos la sentencia.
		st.execute(update);
	}
}

