package com.example.ud22_ejercicio3;

import com.example.ud22_ejercicio3.Views.ViewGeneral;
import com.example.ud22_ejercicio3.controllers.ActionsCientifico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	new App().iniciar();
    }
    public void iniciar() {
    	
    	ViewGeneral viewCientifico = new ViewGeneral();
    	ActionsCientifico actionsCientifico = new ActionsCientifico();
    	
    	viewCientifico.setActionsCientifico(actionsCientifico);
    	actionsCientifico.setViewCientifico(viewCientifico);
    	
    	viewCientifico.frame.setVisible(true);
    }
}
