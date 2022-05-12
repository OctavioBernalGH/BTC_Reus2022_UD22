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

import com.example.ud22_controllers.ActionsCreate;
import com.example.ud22_controllers.ActionsRead;

import javax.swing.JButton;

public class ViewCreate {

	public JFrame frmCrearPersona;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField direccionField;
	private JTextField dniField;
	private JTextField fechaField;
	
	private ActionsCreate actionsCreate;

	//Constructor
	public ViewCreate() {	
		actionsCreate = new ActionsCreate();
		initialize();
	}

	private void initialize() {
		actionsCreate.setViewCreate(this);
//Creating 
		frmCrearPersona 				= new JFrame();
		nombreField 					= new JTextField();
		apellidoField 					= new JTextField();
		direccionField 					= new JTextField();
		dniField 						= new JTextField();
		fechaField 						= new JTextField();
	
		JLabel lblTitulo 				= new JLabel("Crear usuario");
		JLabel lblIntroduzcaDatos 		= new JLabel("** Introduzca los datos");
		JLabel lblNombre 				= new JLabel("Nombre:");
		JLabel lblApellido 				= new JLabel("Apellido:");
		JLabel lblDireccion 			= new JLabel("Direccion:");
		JLabel lblFecha 				= new JLabel("Fecha:");
		JButton btnAtras 				= new JButton("Atras");
		JLabel lblDocumentoDeIdentidad 	= new JLabel("DNI:");
		JButton btnCrear 				= new JButton("Crear");

		frmCrearPersona.setTitle("Crear persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 387, 465);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 81, 78, 31);
		

		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(29, 123, 78, 31);
		

		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(29, 165, 78, 31);
		

		lblDocumentoDeIdentidad.setForeground(Color.WHITE);
		lblDocumentoDeIdentidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidad.setBounds(29, 207, 78, 31);
		

		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(29, 249, 78, 31);
		
		nombreField.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreField.setForeground(Color.WHITE);
		nombreField.setBackground(Color.LIGHT_GRAY);
		nombreField.setBounds(117, 87, 190, 20);
		
		nombreField.setColumns(10);

		apellidoField.setFont(new Font("Tahoma", Font.BOLD, 11));
		apellidoField.setForeground(Color.WHITE);
		apellidoField.setColumns(10);
		apellidoField.setBackground(Color.LIGHT_GRAY);
		apellidoField.setBounds(117, 129, 190, 20);
		

		direccionField.setFont(new Font("Tahoma", Font.BOLD, 11));
		direccionField.setForeground(Color.WHITE);
		direccionField.setColumns(10);
		direccionField.setBackground(Color.LIGHT_GRAY);
		direccionField.setBounds(117, 171, 190, 20);
		

		dniField.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniField.setForeground(Color.WHITE);
		dniField.setColumns(10);
		dniField.setBackground(Color.LIGHT_GRAY);
		dniField.setBounds(117, 213, 190, 20);
		

		fechaField.setFont(new Font("Tahoma", Font.BOLD, 11));
		fechaField.setForeground(Color.WHITE);
		fechaField.setColumns(10);
		fechaField.setBackground(Color.LIGHT_GRAY);
		fechaField.setBounds(117, 255, 190, 20);
		
		btnCrear.setBounds(137, 306, 89, 23);
		
		lblIntroduzcaDatos.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIntroduzcaDatos.setForeground(Color.RED);
		lblIntroduzcaDatos.setBounds(29, 56, 137, 14);

		btnAtras.setBounds(236, 306, 89, 23);
		
//Action Listeners
		btnAtras.addActionListener(actionsCreate);
		btnCrear.addActionListener(actionsCreate);
		
//Adding elements to content panel
		frmCrearPersona.getContentPane().add(btnAtras);
		frmCrearPersona.getContentPane().add(lblIntroduzcaDatos);
		frmCrearPersona.getContentPane().add(btnCrear);
		frmCrearPersona.getContentPane().add(fechaField);
		frmCrearPersona.getContentPane().add(dniField);
		frmCrearPersona.getContentPane().add(direccionField);
		frmCrearPersona.getContentPane().add(apellidoField);
		frmCrearPersona.getContentPane().add(nombreField);
		frmCrearPersona.getContentPane().add(lblFecha);
		frmCrearPersona.getContentPane().add(lblDocumentoDeIdentidad);
		frmCrearPersona.getContentPane().add(lblDireccion);
		frmCrearPersona.getContentPane().add(lblNombre);
		frmCrearPersona.getContentPane().add(lblTitulo);
		frmCrearPersona.getContentPane().add(lblApellido);
	}

	public JFrame getFrmCrearPersona() {
		return frmCrearPersona;
	}

	public void setFrmCrearPersona(JFrame frmCrearPersona) {
		this.frmCrearPersona = frmCrearPersona;
	}

	public JTextField getNombreField() {
		return nombreField;
	}

	public void setNombreField(JTextField nombreField) {
		this.nombreField = nombreField;
	}

	public JTextField getApellidoField() {
		return apellidoField;
	}

	public void setApellidoField(JTextField apellidoField) {
		this.apellidoField = apellidoField;
	}

	public JTextField getDireccionField() {
		return direccionField;
	}

	public void setDireccionField(JTextField direccionField) {
		this.direccionField = direccionField;
	}

	public JTextField getDniField() {
		return dniField;
	}

	public void setDniField(JTextField dniField) {
		this.dniField = dniField;
	}

	public JTextField getFechaField() {
		return fechaField;
	}

	public void setFechaField(JTextField fechaField) {
		this.fechaField = fechaField;
	}

	public ActionsCreate getActionsCreate() {
		return actionsCreate;
	}

	public void setActionsCreate(ActionsCreate actionsCreate) {
		this.actionsCreate = actionsCreate;
	}

	

}
