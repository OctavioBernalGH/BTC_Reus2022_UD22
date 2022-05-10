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

public class CRUDSelectorView {

	private JFrame frmCrearPersona;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDSelectorView window = new CRUDSelectorView();
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
	public CRUDSelectorView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frmCrearPersona = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo = new JLabel("Seleccionar operación");
		JLabel lblConexion = new JLabel("** Selecciona operación a realizar");

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Menu CRUD");
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
		lblConexion.setBounds(29, 56, 164, 14);
		frmCrearPersona.getContentPane().add(lblConexion);

		JButton btnAñadirCliente = new JButton("Añadir Cliente");
		btnAñadirCliente.setBounds(37, 99, 156, 23);
		frmCrearPersona.getContentPane().add(btnAñadirCliente);

		JButton btnBorrarCliente = new JButton("Borrar Cliente");
		btnBorrarCliente.setBounds(37, 133, 156, 23);
		frmCrearPersona.getContentPane().add(btnBorrarCliente);

		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.setBounds(37, 167, 156, 23);
		frmCrearPersona.getContentPane().add(btnModificarCliente);
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.setBounds(37, 201, 156, 23);
		frmCrearPersona.getContentPane().add(btnBuscarCliente);
	}
}
