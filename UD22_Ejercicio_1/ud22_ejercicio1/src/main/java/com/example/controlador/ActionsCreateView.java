package com.example.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewCreate;


public class ActionsCreateView  extends ViewCreate implements ActionListener{
	
	//Se crean las diferentes instancias de clase.
	ModelFunctions funcionesModelo = new ModelFunctions();
	//CRUDSelectorView vistaSelectorCRUD = new CRUDSelectorView();
	
	// Se gestionan los eventos con el actionPerformed.
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {

		//CRUDSelectorView
		case "Crear":
			System.out.println(ViewCreate.nombreField);
			break;
		case "Atras":
			break;
		}
		
	}
	
}

		

