package com.example.ud22_views;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.example.ud22_controllers.ActionsServerView;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class ServerView {

	public ActionsServerView ac = new ActionsServerView();
	public JFrame frameServerView;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerView window = new ServerView();
					window.frameServerView.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ServerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frameServerView 				= new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo 				= new JLabel("Seleccionar servidor");
		JLabel lblConexion 				= new JLabel("** Selecciona conexión");
		JButton btnServidorManual 		= new JButton("Conexión Manual");
		JButton btnServidorOctavio 		= new JButton("Servidor Octavio");
		JButton btnServidorDavid 		= new JButton("Servidor David");
		JButton btnServidorUri 			= new JButton("Servidor Uri");

		// Se definen los diferentes componentes
		frameServerView.setTitle("Crear persona");
		frameServerView.getContentPane().setBackground(Color.DARK_GRAY);
		frameServerView.setBounds(100, 100, 254, 314);
		frameServerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameServerView.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 137, 14);
		
		btnServidorUri.setBounds(37, 99, 156, 23);
		btnServidorDavid.setBounds(37, 133, 156, 23);
		btnServidorOctavio.setBounds(37, 167, 156, 23);
		btnServidorManual.setBackground(Color.YELLOW);
		btnServidorManual.setBounds(37, 221, 156, 23);
		
//Action Listeners
		btnServidorOctavio.addActionListener(ac);
		btnServidorDavid.addActionListener(ac);
		btnServidorUri.addActionListener(ac);
//Adding elements to content panel
		frameServerView.getContentPane().add(btnServidorManual);
		frameServerView.getContentPane().add(btnServidorOctavio);
		frameServerView.getContentPane().add(btnServidorDavid);
		frameServerView.getContentPane().add(btnServidorUri);	
		frameServerView.getContentPane().add(lblConexion);
		frameServerView.getContentPane().add(lblTitulo);
	}
}
