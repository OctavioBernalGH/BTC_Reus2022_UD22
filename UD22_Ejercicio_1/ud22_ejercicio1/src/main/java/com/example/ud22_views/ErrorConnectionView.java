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
import javax.swing.JButton;
import javax.swing.JTextPane;

import com.example.ud22_controllers.ActionsServerView;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JTextField;

public class ErrorConnectionView {

	public JFrame frameErrorConection;
	private JTextField txtFallo1linea;
	private JTextField txtFallo2linea;
	private JTextField txtFallo3linea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorConnectionView window = new ErrorConnectionView();
					window.frameErrorConection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ErrorConnectionView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frameErrorConection 				= new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo 				= new JLabel("Error al conectar");
		JButton btnAceptarError 		= new JButton("Aceptar");

		// Se definen los diferentes componentes
		frameErrorConection.setTitle("Error Window");
		frameErrorConection.getContentPane().setBackground(Color.DARK_GRAY);
		frameErrorConection.setBounds(100, 100, 281, 244);
		frameErrorConection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameErrorConection.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(49, 22, 166, 31);
		btnAceptarError.setBackground(Color.YELLOW);
		btnAceptarError.setBounds(50, 145, 156, 23);
		
//Action Listeners

//Adding elements to content panel
		frameErrorConection.getContentPane().add(btnAceptarError);
		frameErrorConection.getContentPane().add(lblTitulo);
		
		txtFallo1linea = new JTextField();
		txtFallo1linea.setText("No se ha podido establecer");
		txtFallo1linea.setEditable(false);
		txtFallo1linea.setBackground(Color.DARK_GRAY);
		txtFallo1linea.setForeground(Color.RED);
		txtFallo1linea.setBounds(50, 65, 189, 20);
		frameErrorConection.getContentPane().add(txtFallo1linea);
		txtFallo1linea.setColumns(10);
		txtFallo1linea.setBorder(null);
		
		txtFallo2linea = new JTextField();
		txtFallo2linea.setText("la conexión con el servidor,");
		txtFallo2linea.setForeground(Color.RED);
		txtFallo2linea.setEditable(false);
		txtFallo2linea.setColumns(10);
		txtFallo2linea.setBackground(Color.DARK_GRAY);
		txtFallo2linea.setBounds(50, 85, 189, 20);
		frameErrorConection.getContentPane().add(txtFallo2linea);
		txtFallo2linea.setBorder(null);
		
		txtFallo3linea = new JTextField();
		txtFallo3linea.setText("intentelo de nuevo más tarde");
		txtFallo3linea.setForeground(Color.RED);
		txtFallo3linea.setEditable(false);
		txtFallo3linea.setColumns(10);
		txtFallo3linea.setBackground(Color.DARK_GRAY);
		txtFallo3linea.setBounds(50, 105, 189, 20);
		frameErrorConection.getContentPane().add(txtFallo3linea);
		txtFallo3linea.setBorder(null);
	}
}
