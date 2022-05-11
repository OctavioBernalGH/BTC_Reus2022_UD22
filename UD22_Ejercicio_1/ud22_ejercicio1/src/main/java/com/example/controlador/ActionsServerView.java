package com.example.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;


public class ActionsServerView implements ActionListener {

	//Se crean las diferentes instancias de clase.
	ModelFunctions funcionesModelo = new ModelFunctions();
	ViewCRUDSelector vistaSelectorCRUD = new ViewCRUDSelector();
	
	// Se gestionan los eventos con el actionPerformed.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {
//ServerView
		case "Servidor Uri":
			try {
				ModelFunctions.selectServer(0);
				vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "Servidor David":
			try {
				funcionesModelo.selectServer(1);
				vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "Servidor Octavio":
			try {
				funcionesModelo.selectServer(2);
				vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "btnServidorManual":
			try {
				funcionesModelo.selectServer(3);
				vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
//CRUDSelectorView
		case "Añadir Cliente":
			System.out.println("hola");
			break;
		case "Borrar Cliente":
			break;
		case "Modificar Cliente":
			break;
		case "Buscar Cliente":
			break;
		}
		
	}	
}

		

