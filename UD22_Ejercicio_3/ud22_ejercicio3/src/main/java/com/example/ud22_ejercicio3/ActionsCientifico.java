package com.example.ud22_ejercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.example.ud22_ejercicio3.Views.ViewCientifico;

public class ActionsCientifico implements ActionListener{
	
	private ViewCientifico viewCientifico;
	
	public void ActionsCientifico() {
		viewCientifico = new ViewCientifico();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPress = (JButton) e.getSource();
		// Getting the text of the widget
		String name = btnPress.getText();
		
		switch(name) {
		
			case "Crear":
				viewCientifico.showCreate();
				break;
			case "Borrar":
				viewCientifico.showErase();
				break;
			case "Buscar":
				viewCientifico.showSearch();
				break;
			case "Modificar":
				viewCientifico.showModify();
				break;
			//Toggle entity
			case "Cambiar a Proyecto":
				viewCientifico.toggleEntity("Cambiar a Proyecto");
				
				break;
			//Toggle entity
			case "Cambiar a Cientifico":
				viewCientifico.toggleEntity("Cambiar a Cientifico");
				break;
		}
		
	}

	public ViewCientifico getViewCientifico() {
		return viewCientifico;
	}

	public void setViewCientifico(ViewCientifico viewCientifico) {
		this.viewCientifico = viewCientifico;
	}

	
	
}
