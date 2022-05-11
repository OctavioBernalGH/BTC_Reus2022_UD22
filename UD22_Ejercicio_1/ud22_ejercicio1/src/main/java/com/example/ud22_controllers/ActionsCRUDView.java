package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewCreate;
import com.example.ud22_views.ViewDelete;
import com.example.ud22_views.ViewRead;
import com.example.ud22_views.ViewUpdate;


public class ActionsCRUDView implements ActionListener {


	//Se crean las diferentes instancias de clase.
	ModelFunctions funcionesModelo = new ModelFunctions();
	ViewCreate viewCreate = new ViewCreate();
	ViewDelete viewDelete = new ViewDelete();
	ViewRead viewRead = new ViewRead();
	ViewUpdate viewUpdate = new ViewUpdate();
	//ViewCRUDSelector vistaSelectorCRUD = new ViewCRUDSelector();
	
	// Se gestionan los eventos con el actionPerformed.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();
		System.out.println("Evento pulsado");
		switch (name) {

//CRUDSelectorView
		case "Añadir Cliente":
			viewCreate.frmCrearPersona.setVisible(true);
			break;
		case "Borrar Cliente":
			System.out.println("Entra");
			viewDelete.frmCrearPersona.setVisible(true);
			break;
		case "Modificar Cliente":
			viewUpdate.frmCrearPersona.setVisible(true);
			break;
		case "Buscar Cliente":
			viewRead.frmReadPersona.setVisible(true);
			break;
		}
		
	}
	
}

		

