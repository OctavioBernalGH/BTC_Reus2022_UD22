package com.example.ud22_views;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import com.example.ud22_controllers.ActionsRead;

import javax.swing.JButton;

public class ViewRead {

	public JFrame frmReadPersona;
	private JTextField nombreField;
	private JTextField dniField;
	
	private ActionsRead alREad;


	//Constructor
	public ViewRead() {
		alREad  = new ActionsRead();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Envio de esta ventana al action listener
		alREad.setVwREad(this);
		
		//Creating elements
		frmReadPersona = new JFrame();
		nombreField = new JTextField();
		dniField = new JTextField();
		
		JLabel lblTitulo 				= new JLabel("Buscar usuario");
		JLabel lblNewLabel 				= new JLabel("** Introduzca los datos");
		JLabel lblBuscarPorNombre 		= new JLabel("Buscar por nombre");
		JLabel lblNombre 				= new JLabel("Nombre:");
		JLabel lblBuscarPorDni 			= new JLabel("Buscar por DNI");
		JLabel lblDocumentoDeIdentidad 	= new JLabel("DNI:");
		JButton btnAtras 				= new JButton("Atras");
		JButton btnbuscar 				= new JButton("Buscar");
		
		
		
//Parameterizing
		frmReadPersona.setTitle("Buscar persona");
		frmReadPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmReadPersona.setBounds(100, 100, 415, 465);
		frmReadPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmReadPersona.getContentPane().setLayout(null);
		
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 105, 78, 31);
		
		lblDocumentoDeIdentidad.setForeground(Color.WHITE);
		lblDocumentoDeIdentidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidad.setBounds(29, 170, 78, 31);
		
		nombreField.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreField.setForeground(Color.WHITE);
		nombreField.setBackground(Color.LIGHT_GRAY);
		nombreField.setBounds(117, 111, 190, 20);
		
		nombreField.setColumns(10);

		dniField.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniField.setForeground(Color.WHITE);
		dniField.setColumns(10);
		dniField.setBackground(Color.LIGHT_GRAY);
		dniField.setBounds(117, 176, 190, 20);
	
		btnbuscar.setBounds(145, 229, 89, 23);

		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(29, 56, 137, 14);
		

		lblBuscarPorNombre.setForeground(Color.RED);
		lblBuscarPorNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblBuscarPorNombre.setBounds(29, 91, 137, 14);
		

		lblBuscarPorDni.setForeground(Color.RED);
		lblBuscarPorDni.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblBuscarPorDni.setBounds(29, 151, 137, 14);
		btnAtras.setBounds(246, 229, 89, 23);
		
//Action listeners
		btnAtras.addActionListener(alREad);
		btnbuscar.addActionListener(alREad);
		
//Adding elements to content panel
		frmReadPersona.getContentPane().add(lblDocumentoDeIdentidad);
		frmReadPersona.getContentPane().add(nombreField);
		frmReadPersona.getContentPane().add(dniField);
		frmReadPersona.getContentPane().add(lblNombre);
		frmReadPersona.getContentPane().add(lblTitulo);
		frmReadPersona.getContentPane().add(btnbuscar);
		frmReadPersona.getContentPane().add(lblBuscarPorDni);
		frmReadPersona.getContentPane().add(btnAtras);
		frmReadPersona.getContentPane().add(lblBuscarPorNombre);
		frmReadPersona.getContentPane().add(lblNewLabel);
	}
	
//Getters y setters
	public JTextField getNombreField() {
		return nombreField;
	}

	public void setNombreField(JTextField nombreField) {
		this.nombreField = nombreField;
	}

	public JTextField getDniField() {
		return dniField;
	}

	public void setDniField(JTextField dniField) {
		this.dniField = dniField;
	}

	public ActionsRead getAlREad() {
		return alREad;
	}

	public void setAlREad(ActionsRead alREad) {
		this.alREad = alREad;
	}
	
	
}
