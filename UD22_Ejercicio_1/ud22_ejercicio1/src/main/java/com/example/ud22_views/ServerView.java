package com.example.ud22_views;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.example.controlador.ActionListenersClass;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class ServerView {

	public JFrame frmCrearPersona;
	private ActionListenersClass ac = new ActionListenersClass();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerView window = new ServerView();
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
	public ServerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frmCrearPersona = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo = new JLabel("Seleccionar servidor");
		JLabel lblConexion = new JLabel("** Selecciona conexión");

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Crear persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 254, 314);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		frmCrearPersona.getContentPane().add(lblTitulo);

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 137, 14);
		frmCrearPersona.getContentPane().add(lblConexion);

		JButton btnServidorUri = new JButton("Servidor Uri");
		btnServidorUri.setBounds(37, 99, 156, 23);
		frmCrearPersona.getContentPane().add(btnServidorUri);
		
		btnServidorUri.addActionListener(ac);

		JButton btnServidorDavid = new JButton("Servidor David");
		btnServidorDavid.setBounds(37, 133, 156, 23);
		frmCrearPersona.getContentPane().add(btnServidorDavid);
		btnServidorDavid.addActionListener(ac);

		JButton btnServidorOctavio = new JButton("Servidor Octavio");
		btnServidorOctavio.setBounds(37, 167, 156, 23);
		frmCrearPersona.getContentPane().add(btnServidorOctavio);

		JButton btnServidorManual = new JButton("Conexión Manual");
		btnServidorManual.setBackground(Color.YELLOW);
		btnServidorManual.setBounds(37, 221, 156, 23);
		frmCrearPersona.getContentPane().add(btnServidorManual);
	}
}
