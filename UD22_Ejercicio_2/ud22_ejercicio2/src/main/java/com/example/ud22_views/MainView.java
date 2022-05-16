/**
 * 
 */
package com.example.ud22_views;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.example.ud22_controllers.ViewController;

/**
 * @author Gaming
 *
 */
public class MainView {

	public JFrame frame;
	private ViewController viewModelSelector;

	/** Instancia botones principales vista */
	private JButton btnCrear = new JButton("Crear");
	private JButton btnModificar = new JButton("Modificar");
	private JButton btnEliminar = new JButton("Eliminar");
	private JButton btnConsultar = new JButton("Consultar");
	private JButton btnCambiarVista = new JButton("Cambiar a Videos");

	/** Instancia labels vista */
	private JLabel lblNombreCrearCliente = new JLabel("Nombre:");
	private JLabel lblApellidoCrearCliente = new JLabel("Apellido:");
	private JLabel lblDireccionCrearCliente = new JLabel("Dirección:");
	private JLabel lblDniCrearCliente = new JLabel("DNI:");
	private JLabel lblFechaCrearCliente = new JLabel("Fecha:");
	private JLabel lblSelectorVistas = new JLabel("Vista Cliente");
	private JLabel lblTituloCrear = new JLabel("Titulo:");
	private JLabel lblDirectorCrear = new JLabel("Director:");
	private JLabel lblDniClienteModificar = new JLabel("DNI:");
	private JLabel lblNombreClienteModificar = new JLabel("Nombre:");
	private JLabel lblApellidoClienteModificar = new JLabel("Apellido");
	private JLabel lblDireccionClienteModificar = new JLabel("Dirección:");
	private JLabel lblFechaClienteModificar = new JLabel("Fecha:");
	private JLabel lblDniClienteEliminar = new JLabel("DNI:");

	/** Instanacia textfields vista */
	private JTextField txtNombreCrearCliente;
	private JTextField txtApellidoCrearCliente;
	private JTextField txtDireccionCrearCliente;
	private JTextField txtDniCrearCliente;
	private JTextField txtFechaCrearCliente;
	private JTextField txtTituloCrear;
	private JTextField txtDirectorCrear;
	private JTextField txtDniClienteModificar;
	private JTextField txtNombreClienteModificar;
	private JTextField txtApellidoClienteModificar;
	private JTextField txtDireccionClienteModificar;
	private JTextField txtFechaClienteModificar;
	private JTextField txtDniClienteEliminar;

	/**
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MainView window = new MainView();
	 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
	 * } }); }
	 */

	public MainView() {
		viewModelSelector = new ViewController();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		viewModelSelector.setVistaPrincipal(this);
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
		btnCambiarVista.setBounds(36, 415, 152, 23);

		/** Añadir labels al Pane */
		frame.getContentPane().add(lblNombreCrearCliente);
		frame.getContentPane().add(lblApellidoCrearCliente);
		frame.getContentPane().add(lblDireccionCrearCliente);
		frame.getContentPane().add(lblDniCrearCliente);
		frame.getContentPane().add(lblFechaCrearCliente);
		frame.getContentPane().add(lblTituloCrear);
		frame.getContentPane().add(lblDirectorCrear);
		frame.getContentPane().add(lblDniClienteModificar);
		frame.getContentPane().add(lblNombreClienteModificar);
		frame.getContentPane().add(lblApellidoClienteModificar);
		frame.getContentPane().add(lblDireccionClienteModificar);
		frame.getContentPane().add(lblFechaClienteModificar);
		frame.getContentPane().add(lblDniClienteEliminar);

		lblNombreCrearCliente.setBounds(226, 63, 81, 14);
		lblApellidoCrearCliente.setBounds(226, 122, 81, 14);
		lblDireccionCrearCliente.setBounds(226, 181, 94, 14);
		lblDniCrearCliente.setBounds(226, 240, 46, 14);
		lblFechaCrearCliente.setBounds(226, 291, 81, 14);
		lblTituloCrear.setBounds(226, 63, 81, 14);
		lblDirectorCrear.setBounds(226, 122, 46, 14);
		lblSelectorVistas.setBounds(71, 390, 73, 14);
		lblDniClienteModificar.setBounds(226, 63, 46, 14);
		lblNombreClienteModificar.setBounds(226, 122, 46, 14);
		lblApellidoClienteModificar.setBounds(226, 181, 46, 14);
		lblDireccionClienteModificar.setBounds(226, 240, 60, 14);
		lblFechaClienteModificar.setBounds(226, 291, 60, 14);
		lblDniClienteEliminar.setBounds(226, 63, 46, 14);

		/** Instancia TextFileds vista */
		txtNombreCrearCliente = new JTextField();
		txtApellidoCrearCliente = new JTextField();
		txtDireccionCrearCliente = new JTextField();
		txtDniCrearCliente = new JTextField();
		txtFechaCrearCliente = new JTextField();
		txtTituloCrear = new JTextField();
		txtDirectorCrear = new JTextField();
		txtNombreClienteModificar = new JTextField();
		txtApellidoClienteModificar = new JTextField();
		txtDireccionClienteModificar = new JTextField();
		txtFechaClienteModificar = new JTextField();
		txtDniClienteModificar = new JTextField();
		txtDniClienteEliminar = new JTextField();

		/** Añadir TextFields al pane */
		frame.getContentPane().add(txtApellidoCrearCliente);
		frame.getContentPane().add(txtDireccionCrearCliente);
		frame.getContentPane().add(txtDniCrearCliente);
		frame.getContentPane().add(txtFechaCrearCliente);
		frame.getContentPane().add(txtNombreCrearCliente);
		frame.getContentPane().add(lblSelectorVistas);
		frame.getContentPane().add(txtTituloCrear);
		frame.getContentPane().add(txtDirectorCrear);
		frame.getContentPane().add(txtDniClienteModificar);
		frame.getContentPane().add(txtNombreClienteModificar);
		frame.getContentPane().add(txtApellidoClienteModificar);
		frame.getContentPane().add(txtDireccionClienteModificar);
		frame.getContentPane().add(txtFechaClienteModificar);
		frame.getContentPane().add(txtDniClienteEliminar);

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
		txtDniClienteModificar.setBounds(314, 60, 124, 20);
		txtDniClienteModificar.setColumns(10);
		txtApellidoClienteModificar.setColumns(10);
		txtApellidoClienteModificar.setBounds(314, 178, 124, 20);
		txtDireccionClienteModificar.setColumns(10);
		txtDireccionClienteModificar.setBounds(313, 237, 124, 20);
		txtFechaClienteModificar.setColumns(10);
		txtFechaClienteModificar.setBounds(313, 288, 124, 20);
		txtNombreClienteModificar.setBounds(314, 119, 124, 20);
		txtNombreClienteModificar.setColumns(10);
		txtDniClienteEliminar.setBounds(314, 60, 124, 20);
		txtDniClienteEliminar.setColumns(10);

		/** Se inicializa la vista con los elementos innecesarios ocultos */
		mostrarVistaCrear();

		/** Action Listeners */
		btnCambiarVista.addActionListener(viewModelSelector);
		btnCrear.addActionListener(viewModelSelector);
		btnConsultar.addActionListener(viewModelSelector);
		btnEliminar.addActionListener(viewModelSelector);
		btnModificar.addActionListener(viewModelSelector);
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
		lblDniClienteModificar.setVisible(false);
		lblNombreClienteModificar.setVisible(false);
		lblApellidoClienteModificar.setVisible(false);
		lblDireccionClienteModificar.setVisible(false);
		lblFechaClienteModificar.setVisible(false);
		lblDniClienteEliminar.setVisible(false);
		lblTituloCrear.setVisible(false);
		lblDirectorCrear.setVisible(false);

		/** Se ocultan los campos de texto del pane */
		txtNombreCrearCliente.setVisible(false);
		txtApellidoCrearCliente.setVisible(false);
		txtDireccionCrearCliente.setVisible(false);
		txtDniCrearCliente.setVisible(false);
		txtFechaCrearCliente.setVisible(false);
		txtDniClienteModificar.setVisible(false);
		txtNombreClienteModificar.setVisible(false);
		txtApellidoClienteModificar.setVisible(false);
		txtDireccionClienteModificar.setVisible(false);
		txtFechaClienteModificar.setVisible(false);
		txtDniClienteEliminar.setVisible(false);
		txtTituloCrear.setVisible(false);
		txtDirectorCrear.setVisible(false);
	}

	/** Método para cambiar de vista */
	public void cambiarVista(String vistaActual) {

		/** Se vacia completamente el pane */
		vaciarPanel();

		/** Se selecciona cambio de vista */
		if (vistaActual.equals("Cambiar a Videos")) {
			btnCambiarVista.setText("Cambiar a Cliente");
			lblSelectorVistas.setText("Vista Videos");
		} else {
			btnCambiarVista.setText("Cambiar a Videos");
			lblSelectorVistas.setText("Vista Cliente");
		}
	}

	/** Método para mostrar la vista Crear. */
	public void mostrarVistaCrear() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se otorga visibilidad a las etiquetas de la vista crear. */
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

		} else {

			/** Se otorga visibilidad a las etiquetas */
			lblTituloCrear.setVisible(true);
			lblDirectorCrear.setVisible(true);

			/** Se otorga visibildiad a los textField */
			txtTituloCrear.setVisible(true);
			txtDirectorCrear.setVisible(true);
		}
	}

	public void mostrarVistaModificar() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se otorga visibilidad a las etiquetas de la vista modificar */
			lblDniClienteModificar.setVisible(true);
			lblNombreClienteModificar.setVisible(true);
			lblApellidoClienteModificar.setVisible(true);
			lblDireccionClienteModificar.setVisible(true);
			lblFechaClienteModificar.setVisible(true);

			/** Se otorga visibildad a los TextArea de la vista modificar */
			txtDniClienteModificar.setVisible(true);
			txtNombreClienteModificar.setVisible(true);
			txtApellidoClienteModificar.setVisible(true);
			txtDireccionClienteModificar.setVisible(true);
			txtFechaClienteModificar.setVisible(true);
		}
	}
	
	public void mostrarVistaEliminar() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se otorga visibilidad a las etiquetas de la vista modificar */
			lblDniClienteEliminar.setVisible(true);

			/** Se otorga visibildad a los TextArea de la vista modificar */
			txtDniClienteEliminar.setVisible(true);
		}
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * @return the viewModelSelector
	 */
	public ViewController getViewModelSelector() {
		return viewModelSelector;
	}

	/**
	 * @param viewModelSelector the viewModelSelector to set
	 */
	public void setViewModelSelector(ViewController viewModelSelector) {
		this.viewModelSelector = viewModelSelector;
	}

	/**
	 * @return the btnCrear
	 */
	public JButton getBtnCrear() {
		return btnCrear;
	}

	/**
	 * @param btnCrear the btnCrear to set
	 */
	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	/**
	 * @return the btnModificar
	 */
	public JButton getBtnModificar() {
		return btnModificar;
	}

	/**
	 * @param btnModificar the btnModificar to set
	 */
	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	/**
	 * @return the btnEliminar
	 */
	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	/**
	 * @param btnEliminar the btnEliminar to set
	 */
	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	/**
	 * @return the btnConsultar
	 */
	public JButton getBtnConsultar() {
		return btnConsultar;
	}

	/**
	 * @param btnConsultar the btnConsultar to set
	 */
	public void setBtnConsultar(JButton btnConsultar) {
		this.btnConsultar = btnConsultar;
	}

	/**
	 * @return the btnCambiarVista
	 */
	public JButton getBtnCambiarVista() {
		return btnCambiarVista;
	}

	/**
	 * @param btnCambiarVista the btnCambiarVista to set
	 */
	public void setBtnCambiarVista(JButton btnCambiarVista) {
		this.btnCambiarVista = btnCambiarVista;
	}

	/**
	 * @return the lblNombreCrearCliente
	 */
	public JLabel getLblNombreCrearCliente() {
		return lblNombreCrearCliente;
	}

	/**
	 * @param lblNombreCrearCliente the lblNombreCrearCliente to set
	 */
	public void setLblNombreCrearCliente(JLabel lblNombreCrearCliente) {
		this.lblNombreCrearCliente = lblNombreCrearCliente;
	}

	/**
	 * @return the lblApellidoCrearCliente
	 */
	public JLabel getLblApellidoCrearCliente() {
		return lblApellidoCrearCliente;
	}

	/**
	 * @param lblApellidoCrearCliente the lblApellidoCrearCliente to set
	 */
	public void setLblApellidoCrearCliente(JLabel lblApellidoCrearCliente) {
		this.lblApellidoCrearCliente = lblApellidoCrearCliente;
	}

	/**
	 * @return the lblDireccionCrearCliente
	 */
	public JLabel getLblDireccionCrearCliente() {
		return lblDireccionCrearCliente;
	}

	/**
	 * @param lblDireccionCrearCliente the lblDireccionCrearCliente to set
	 */
	public void setLblDireccionCrearCliente(JLabel lblDireccionCrearCliente) {
		this.lblDireccionCrearCliente = lblDireccionCrearCliente;
	}

	/**
	 * @return the lblDniCrearCliente
	 */
	public JLabel getLblDniCrearCliente() {
		return lblDniCrearCliente;
	}

	/**
	 * @param lblDniCrearCliente the lblDniCrearCliente to set
	 */
	public void setLblDniCrearCliente(JLabel lblDniCrearCliente) {
		this.lblDniCrearCliente = lblDniCrearCliente;
	}

	/**
	 * @return the lblFechaCrearCliente
	 */
	public JLabel getLblFechaCrearCliente() {
		return lblFechaCrearCliente;
	}

	/**
	 * @param lblFechaCrearCliente the lblFechaCrearCliente to set
	 */
	public void setLblFechaCrearCliente(JLabel lblFechaCrearCliente) {
		this.lblFechaCrearCliente = lblFechaCrearCliente;
	}

	/**
	 * @return the lblSelectorVistas
	 */
	public JLabel getLblSelectorVistas() {
		return lblSelectorVistas;
	}

	/**
	 * @param lblSelectorVistas the lblSelectorVistas to set
	 */
	public void setLblSelectorVistas(JLabel lblSelectorVistas) {
		this.lblSelectorVistas = lblSelectorVistas;
	}

	/**
	 * @return the lblTituloCrear
	 */
	public JLabel getLblTituloCrear() {
		return lblTituloCrear;
	}

	/**
	 * @param lblTituloCrear the lblTituloCrear to set
	 */
	public void setLblTituloCrear(JLabel lblTituloCrear) {
		this.lblTituloCrear = lblTituloCrear;
	}

	/**
	 * @return the lblDirectorCrear
	 */
	public JLabel getLblDirectorCrear() {
		return lblDirectorCrear;
	}

	/**
	 * @param lblDirectorCrear the lblDirectorCrear to set
	 */
	public void setLblDirectorCrear(JLabel lblDirectorCrear) {
		this.lblDirectorCrear = lblDirectorCrear;
	}

	/**
	 * @return the txtNombreCrearCliente
	 */
	public JTextField getTxtNombreCrearCliente() {
		return txtNombreCrearCliente;
	}

	/**
	 * @param txtNombreCrearCliente the txtNombreCrearCliente to set
	 */
	public void setTxtNombreCrearCliente(JTextField txtNombreCrearCliente) {
		this.txtNombreCrearCliente = txtNombreCrearCliente;
	}

	/**
	 * @return the txtApellidoCrearCliente
	 */
	public JTextField getTxtApellidoCrearCliente() {
		return txtApellidoCrearCliente;
	}

	/**
	 * @param txtApellidoCrearCliente the txtApellidoCrearCliente to set
	 */
	public void setTxtApellidoCrearCliente(JTextField txtApellidoCrearCliente) {
		this.txtApellidoCrearCliente = txtApellidoCrearCliente;
	}

	/**
	 * @return the txtDireccionCrearCliente
	 */
	public JTextField getTxtDireccionCrearCliente() {
		return txtDireccionCrearCliente;
	}

	/**
	 * @param txtDireccionCrearCliente the txtDireccionCrearCliente to set
	 */
	public void setTxtDireccionCrearCliente(JTextField txtDireccionCrearCliente) {
		this.txtDireccionCrearCliente = txtDireccionCrearCliente;
	}

	/**
	 * @return the txtDniCrearCliente
	 */
	public JTextField getTxtDniCrearCliente() {
		return txtDniCrearCliente;
	}

	/**
	 * @param txtDniCrearCliente the txtDniCrearCliente to set
	 */
	public void setTxtDniCrearCliente(JTextField txtDniCrearCliente) {
		this.txtDniCrearCliente = txtDniCrearCliente;
	}

	/**
	 * @return the txtFechaCrearCliente
	 */
	public JTextField getTxtFechaCrearCliente() {
		return txtFechaCrearCliente;
	}

	/**
	 * @param txtFechaCrearCliente the txtFechaCrearCliente to set
	 */
	public void setTxtFechaCrearCliente(JTextField txtFechaCrearCliente) {
		this.txtFechaCrearCliente = txtFechaCrearCliente;
	}

	/**
	 * @return the txtTituloCrear
	 */
	public JTextField getTxtTituloCrear() {
		return txtTituloCrear;
	}

	/**
	 * @param txtTituloCrear the txtTituloCrear to set
	 */
	public void setTxtTituloCrear(JTextField txtTituloCrear) {
		this.txtTituloCrear = txtTituloCrear;
	}

	/**
	 * @return the txtDirectorCrear
	 */
	public JTextField getTxtDirectorCrear() {
		return txtDirectorCrear;
	}

	/**
	 * @param txtDirectorCrear the txtDirectorCrear to set
	 */
	public void setTxtDirectorCrear(JTextField txtDirectorCrear) {
		this.txtDirectorCrear = txtDirectorCrear;
	}
}
