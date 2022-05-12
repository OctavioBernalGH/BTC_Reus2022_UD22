package com.example.ud22_ejercicio3;

import com.example.ud22_ejercicio3.Views.ViewCientifico;

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
    	
    	ViewCientifico viewCientifico = new ViewCientifico();
    	ActionsCientifico actionsCientifico = new ActionsCientifico();
    	
    	viewCientifico.setActionsCientifico(actionsCientifico);
    	actionsCientifico.setViewCientifico(viewCientifico);
    	
    	viewCientifico.frame.setVisible(true);
    }
}
