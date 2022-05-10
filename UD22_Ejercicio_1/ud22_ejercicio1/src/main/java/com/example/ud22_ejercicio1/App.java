package com.example.ud22_ejercicio1;


import com.example.ud22_views.ServerView;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {

        ServerView selectorServidor = new ServerView();
        selectorServidor.frameServerView.setVisible(true);

    }
}
