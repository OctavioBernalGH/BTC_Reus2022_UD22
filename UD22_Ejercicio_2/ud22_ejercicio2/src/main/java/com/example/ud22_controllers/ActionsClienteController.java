/**
 * 
 */
package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.FunctionModel;
import com.example.ud22_views.MainView;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class ActionsClienteController implements ActionListener {

	FunctionModel conexion = new FunctionModel();
	private MainView vista;

	public void CrearClienteController() {
		vista = new MainView();
	}

	/**
	 * ActionPerformed. El siguiente método detecta los eventos generados en los
	 * botones de confirmación de acción, como por ejemplo el botón de crear un
	 * cliente, modificar un cliente o eliminarlo.
	 */
	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		/** Se define el botón de cada funcionalidad */
		JButton botonAceptar = (JButton) e.getSource();
		/** Se recibe el elemento botón */
		String nombreBoton = botonAceptar.getText();
		/** Se crea una instancia de la clase FunctionModel */
		FunctionModel functionModel = new FunctionModel();

		/** Se realizan acciones en función del nombre del botón */
		switch (nombreBoton) {

		/** Botón crear cliente */
		case "Crear Cliente":
			// Se muestra un comentario para comprobar entrada en el case.
			System.out.println("Evento boton crear");
			// Se obtienen los datos de los campos de texto.
			String nombre = vista.getTxtNombreCrearCliente().getText();
			String apellido = vista.getTxtApellidoCrearCliente().getText();
			String direccion = vista.getTxtDireccionCrearCliente().getText();
			int dni = Integer.parseInt(vista.getTxtDniCrearCliente().getText());
			String fecha = vista.getTxtFechaCrearCliente().getText();
			// Se instanacia el atributo fechaSQL del tipo Date.
			java.sql.Date fechaSQL = null;

			// Se convierte la fecha de cadena a sentencia SQL
			try {
				fechaSQL = functionModel.formatStringToSQLDate(fecha);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// Se crea un cliente con la función crearCliente.
			try {
				functionModel.crearCliente(nombre, apellido, direccion, dni, fechaSQL);
			} catch (Throwable e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;

		/** Botón actualizar cliente */
		case "Actualizar Cliente":
			// Se muestra un comentario para comprobar entrada en el case.
			System.out.println("Evento boton actualizar");
			// Se obtienen los datos de los campos de texto.
			dni = Integer.parseInt(vista.getTxtDniClienteModificar().getText());
			nombre = vista.getTxtNombreClienteModificar().getText();
			apellido = vista.getTxtApellidoClienteModificar().getText();
			direccion = vista.getTxtDireccionClienteModificar().getText();
			// Se instanacia el atributo fechaSQL del tipo Date.
			fecha = vista.getTxtFechaClienteModificar().getText();
			fechaSQL = null;

			// Se convierte la fecha de cadena a sentencia SQL
			try {
				fechaSQL = functionModel.formatStringToSQLDate(fecha);
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			// Llamamos la funcion de crearCliente y seteamos los textos
			try {
				functionModel.updateCliente(nombre, apellido, direccion, dni, fechaSQL);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
			break;

		/** Botón eliminar cliente */
		case "Eliminar Cliente":
			// Se muestra un comentario para comprobar entrada en el case.
			System.out.println("Evento boton eliminar");
			// Se obtienen los datos de los campos de texto.
			dni = Integer.parseInt(vista.getTxtDniClienteEliminar().getText());

			// Se elimina un cliente mediante la función eliminarCliente.
			try {
				functionModel.eliminarCliente(dni);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
			break;

		/** Botón consultar cliente */
		case "Consultar Cliente":
			/** Futura implementación */
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
