package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewUpdate;


public class ActionsUpdate implements ActionListener {


	//Se crean las diferentes instancias de clase.
	private ModelFunctions funcionesModelo = new ModelFunctions();
	private ViewUpdate viewUpdate;
	
	
	public void ActionsUpdate() {
		viewUpdate = new ViewUpdate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {

			case "Actualizar":
				System.out.println("Update");
				break;
			case "Atras":
				
				break;
				
		}
		
	}

	public ViewUpdate getViewUpdate() {
		return viewUpdate;
	}

	public void setViewUpdate(ViewUpdate viewUpdate) {
		this.viewUpdate = viewUpdate;
	}
	
}

		

