package com.example.ud22_ejercicio2;

import com.example.ud22_controllers.ViewController;
import com.example.ud22_views.MainView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )    {
       MainView vistaPrincipal = new MainView();
       ViewController selectorVista = new ViewController();
       
       vistaPrincipal.setViewModelSelector(selectorVista);
       selectorVista.setVistaPrincipal(vistaPrincipal);
       
       vistaPrincipal.frame.setVisible(true);
    }
}
