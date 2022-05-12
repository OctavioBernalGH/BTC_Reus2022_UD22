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
	private ViewRead vwREad;
	//CRUDSelectorView vistaSelectorCRUD = new CRUDSelectorView();
	
	// Se gestionan los eventos con el actionPerformed.
	
	public void ActionsRead() {
		//Ventana asociada
		vwREad = new ViewRead();;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();

		switch (name) {

//CRUDSelectorView
		case "Buscar":
			System.out.println(vwREad.getDniField().getText());
			System.out.println("hola");
			break;
		case "Atras":
			break;
		}
		
	}
//Getters y setters
	public ViewRead getVwREad() {
		return vwREad;
	}

	public void setVwREad(ViewRead vwREad) {
		this.vwREad = vwREad;
	}
	
}

		

