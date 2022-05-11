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

import com.example.controlador.ActionsDelete;

import javax.swing.JButton;

public class ViewDelete {

	private JFrame frmCrearPersona;
	private JTextField nombreBorrarField;
	private JTextField dniBorrarField;
	
	private ActionsDelete ac = new ActionsDelete();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDelete window = new ViewDelete();
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
	public ViewDelete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frmCrearPersona = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTituloBorrar = new JLabel("Borrar usuario");
		JLabel lblIntroducirDatosBorrar = new JLabel("** Introduzca los datos");
		JLabel lblNombreBorrar = new JLabel("Nombre:");
		JLabel lblBuscarPorDniBorrar = new JLabel("Necesario introducir Nombre y DNI.");
		JLabel lblDocumentoDeIdentidadBorrar = new JLabel("DNI:");
		// Se crean las diferentes JTextFields
		nombreBorrarField = new JTextField();
		dniBorrarField = new JTextField();
		// Se crean los JButtons
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(ac);

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Borrar persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 415, 465);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTituloBorrar.setForeground(Color.WHITE);
		lblTituloBorrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTituloBorrar.setBounds(29, 22, 227, 31);
		frmCrearPersona.getContentPane().add(lblTituloBorrar);

		lblNombreBorrar.setForeground(Color.WHITE);
		lblNombreBorrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombreBorrar.setBounds(29, 105, 78, 31);
		frmCrearPersona.getContentPane().add(lblNombreBorrar);

		lblDocumentoDeIdentidadBorrar.setForeground(Color.WHITE);
		lblDocumentoDeIdentidadBorrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidadBorrar.setBounds(29, 147, 78, 31);
		frmCrearPersona.getContentPane().add(lblDocumentoDeIdentidadBorrar);

		nombreBorrarField.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreBorrarField.setForeground(Color.WHITE);
		nombreBorrarField.setBackground(Color.LIGHT_GRAY);
		nombreBorrarField.setBounds(117, 111, 190, 20);
		frmCrearPersona.getContentPane().add(nombreBorrarField);
		nombreBorrarField.setColumns(10);

		dniBorrarField.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniBorrarField.setForeground(Color.WHITE);
		dniBorrarField.setColumns(10);
		dniBorrarField.setBackground(Color.LIGHT_GRAY);
		dniBorrarField.setBounds(117, 153, 190, 20);
		frmCrearPersona.getContentPane().add(dniBorrarField);

		btnBorrar.setBounds(131, 201, 89, 23);
		frmCrearPersona.getContentPane().add(btnBorrar);

		lblIntroducirDatosBorrar.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIntroducirDatosBorrar.setForeground(Color.RED);
		lblIntroducirDatosBorrar.setBounds(29, 56, 137, 14);
		frmCrearPersona.getContentPane().add(lblIntroducirDatosBorrar);

		lblBuscarPorDniBorrar.setForeground(Color.RED);
		lblBuscarPorDniBorrar.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblBuscarPorDniBorrar.setBounds(29, 80, 227, 14);
		frmCrearPersona.getContentPane().add(lblBuscarPorDniBorrar);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(232, 198, 89, 23);
		frmCrearPersona.getContentPane().add(btnAtras);
	}
}
