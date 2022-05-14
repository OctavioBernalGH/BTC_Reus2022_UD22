/**
 * Clase CRUDClienteModel.
 */
package com.example.ud22_models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */

public class CRUDClienteModel {

	/* Instancias de Clase */
	ConnectorModel mysqlConn = new ConnectorModel();
	ClienteClass modeloCliente = new ClienteClass();

	/**
	 * Método para crear un cliente.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void crearCliente(Connection mysqlConn) throws SQLException {

		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO cliente (nombre, apellido, direccion, dni, fecha";
		modeloCliente.setNombre(modeloCliente.getNombre());
		modeloCliente.setApellido(modeloCliente.getApellido());
		modeloCliente.setDireccion(modeloCliente.getDireccion());
		modeloCliente.setDni(modeloCliente.getDni());
		modeloCliente.setFecha(modeloCliente.getFecha());
		// Ejecutamos la sentencia.
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
