package com.example.ud22_models;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import com.example.ud22_views.ErrorConnectionView;

public class ModelFunctions {

	// Se crea una conexion del tipo Connection.
	public static Connection mysqlConn = null;
	// Atributos para completar la String de conexión al servidor.
	static String address;
	static String userSQL;
	static String password;

	private ClienteClass modelo 			= new ClienteClass();

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

		mysqlConn = createConnection(address, userSQL, password);

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
			 ErrorConnectionView errorView 	= new ErrorConnectionView();
			 errorView.frameErrorConection.setVisible(true);
		}
		System.out.println(flag);
		return flag;
	}


	/**
	 * Función para añadir una persona nueva al registro.
	 * 
	 * @throws SQLException
	 */
	public void crearCliente() throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO cliente "
				+ "VALUES(" + 
				modelo.getNombre() + ", " + 
				modelo.getApellido() + ", " + 
				modelo.getDireccion() + ", " + 
				modelo.getDni() + ", " + 
				modelo.getFecha() + ");";
		// Ejecutamos la sentencia.
		st.execute(insert);
	}

	/**
	 * Función para eliminar un registro de la tabla.
	 * 
	 * @throws SQLException
	 */
	public void borrarPersona() throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE "
				+ "FROM cliente "
				+ "WHERE nombre=" + modelo.getNombre() + ", dni=" + modelo.getDni() + ");";
		// Ejecutamos la sentencia.
		st.execute(delete);
	}
	
	
	/**
	 * Función para actualizar un registro de la tabla.
	 * 
	 * @throws SQLException
	 */
	
	public void updatePersona() throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE " 
				+ "FROM cliente "
				+ "WHERE dni=" + modelo.getDni() + ");";
		// Ejecutamos la sentencia.
		st.execute(update);
	}
}
