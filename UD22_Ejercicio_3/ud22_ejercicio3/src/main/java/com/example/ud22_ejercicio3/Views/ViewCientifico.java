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

public class ViewCientifico {

	public JFrame frame;
	private JTextField tfCientificoNombre;
	private JTextField tfCientificoDNI;
	private ActionsCientifico actionsCientifico;
	
	JLabel lblCientifico = new JLabel("Cientifico");
	JLabel lblCientificoNombre = new JLabel("Nombre");
	JLabel lblCientificoDNI = new JLabel("DNI");
	JButton btnCientificoCrear = new JButton("Crear");
	JButton btncientificoBorrar = new JButton("Borrar");
	JButton btnCientificoBuscar = new JButton("Buscar");
	JButton btnCientificoModificar = new JButton("Modificar");
	JButton btnBorrarCientifico = new JButton("Borrar Cientifico");
	JButton btnBuscarCientifico = new JButton("Buscar Cientifico");
	JButton btnModificarCientifico = new JButton("Modificar Cientifico");
	JButton btnCrearCientifico = new JButton("Crear Cientifico");



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
		
	
		btnCientificoCrear.setBounds(7, 34, 117, 29);
		btncientificoBorrar.setBounds(7, 75, 117, 29);
		btnCientificoBuscar.setBounds(7, 116, 117, 29);
		btnCientificoModificar.setBounds(6, 157, 117, 29);
		
		btnCrearCientifico.setBounds(351, 182, 167, 29);
		btnBorrarCientifico.setBounds(351, 182, 167, 29);
		btnBuscarCientifico.setBounds(351, 182, 167, 29);
		btnModificarCientifico.setBounds(351, 182, 167, 29);
		
		
		tfCientificoNombre.setBounds(284, 85, 130, 26);
		frame.getContentPane().add(tfCientificoNombre);
		tfCientificoNombre.setColumns(10);
		
		
		tfCientificoDNI.setColumns(10);
		tfCientificoDNI.setBounds(284, 49, 130, 26);
		
//Initial views of elements
		//Ocultamos todos los elementos no necesarios en la primera vista
		unshowAll();
		
//Action Listeners
		btnCientificoCrear.addActionListener(actionsCientifico);
		btncientificoBorrar.addActionListener(actionsCientifico);
		btnCientificoBuscar.addActionListener(actionsCientifico);
		btnCientificoModificar.addActionListener(actionsCientifico);	
	
//Adding to content Panel
		frame.getContentPane().add(btnModificarCientifico);
		frame.getContentPane().add(btnBuscarCientifico);
		frame.getContentPane().add(btnBorrarCientifico);
		frame.getContentPane().add(btnCrearCientifico);
		frame.getContentPane().add(tfCientificoDNI);
		frame.getContentPane().add(lblCientificoDNI);
		frame.getContentPane().add(lblCientificoNombre);
		frame.getContentPane().add(btnCientificoModificar);
		frame.getContentPane().add(btnCientificoBuscar);
		frame.getContentPane().add(btncientificoBorrar);
		frame.getContentPane().add(btnCientificoCrear);
		frame.getContentPane().add(lblCientifico);
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
		
		//Quitamos los marcadores de boton activo principal
		btncientificoBorrar.setForeground(null);
		btnCientificoCrear.setForeground(null);
		btnCientificoBuscar.setForeground(null);
		btnCientificoModificar.setForeground(null);
	}
	//Muestra los elementos para crear
	public void showCreate() {
		btnCientificoCrear.setForeground(Color.BLUE);
		
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
		
		btncientificoBorrar.setForeground(Color.BLUE);
		
		btnBorrarCientifico.setVisible(true);
		tfCientificoDNI.setVisible(true);
		lblCientificoDNI.setVisible(true);
		
		btnBorrarCientifico.setEnabled(true);
		tfCientificoDNI.setEnabled(true);
		
	}
	//Muestra los elementos de la funcion search
	public void showSearch() {
		btnCientificoBuscar.setForeground(Color.BLUE);
		
		btnBuscarCientifico.setVisible(true);
		tfCientificoDNI.setVisible(true);
		lblCientificoDNI.setVisible(true);
		
		btnBuscarCientifico.setEnabled(true);
		tfCientificoDNI.setEnabled(true);
	}
	
	public void showModify() {
		btnCientificoModificar.setForeground(Color.BLUE);
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
		return btnCientificoCrear;
	}

	public void setBtnCientificoCrear(JButton btnCientificoCrear) {
		this.btnCientificoCrear = btnCientificoCrear;
	}

	public JButton getBtncientificoBorrar() {
		return btncientificoBorrar;
	}

	public void setBtncientificoBorrar(JButton btncientificoBorrar) {
		this.btncientificoBorrar = btncientificoBorrar;
	}

	public JButton getBtnCientificoBuscar() {
		return btnCientificoBuscar;
	}

	public void setBtnCientificoBuscar(JButton btnCientificoBuscar) {
		this.btnCientificoBuscar = btnCientificoBuscar;
	}

	public JButton getBtnCientificoModificar() {
		return btnCientificoModificar;
	}

	public void setBtnCientificoModificar(JButton btnCientificoModificar) {
		this.btnCientificoModificar = btnCientificoModificar;
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
