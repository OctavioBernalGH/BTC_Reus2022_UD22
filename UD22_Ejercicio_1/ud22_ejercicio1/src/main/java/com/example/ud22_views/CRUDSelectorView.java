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

	public JFrame frameCRUDSelectorView;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUDSelectorView window = new CRUDSelectorView();
					window.frameCRUDSelectorView.setVisible(true);
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
		frameCRUDSelectorView = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo = new JLabel("Seleccionar operación");
		JLabel lblConexion = new JLabel("** Selecciona operación a realizar");

		// Se definen los diferentes componentes
		frameCRUDSelectorView.setTitle("Menu CRUD");
		frameCRUDSelectorView.getContentPane().setBackground(Color.DARK_GRAY);
		frameCRUDSelectorView.setBounds(100, 100, 254, 314);
		frameCRUDSelectorView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCRUDSelectorView.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		frameCRUDSelectorView.getContentPane().add(lblTitulo);

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 164, 14);
		frameCRUDSelectorView.getContentPane().add(lblConexion);

		JButton btnAnyadirCliente = new JButton("Añadir Cliente");
		btnAnyadirCliente.setBounds(37, 99, 156, 23);
		frameCRUDSelectorView.getContentPane().add(btnAnyadirCliente);

		JButton btnBorrarCliente = new JButton("Borrar Cliente");
		btnBorrarCliente.setBounds(37, 133, 156, 23);
		frameCRUDSelectorView.getContentPane().add(btnBorrarCliente);

		JButton btnModificarCliente = new JButton("Modificar Cliente");
		btnModificarCliente.setBounds(37, 167, 156, 23);
		frameCRUDSelectorView.getContentPane().add(btnModificarCliente);
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.setBounds(37, 201, 156, 23);
		frameCRUDSelectorView.getContentPane().add(btnBuscarCliente);

		
	}
	
}
