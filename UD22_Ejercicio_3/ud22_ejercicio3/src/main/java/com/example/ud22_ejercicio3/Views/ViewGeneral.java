package com.example.ud22_ejercicio3.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;

import com.example.ud22_ejercicio3.controllers.ActionsCientifico;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ViewGeneral {

	public JFrame frame;
	private JTextField tfCientificoNombre;
	private JTextField tfCientificoDNI;
	private ActionsCientifico actionsCientifico;
	
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
	
	private JTextField tfProyectoID;
	private JTextField tfProyectoNombre;
	private JTextField tfProyectoHoras;
	private JButton btnProyectoCrear = new JButton("Crear Proyecto");
	private JButton btnProyectoBorrar = new JButton("Borrar Proyecto");
	private final JButton btnProyectoMostrar = new JButton("Busqueda");
	private final JButton btnProyectoModificar = new JButton("Modificar Proyecto");
	
	public ViewGeneral() {
		actionsCientifico = new ActionsCientifico(); 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		tfProyectoID = new JTextField();
		tfProyectoNombre = new JTextField();
		tfProyectoHoras = new JTextField();
		
		actionsCientifico.setViewCientifico(this);
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfCientificoDNI = new JTextField();
		tfCientificoNombre = new JTextField();
		
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
		
		
		tfCientificoNombre.setBounds(284, 85, 130, 26);
		
		tfCientificoNombre.setColumns(10);
		
		
		tfCientificoDNI.setColumns(10);
		tfCientificoDNI.setBounds(284, 49, 130, 26);
		
		btnCientificoMostrar.setBounds(417, 49, 117, 29);
		
		txaMostrarResultados.setBounds(211, 85, 307, 85);
		tglbtnToggleEntity.setBounds(6, 299, 161, 29);
		tfProyectoID.setBounds(286, 52, 130, 26);
		
		tfProyectoID.setColumns(10);

		tfProyectoNombre.setColumns(10);
		tfProyectoNombre.setBounds(286, 90, 130, 26);
	
		tfProyectoHoras.setBounds(286, 128, 130, 26);
		
		tfProyectoHoras.setColumns(10);
		
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
		frame.getContentPane().add(lblTittle);
		frame.getContentPane().add(btnCientificoMostrar);
		frame.getContentPane().add(txaMostrarResultados);
		frame.getContentPane().add(tglbtnToggleEntity);	
		frame.getContentPane().add(tfCientificoNombre);
		frame.getContentPane().add(tfProyectoID);
		frame.getContentPane().add(tfProyectoNombre);
		frame.getContentPane().add(tfProyectoHoras);
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
		
		//Proyecto
		tfProyectoID.setVisible(false);
		tfProyectoNombre.setVisible(false);
		tfProyectoHoras.setVisible(false);
		lblProyectoID.setVisible(false);
		lblProyectoHoras.setVisible(false);
		lblProyectoNombre.setVisible(false);
		btnProyectoCrear.setVisible(false);
		btnProyectoBorrar.setVisible(false);
		btnProyectoMostrar.setVisible(false);
		btnProyectoModificar.setVisible(false);
		
		tfProyectoID.setEnabled(false);
		tfProyectoNombre.setEnabled(false);
		tfProyectoHoras.setEnabled(false);
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
			
			tfCientificoDNI.setVisible(true);
			tfCientificoNombre.setVisible(true);
			
			tfCientificoDNI.setEnabled(true);
			tfCientificoNombre.setEnabled(true);
			
			btnCrearCientifico.setVisible(true);
			btnCrearCientifico.setEnabled(true);
		}else {//Proyecto
			
			tfProyectoID.setVisible(true);
			tfProyectoNombre.setVisible(true);
			tfProyectoHoras.setVisible(true);
			lblProyectoID.setVisible(true);
			lblProyectoHoras.setVisible(true);
			lblProyectoNombre.setVisible(true);
			btnProyectoCrear.setVisible(true);
			
			tfProyectoID.setEnabled(true);
			tfProyectoNombre.setEnabled(true);
			tfProyectoHoras.setEnabled(true);
			btnProyectoCrear.setEnabled(true);
		}
		
	}
	//Muestra elementos de la funcion de borrar
	public void showErase() {
		unshowAll();
		if(lblTittle.getText().equals("Cientifico")) {
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
		}else {//Proyecto
			lblProyectoID.setVisible(true);
			tfProyectoID.setVisible(true);
			txaMostrarResultados.setVisible(true);
			btnProyectoBorrar.setVisible(true);
			btnProyectoMostrar.setVisible(true);
			
			lblProyectoID.setEnabled(true);
			tfProyectoID.setEnabled(true);
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
			tfCientificoDNI.setVisible(true);
			lblCientificoDNI.setVisible(true);
			txaMostrarResultados.setVisible(true);
			
			btnBuscarCientifico.setEnabled(true);
			tfCientificoDNI.setEnabled(true);
			txaMostrarResultados.setEnabled(true);
		}else {//Proyecto
			lblProyectoID.setVisible(true);
			tfProyectoID.setVisible(true);
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
			tfCientificoDNI.setVisible(true);
			lblCientificoDNI.setVisible(true);
			lblCientificoNombre.setVisible(true);
			tfCientificoNombre.setVisible(true);
			btnCientificoMostrar.setVisible(true);
			
			
			btnModificarCientifico.setEnabled(true);
			tfCientificoNombre.setEnabled(true);
			btnCientificoMostrar.setEnabled(true);	
			}else {//Proyecto
				tfProyectoID.setVisible(true);
				tfProyectoNombre.setVisible(true);
				tfProyectoHoras.setVisible(true);
				lblProyectoID.setVisible(true);
				lblProyectoHoras.setVisible(true);
				lblProyectoNombre.setVisible(true);
				btnProyectoModificar.setVisible(true);
				
				
				tfProyectoID.setEnabled(true);
				tfProyectoNombre.setEnabled(true);
				tfProyectoHoras.setEnabled(true);
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

	public JLabel getLblTittle() {
		return lblTittle;
	}

	public void setLblTittle(JLabel lblCientifico) {
		this.lblTittle = lblCientifico;
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
