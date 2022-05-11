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

import com.example.ud22_controllers.ActionsUpdate;

import javax.swing.JButton;

public class ViewUpdate {

	public JFrame frmCrearPersona;
	private JTextField nombreFieldUpdate;
	private JTextField apellidoFieldUpdate;
	private JTextField direccionFieldUpdate;
	private JTextField dniFieldUpdate;
	private JTextField fechaFieldUpdate;
	
	private ActionsUpdate ac = new ActionsUpdate();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUpdate window = new ViewUpdate();
					window.frmCrearPersona.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewUpdate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
//Declaring objects
		frmCrearPersona 				= new JFrame();
		nombreFieldUpdate 				= new JTextField();
		apellidoFieldUpdate 			= new JTextField();
		direccionFieldUpdate 			= new JTextField();
		dniFieldUpdate 					= new JTextField();
		fechaFieldUpdate 				= new JTextField();
		
		JLabel lblTitulo 				= new JLabel("Actualizar usuario");
		JLabel lblIntroduzcaDatos 		= new JLabel("* Introduzca el DNI y a continuación los demás datos.");
		JLabel lblNombre				= new JLabel("Nombre:");
		JLabel lblApellido 				= new JLabel("Apellido:");
		JLabel lblDireccion 			= new JLabel("Direccion:");
		JLabel lblFecha 				= new JLabel("Fecha:");
		JButton btnActualizar 			= new JButton("Actualizar");
		JButton btnAtras 				= new JButton("Atras");
		JLabel lblDocumentoDeIdentidad 	= new JLabel("DNI:");
		
//Parameterizing
		frmCrearPersona.setTitle("Actualizar persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 387, 465);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);
		

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		

		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 123, 78, 31);
		
		
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(29, 165, 78, 31);
		

		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(29, 207, 78, 31);
		

		lblDocumentoDeIdentidad.setForeground(Color.WHITE);
		lblDocumentoDeIdentidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidad.setBounds(29, 81, 78, 31);
		

		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(29, 249, 78, 31);
		

		nombreFieldUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreFieldUpdate.setForeground(Color.WHITE);
		nombreFieldUpdate.setBackground(Color.LIGHT_GRAY);
		nombreFieldUpdate.setBounds(117, 129, 190, 20);
		
		nombreFieldUpdate.setColumns(10);

		apellidoFieldUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		apellidoFieldUpdate.setForeground(Color.WHITE);
		apellidoFieldUpdate.setColumns(10);
		apellidoFieldUpdate.setBackground(Color.LIGHT_GRAY);
		apellidoFieldUpdate.setBounds(117, 170, 190, 20);
		

		direccionFieldUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		direccionFieldUpdate.setForeground(Color.WHITE);
		direccionFieldUpdate.setColumns(10);
		direccionFieldUpdate.setBackground(Color.LIGHT_GRAY);
		direccionFieldUpdate.setBounds(117, 211, 190, 20);
		

		dniFieldUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniFieldUpdate.setForeground(Color.WHITE);
		dniFieldUpdate.setColumns(10);
		dniFieldUpdate.setBackground(Color.LIGHT_GRAY);
		dniFieldUpdate.setBounds(117, 87, 190, 20);
		

		fechaFieldUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		fechaFieldUpdate.setForeground(Color.WHITE);
		fechaFieldUpdate.setColumns(10);
		fechaFieldUpdate.setBackground(Color.LIGHT_GRAY);
		fechaFieldUpdate.setBounds(117, 255, 190, 20);
		

		btnActualizar.setBounds(137, 306, 89, 23);
		

		lblIntroduzcaDatos.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIntroduzcaDatos.setForeground(Color.RED);
		lblIntroduzcaDatos.setBounds(29, 56, 278, 14);
		
		
		
		btnAtras.setBounds(238, 306, 89, 23);
		frmCrearPersona.getContentPane().add(btnAtras);
		
//Acction listeners
		btnAtras.addActionListener(ac);
		btnActualizar.addActionListener(ac);
		
//Adding to content panel
		frmCrearPersona.getContentPane().add(nombreFieldUpdate);
		frmCrearPersona.getContentPane().add(apellidoFieldUpdate);
		frmCrearPersona.getContentPane().add(direccionFieldUpdate);
		frmCrearPersona.getContentPane().add(dniFieldUpdate);
		frmCrearPersona.getContentPane().add(fechaFieldUpdate);
		frmCrearPersona.getContentPane().add(lblDocumentoDeIdentidad);
		frmCrearPersona.getContentPane().add(lblFecha);
		frmCrearPersona.getContentPane().add(lblDireccion);
		frmCrearPersona.getContentPane().add(lblTitulo);
		frmCrearPersona.getContentPane().add(lblNombre);
		frmCrearPersona.getContentPane().add(lblApellido);
		frmCrearPersona.getContentPane().add(lblIntroduzcaDatos);
		frmCrearPersona.getContentPane().add(btnActualizar);
	}
}
