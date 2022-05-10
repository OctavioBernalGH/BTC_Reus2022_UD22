package com.example.ud22_controllers;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.example.ud22_models.ModelDDBB;
import com.example.ud22_models.ModelFunctions;
import com.example.ud22_views.ViewCreate;
import com.example.ud22_views.ViewDelete;
import com.example.ud22_views.ViewRead;

public class MainController {

	public class Controlador implements ActionListener {

		private ModelDDBB modeloBBDD;
		private ModelFunctions funcionesModelo;
		private ViewCreate vistaCrear;
		private ViewDelete vistaBorrar;
		private ViewRead vistaLeer;

		/**
		 * Método de la clase Controlador del tipo ActionPerformed.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}
}
