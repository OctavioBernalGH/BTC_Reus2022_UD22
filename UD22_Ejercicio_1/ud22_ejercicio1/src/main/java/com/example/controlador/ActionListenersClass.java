package com.example.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.CRUDSelectorView;
import com.example.ud22_views.ServerView;

public class ActionListenersClass implements ActionListener {

	
	//Se crean las diferentes instancias de clase.
	ModelFunctions funcionesModelo = new ModelFunctions();
	ServerView vistaSelectorServidor = new ServerView();
	CRUDSelectorView vistaSelectorCRUD = new CRUDSelectorView();
	
	// Se gestionan los eventos con el actionPerformed.
	
	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {
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
		}
		
	}
}

		

