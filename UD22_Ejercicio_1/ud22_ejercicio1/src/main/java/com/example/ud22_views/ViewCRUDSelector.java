package com.example.ud22_views;

/**
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * @author Octavio Bernal Vilana
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.example.controlador.ActionsCRUDView;
import com.example.controlador.ActionsServerView;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JButton;

public class ViewCRUDSelector {

	public JFrame frameCRUDSelectorView;
	private ActionsCRUDView ac = new ActionsCRUDView();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCRUDSelector window = new ViewCRUDSelector();
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
	public ViewCRUDSelector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frameCRUDSelectorView 		= new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo 			= new JLabel("Seleccionar operación");
		JLabel lblConexion 			= new JLabel("** Selecciona operación a realizar");
		JButton btnBuscarCliente 	= new JButton("Buscar Cliente");
		JButton btnModificarCliente = new JButton("Modificar Cliente");
		JButton btnBorrarCliente 	= new JButton("Borrar Cliente");
		JButton btnAnyadirCliente 	= new JButton("Añadir Cliente");

		// Se definen los diferentes componentes
		frameCRUDSelectorView.setTitle("Menu CRUD");
		frameCRUDSelectorView.getContentPane().setBackground(Color.DARK_GRAY);
		frameCRUDSelectorView.setBounds(100, 100, 254, 314);
		frameCRUDSelectorView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameCRUDSelectorView.getContentPane().setLayout(null);

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		

		lblConexion.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblConexion.setForeground(Color.RED);
		lblConexion.setBounds(29, 56, 164, 14);
		
		
		btnAnyadirCliente.setBounds(37, 99, 156, 23);
		btnBorrarCliente.setBounds(37, 133, 156, 23);
		btnModificarCliente.setBounds(37, 167, 156, 23);
		btnBuscarCliente.setBounds(37, 201, 156, 23);
		
//Action Listeners
		btnBuscarCliente.addActionListener(ac);
		btnModificarCliente.addActionListener(ac);
		btnBorrarCliente.addActionListener(ac);
		btnAnyadirCliente.addActionListener(ac);
		
//Adding elements to Content panel
		frameCRUDSelectorView.getContentPane().add(btnBuscarCliente);
		frameCRUDSelectorView.getContentPane().add(btnModificarCliente);
		frameCRUDSelectorView.getContentPane().add(btnBorrarCliente);
		frameCRUDSelectorView.getContentPane().add(btnAnyadirCliente);
		frameCRUDSelectorView.getContentPane().add(lblConexion);
		frameCRUDSelectorView.getContentPane().add(lblTitulo);
	}
	
}
