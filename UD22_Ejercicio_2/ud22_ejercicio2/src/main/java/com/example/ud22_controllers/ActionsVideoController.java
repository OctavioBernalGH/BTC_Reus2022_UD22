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
public class ActionsVideoController implements ActionListener {

	FunctionModel conexion = new FunctionModel();
	private MainView vista;

	public void CrearVideoController() {
		vista = new MainView();
	}
	

	/**
	 * ActionPerformed. El siguiente método detecta los eventos generados en los
	 * botones de confirmación de acción, como por ejemplo el botón de crear un
	 * Videos, modificar un Video o eliminarlo.
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
		case "Crear Video":
			// Se muestra un comentario para comprobar entrada en el case.
			System.out.println("Evento boton crear video");
			// Se obtienen los datos de los campos de texto.
			String title = vista.getTxtTituloCrear().getText();
			String director = vista.getTxtDirectorCrear().getText();

			// Se crea un cliente con la función crearCliente.
			try {
				functionModel.crearVideo(title, director);
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
			
			// Se instanacia el atributo fechaSQL del tipo Date.
			

			// Se convierte la fecha de cadena a sentencia SQL

			// Llamamos la funcion de crearCliente y seteamos los textos
			try {
				//functionModel.actualizarVideo(null);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
			break;

		/** Botón eliminar cliente */
		case "Eliminar Video":
			// Se muestra un comentario para comprobar entrada en el case.
			System.out.println("Evento boton eliminar");
			// Se obtienen los datos de los campos de texto.
			

			// Se elimina un cliente mediante la función eliminarCliente.
			try {
				//functionModel.(dni);
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


