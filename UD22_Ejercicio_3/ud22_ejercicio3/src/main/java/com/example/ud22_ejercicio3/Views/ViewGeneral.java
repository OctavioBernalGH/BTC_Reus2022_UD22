package com.example.ud22_ejercicio3.Views;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import com.example.ud22_ejercicio3.controllers.ViewSwicherController;

public class ViewGeneral {

	public JFrame frame;
	private JTextField txtCientificoNomApels;
	private JTextField txtCientificoDNI;
	private ViewSwicherController cambiarVistas;
	
	private JLabel lblTittle = new JLabel("Cientifico");
	private JLabel lblCientificoNombre = new JLabel("Nombre");
	private JLabel lblCientificoDNI = new JLabel("DNI");
	//view principales
	private JButton btnPCientificoCrear = new JButton("Crear");
	private JButton btnPCientificoBorrar = new JButton("Borrar");
	private JButton btnPCientificoBuscar = new JButton("Buscar");
	private JButton btnPCientificoModificar = new JButton("Modificar");
	//view conjunta
	JTextArea txaMostrarResultados = new JTextArea();
	//view borrar
	private JButton btnBorrarCientifico = new JButton("Borrar Cientifico");
	private JButton btnCientificoMostrar = new JButton("Mostrar");
	//view buscar
	private JButton btnBuscarCientifico = new JButton("Buscar Cientifico");
	private JButton btnModificarCientifico = new JButton("Modificar Cientifico");
	private JButton btnCrearCientifico = new JButton("Crear Cientifico");
	private JButton tglbtnToggleEntity = new JButton("Cambiar a Proyecto");
	
//Elementos de Proyecto
	private JLabel lblProyectoID = new JLabel("ID");
	private JLabel lblProyectoHoras = new JLabel("Horas");
	private JLabel lblProyectoNombre = new JLabel("Nombre");
	
	private JTextField txtProyectoID;
	private JTextField txtProyectoNombre;
	private JTextField txtProyectoHoras;
	private JButton btnProyectoCrear = new JButton("Crear Proyecto");
	private JButton btnProyectoBorrar = new JButton("Borrar Proyecto");
	private JButton btnProyectoMostrar = new JButton("Busqueda");
	private JButton btnProyectoModificar = new JButton("Modificar Proyecto");
	
	public ViewGeneral() {
		cambiarVistas = new ViewSwicherController();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		txtProyectoID = new JTextField();
		txtProyectoNombre = new JTextField();
		txtProyectoHoras = new JTextField();
		
		cambiarVistas.setViewCientifico(this);
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtCientificoDNI = new JTextField();
		txtCientificoNomApels = new JTextField();
		
		lblTittle.setBounds(6, 6, 118, 16);
		lblCientificoNombre.setBounds(211, 90, 61, 16);
		lblCientificoDNI.setBounds(211, 54, 61, 16);
		
	
		btnPCientificoCrear.setBounds(7, 34, 117, 29);
		btnPCientificoBorrar.setBounds(7, 75, 117, 29);
		btnPCientificoBuscar.setBounds(7, 116, 117, 29);
		btnPCientificoModificar.setBounds(6, 157, 117, 29);
		
		btnCrearCientifico.setBounds(351, 182, 167, 29);
		btnBorrarCientifico.setBounds(351, 182, 167, 29);
		btnBuscarCientifico.setBounds(417, 49, 167, 29);
		btnModificarCientifico.setBounds(351, 182, 167, 29);
		
		
		txtCientificoNomApels.setBounds(284, 85, 130, 26);
		
		txtCientificoNomApels.setColumns(10);
		
		
		txtCientificoDNI.setColumns(10);
		txtCientificoDNI.setBounds(284, 49, 130, 26);
		
		btnCientificoMostrar.setBounds(417, 49, 117, 29);
		
		txaMostrarResultados.setBounds(211, 85, 307, 85);
		tglbtnToggleEntity.setBounds(6, 299, 161, 29);
		txtProyectoID.setBounds(286, 52, 130, 26);
		
		txtProyectoID.setColumns(10);

		txtProyectoNombre.setColumns(10);
		txtProyectoNombre.setBounds(286, 90, 130, 26);
	
		txtProyectoHoras.setBounds(286, 128, 130, 26);
		
		txtProyectoHoras.setColumns(10);
		
		lblProyectoID.setBounds(211, 57, 61, 16);
		
		lblProyectoHoras.setBounds(211, 133, 61, 16);
		
		lblProyectoNombre.setBounds(211, 95, 61, 16);
		btnProyectoCrear.setBounds(428, 128, 117, 29);
		btnProyectoBorrar.setBounds(357, 182, 161, 29);
		btnProyectoMostrar.setBounds(417, 49, 117, 29);
		btnProyectoModificar.setBounds(361, 223, 157, 29);
		
//Initial views of elements
		//Ocultamos todos los elementos no necesarios en la primera vista
		unshowAll();
		
//Action Listeners
		btnPCientificoCrear.addActionListener(cambiarVistas);
		btnPCientificoBorrar.addActionListener(cambiarVistas);
		btnPCientificoBuscar.addActionListener(cambiarVistas);
		btnPCientificoModificar.addActionListener(cambiarVistas);	
		btnCientificoMostrar.addActionListener(cambiarVistas);
		tglbtnToggleEntity.addActionListener(cambiarVistas);
		btnCrearCientifico.addActionListener(cambiarVistas);
		btnProyectoCrear.addActionListener(cambiarVistas);
		btnModificarCientifico.addActionListener(cambiarVistas);
		btnProyectoModificar.addActionListener(cambiarVistas);
		btnBorrarCientifico.addActionListener(cambiarVistas);
		btnProyectoBorrar.addActionListener(cambiarVistas);
		btnBuscarCientifico.addActionListener(cambiarVistas);
//Adding to content Panel
		frame.getContentPane().add(btnModificarCientifico);
		frame.getContentPane().add(btnBuscarCientifico);
		frame.getContentPane().add(btnBorrarCientifico);
		frame.getContentPane().add(btnCrearCientifico);
		frame.getContentPane().add(txtCientificoDNI);
		frame.getContentPane().add(lblCientificoDNI);
		frame.getContentPane().add(lblCientificoNombre);
		frame.getContentPane().add(btnPCientificoModificar);
		frame.getContentPane().add(btnPCientificoBuscar);
		frame.getContentPane().add(btnPCientificoBorrar);
		frame.getContentPane().add(btnPCientificoCrear);
		frame.getContentPane().add(lblTittle);
		frame.getContentPane().add(btnCientificoMostrar);
		frame.getContentPane().add(txaMostrarResultados);
		frame.getContentPane().add(tglbtnToggleEntity);	
		frame.getContentPane().add(txtCientificoNomApels);
		frame.getContentPane().add(txtProyectoID);
		frame.getContentPane().add(txtProyectoNombre);
		frame.getContentPane().add(txtProyectoHoras);
		frame.getContentPane().add(lblProyectoID);
		frame.getContentPane().add(lblProyectoHoras);
		frame.getContentPane().add(lblProyectoNombre);
		frame.getContentPane().add(btnProyectoCrear);
		frame.getContentPane().add(btnProyectoBorrar);
		frame.getContentPane().add(btnProyectoMostrar);
		frame.getContentPane().add(btnProyectoModificar);
			
	}
	//Seteamos todo a no visible y no enable
	public void unshowAll() {
		//botones secundarios
		btnBorrarCientifico.setVisible(false);
		btnBuscarCientifico.setVisible(false);
		btnModificarCientifico.setVisible(false);
		btnCrearCientifico.setVisible(false);
		lblCientificoNombre.setVisible(false);
		lblCientificoDNI.setVisible(false);
		txtCientificoDNI.setVisible(false);
		txtCientificoNomApels.setVisible(false);
		txtCientificoNomApels.setEnabled(false);
		txtCientificoDNI.setEnabled(false);
		txaMostrarResultados.setVisible(false);
		txaMostrarResultados.setEnabled(false);
		
		//Borrar
		btnCientificoMostrar.setVisible(false);
		btnCientificoMostrar.setEnabled(false);
		
		//Quitamos los marcadores de boton activo principal
		btnPCientificoBorrar.setForeground(null);
		btnPCientificoCrear.setForeground(null);
		btnPCientificoBuscar.setForeground(null);
		btnPCientificoModificar.setForeground(null);
		
		//Proyecto
		txtProyectoID.setVisible(false);
		txtProyectoNombre.setVisible(false);
		txtProyectoHoras.setVisible(false);
		lblProyectoID.setVisible(false);
		lblProyectoHoras.setVisible(false);
		lblProyectoNombre.setVisible(false);
		btnProyectoCrear.setVisible(false);
		btnProyectoBorrar.setVisible(false);
		btnProyectoMostrar.setVisible(false);
		btnProyectoModificar.setVisible(false);
		
		txtProyectoID.setEnabled(false);
		txtProyectoNombre.setEnabled(false);
		txtProyectoHoras.setEnabled(false);
		btnProyectoCrear.setEnabled(false);
		btnProyectoBorrar.setEnabled(false);
		btnProyectoMostrar.setEnabled(false);
		btnProyectoModificar.setEnabled(false);
		
		
	}
	//Muestra los elementos para crear
	public void showCreate() {
		
		unshowAll();
		
		if(lblTittle.getText().equals("Cientifico")) {
			btnPCientificoCrear.setForeground(Color.BLUE);
			
			lblCientificoNombre.setVisible(true);
			lblCientificoDNI.setVisible(true);
			
			txtCientificoDNI.setVisible(true);
			txtCientificoNomApels.setVisible(true);
			
			txtCientificoDNI.setEnabled(true);
			txtCientificoNomApels.setEnabled(true);
			
			btnCrearCientifico.setVisible(true);
			btnCrearCientifico.setEnabled(true);
		}else {//Proyecto
			
			txtProyectoID.setVisible(true);
			txtProyectoNombre.setVisible(true);
			txtProyectoHoras.setVisible(true);
			lblProyectoID.setVisible(true);
			lblProyectoHoras.setVisible(true);
			lblProyectoNombre.setVisible(true);
			btnProyectoCrear.setVisible(true);
			
			txtProyectoID.setEnabled(true);
			txtProyectoNombre.setEnabled(true);
			txtProyectoHoras.setEnabled(true);
			btnProyectoCrear.setEnabled(true);
		}
		
	}
	//Muestra elementos de la funcion de borrar
	public void showErase() {
		unshowAll();
		if(lblTittle.getText().equals("Cientifico")) {
			btnPCientificoBorrar.setForeground(Color.BLUE);
			
			btnBorrarCientifico.setVisible(true);
			txtCientificoDNI.setVisible(true);
			lblCientificoDNI.setVisible(true);
			btnCientificoMostrar.setVisible(true);
			txaMostrarResultados.setVisible(true);
			
			btnBorrarCientifico.setEnabled(true);
			txtCientificoDNI.setEnabled(true);
			btnCientificoMostrar.setEnabled(true);
			txaMostrarResultados.setEnabled(true);
		}else {//Proyecto
			lblProyectoID.setVisible(true);
			txtProyectoID.setVisible(true);
			txaMostrarResultados.setVisible(true);
			btnProyectoBorrar.setVisible(true);
			btnProyectoMostrar.setVisible(true);
			
			lblProyectoID.setEnabled(true);
			txtProyectoID.setEnabled(true);
			btnProyectoBorrar.setEnabled(true);
			btnProyectoMostrar.setEnabled(true);
			
			}
		
		
	}
	//Muestra los elementos de la funcion search
	public void showSearch() {
		unshowAll();
		if(lblTittle.getText().equals("Cientifico")) {
			btnPCientificoBuscar.setForeground(Color.BLUE);
			
			btnBuscarCientifico.setVisible(true);
			txtCientificoDNI.setVisible(true);
			lblCientificoDNI.setVisible(true);
			txaMostrarResultados.setVisible(true);
			
			btnBuscarCientifico.setEnabled(true);
			txtCientificoDNI.setEnabled(true);
			txaMostrarResultados.setEnabled(true);
		}else {//Proyecto
			lblProyectoID.setVisible(true);
			txtProyectoID.setVisible(true);
			btnProyectoMostrar.setVisible(true);
				
			txaMostrarResultados.setVisible(true);
			btnProyectoMostrar.setEnabled(true);
		}

	}
	
	public void showModify() {
		unshowAll();
		if(lblTittle.getText().equals("Cientifico")) {
			btnPCientificoModificar.setForeground(Color.BLUE);
			
			btnModificarCientifico.setVisible(true);
			txtCientificoDNI.setVisible(true);
			lblCientificoDNI.setVisible(true);
			lblCientificoNombre.setVisible(true);
			txtCientificoNomApels.setVisible(true);
			btnCientificoMostrar.setVisible(true);
			
			
			btnModificarCientifico.setEnabled(true);
			txtCientificoDNI.setEnabled(true);
			txtCientificoNomApels.setEnabled(true);
			btnCientificoMostrar.setEnabled(true);	
			}else {//Proyecto
				txtProyectoID.setVisible(true);
				txtProyectoNombre.setVisible(true);
				txtProyectoHoras.setVisible(true);
				lblProyectoID.setVisible(true);
				lblProyectoHoras.setVisible(true);
				lblProyectoNombre.setVisible(true);
				btnProyectoModificar.setVisible(true);
				
				
				txtProyectoID.setEnabled(true);
				txtProyectoNombre.setEnabled(true);
				txtProyectoHoras.setEnabled(true);
				btnProyectoModificar.setEnabled(true);
				
			}
		
	
	}
	public void toggleEntity(String entidadActual) {
		unshowAll();
		if(entidadActual.equals("Cambiar a Proyecto")) {
			tglbtnToggleEntity.setText("Cambiar a Cientifico");
			lblTittle.setText("Proyecto");
		}else {
			tglbtnToggleEntity.setText("Cambiar a Proyecto");
			lblTittle.setText("Cientifico");
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
	 * @return the txtCientificoNomApels
	 */
	public JTextField getTxtCientificoNomApels() {
		return txtCientificoNomApels;
	}

	/**
	 * @param txtCientificoNomApels the txtCientificoNomApels to set
	 */
	public void setTxtCientificoNomApels(JTextField txtCientificoNomApels) {
		this.txtCientificoNomApels = txtCientificoNomApels;
	}

	/**
	 * @return the txtCientificoDNI
	 */
	public JTextField getTxtCientificoDNI() {
		return txtCientificoDNI;
	}

	/**
	 * @param txtCientificoDNI the txtCientificoDNI to set
	 */
	public void setTxtCientificoDNI(JTextField txtCientificoDNI) {
		this.txtCientificoDNI = txtCientificoDNI;
	}

	/**
	 * @return the cambiarVistas
	 */
	public ViewSwicherController getCambiarVistas() {
		return cambiarVistas;
	}

	/**
	 * @param cambiarVistas the cambiarVistas to set
	 */
	public void setCambiarVistas(ViewSwicherController cambiarVistas) {
		this.cambiarVistas = cambiarVistas;
	}

	/**
	 * @return the lblTittle
	 */
	public JLabel getLblTittle() {
		return lblTittle;
	}

	/**
	 * @param lblTittle the lblTittle to set
	 */
	public void setLblTittle(JLabel lblTittle) {
		this.lblTittle = lblTittle;
	}

	/**
	 * @return the lblCientificoNombre
	 */
	public JLabel getLblCientificoNombre() {
		return lblCientificoNombre;
	}

	/**
	 * @param lblCientificoNombre the lblCientificoNombre to set
	 */
	public void setLblCientificoNombre(JLabel lblCientificoNombre) {
		this.lblCientificoNombre = lblCientificoNombre;
	}

	/**
	 * @return the lblCientificoDNI
	 */
	public JLabel getLblCientificoDNI() {
		return lblCientificoDNI;
	}

	/**
	 * @param lblCientificoDNI the lblCientificoDNI to set
	 */
	public void setLblCientificoDNI(JLabel lblCientificoDNI) {
		this.lblCientificoDNI = lblCientificoDNI;
	}

	/**
	 * @return the btnPCientificoCrear
	 */
	public JButton getBtnPCientificoCrear() {
		return btnPCientificoCrear;
	}

	/**
	 * @param btnPCientificoCrear the btnPCientificoCrear to set
	 */
	public void setBtnPCientificoCrear(JButton btnPCientificoCrear) {
		this.btnPCientificoCrear = btnPCientificoCrear;
	}

	/**
	 * @return the btnPCientificoBorrar
	 */
	public JButton getBtnPCientificoBorrar() {
		return btnPCientificoBorrar;
	}

	/**
	 * @param btnPCientificoBorrar the btnPCientificoBorrar to set
	 */
	public void setBtnPCientificoBorrar(JButton btnPCientificoBorrar) {
		this.btnPCientificoBorrar = btnPCientificoBorrar;
	}

	/**
	 * @return the btnPCientificoBuscar
	 */
	public JButton getBtnPCientificoBuscar() {
		return btnPCientificoBuscar;
	}

	/**
	 * @param btnPCientificoBuscar the btnPCientificoBuscar to set
	 */
	public void setBtnPCientificoBuscar(JButton btnPCientificoBuscar) {
		this.btnPCientificoBuscar = btnPCientificoBuscar;
	}

	/**
	 * @return the btnPCientificoModificar
	 */
	public JButton getBtnPCientificoModificar() {
		return btnPCientificoModificar;
	}

	/**
	 * @param btnPCientificoModificar the btnPCientificoModificar to set
	 */
	public void setBtnPCientificoModificar(JButton btnPCientificoModificar) {
		this.btnPCientificoModificar = btnPCientificoModificar;
	}

	/**
	 * @return the txaMostrarResultados
	 */
	public JTextArea getTxaMostrarResultados() {
		return txaMostrarResultados;
	}

	/**
	 * @param txaMostrarResultados the txaMostrarResultados to set
	 */
	public void setTxaMostrarResultados(JTextArea txaMostrarResultados) {
		this.txaMostrarResultados = txaMostrarResultados;
	}

	/**
	 * @return the btnBorrarCientifico
	 */
	public JButton getBtnBorrarCientifico() {
		return btnBorrarCientifico;
	}

	/**
	 * @param btnBorrarCientifico the btnBorrarCientifico to set
	 */
	public void setBtnBorrarCientifico(JButton btnBorrarCientifico) {
		this.btnBorrarCientifico = btnBorrarCientifico;
	}

	/**
	 * @return the btnCientificoMostrar
	 */
	public JButton getBtnCientificoMostrar() {
		return btnCientificoMostrar;
	}

	/**
	 * @param btnCientificoMostrar the btnCientificoMostrar to set
	 */
	public void setBtnCientificoMostrar(JButton btnCientificoMostrar) {
		this.btnCientificoMostrar = btnCientificoMostrar;
	}

	/**
	 * @return the btnBuscarCientifico
	 */
	public JButton getBtnBuscarCientifico() {
		return btnBuscarCientifico;
	}

	/**
	 * @param btnBuscarCientifico the btnBuscarCientifico to set
	 */
	public void setBtnBuscarCientifico(JButton btnBuscarCientifico) {
		this.btnBuscarCientifico = btnBuscarCientifico;
	}

	/**
	 * @return the btnModificarCientifico
	 */
	public JButton getBtnModificarCientifico() {
		return btnModificarCientifico;
	}

	/**
	 * @param btnModificarCientifico the btnModificarCientifico to set
	 */
	public void setBtnModificarCientifico(JButton btnModificarCientifico) {
		this.btnModificarCientifico = btnModificarCientifico;
	}

	/**
	 * @return the btnCrearCientifico
	 */
	public JButton getBtnCrearCientifico() {
		return btnCrearCientifico;
	}

	/**
	 * @param btnCrearCientifico the btnCrearCientifico to set
	 */
	public void setBtnCrearCientifico(JButton btnCrearCientifico) {
		this.btnCrearCientifico = btnCrearCientifico;
	}

	/**
	 * @return the tglbtnToggleEntity
	 */
	public JButton getTglbtnToggleEntity() {
		return tglbtnToggleEntity;
	}

	/**
	 * @param tglbtnToggleEntity the tglbtnToggleEntity to set
	 */
	public void setTglbtnToggleEntity(JButton tglbtnToggleEntity) {
		this.tglbtnToggleEntity = tglbtnToggleEntity;
	}

	/**
	 * @return the lblProyectoID
	 */
	public JLabel getLblProyectoID() {
		return lblProyectoID;
	}

	/**
	 * @param lblProyectoID the lblProyectoID to set
	 */
	public void setLblProyectoID(JLabel lblProyectoID) {
		this.lblProyectoID = lblProyectoID;
	}

	/**
	 * @return the lblProyectoHoras
	 */
	public JLabel getLblProyectoHoras() {
		return lblProyectoHoras;
	}

	/**
	 * @param lblProyectoHoras the lblProyectoHoras to set
	 */
	public void setLblProyectoHoras(JLabel lblProyectoHoras) {
		this.lblProyectoHoras = lblProyectoHoras;
	}

	/**
	 * @return the lblProyectoNombre
	 */
	public JLabel getLblProyectoNombre() {
		return lblProyectoNombre;
	}

	/**
	 * @param lblProyectoNombre the lblProyectoNombre to set
	 */
	public void setLblProyectoNombre(JLabel lblProyectoNombre) {
		this.lblProyectoNombre = lblProyectoNombre;
	}

	/**
	 * @return the txtProyectoID
	 */
	public JTextField getTxtProyectoID() {
		return txtProyectoID;
	}

	/**
	 * @param txtProyectoID the txtProyectoID to set
	 */
	public void setTxtProyectoID(JTextField txtProyectoID) {
		this.txtProyectoID = txtProyectoID;
	}

	/**
	 * @return the txtProyectoNombre
	 */
	public JTextField getTxtProyectoNombre() {
		return txtProyectoNombre;
	}

	/**
	 * @param txtProyectoNombre the txtProyectoNombre to set
	 */
	public void setTxtProyectoNombre(JTextField txtProyectoNombre) {
		this.txtProyectoNombre = txtProyectoNombre;
	}

	/**
	 * @return the txtProyectoHoras
	 */
	public JTextField getTxtProyectoHoras() {
		return txtProyectoHoras;
	}

	/**
	 * @param txtProyectoHoras the txtProyectoHoras to set
	 */
	public void setTxtProyectoHoras(JTextField txtProyectoHoras) {
		this.txtProyectoHoras = txtProyectoHoras;
	}

	/**
	 * @return the btnProyectoCrear
	 */
	public JButton getBtnProyectoCrear() {
		return btnProyectoCrear;
	}

	/**
	 * @param btnProyectoCrear the btnProyectoCrear to set
	 */
	public void setBtnProyectoCrear(JButton btnProyectoCrear) {
		this.btnProyectoCrear = btnProyectoCrear;
	}

	/**
	 * @return the btnProyectoBorrar
	 */
	public JButton getBtnProyectoBorrar() {
		return btnProyectoBorrar;
	}

	/**
	 * @param btnProyectoBorrar the btnProyectoBorrar to set
	 */
	public void setBtnProyectoBorrar(JButton btnProyectoBorrar) {
		this.btnProyectoBorrar = btnProyectoBorrar;
	}

	/**
	 * @return the btnProyectoMostrar
	 */
	public JButton getBtnProyectoMostrar() {
		return btnProyectoMostrar;
	}

	/**
	 * @param btnProyectoMostrar the btnProyectoMostrar to set
	 */
	public void setBtnProyectoMostrar(JButton btnProyectoMostrar) {
		this.btnProyectoMostrar = btnProyectoMostrar;
	}

	/**
	 * @return the btnProyectoModificar
	 */
	public JButton getBtnProyectoModificar() {
		return btnProyectoModificar;
	}

	/**
	 * @param btnProyectoModificar the btnProyectoModificar to set
	 */
	public void setBtnProyectoModificar(JButton btnProyectoModificar) {
		this.btnProyectoModificar = btnProyectoModificar;
	}

	
	
	
	
	
}
