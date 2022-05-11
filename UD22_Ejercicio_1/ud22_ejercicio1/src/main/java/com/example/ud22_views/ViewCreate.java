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

public class ViewCreate {

	public JFrame frmCrearPersona;
	private JTextField nombreField;
	private JTextField apellidoField;
	private JTextField direccionField;
	private JTextField dniField;
	private JTextField fechaField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCreate window = new ViewCreate();
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
	public ViewCreate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Se crea componente JFrame.
		frmCrearPersona = new JFrame();
		// Se crean las diferentes JLabels.
		JLabel lblTitulo = new JLabel("Crear usuario");
		JLabel lblIntroduzcaDatos = new JLabel("** Introduzca los datos");
		JLabel lblNombre = new JLabel("Nombre:");
		JLabel lblApellido = new JLabel("Apellido:");
		JLabel lblDireccion = new JLabel("Direccion:");
		JLabel lblFecha = new JLabel("Fecha:");
		// Se crean las diferentes JTextFields
		nombreField = new JTextField();
		apellidoField = new JTextField();
		direccionField = new JTextField();
		dniField = new JTextField();
		fechaField = new JTextField();
		// Se crean los JButtons
		JButton btnCrear = new JButton("Crear");

		// Se definen los diferentes componentes
		frmCrearPersona.setTitle("Crear persona");
		frmCrearPersona.getContentPane().setBackground(Color.DARK_GRAY);
		frmCrearPersona.setBounds(100, 100, 387, 465);
		frmCrearPersona.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCrearPersona.getContentPane().setLayout(null);
		JLabel lblDocumentoDeIdentidad = new JLabel("DNI:");

		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(29, 22, 227, 31);
		frmCrearPersona.getContentPane().add(lblTitulo);

		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setBounds(29, 81, 78, 31);
		frmCrearPersona.getContentPane().add(lblNombre);

		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(29, 123, 78, 31);
		frmCrearPersona.getContentPane().add(lblApellido);

		lblDireccion.setForeground(Color.WHITE);
		lblDireccion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDireccion.setBounds(29, 165, 78, 31);
		frmCrearPersona.getContentPane().add(lblDireccion);

		lblDocumentoDeIdentidad.setForeground(Color.WHITE);
		lblDocumentoDeIdentidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDocumentoDeIdentidad.setBounds(29, 207, 78, 31);
		frmCrearPersona.getContentPane().add(lblDocumentoDeIdentidad);

		lblFecha.setForeground(Color.WHITE);
		lblFecha.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFecha.setBounds(29, 249, 78, 31);
		frmCrearPersona.getContentPane().add(lblFecha);

		nombreField.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreField.setForeground(Color.WHITE);
		nombreField.setBackground(Color.LIGHT_GRAY);
		nombreField.setBounds(117, 87, 190, 20);
		frmCrearPersona.getContentPane().add(nombreField);
		nombreField.setColumns(10);

		apellidoField.setFont(new Font("Tahoma", Font.BOLD, 11));
		apellidoField.setForeground(Color.WHITE);
		apellidoField.setColumns(10);
		apellidoField.setBackground(Color.LIGHT_GRAY);
		apellidoField.setBounds(117, 129, 190, 20);
		frmCrearPersona.getContentPane().add(apellidoField);

		direccionField.setFont(new Font("Tahoma", Font.BOLD, 11));
		direccionField.setForeground(Color.WHITE);
		direccionField.setColumns(10);
		direccionField.setBackground(Color.LIGHT_GRAY);
		direccionField.setBounds(117, 171, 190, 20);
		frmCrearPersona.getContentPane().add(direccionField);

		dniField.setFont(new Font("Tahoma", Font.BOLD, 11));
		dniField.setForeground(Color.WHITE);
		dniField.setColumns(10);
		dniField.setBackground(Color.LIGHT_GRAY);
		dniField.setBounds(117, 213, 190, 20);
		frmCrearPersona.getContentPane().add(dniField);

		fechaField.setFont(new Font("Tahoma", Font.BOLD, 11));
		fechaField.setForeground(Color.WHITE);
		fechaField.setColumns(10);
		fechaField.setBackground(Color.LIGHT_GRAY);
		fechaField.setBounds(117, 255, 190, 20);
		frmCrearPersona.getContentPane().add(fechaField);

		btnCrear.setBounds(137, 306, 89, 23);
		frmCrearPersona.getContentPane().add(btnCrear);

		lblIntroduzcaDatos.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblIntroduzcaDatos.setForeground(Color.RED);
		lblIntroduzcaDatos.setBounds(29, 56, 137, 14);
		frmCrearPersona.getContentPane().add(lblIntroduzcaDatos);
	}
}
