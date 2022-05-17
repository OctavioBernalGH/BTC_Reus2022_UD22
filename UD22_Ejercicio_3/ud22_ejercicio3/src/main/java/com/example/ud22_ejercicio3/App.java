package com.example.ud22_ejercicio3;

import com.example.ud22_ejercicio3.Views.ViewGeneral;
import com.example.ud22_ejercicio3.controllers.ActionsCientificoController;
import com.example.ud22_ejercicio3.controllers.ViewController;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args )    {
       ViewGeneral vistaPrincipal = new ViewGeneral();
       ViewController selectorVista = new ViewController();
       
       vistaPrincipal.setViewModelSelector(selectorVista);
       selectorVista.setVistaPrincipal(vistaPrincipal);
       
       vistaPrincipal.frame.setVisible(true);
    }
}

