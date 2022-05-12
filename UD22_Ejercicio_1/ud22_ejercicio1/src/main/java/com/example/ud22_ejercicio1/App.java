package com.example.ud22_ejercicio1;


import com.example.ud22_controllers.ActionsRead;
import com.example.ud22_views.ViewCRUDSelector;
import com.example.ud22_views.ViewCreate;
import com.example.ud22_views.ViewDelete;
import com.example.ud22_views.ViewErrorConnection;
import com.example.ud22_views.ViewManualConn;
import com.example.ud22_views.ViewRead;
import com.example.ud22_views.ViewServer;
import com.example.ud22_views.ViewUpdate;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        new App().iniciar();
    }
    
    public void iniciar() {
//Declarations of views
    	ViewServer vServidor 			= new ViewServer();
    	ViewManualConn vManual 			= new ViewManualConn();
    	ViewCRUDSelector vCrud 			= new ViewCRUDSelector();
    	ViewCreate vCreate 				= new ViewCreate();
    	ViewDelete vDelete 				= new ViewDelete();
    	ViewErrorConnection vErrorCon	= new ViewErrorConnection();
    	ViewRead vRead 					= new ViewRead();
    	ViewUpdate vUpdate 				= new ViewUpdate();
    	
//Declaration of Listeners
    	ActionsRead actionsRead = new ActionsRead();
    	
//Asignaciones a views
    	vRead.setAlREad(actionsRead);
//Asignaciones a Listeners
        actionsRead.setVwREad(vRead);
        
//Show view
        vServidor.frameServerView.setVisible(true);
    }
}
