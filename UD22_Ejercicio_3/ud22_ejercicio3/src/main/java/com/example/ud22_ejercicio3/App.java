package com.example.ud22_ejercicio3;

import com.example.ud22_ejercicio3.Views.ViewGeneral;
import com.example.ud22_ejercicio3.controllers.ViewSwicherController;

public class App {
    public static void main( String[] args )    {
     
       ViewGeneral vistaPrincipal = new ViewGeneral();
       ViewSwicherController selectorVista = new ViewSwicherController();
       
       vistaPrincipal.setCambiarVistas(selectorVista);
       selectorVista.setViewCientifico(vistaPrincipal);
       
       vistaPrincipal.frame.setVisible(true);
    }
}

