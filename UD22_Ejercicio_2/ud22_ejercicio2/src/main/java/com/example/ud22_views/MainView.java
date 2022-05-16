/**
 * 
 */
package com.example.ud22_views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Gaming
 *
 */
public class MainView {

	private JFrame frame;

	/** Instancia botones principales vista */
	private JButton btnCrear = new JButton("Crear");
	private JButton btnModificar = new JButton("Modificar");
	private JButton btnEliminar = new JButton("Eliminar");
	private JButton btnConsultar = new JButton("Consultar");
	private JButton btnCambiarVista = new JButton("Cambiar Vista");

	/** Instancia labels vista */
	private JLabel lblNombreCrearCliente = new JLabel("Nombre:");
	private JLabel lblApellidoCrearCliente = new JLabel("Apellido:");
	private JLabel lblDireccionCrearCliente = new JLabel("Dirección:");
	private JLabel lblDniCrearCliente = new JLabel("DNI:");
	private JLabel lblFechaCrearCliente = new JLabel("Fecha:");
	private JLabel lblSelectorVistas = new JLabel("");
	private JLabel lblTituloCrear = new JLabel("Titulo:");
	private JLabel lblDirectorCrear = new JLabel("Director:");

	/** Instanacia textfields vista */
	private JTextField txtNombreCrearCliente;
	private JTextField txtApellidoCrearCliente;
	private JTextField txtDireccionCrearCliente;
	private JTextField txtDniCrearCliente;
	private JTextField txtFechaCrearCliente;
	private JTextField txtTituloCrear;
	private JTextField txtDirectorCrear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView window = new MainView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		lblSelectorVistas.setText("Vista Cliente");
		frame.setBounds(100, 100, 643, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/** Añadir botones al Pane */
		frame.getContentPane().add(btnCrear);
		frame.getContentPane().add(btnModificar);
		frame.getContentPane().add(btnEliminar);
		frame.getContentPane().add(btnConsultar);
		frame.getContentPane().add(btnCambiarVista);

		btnCrear.setBounds(10, 46, 124, 48);
		btnModificar.setBounds(10, 105, 124, 48);
		btnEliminar.setBounds(10, 164, 124, 48);
		btnConsultar.setBounds(10, 223, 124, 48);
		btnCambiarVista.setBounds(31, 417, 170, 23);

		/** Añadir labels al Pane */
		frame.getContentPane().add(lblNombreCrearCliente);
		frame.getContentPane().add(lblApellidoCrearCliente);
		frame.getContentPane().add(lblDireccionCrearCliente);
		frame.getContentPane().add(lblDniCrearCliente);
		frame.getContentPane().add(lblFechaCrearCliente);
		frame.getContentPane().add(lblTituloCrear);
		frame.getContentPane().add(lblDirectorCrear);

		lblNombreCrearCliente.setBounds(226, 63, 81, 14);
		lblApellidoCrearCliente.setBounds(226, 122, 81, 14);
		lblDireccionCrearCliente.setBounds(226, 181, 94, 14);
		lblDniCrearCliente.setBounds(226, 240, 46, 14);
		lblFechaCrearCliente.setBounds(226, 291, 81, 14);
		lblTituloCrear.setBounds(226, 63, 81, 14);
		lblDirectorCrear.setBounds(226, 122, 46, 14);
		lblSelectorVistas.setBounds(71, 390, 73, 14);

		/** Instancia TextFileds vista */
		txtNombreCrearCliente = new JTextField();
		txtApellidoCrearCliente = new JTextField();
		txtDireccionCrearCliente = new JTextField();
		txtDniCrearCliente = new JTextField();
		txtFechaCrearCliente = new JTextField();
		txtTituloCrear = new JTextField();
		txtDirectorCrear = new JTextField();

		/** Añadir TextFields al pane */
		frame.getContentPane().add(txtApellidoCrearCliente);
		frame.getContentPane().add(txtDireccionCrearCliente);
		frame.getContentPane().add(txtDniCrearCliente);
		frame.getContentPane().add(txtFechaCrearCliente);
		frame.getContentPane().add(txtNombreCrearCliente);
		frame.getContentPane().add(lblSelectorVistas);
		frame.getContentPane().add(txtTituloCrear);
		frame.getContentPane().add(txtDirectorCrear);

		txtNombreCrearCliente.setBounds(314, 60, 124, 20);
		txtNombreCrearCliente.setColumns(10);
		txtApellidoCrearCliente.setColumns(10);
		txtApellidoCrearCliente.setBounds(314, 119, 124, 20);
		txtDireccionCrearCliente.setColumns(10);
		txtDireccionCrearCliente.setBounds(314, 178, 124, 20);
		txtDniCrearCliente.setColumns(10);
		txtDniCrearCliente.setBounds(314, 237, 124, 20);
		txtFechaCrearCliente.setColumns(10);
		txtFechaCrearCliente.setBounds(314, 288, 124, 20);
		txtTituloCrear.setBounds(314, 60, 125, 20);
		txtTituloCrear.setColumns(10);
		txtDirectorCrear.setColumns(10);
		txtDirectorCrear.setBounds(313, 119, 125, 20);

		/** Se inicializa la vista con los elementos innecesarios ocultos */
		mostrarVistaCrear();
	}

	/**
	 * Método para vaciar la vista.
	 */

	public void vaciarPanel() {

		/** Se ocultan las etiquetas innecesarias del pane */
		lblNombreCrearCliente.setVisible(false);
		lblApellidoCrearCliente.setVisible(false);
		lblDireccionCrearCliente.setVisible(false);
		lblDniCrearCliente.setVisible(false);
		lblFechaCrearCliente.setVisible(false);

		/** Se ocultan los campos de texto del pane */
		txtNombreCrearCliente.setVisible(false);
		txtApellidoCrearCliente.setVisible(false);
		txtDireccionCrearCliente.setVisible(false);
		txtDniCrearCliente.setVisible(false);
		txtFechaCrearCliente.setVisible(false);
		
		/** Se otorga visibilidad a las etiquetas */
		lblTituloCrear.setVisible(false);
		lblDirectorCrear.setVisible(false);

		/** Se otorga visibildiad a los textField */
		txtTituloCrear.setVisible(false);
		txtDirectorCrear.setVisible(false);
	}

	/**
	 * Método para mostrar la vista Crear.
	 */
	public void mostrarVistaCrear() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se otorga visibilidad a las etiquetas innecesarias del pane */
			lblNombreCrearCliente.setVisible(true);
			lblApellidoCrearCliente.setVisible(true);
			lblDireccionCrearCliente.setVisible(true);
			lblDniCrearCliente.setVisible(true);
			lblFechaCrearCliente.setVisible(true);

			/** Se otorga visiblidad a los campos de texto del pane */
			txtNombreCrearCliente.setVisible(true);
			txtApellidoCrearCliente.setVisible(true);
			txtDireccionCrearCliente.setVisible(true);
			txtDniCrearCliente.setVisible(true);
			txtFechaCrearCliente.setVisible(true);

		} else if (lblSelectorVistas.getText().equals("Vista Videos")) {

			/** Se otorga visibilidad a las etiquetas */
			lblTituloCrear.setVisible(true);
			lblDirectorCrear.setVisible(true);

			/** Se otorga visibildiad a los textField */
			txtTituloCrear.setVisible(true);
			txtDirectorCrear.setVisible(true);
		}
	}
}
