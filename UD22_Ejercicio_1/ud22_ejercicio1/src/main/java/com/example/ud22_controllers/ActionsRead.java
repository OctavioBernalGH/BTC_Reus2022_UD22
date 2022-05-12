package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewRead;


public class ActionsRead implements ActionListener {

	//Se crean las diferentes instancias de clase.
	private ModelFunctions funcionesModelo = new ModelFunctions();
	private ViewRead viewRead;
	
	public void ActionsRead() {
		//Ventana asociada
		viewRead = new ViewRead();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {
			case "Buscar":
				System.out.println(viewRead.getDniField().getText());
				break;
			case "Atras":
				break;
		}
		
	}
//Getters y setters

	public ViewRead getViewRead() {
		return viewRead;
	}

	public void setViewRead(ViewRead viewRead) {
		this.viewRead = viewRead;
	}
	
}

		

