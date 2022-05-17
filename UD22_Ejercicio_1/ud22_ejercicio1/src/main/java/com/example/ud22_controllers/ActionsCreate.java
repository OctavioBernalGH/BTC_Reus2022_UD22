package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewCreate;


public class ActionsCreate implements ActionListener{

	//Se crean las diferentes instancias de clase.
	private ModelFunctions funcionesModelo = new ModelFunctions();
	private ViewCreate viewCreate; 

	public void ActionsCreate() {
		viewCreate = new ViewCreate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {

		case "Crear":
			System.out.println("Crear");
			//System.out.println(nombreField.getText());
			ModelFunctions creacionCliente = new ModelFunctions();
			try {
				// Cogemos el texto que escribimos en el textField de ViewCreate
				String nombre = viewCreate.getNombreField().getText();
				String apellido = viewCreate.getApellidoField().getText();
				String direccion = viewCreate.getDireccionField().getText();
				int dni = Integer.parseInt(viewCreate.getDniField().getText());
				
				// Cogera un string y lo transformara en la fecha indicada
				String fecha = viewCreate.getFechaField().getText();
				java.sql.Date sqlDate = null;
				try {
					
					sqlDate = funcionesModelo.formatStringToSQLDate(fecha);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println("fechanormal " + fecha);
						
				// Llamamos la funcion de crearCliente y seteamos los textos
				creacionCliente.crearCliente(nombre, apellido, direccion, dni, sqlDate);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case "Atras":
			break;
		}
	}

	public ViewCreate getViewCreate() {
		return viewCreate;
	}

	public void setViewCreate(ViewCreate viewCreate) {
		this.viewCreate = viewCreate;
	}
}



