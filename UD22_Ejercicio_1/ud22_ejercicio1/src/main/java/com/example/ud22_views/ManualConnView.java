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

public class ManualConnView {

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
					ManualConnView window = new ManualConnView();
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
	public ManualConnView() {
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
		JLabel lblConexion = new JLabel("** Introduzca IP separada por puntos");

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Conexión Manual");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 289, 314);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		frmCrearPersona.getContentPane().add(lblTitulo);

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 187, 14);
		frmCrearPersona.getContentPane().add(lblConexion);

		JButton btnServidorManual = new JButton("Conectarse");
		btnServidorManual.setBackground(Color.YELLOW);
		btnServidorManual.setBounds(60, 228, 156, 23);
		frmCrearPersona.getContentPane().add(btnServidorManual);
		
		JLabel lblIpManual = new JLabel("IP Servidor:");
		lblIpManual.setForeground(Color.WHITE);
		lblIpManual.setBounds(10, 87, 78, 14);
		frmCrearPersona.getContentPane().add(lblIpManual);
		
		txtIP = new JTextField();
		txtIP.setForeground(Color.WHITE);
		txtIP.setBackground(Color.GRAY);
		txtIP.setBounds(96, 84, 137, 20);
		frmCrearPersona.getContentPane().add(txtIP);
		txtIP.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(10, 133, 78, 14);
		frmCrearPersona.getContentPane().add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(Color.WHITE);
		txtUsuario.setBackground(Color.GRAY);
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(96, 130, 137, 20);
		frmCrearPersona.getContentPane().add(txtUsuario);
		
		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setBounds(10, 178, 78, 14);
		frmCrearPersona.getContentPane().add(lblContrasea);
		
		txtContraseña = new JTextField();
		txtContraseña.setForeground(Color.WHITE);
		txtContraseña.setBackground(Color.GRAY);
		txtContraseña.setColumns(10);
		txtContraseña.setBounds(96, 175, 137, 20);
		frmCrearPersona.getContentPane().add(txtContraseña);
	}
}
