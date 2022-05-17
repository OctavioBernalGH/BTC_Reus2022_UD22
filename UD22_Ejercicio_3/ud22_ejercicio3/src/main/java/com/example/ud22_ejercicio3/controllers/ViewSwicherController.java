package com.example.ud22_ejercicio3.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import com.example.ud22_ejercicio3.Views.ViewGeneral;
import com.example.ud22_ejercicio3.models.FunctionModel;

public class ViewSwicherController implements ActionListener{
	
	FunctionModel functionModel = new FunctionModel();
	private ViewGeneral vista;
	
	public void ActionsCientifico() {
		vista = new ViewGeneral();
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		FunctionModel functionModel = new FunctionModel();
		
		JButton cambiadorVista = (JButton) e.getSource();
		String discriminator = vista.getLblTittle().getText();
		// Getting the text of the widget
		String name = cambiadorVista.getText();
		
		//Si esta selecionado cientifico
		if(discriminator.equals("Cientifico")) {
			cambiarVistaCientifico(name);
		}else {//si esta selecionado Proyecto
			cambiarVistaProyecto(name);
		}
		
		switch (name) {

		/** Botón crear cliente */
		case "Crear Cientifico":
			// Syso de ruta
			System.out.println("Switch crear cientifico");
			// Obtener datos de los TF.
			String nomApels = vista.getTxtCientificoNomApels().getText();
			String dni = vista.getTxtCientificoDNI().getText();
			// Crear cientifico.
			try {
				functionModel.crearCientifico(dni, nomApels);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
			break;
		
		/** Botón crear proyecto */
		case "Crear Proyecto":
			// Syso de ruta
			System.out.println("Switch crear proyecto");
			// Obtener datos de los TF.
			String id = vista.getTxtProyectoID().getText();
			String nombre = vista.getTxtProyectoNombre().getText();
			int horas = Integer.parseInt(vista.getTxtProyectoHoras().getText());
			// Crear proyecto.
			try {
				functionModel.crearProyecto(id, nombre, horas);
			} catch (Throwable e1) {
				e1.printStackTrace();
			}
			break;
			
			/** Botón modificar cientifico */
			case "Modificar Cientifico":
				// Syso de ruta
				System.out.println("Switch modificar cientifico");
				// Obtener datos de los TF.
				nomApels = vista.getTxtCientificoNomApels().getText();
				dni = vista.getTxtCientificoDNI().getText();
				// Modificar cientifico.
				try {
					functionModel.updateCientifico(dni, nomApels);
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
				break;
				
				/** Botón modificar cientifico */
			case "Modificar Proyecto":
				// Syso de ruta
				System.out.println("Switch crear proyecto");
				// Obtener datos de los TF.
				id = vista.getTxtProyectoID().getText();
				nombre = vista.getTxtProyectoNombre().getText();
				horas = Integer.parseInt(vista.getTxtProyectoHoras().getText());
				// Modificar proyecto.
				try {
					functionModel.updateProyecto(id, nombre, horas);
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
				break;
				
				/** Botón crear cientifico */
			case "Borrar Cientifico":
				// Syso de ruta
				System.out.println("Switch borrar cientifico");
				// Obtener datos de los TF.
				dni = vista.getTxtCientificoDNI().getText();
				// borrar cientifico.
				try {
					functionModel.eliminarCientifico(dni);
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
				break;
				
				/** Botón borrar proyecto */
			case "Borrar Proyecto":
				// Syso de ruta
				System.out.println("Switch borrar proyecto");
				// Obtener datos de los TF.
				id = vista.getTxtProyectoID().getText();
				// borrar proyectro.
				try {
					functionModel.eliminarProyecto(id);
				} catch (Throwable e1) {
					e1.printStackTrace();
				}
				break;
				
			case "Buscar Cientifico":
				// Syso de ruta
				dni = vista.getTxtCientificoDNI().getText();
				
			try {
				functionModel.buscarCientificoDNI(dni);
			} catch (Throwable e1) {
				
				e1.printStackTrace();
			}
				break;
	}
			
	}
	private void cambiarVistaProyecto(String name) {
		
		switch(name) {
			case "Crear":
				vista.showCreate();
				break;
			case "Borrar":
				vista.showErase();
				break;
			case "Buscar":
				vista.showSearch();
				break;
			case "Modificar":
				vista.showModify();
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
				System.out.println("Cambiar de vista a proyecto");
				vista.toggleEntity("Cambiar a Proyecto");
				break;
			//Toggle entity
			case "Cambiar a Cientifico":
				System.out.println("Cambiar de vista a cientifico");
				vista.toggleEntity("Cambiar a Cientifico");
				break;
		}
	}
	private void cambiarVistaCientifico(String name) {
		switch(name) {
			case "Crear":
				vista.showCreate();
				break;
			case "Borrar":
				vista.showErase();
				break;
			case "Buscar":
				vista.showSearch();
				break;
			case "Modificar":
				vista.showModify();
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
				vista.showCreate();
				break;
			//Toggle entity
			case "Cambiar a Proyecto":
				System.out.println("Cambiar a vista proyecto");
				vista.toggleEntity("Cambiar a Proyecto");
				break;
			//Toggle entity
			case "Cambiar a Cientifico":
				System.out.println("cambiar a vista cientifico");
				vista.toggleEntity("Cambiar a Cientifico");
				break;
		}
	}

	public ViewGeneral getViewCientifico() {
		return vista;
	}

	public void setViewCientifico(ViewGeneral viewCientifico) {
		this.vista = viewCientifico;
	}

	
	
}
