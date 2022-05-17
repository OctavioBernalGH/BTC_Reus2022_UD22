/**
 * Clase CRUDClienteModel.
 */
package com.example.ud22_models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */

import com.example.ud22_models.ConnectorModel;

public class CRUDClienteModel {

	/* Instancias de Clase */
		
	public static Connection mysqlConn = null;
	ClienteClass modeloCliente = new ClienteClass();
	ConnectorModel conexion = new ConnectorModel();
	
	
	/**
	 * Método para crear un cliente.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void crearCliente(String nombre, String apellido, String direccion, int dni, Date fecha) throws SQLException {

				
		try {
			mysqlConn = ConnectorModel.createConnection("192.168.1.123", "remote", "Reus_2022");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Querydb = "USE UD22_Ejercicio_2;";             
				
		Statement st = (Statement)mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO `cliente` (nombre, apellido, direccion, dni, fecha)VALUES(\""+
				nombre + "\", \"" + apellido + "\", \""+ direccion + "\", " + dni + ", '" + fecha + "');";
		System.out.println(insert);
		// Ejecutamos la sentencia.
		st.execute(Querydb);
		st.execute(insert);
	}
 
	/**
	 * Método para eliminar un cliente.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void borrarCliente(Connection mysqlConn) throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String delete = "DELETE " + "FROM cliente " + "WHERE nombre=" + modeloCliente.getNombre() + ", dni="
				+ modeloCliente.getDni() + ");";
		// Ejecutamos la sentencia.
		st.execute(delete);
	}

	/**
	 * Método para actualizar un cliente.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void actualizarCliente(Connection mysqlConn) throws SQLException {
		// Se crea una sentencia sql.
		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String update = "UPDATE clinte SET nombre, apellido, direccion, dni, fecha WHERE dni=" + modeloCliente.getDni() + ");";
		modeloCliente.setNombre(modeloCliente.getNombre());
		modeloCliente.setApellido(modeloCliente.getApellido());
		modeloCliente.setDireccion(modeloCliente.getDireccion());
		modeloCliente.setDni(modeloCliente.getDni());
		modeloCliente.setFecha(modeloCliente.getFecha());
		// Ejecutamos la sentencia.
		st.execute(update);
	}
}
