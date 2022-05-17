/**
 * 
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

public class CRUDVideosModel {

	/* Instancias de Clase */
	ConnectorModel mysqlConn = new ConnectorModel();
	VideosClass modeloVideos = new VideosClass();
	ClienteClass modeloCliente = new ClienteClass();

	/**
	 * Método para crear un video asociado a un cliente.
	 * 
	 * @param mysqlConn
	 * @throws SQLException
	 */
	public void crearVideo(Connection mysqlConn) throws SQLException {

		Statement st = (Statement) mysqlConn.createStatement();
		// Creamos una cadena con los parámetros pasados por pantalla.
		String insert = "INSERT INTO videos (title, director, cli_id "+");";
		modeloVideos.setTitle(modeloVideos.getTitle());
		modeloVideos.setDirector(modeloVideos.getDirector());
		modeloVideos.setCli_id(modeloCliente.getId());
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
		modeloVideos.setCli_id(modeloCliente.getId());
		// Ejecutamos la sentencia.
		st.execute(update);
	}
}
