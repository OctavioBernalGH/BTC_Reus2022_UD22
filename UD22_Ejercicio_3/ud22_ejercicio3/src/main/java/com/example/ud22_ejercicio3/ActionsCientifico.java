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
				viewCientifico.getBtnCientificoCrear().setBackground(Color.blue);
				viewCientifico.getBtnCientificoCrear().setOpaque(true);
				
				viewCientifico.getLblCientificoNombre().setVisible(true);
				viewCientifico.getLblCientificoDNI().setVisible(true);
				
				viewCientifico.getTfCientificoDNI().setVisible(true);
				viewCientifico.getTfCientificoDNI().setEnabled(true);
				viewCientifico.getTfCientificoNombre().setVisible(true);
				viewCientifico.getTfCientificoNombre().setEnabled(true);
				
				viewCientifico.getBtnCrearCientifico().setVisible(true);
				viewCientifico.getBtnCrearCientifico().setEnabled(true);
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
