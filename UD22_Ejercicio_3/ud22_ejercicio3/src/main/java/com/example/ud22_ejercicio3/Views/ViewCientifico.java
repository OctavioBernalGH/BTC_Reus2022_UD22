package com.example.ud22_ejercicio3.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import com.example.ud22_ejercicio3.ActionsCientifico;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ViewCientifico {

	public JFrame frame;
	private JTextField tfCientificoNombre;
	private JTextField tfCientificoDNI;
	private ActionsCientifico actionsCientifico;
	
	JLabel lblCientifico = new JLabel("Cientifico");
	JLabel lblCientificoNombre = new JLabel("Nombre");
	JLabel lblCientificoDNI = new JLabel("DNI");
	//view principales
	JButton btnPCientificoCrear = new JButton("Crear");
	JButton btnPCientificoBorrar = new JButton("Borrar");
	JButton btnPCientificoBuscar = new JButton("Buscar");
	JButton btnPCientificoModificar = new JButton("Modificar");
	//view conjunta
	JTextArea txaMostrarResultados = new JTextArea();
	//view borrar
	JButton btnBorrarCientifico = new JButton("Borrar Cientifico");
	JButton btnCientificoMostrar = new JButton("Mostrar");
	//view buscar
	JButton btnBuscarCientifico = new JButton("Buscar Cientifico");
	JButton btnModificarCientifico = new JButton("Modificar Cientifico");
	JButton btnCrearCientifico = new JButton("Crear Cientifico");
	JButton tglbtnToggleEntity = new JButton("Cambiar a Proyecto");
	
	



	public ViewCientifico() {
		actionsCientifico = new ActionsCientifico(); 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		actionsCientifico.setViewCientifico(this);
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfCientificoDNI = new JTextField();
		tfCientificoNombre = new JTextField();
		
		
		
		lblCientifico.setBounds(6, 6, 118, 16);
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
		
		
		tfCientificoNombre.setBounds(284, 85, 130, 26);
		frame.getContentPane().add(tfCientificoNombre);
		tfCientificoNombre.setColumns(10);
		
		
		tfCientificoDNI.setColumns(10);
		tfCientificoDNI.setBounds(284, 49, 130, 26);
		
		btnCientificoMostrar.setBounds(417, 49, 117, 29);
		
		txaMostrarResultados.setBounds(211, 85, 307, 85);
		tglbtnToggleEntity.setBounds(6, 299, 161, 29);
		
//Initial views of elements
		//Ocultamos todos los elementos no necesarios en la primera vista
		unshowAll();
		
//Action Listeners
		btnPCientificoCrear.addActionListener(actionsCientifico);
		btnPCientificoBorrar.addActionListener(actionsCientifico);
		btnPCientificoBuscar.addActionListener(actionsCientifico);
		btnPCientificoModificar.addActionListener(actionsCientifico);	
		btnCientificoMostrar.addActionListener(actionsCientifico);
		tglbtnToggleEntity.addActionListener(actionsCientifico);
	
//Adding to content Panel
		frame.getContentPane().add(btnModificarCientifico);
		frame.getContentPane().add(btnBuscarCientifico);
		frame.getContentPane().add(btnBorrarCientifico);
		frame.getContentPane().add(btnCrearCientifico);
		frame.getContentPane().add(tfCientificoDNI);
		frame.getContentPane().add(lblCientificoDNI);
		frame.getContentPane().add(lblCientificoNombre);
		frame.getContentPane().add(btnPCientificoModificar);
		frame.getContentPane().add(btnPCientificoBuscar);
		frame.getContentPane().add(btnPCientificoBorrar);
		frame.getContentPane().add(btnPCientificoCrear);
		frame.getContentPane().add(lblCientifico);
		frame.getContentPane().add(btnCientificoMostrar);
		frame.getContentPane().add(txaMostrarResultados);
		frame.getContentPane().add(tglbtnToggleEntity);	
		
	}
	
	public void unshowAll() {
		//botones secundarios
		btnBorrarCientifico.setVisible(false);
		btnBuscarCientifico.setVisible(false);
		btnModificarCientifico.setVisible(false);
		btnCrearCientifico.setVisible(false);
		
		
		lblCientificoNombre.setVisible(false);
		lblCientificoDNI.setVisible(false);
		tfCientificoDNI.setVisible(false);
		
		tfCientificoNombre.setVisible(false);
		
		tfCientificoNombre.setEnabled(false);
		tfCientificoDNI.setEnabled(false);
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
	}
	//Muestra los elementos para crear
	public void showCreate() {
		unshowAll();
		btnPCientificoCrear.setForeground(Color.BLUE);
		
		lblCientificoNombre.setVisible(true);
		lblCientificoDNI.setVisible(true);
		
		tfCientificoDNI.setVisible(true);
		tfCientificoNombre.setVisible(true);
		
		tfCientificoDNI.setEnabled(true);
		tfCientificoNombre.setEnabled(true);
		
		btnCrearCientifico.setVisible(true);
		btnCrearCientifico.setEnabled(true);
	}
	//Muestra elementos de la funcion de borrar
	public void showErase() {
		unshowAll();
		btnPCientificoBorrar.setForeground(Color.BLUE);
		
		btnBorrarCientifico.setVisible(true);
		tfCientificoDNI.setVisible(true);
		lblCientificoDNI.setVisible(true);
		btnCientificoMostrar.setVisible(true);
		txaMostrarResultados.setVisible(true);
		
		btnBorrarCientifico.setEnabled(true);
		tfCientificoDNI.setEnabled(true);
		btnCientificoMostrar.setEnabled(true);
		txaMostrarResultados.setEnabled(true);
		
	}
	//Muestra los elementos de la funcion search
	public void showSearch() {
		unshowAll();
		btnPCientificoBuscar.setForeground(Color.BLUE);
		
		btnBuscarCientifico.setVisible(true);
		tfCientificoDNI.setVisible(true);
		lblCientificoDNI.setVisible(true);
		txaMostrarResultados.setVisible(true);
		
		btnBuscarCientifico.setEnabled(true);
		tfCientificoDNI.setEnabled(true);
		txaMostrarResultados.setEnabled(true);
	}
	
	public void showModify() {
		unshowAll();
		btnPCientificoModificar.setForeground(Color.BLUE);
		
		btnModificarCientifico.setVisible(true);
		tfCientificoDNI.setVisible(true);
		lblCientificoDNI.setVisible(true);
		lblCientificoNombre.setVisible(true);
		tfCientificoNombre.setVisible(true);
		btnCientificoMostrar.setVisible(true);
		
		
		btnModificarCientifico.setEnabled(true);
		tfCientificoNombre.setEnabled(true);
		btnCientificoMostrar.setEnabled(true);
	
	}
	public void toggleEntity(String entidadActual) {
		
		if(entidadActual.equals("Cambiar a Proyecto")) {
			tglbtnToggleEntity.setText("Cambiar a Cientifico");
			lblCientifico.setText("Proyecto");
		}else {
			tglbtnToggleEntity.setText("Cambiar a Proyecto");
			lblCientifico.setText("Cientifico");
		}
		
	}
	

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTfCientificoNombre() {
		return tfCientificoNombre;
	}

	public void setTfCientificoNombre(JTextField tfCientificoNombre) {
		this.tfCientificoNombre = tfCientificoNombre;
	}

	public JTextField getTfCientificoDNI() {
		return tfCientificoDNI;
	}

	public void setTfCientificoDNI(JTextField tfCientificoDNI) {
		this.tfCientificoDNI = tfCientificoDNI;
	}

	public ActionsCientifico getActionsCientifico() {
		return actionsCientifico;
	}

	public void setActionsCientifico(ActionsCientifico actionsCientifico) {
		this.actionsCientifico = actionsCientifico;
	}

	public JLabel getLblCientifico() {
		return lblCientifico;
	}

	public void setLblCientifico(JLabel lblCientifico) {
		this.lblCientifico = lblCientifico;
	}

	public JLabel getLblCientificoNombre() {
		return lblCientificoNombre;
	}

	public void setLblCientificoNombre(JLabel lblCientificoNombre) {
		this.lblCientificoNombre = lblCientificoNombre;
	}

	public JLabel getLblCientificoDNI() {
		return lblCientificoDNI;
	}

	public void setLblCientificoDNI(JLabel lblCientificoDNI) {
		this.lblCientificoDNI = lblCientificoDNI;
	}

	public JButton getBtnCientificoCrear() {
		return btnPCientificoCrear;
	}

	public void setBtnCientificoCrear(JButton btnCientificoCrear) {
		this.btnPCientificoCrear = btnCientificoCrear;
	}

	public JButton getBtncientificoBorrar() {
		return btnPCientificoBorrar;
	}

	public void setBtncientificoBorrar(JButton btncientificoBorrar) {
		this.btnPCientificoBorrar = btncientificoBorrar;
	}

	public JButton getBtnCientificoBuscar() {
		return btnPCientificoBuscar;
	}

	public void setBtnCientificoBuscar(JButton btnCientificoBuscar) {
		this.btnPCientificoBuscar = btnCientificoBuscar;
	}

	public JButton getBtnCientificoModificar() {
		return btnPCientificoModificar;
	}

	public void setBtnCientificoModificar(JButton btnCientificoModificar) {
		this.btnPCientificoModificar = btnCientificoModificar;
	}

	public JButton getBtnBorrarCientifico() {
		return btnBorrarCientifico;
	}

	public void setBtnBorrarCientifico(JButton btnBorrarCientifico) {
		this.btnBorrarCientifico = btnBorrarCientifico;
	}

	public JButton getBtnBuscarCientifico() {
		return btnBuscarCientifico;
	}

	public void setBtnBuscarCientifico(JButton btnBuscarCientifico) {
		this.btnBuscarCientifico = btnBuscarCientifico;
	}

	public JButton getBtnModificarCientifico() {
		return btnModificarCientifico;
	}

	public void setBtnModificarCientifico(JButton btnModificarCientifico) {
		this.btnModificarCientifico = btnModificarCientifico;
	}

	public JButton getBtnCrearCientifico() {
		return btnCrearCientifico;
	}

	public void setBtnCrearCientifico(JButton btnCrearCientifico) {
		this.btnCrearCientifico = btnCrearCientifico;
	}
}
