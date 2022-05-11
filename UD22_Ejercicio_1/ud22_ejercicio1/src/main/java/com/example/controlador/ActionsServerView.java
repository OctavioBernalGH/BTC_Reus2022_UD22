package com.example.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;


public class ActionsServerView implements ActionListener {

	//Se crean las diferentes instancias de clase.
	private ModelFunctions funcionesModelo = new ModelFunctions();
	private ViewCRUDSelector vistaSelectorCRUD = new ViewCRUDSelector();
	// Se crea una conexion del tipo Connection.
	private static Connection mysqlConn = null;
	
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
				funcionesModelo.selectServer(0);
				vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "Servidor David":
			try {
				funcionesModelo.selectServer(1);
				//vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "Servidor Octavio":
			try {
				funcionesModelo.selectServer(2);
				//vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		case "btnServidorManual":
			try {
				funcionesModelo.selectServer(3);
				//vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			} catch (ClassNotFoundException e1) {
			} catch (Throwable e1) {
			}
			break;
		}
		if(funcionesModelo.checkConnection()) {
			vistaSelectorCRUD.frameCRUDSelectorView.setVisible(true);
			System.out.println(funcionesModelo.checkConnection());
		}else {
			//TODO: Lanzar error view
		}
	}	
}

		

