/**
 * 
 */
package com.example.ud22_views;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.example.ud22_controllers.ActionsClienteController;
import com.example.ud22_controllers.ActionsVideoController;
import com.example.ud22_controllers.ViewController;

/**
 * @author Gaming
 *
 */
public class MainView {

	public JFrame frame;
	private ViewController viewModelSelector;
	private ActionsClienteController crearClienteController;
	private ActionsVideoController crearVideosController;

	/** Instancia botones principales vista */
	private JButton btnCrear = new JButton("Crear");
	private JButton btnModificar = new JButton("Modificar");
	private JButton btnEliminar = new JButton("Eliminar");
	private JButton btnConsultar = new JButton("Consultar");
	private JButton btnCambiarVista = new JButton("Cambiar a Videos");
	private JButton btnAceptarCreacion = new JButton("Crear Cliente");
	private JButton btnAsignarVideoCliente = new JButton("Asignar");
	
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
	private JLabel lblAsignarCliente = new JLabel("Cliente ID");
	private JLabel lblAsignarVideos = new JLabel("Videos ID");
	
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
	
	//Eliminar
	private JButton btnAceptarEliminacion = new JButton("Eliminar Cliente");
	//Modificar
	private JButton btnAceptarModificacion = new JButton("Actualizar Cliente");
	private JButton btnClienteConsultar = new JButton("Consultar Cliente");
	private JTextField txtDefinirCliente;
	private JTextField txtAsignarVideo;
	private JTextField txtTituloModificar = new JTextField();
	private JTextField txtDirectorModificar = new JTextField();

	/**
	 * 
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { MainView window = new MainView();
	 * window.frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); }
	 * } }); }
	 */

	public MainView() {
		viewModelSelector = new ViewController();
		crearClienteController = new ActionsClienteController();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		txtDirectorModificar.setBounds(313, 119, 124, 20);
		txtDirectorModificar.setColumns(10);
		txtTituloModificar.setBounds(314, 60, 124, 20);
		txtTituloModificar.setColumns(10);
		crearClienteController.setVista(this);

		frame = new JFrame();
		viewModelSelector.setVistaPrincipal(this);
		lblSelectorVistas.setText("Vista Cliente");
		frame.setBounds(100, 100, 643, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/** Añadir botones al Pane */
		frame.getContentPane().add(btnCrear);
		frame.getContentPane().add(btnModificar);
		frame.getContentPane().add(btnEliminar);
		frame.getContentPane().add(btnConsultar);
		frame.getContentPane().add(btnCambiarVista);
		frame.getContentPane().add(btnAceptarCreacion);
		frame.getContentPane().add(btnAceptarEliminacion);
		frame.getContentPane().add(btnAceptarModificacion);
		frame.getContentPane().add(btnClienteConsultar);
		frame.getContentPane().add(btnAsignarVideoCliente);
		
		btnAceptarCreacion.setBounds(277, 415, 136, 23);
		btnCrear.setBounds(10, 46, 124, 48);
		btnModificar.setBounds(10, 105, 124, 48);
		btnEliminar.setBounds(10, 164, 124, 48);
		btnConsultar.setBounds(10, 223, 124, 48);
		btnCambiarVista.setBounds(24, 415, 152, 23);
		btnAceptarEliminacion.setBounds(277, 412, 136, 29);
		btnAceptarModificacion.setBounds(277, 412, 152, 29);
		btnClienteConsultar.setBounds(261, 412, 152, 29);
		btnAsignarVideoCliente.setBounds(10, 478, 124, 48);
		
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
		frame.getContentPane().add(lblAsignarCliente);
		frame.getContentPane().add(lblAsignarVideos);

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
		lblAsignarCliente.setBounds(212, 478, 60, 14);
		lblAsignarVideos.setBounds(212, 512, 46, 14);

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
		txtDefinirCliente = new JTextField();
		txtAsignarVideo = new JTextField();
		
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
		frame.getContentPane().add(txtDefinirCliente);
		frame.getContentPane().add(txtAsignarVideo);
		frame.getContentPane().add(txtTituloModificar);
		frame.getContentPane().add(txtDirectorModificar);
		
		txtNombreCrearCliente.setBounds(314, 60, 124, 20);
		txtNombreCrearCliente.setColumns(10);
		txtApellidoCrearCliente.setColumns(10);
		txtApellidoCrearCliente.setBounds(314, 119, 124, 20);
		txtDireccionCrearCliente.setColumns(10);
		txtDireccionCrearCliente.setBounds(314, 178, 124, 20);
		txtDniCrearCliente.setColumns(10);
		txtDniCrearCliente.setBounds(314, 236, 124, 20);
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
		txtDefinirCliente.setBounds(300, 475, 86, 20);
		txtDefinirCliente.setColumns(10);
		txtAsignarVideo.setBounds(300, 509, 86, 20);
		txtAsignarVideo.setColumns(10);
		
		/** Se inicializa la vista con los elementos innecesarios ocultos */
		mostrarVistaCrear();

		/** Action Listeners */
		btnCambiarVista.addActionListener(viewModelSelector);
		btnCrear.addActionListener(viewModelSelector);
		btnConsultar.addActionListener(viewModelSelector);
		btnEliminar.addActionListener(viewModelSelector);
		btnModificar.addActionListener(viewModelSelector);
		btnAceptarCreacion.addActionListener(crearClienteController);
		btnAceptarModificacion.addActionListener(crearClienteController);
		btnAsignarVideoCliente.addActionListener(crearClienteController);
		btnAceptarEliminacion.addActionListener(crearClienteController);
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
		btnAceptarEliminacion.setVisible(false);
		btnAceptarModificacion.setVisible(false);
		btnClienteConsultar.setVisible(false);
		btnAceptarCreacion.setVisible(false);
		txtTituloModificar.setVisible(false);
		txtDirectorModificar.setVisible(false);
		
		/** Se deshabilitan los componentes de la vista */
		txtNombreCrearCliente.setEnabled(false);
		txtApellidoCrearCliente.setEnabled(false);
		txtDireccionCrearCliente.setEnabled(false);
		txtDniCrearCliente.setEnabled(false);
		txtFechaCrearCliente.setEnabled(false);
		txtDniClienteModificar.setEnabled(false);
		txtNombreClienteModificar.setEnabled(false);
		txtApellidoClienteModificar.setEnabled(false);
		txtDireccionClienteModificar.setEnabled(false);
		txtFechaClienteModificar.setEnabled(false);
		txtDniClienteEliminar.setEnabled(false);
		txtTituloCrear.setEnabled(false);
		txtDirectorCrear.setEnabled(false);
		txtTituloCrear.setEnabled(false);
		txtDirectorCrear.setEnabled(false);
		txtDniClienteModificar.setEnabled(false);
		txtNombreClienteModificar.setEnabled(false);
		txtApellidoClienteModificar.setEnabled(false);
		txtDireccionClienteModificar.setEnabled(false);
		txtFechaClienteModificar.setEnabled(false);
		btnAceptarModificacion.setVisible(false);
		btnAceptarModificacion.setEnabled(false);
		txtDniClienteEliminar.setEnabled(true);
		btnAceptarEliminacion.setEnabled(false);
		btnClienteConsultar.setEnabled(false);
		btnAceptarEliminacion.setEnabled(false);
		btnAceptarModificacion.setEnabled(false);
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

		btnAceptarCreacion.setText("Crear Cliente");
		
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
			
			/** Se habilitan los campos */
			txtNombreCrearCliente.setEnabled(true);
			txtApellidoCrearCliente.setEnabled(true);
			txtDireccionCrearCliente.setEnabled(true);
			txtDniCrearCliente.setEnabled(true);
			txtFechaCrearCliente.setEnabled(true);
			
			/** Se otorga visibilidad al botón */
			btnAceptarCreacion.setVisible(true);

		} else {

			btnAceptarCreacion.setText("Crear Video");
			
			/** Se otorga visibilidad a las etiquetas */
			lblTituloCrear.setVisible(true);
			lblDirectorCrear.setVisible(true);

			/** Se otorga visibildiad a los textField */
			txtTituloCrear.setVisible(true);
			txtDirectorCrear.setVisible(true);
			
			/** Se habilitan los campos */
			txtTituloCrear.setEnabled(true);
			txtDirectorCrear.setEnabled(true);
			
			btnAceptarCreacion.setEnabled(true);
			btnAceptarCreacion.setVisible(true);
		}
	}

	public void mostrarVistaModificar() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			btnAceptarModificacion.setText("Actualizar Cliente");
			
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
			
			/** Se habilitan los componentes de la vista */
			txtDniClienteModificar.setEnabled(true);
			txtNombreClienteModificar.setEnabled(true);
			txtApellidoClienteModificar.setEnabled(true);
			txtDireccionClienteModificar.setEnabled(true);
			txtFechaClienteModificar.setEnabled(true);
			btnAceptarModificacion.setVisible(true);
			btnAceptarModificacion.setEnabled(true);
			
		}
		
		else {

			btnAceptarModificacion.setText("Actualizar Video");
			
			/** Se otorga visibilidad a las etiquetas */
			lblTituloCrear.setVisible(true);
			lblDirectorCrear.setVisible(true);

			/** Se otorga visibildiad a los textField */
			txtTituloModificar.setVisible(true);
			txtDirectorModificar.setVisible(true);
			
			/** Se habilitan los campos */
			txtTituloModificar.setEnabled(true);
			txtDirectorModificar.setEnabled(true);
			
			btnAceptarModificacion.setEnabled(true);
			btnAceptarModificacion.setVisible(true);
		}
	}
	
	public void mostrarVistaEliminar() {

		/** Se vacía completamente el pane */
		vaciarPanel();

		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se cambia el nombre al botón para duplicar función */
			btnAceptarEliminacion.setText("Eliminar Cliente");
			
			/** Se otorga visibilidad a las etiquetas de la vista modificar */
			lblDniClienteEliminar.setVisible(true);

			/** Se otorga visibildad a los TextArea de la vista modificar */
			txtDniClienteEliminar.setVisible(true);
			btnAceptarEliminacion.setVisible(true);

			/** Se habilitan los componentes de la vista eliminar */
			txtDniClienteEliminar.setEnabled(true);
			btnAceptarEliminacion.setEnabled(true);
		}
		
		else {
			
			/** Se cambia el nombre al botón para duplicar función */
			btnAceptarEliminacion.setText("Eliminar Video");
			
			/** Se otorga visibilidad a los componentes */
			lblTituloCrear.setVisible(true);
			txtTituloCrear.setVisible(true);
			btnAceptarEliminacion.setVisible(true);
			
			/** Se habilitan los componentes de la vista eliminar */
			txtTituloCrear.setEnabled(true);
			btnAceptarEliminacion.setEnabled(true);
		}
	}
	public void mostrarVistaMostrar() {
		vaciarPanel();
		
		if (lblSelectorVistas.getText().equals("Vista Cliente")) {

			/** Se otorga visibilidad a las etiquetas de la vista modificar */
			lblDniClienteEliminar.setVisible(true);

			/** Se otorga visibildad a los TextArea de la vista modificar */
			txtDniCrearCliente.setVisible(true);
			btnClienteConsultar.setVisible(true);
			btnClienteConsultar.setEnabled(true);
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
	 * @return the crearClienteController
	 */
	public ActionsClienteController getCrearClienteController() {
		return crearClienteController;
	}

	/**
	 * @param crearClienteController the crearClienteController to set
	 */
	public void setCrearClienteController(ActionsClienteController crearClienteController) {
		this.crearClienteController = crearClienteController;
	}

	/**
	 * @return the crearVideosController
	 */
	public ActionsVideoController getCrearVideosController() {
		return crearVideosController;
	}

	/**
	 * @param crearVideosController the crearVideosController to set
	 */
	public void setCrearVideosController(ActionsVideoController crearVideosController) {
		this.crearVideosController = crearVideosController;
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
	 * @return the btnAceptarCrearCliente
	 */
	public JButton getBtnAceptarCrearCliente() {
		return btnAceptarCreacion;
	}

	/**
	 * @param btnAceptarCrearCliente the btnAceptarCrearCliente to set
	 */
	public void setBtnAceptarCrearCliente(JButton btnAceptarCrearCliente) {
		this.btnAceptarCreacion = btnAceptarCrearCliente;
	}

	/**
	 * @return the btnAsignarVideoCliente
	 */
	public JButton getBtnAsignarVideoCliente() {
		return btnAsignarVideoCliente;
	}

	/**
	 * @param btnAsignarVideoCliente the btnAsignarVideoCliente to set
	 */
	public void setBtnAsignarVideoCliente(JButton btnAsignarVideoCliente) {
		this.btnAsignarVideoCliente = btnAsignarVideoCliente;
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
	 * @return the lblDniClienteModificar
	 */
	public JLabel getLblDniClienteModificar() {
		return lblDniClienteModificar;
	}

	/**
	 * @param lblDniClienteModificar the lblDniClienteModificar to set
	 */
	public void setLblDniClienteModificar(JLabel lblDniClienteModificar) {
		this.lblDniClienteModificar = lblDniClienteModificar;
	}

	/**
	 * @return the lblNombreClienteModificar
	 */
	public JLabel getLblNombreClienteModificar() {
		return lblNombreClienteModificar;
	}

	/**
	 * @param lblNombreClienteModificar the lblNombreClienteModificar to set
	 */
	public void setLblNombreClienteModificar(JLabel lblNombreClienteModificar) {
		this.lblNombreClienteModificar = lblNombreClienteModificar;
	}

	/**
	 * @return the lblApellidoClienteModificar
	 */
	public JLabel getLblApellidoClienteModificar() {
		return lblApellidoClienteModificar;
	}

	/**
	 * @param lblApellidoClienteModificar the lblApellidoClienteModificar to set
	 */
	public void setLblApellidoClienteModificar(JLabel lblApellidoClienteModificar) {
		this.lblApellidoClienteModificar = lblApellidoClienteModificar;
	}

	/**
	 * @return the lblDireccionClienteModificar
	 */
	public JLabel getLblDireccionClienteModificar() {
		return lblDireccionClienteModificar;
	}

	/**
	 * @param lblDireccionClienteModificar the lblDireccionClienteModificar to set
	 */
	public void setLblDireccionClienteModificar(JLabel lblDireccionClienteModificar) {
		this.lblDireccionClienteModificar = lblDireccionClienteModificar;
	}

	/**
	 * @return the lblFechaClienteModificar
	 */
	public JLabel getLblFechaClienteModificar() {
		return lblFechaClienteModificar;
	}

	/**
	 * @param lblFechaClienteModificar the lblFechaClienteModificar to set
	 */
	public void setLblFechaClienteModificar(JLabel lblFechaClienteModificar) {
		this.lblFechaClienteModificar = lblFechaClienteModificar;
	}

	/**
	 * @return the lblDniClienteEliminar
	 */
	public JLabel getLblDniClienteEliminar() {
		return lblDniClienteEliminar;
	}

	/**
	 * @param lblDniClienteEliminar the lblDniClienteEliminar to set
	 */
	public void setLblDniClienteEliminar(JLabel lblDniClienteEliminar) {
		this.lblDniClienteEliminar = lblDniClienteEliminar;
	}

	/**
	 * @return the lblAsignarCliente
	 */
	public JLabel getLblAsignarCliente() {
		return lblAsignarCliente;
	}

	/**
	 * @param lblAsignarCliente the lblAsignarCliente to set
	 */
	public void setLblAsignarCliente(JLabel lblAsignarCliente) {
		this.lblAsignarCliente = lblAsignarCliente;
	}

	/**
	 * @return the lblAsignarVideos
	 */
	public JLabel getLblAsignarVideos() {
		return lblAsignarVideos;
	}

	/**
	 * @param lblAsignarVideos the lblAsignarVideos to set
	 */
	public void setLblAsignarVideos(JLabel lblAsignarVideos) {
		this.lblAsignarVideos = lblAsignarVideos;
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

	/**
	 * @return the txtDniClienteModificar
	 */
	public JTextField getTxtDniClienteModificar() {
		return txtDniClienteModificar;
	}

	/**
	 * @param txtDniClienteModificar the txtDniClienteModificar to set
	 */
	public void setTxtDniClienteModificar(JTextField txtDniClienteModificar) {
		this.txtDniClienteModificar = txtDniClienteModificar;
	}

	/**
	 * @return the txtNombreClienteModificar
	 */
	public JTextField getTxtNombreClienteModificar() {
		return txtNombreClienteModificar;
	}

	/**
	 * @param txtNombreClienteModificar the txtNombreClienteModificar to set
	 */
	public void setTxtNombreClienteModificar(JTextField txtNombreClienteModificar) {
		this.txtNombreClienteModificar = txtNombreClienteModificar;
	}

	/**
	 * @return the txtApellidoClienteModificar
	 */
	public JTextField getTxtApellidoClienteModificar() {
		return txtApellidoClienteModificar;
	}

	/**
	 * @param txtApellidoClienteModificar the txtApellidoClienteModificar to set
	 */
	public void setTxtApellidoClienteModificar(JTextField txtApellidoClienteModificar) {
		this.txtApellidoClienteModificar = txtApellidoClienteModificar;
	}

	/**
	 * @return the txtDireccionClienteModificar
	 */
	public JTextField getTxtDireccionClienteModificar() {
		return txtDireccionClienteModificar;
	}

	/**
	 * @param txtDireccionClienteModificar the txtDireccionClienteModificar to set
	 */
	public void setTxtDireccionClienteModificar(JTextField txtDireccionClienteModificar) {
		this.txtDireccionClienteModificar = txtDireccionClienteModificar;
	}

	/**
	 * @return the txtFechaClienteModificar
	 */
	public JTextField getTxtFechaClienteModificar() {
		return txtFechaClienteModificar;
	}

	/**
	 * @param txtFechaClienteModificar the txtFechaClienteModificar to set
	 */
	public void setTxtFechaClienteModificar(JTextField txtFechaClienteModificar) {
		this.txtFechaClienteModificar = txtFechaClienteModificar;
	}

	/**
	 * @return the txtDniClienteEliminar
	 */
	public JTextField getTxtDniClienteEliminar() {
		return txtDniClienteEliminar;
	}

	/**
	 * @param txtDniClienteEliminar the txtDniClienteEliminar to set
	 */
	public void setTxtDniClienteEliminar(JTextField txtDniClienteEliminar) {
		this.txtDniClienteEliminar = txtDniClienteEliminar;
	}

	/**
	 * @return the btnClienteEliminar
	 */
	public JButton getBtnClienteEliminar() {
		return btnAceptarEliminacion;
	}

	/**
	 * @param btnClienteEliminar the btnClienteEliminar to set
	 */
	public void setBtnClienteEliminar(JButton btnClienteEliminar) {
		this.btnAceptarEliminacion = btnClienteEliminar;
	}

	/**
	 * @return the btnClienteModificar
	 */
	public JButton getBtnClienteModificar() {
		return btnAceptarModificacion;
	}

	/**
	 * @param btnClienteModificar the btnClienteModificar to set
	 */
	public void setBtnClienteModificar(JButton btnClienteModificar) {
		this.btnAceptarModificacion = btnClienteModificar;
	}

	/**
	 * @return the btnClienteConsultar
	 */
	public JButton getBtnClienteConsultar() {
		return btnClienteConsultar;
	}

	/**
	 * @param btnClienteConsultar the btnClienteConsultar to set
	 */
	public void setBtnClienteConsultar(JButton btnClienteConsultar) {
		this.btnClienteConsultar = btnClienteConsultar;
	}

	/**
	 * @return the txtDefinirCliente
	 */
	public JTextField getTxtDefinirCliente() {
		return txtDefinirCliente;
	}

	/**
	 * @param txtDefinirCliente the txtDefinirCliente to set
	 */
	public void setTxtDefinirCliente(JTextField txtDefinirCliente) {
		this.txtDefinirCliente = txtDefinirCliente;
	}

	/**
	 * @return the txtAsignarVideo
	 */
	public JTextField getTxtAsignarVideo() {
		return txtAsignarVideo;
	}

	/**
	 * @param txtAsignarVideo the txtAsignarVideo to set
	 */
	public void setTxtAsignarVideo(JTextField txtAsignarVideo) {
		this.txtAsignarVideo = txtAsignarVideo;
	}

	/**
	 * @return the txtTituloModificar
	 */
	public JTextField getTxtTituloModificar() {
		return txtTituloModificar;
	}

	/**
	 * @param txtTituloModificar the txtTituloModificar to set
	 */
	public void setTxtTituloModificar(JTextField txtTituloModificar) {
		this.txtTituloModificar = txtTituloModificar;
	}

	/**
	 * @return the txtDirectorModificar
	 */
	public JTextField getTxtDirectorModificar() {
		return txtDirectorModificar;
	}

	/**
	 * @param txtDirectorModificar the txtDirectorModificar to set
	 */
	public void setTxtDirectorModificar(JTextField txtDirectorModificar) {
		this.txtDirectorModificar = txtDirectorModificar;
	}


	
	
	
	
	
	
}
