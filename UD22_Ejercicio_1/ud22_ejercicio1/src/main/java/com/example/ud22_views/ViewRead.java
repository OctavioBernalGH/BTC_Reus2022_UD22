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
import javax.swing.JButton;

public class ViewRead {

	private JFrame frmCrearPersona;
	private JTextField nombreField;
	private JTextField dniField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRead window = new ViewRead();
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
	public ViewRead() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frmCrearPersona = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo = new JLabel("Buscar usuario");
		JLabel lblNewLabel = new JLabel("** Introduzca los datos");
		JLabel lblBuscarPorNombre = new JLabel("Buscar por nombre");
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblBuscarPorDni = new JLabel("Buscar por DNI");
		JLabel lblDocumentoDeIdentidad = new JLabel("DNI:");
		// Se crean las diferentes JTextFields
		nombreField = new JTextField();
		dniField = new JTextField();
		// Se crean los JButtons
		JButton buscarButton = new JButton("Buscar");

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Buscar persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 415, 465);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		frmCrearPersona.getContentPane().add(lblTitulo);

		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 105, 78, 31);
		frmCrearPersona.getContentPane().add(lblNombre);

		lblDocumentoDeIdentidad.setForeground(Color.WHITE);
		lblDocumentoDeIdentidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidad.setBounds(29, 170, 78, 31);
		frmCrearPersona.getContentPane().add(lblDocumentoDeIdentidad);

		nombreField.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreField.setForeground(Color.WHITE);
		nombreField.setBackground(Color.LIGHT_GRAY);
		nombreField.setBounds(117, 111, 190, 20);
		frmCrearPersona.getContentPane().add(nombreField);
		nombreField.setColumns(10);

		dniField.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniField.setForeground(Color.WHITE);
		dniField.setColumns(10);
		dniField.setBackground(Color.LIGHT_GRAY);
		dniField.setBounds(117, 176, 190, 20);
		frmCrearPersona.getContentPane().add(dniField);

		buscarButton.setBounds(145, 229, 89, 23);
		frmCrearPersona.getContentPane().add(buscarButton);

		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(29, 56, 137, 14);
		frmCrearPersona.getContentPane().add(lblNewLabel);

		lblBuscarPorNombre.setForeground(Color.RED);
		lblBuscarPorNombre.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblBuscarPorNombre.setBounds(29, 91, 137, 14);
		frmCrearPersona.getContentPane().add(lblBuscarPorNombre);

		lblBuscarPorDni.setForeground(Color.RED);
		lblBuscarPorDni.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblBuscarPorDni.setBounds(29, 151, 137, 14);
		frmCrearPersona.getContentPane().add(lblBuscarPorDni);
	}
}
