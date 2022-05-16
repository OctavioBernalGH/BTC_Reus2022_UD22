/**
 * Clase ConnectorModel.
 */
package com.example.ud22_models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.ud22_views.MainView;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class ConnectorModel {

	// Se crea una connexión del tipo Connection.
	public static Connection mysqlConn = null;
	// Atributos para completar la String de conexión al servidor.
	static String address = "192.168.1.123";
	static String userSQL = "remote";
	static String password = "Reus_2022";

	/**
	 * Método para recibir los parámetros de conexión.
	 * 
	 * @param adress
	 * @param userSQL
	 * @param password
	 * @return Connection
	 * @throws Throwable
	 */
	public static Connection createStringConnection(String adress, String userSQL, String password) throws Throwable {

		mysqlConn = createConnection(address, userSQL, password);

		return mysqlConn;
	}

	/**
	 * Método para crear la conexión.
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

			// errorView.frameErrorConection.setVisible(true);
			// JOptionPane.showMessageDialog( null, "No se ha podido establecer conexión" +
			// e.getLocalizedMessage());
		}

		return mysqlConn;
	}

	/**
	 * Método para cerrar la conexión.
	 */
	public static void closeConnection() {
		try {
			mysqlConn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	/**
	 * Convertir la fecha.util a fecha.sql.
	 * 
	 * @param strDate
	 * @return
	 * @throws Exception
	 */
	public static java.sql.Date formatStringToSQLDate(String strDate) throws Exception {
		Date utilDate = new Date(); // DateFormat
		SimpleDateFormat dfFormat = new SimpleDateFormat("dd/MM/yyyy"); // parse string into a DATE format
		utilDate = dfFormat.parse(strDate); // convert a util.Date to milliseconds via its getTime() method
		long time = utilDate.getTime(); // get the long value of java.sql.Date
		java.sql.Date sqlDate = new java.sql.Date(time);
		return sqlDate;
	}
	
}
