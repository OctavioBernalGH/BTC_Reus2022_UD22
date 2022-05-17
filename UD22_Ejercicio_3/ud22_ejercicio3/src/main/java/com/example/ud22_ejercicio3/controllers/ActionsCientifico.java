package com.example.ud22_ejercicio3.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.example.ud22_ejercicio3.Views.ViewGeneral;

public class ActionsCientifico implements ActionListener{
	
	private ViewGeneral viewGeneral;
	
	public void ActionsCientifico() {
		viewGeneral = new ViewGeneral();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPress = (JButton) e.getSource();
		String discriminator = viewGeneral.getLblTittle().getText();
		// Getting the text of the widget
		String name = btnPress.getText();
		
		//Si esta selecionado cientifico
		if(discriminator.equals("Cientifico")) {
			switchyCientifico(name);
		}else {//si esta selecionado Proyecto
			switchyProyecto(name);
		}
		
		
	}
	private void switchyProyecto(String name) {
		
		switch(name) {
			case "Crear":
				System.out.println(name);
				viewGeneral.showCreate();
				break;
			case "Borrar":
				viewGeneral.showErase();
				break;
			case "Buscar":
				viewGeneral.showSearch();
				break;
			case "Modificar":
				viewGeneral.showModify();
				break;
			case "Crear Proyecto":
				break;
			case "Borrar Proyecto":
				break;
			case "Busqueda":
				break;
			case "Modificar Proyecto":
				break;
			//Toggle entity
			case "Cambiar a Proyecto":
				viewGeneral.toggleEntity("Cambiar a Proyecto");
				break;
			//Toggle entity
			case "Cambiar a Cientifico":
				viewGeneral.toggleEntity("Cambiar a Cientifico");
				break;
		}
	}
	private void switchyCientifico(String name) {
		switch(name) {
			case "Crear":
				viewGeneral.showCreate();
				break;
			case "Borrar":
				viewGeneral.showErase();
				break;
			case "Buscar":
				viewGeneral.showSearch();
				break;
			case "Modificar":
				viewGeneral.showModify();
				break;
			case "Borrar Cientifico":
				break;
			case "Mostrar":
				break;
			case "Buscar Cientifico":
				break;
			case "Modificar Cientifico":
				break;
			case "Crear Cientifico":
				break;
			//Toggle entity
			case "Cambiar a Proyecto":
				viewGeneral.toggleEntity("Cambiar a Proyecto");
				break;
			//Toggle entity
			case "Cambiar a Cientifico":
				viewGeneral.toggleEntity("Cambiar a Cientifico");
				break;
		}
	}

	public ViewGeneral getViewCientifico() {
		return viewGeneral;
	}

	public void setViewCientifico(ViewGeneral viewCientifico) {
		this.viewGeneral = viewCientifico;
	}

	
	
}
