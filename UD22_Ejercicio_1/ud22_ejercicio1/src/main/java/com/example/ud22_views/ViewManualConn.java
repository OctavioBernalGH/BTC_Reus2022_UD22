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
import javax.swing.JTextField;

public class ViewManualConn {

	private JFrame frmCrearPersona;
	private JTextField txtIP;
	private JTextField txtUsuario;
	private JTextField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewManualConn window = new ViewManualConn();
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
	public ViewManualConn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

//Declaring objects
		txtIP 							= new JTextField();
		frmCrearPersona 				= new JFrame();
		txtUsuario 						= new JTextField();
		txtContraseña 					= new JTextField();
		JLabel lblContrasea 			= new JLabel("Contraseña:");
		JLabel lblUsuario 				= new JLabel("Usuario:");
		JLabel lblIpManual 				= new JLabel("IP Servidor:");
		JButton btnServidorManual 		= new JButton("Conectarse");
		JLabel lblTitulo 				= new JLabel("Seleccionar servidor");
		JLabel lblConexion 				= new JLabel("** Introduzca IP separada por puntos");

		frmCrearPersona.setTitle("Conexión Manual");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 289, 314);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 187, 14);
		
		
		btnServidorManual.setBackground(Color.YELLOW);
		btnServidorManual.setBounds(60, 228, 156, 23);
		
		
		lblIpManual.setForeground(Color.WHITE);
		lblIpManual.setBounds(10, 87, 78, 14);
		
		
		
		txtIP.setForeground(Color.WHITE);
		txtIP.setBackground(Color.GRAY);
		txtIP.setBounds(96, 84, 137, 20);
		
		txtIP.setColumns(10);
		
		
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(10, 133, 78, 14);
		
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setBackground(Color.GRAY);
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(96, 130, 137, 20);
		
		
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(10, 178, 78, 14);
		
		txtContraseña.setForeground(Color.WHITE);
		txtContraseña.setBackground(Color.GRAY);
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(96, 175, 137, 20);
//Action listeners
		
//Adding elements to content Panel
		frmCrearPersona.getContentPane().add(txtIP);
		frmCrearPersona.getContentPane().add(lblTitulo);
		frmCrearPersona.getContentPane().add(lblConexion);
		frmCrearPersona.getContentPane().add(btnServidorManual);
		frmCrearPersona.getContentPane().add(lblIpManual);
		frmCrearPersona.getContentPane().add(lblUsuario);
		frmCrearPersona.getContentPane().add(txtUsuario);
		frmCrearPersona.getContentPane().add(lblContrasea);
		frmCrearPersona.getContentPane().add(txtContraseña);
		
	}
}
