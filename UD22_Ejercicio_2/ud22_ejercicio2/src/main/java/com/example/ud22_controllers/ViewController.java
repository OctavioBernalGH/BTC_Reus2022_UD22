/**
 * 
 */
package com.example.ud22_controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import com.example.ud22_models.ConnectorModel;
import com.example.ud22_views.MainView;

/**
 * @author Gaming
 *
 */
public class ViewController implements ActionListener {

	private ConnectorModel conectorModelo = new ConnectorModel();
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
			try {
				conectorModelo.selectServer(3);
				vistaPrincipal.mostrarVistaCrear();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			break;
		case "Modificar":
			vistaPrincipal.mostrarVistaModificar();
			break;
		case "Eliminar":
			vistaPrincipal.mostrarVistaEliminar();
			break;
		case "Cambiar a Cliente":
			vistaPrincipal.cambiarVista("Cambiar a Cliente");
			break;
		case "Consultar":
			vistaPrincipal.mostrarVistaMostrar();
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
				break;
			case "Modificar":
				vistaPrincipal.mostrarVistaModificar();
				break;
			case "Eliminar":
				vistaPrincipal.mostrarVistaEliminar();
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
