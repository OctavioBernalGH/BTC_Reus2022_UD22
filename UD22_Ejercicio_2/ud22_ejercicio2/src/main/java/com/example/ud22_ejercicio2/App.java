package com.example.ud22_ejercicio2;

import com.example.ud22_controllers.ViewModelSelector;
import com.example.ud22_views.MainView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       MainView vistaPrincipal = new MainView();
       ViewModelSelector selectorVista = new ViewModelSelector();
       
       vistaPrincipal.setViewModelSelector(selectorVista);
       selectorVista.setVistaPrincipal(vistaPrincipal);
       
       vistaPrincipal.frame.setVisible(true);
    }
}
