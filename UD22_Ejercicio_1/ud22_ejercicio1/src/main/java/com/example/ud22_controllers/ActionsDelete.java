package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewDelete;


public class ActionsDelete implements ActionListener {


	//Se crean las diferentes instancias de clase.
	private ModelFunctions funcionesModelo = new ModelFunctions();
	private ViewDelete viewDelete;
	
	public void ActionsDelete() {
		viewDelete = new ViewDelete();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {

//CRUDSelectorView
		case "Borrar":
			System.out.println("Borrar");
			break;
		case "Atras":
			break;
		}
		
	}


	public ViewDelete getViewDelete() {
		return viewDelete;
	}


	public void setViewDelete(ViewDelete viewDelete) {
		this.viewDelete = viewDelete;
	}
	
	
}

		

