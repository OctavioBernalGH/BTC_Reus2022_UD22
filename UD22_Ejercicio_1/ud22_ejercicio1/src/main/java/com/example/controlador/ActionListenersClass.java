package com.example.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ActionListenersClass implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPress = (JButton)e.getSource();
		//Getting the text of the widget
		String name = btnPress.getText();
		
		switch(name) {
		case "Servidor Uri":
			System.out.println("hola");
			//Selectvista 1
			break;
		case "Servidor David":
			System.out.println("adios");
			break;
		}
		
	}

}
