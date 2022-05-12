package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

		

