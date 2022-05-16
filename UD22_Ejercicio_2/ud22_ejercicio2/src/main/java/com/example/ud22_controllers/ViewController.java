/**
 * 
 */
package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_views.MainView;

/**
 * @author Gaming
 *
 */
public class ViewController implements ActionListener {

	private MainView vistaPrincipal;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton controlBotton = (JButton) e.getSource();
		String cadenaSelectorVista = vistaPrincipal.getLblSelectorVistas().getText();
		String name = controlBotton.getText();
		
		if(cadenaSelectorVista.equals("Vista Cliente")) {
			cambiarVistaCliente(name);
			System.out.println(name);
		} else {
			cambiarVistaVideos(name);
			System.out.println(name);
		}
	}
	
	/** Cambia de rama cliente a rama videos */
	private void cambiarVistaCliente(String name) {
		
		switch(name) {
		case "Crear":
			vistaPrincipal.mostrarVistaCrear();
			break;
		case "Modificar":
			vistaPrincipal.mostrarVistaModificar();
			break;
		case "Cambiar a Cliente":
			vistaPrincipal.cambiarVista("Cambiar a Cliente");
			break;
		case "Cambiar a Videos":
			vistaPrincipal.cambiarVista("Cambiar a Videos");
			break;
		}
	}
	
	/** Cambia de rama videos a rama cliente */
	private void cambiarVistaVideos(String name) {
		
		switch(name) {
		case "Crear":
			vistaPrincipal.mostrarVistaCrear();
		case "Modificar":
			vistaPrincipal.mostrarVistaModificar();
			break;
		case "Cambiar a Cliente":
			vistaPrincipal.cambiarVista("Cambiar a Cliente");
			break;
		case "Cambiar a Videos":
			vistaPrincipal.cambiarVista("Cambiar a Videos");
			break;
		}
	}

	/**
	 * @return the vistaPrincipal
	 */
	public MainView getVistaPrincipal() {
		return vistaPrincipal;
	}

	/**
	 * @param vistaPrincipal the vistaPrincipal to set
	 */
	public void setVistaPrincipal(MainView vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
	}
	
	
	
}
