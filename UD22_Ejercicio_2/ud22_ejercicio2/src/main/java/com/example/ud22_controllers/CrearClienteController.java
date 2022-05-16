/**
 * 
 */
package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import com.example.ud22_models.CRUDClienteModel;
import com.example.ud22_models.ConnectorModel;
import com.example.ud22_views.MainView;


/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class CrearClienteController implements ActionListener {

	ConnectorModel conexion = new ConnectorModel();
	CRUDClienteModel crudCliente = new CRUDClienteModel();
	private MainView vista;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton botonAceptar = (JButton) e.getSource();
		String nombreBoton = botonAceptar.getText();
		vista = new MainView();		
		
		switch (nombreBoton) {
		case "Crear Cliente":
			System.out.println("Evento boton");
			String nombre = vista.getTxtNombreCrearCliente().getText();
			String apellido = vista.getTxtApellidoCrearCliente().getText();
			String direccion = vista.getTxtDireccionCrearCliente().getText();
			int dni = Integer.parseInt(vista.getTxtDniCrearCliente().getText());
			String fecha = vista.getTxtFechaCrearCliente().getText();
			java.sql.Date fechaSQL = null;
			/** Se convierte la fecha de cadena a sentencia SQL */
			try {
				fechaSQL = ConnectorModel.formatStringToSQLDate(fecha);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			/** Se crea un cliente */
			try {
				crudCliente.crearCliente(nombre, apellido, direccion, dni, fechaSQL);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			break;
		}


	}

	/**
	 * @return the vista
	 */
	public MainView getVista() {
		return vista;
	}

	/**
	 * @param vista the vista to set
	 */
	public void setVista(MainView vista) {
		this.vista = vista;
	}


	
	
	
	
	
}
