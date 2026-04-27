package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Variables;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class frmModificar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtModelo;
	private JTextField txtDiametro;
	private JTextField txtResistencia;
	private JComboBox cboMarca;
	private JButton btnGuardar;
	private JButton btnCerrar;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtGrosor;
	private JComboBox cboTipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmModificar dialog = new frmModificar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmModificar() {
		setModal(true);
		setTitle("Modificar");
		setBounds(100, 100, 454, 282);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Marca");
			lblNewLabel.setBounds(10, 25, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 119, 78, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Modelo");
			lblNewLabel_2.setBounds(10, 57, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Diametro (mm)");
			lblNewLabel_3.setBounds(10, 150, 89, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Res. al Agua (m)");
			lblNewLabel_4.setBounds(10, 212, 95, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			cboMarca = new JComboBox();
			cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Casio", "Seiko", "Hamilton", "Orient", "Tissot"}));
			cboMarca.addActionListener(this);
			cboMarca.setBounds(115, 21, 159, 22);
			contentPanel.add(cboMarca);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(115, 116, 159, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtModelo = new JTextField();
			txtModelo.setBounds(115, 54, 159, 20);
			contentPanel.add(txtModelo);
			txtModelo.setColumns(10);
		}
		{
			txtDiametro = new JTextField();
			txtDiametro.setBounds(115, 147, 159, 20);
			contentPanel.add(txtDiametro);
			txtDiametro.setColumns(10);
		}
		{
			txtResistencia = new JTextField();
			txtResistencia.setBounds(115, 209, 159, 20);
			contentPanel.add(txtResistencia);
			txtResistencia.setColumns(10);
		}
		{
			btnCerrar = new JButton("Cerrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(335, 21, 89, 23);
			contentPanel.add(btnCerrar);
		}
		{
			btnGuardar = new JButton("Guardar");
			btnGuardar.addActionListener(this);
			btnGuardar.setBounds(335, 50, 89, 23);
			contentPanel.add(btnGuardar);
		}

		{
			lblNewLabel_5 = new JLabel("Tipo");
			lblNewLabel_5.setBounds(10, 88, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Grosor (mm)");
			lblNewLabel_6.setBounds(10, 185, 89, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			txtGrosor = new JTextField();
			txtGrosor.setBounds(115, 178, 159, 20);
			contentPanel.add(txtGrosor);
			txtGrosor.setColumns(10);
		}
		
		cboTipo = new JComboBox();
		cboTipo.setModel(new DefaultComboBoxModel(new String[] {"Analógico", "Digital"}));
		cboTipo.setBounds(115, 85, 159, 22);
		contentPanel.add(cboTipo);
		
		//Variables iniciales
		txtModelo.setText(String.valueOf(Variables.modelo0));
		cboTipo.setSelectedIndex(Variables.tipo0); //0 o 1
		txtPrecio.setText(String.valueOf(Variables.precio0));
		txtDiametro.setText(String.valueOf(Variables.diametro0));
		txtGrosor.setText(String.valueOf(Variables.grosor0));
		txtResistencia.setText(String.valueOf(Variables.resistencia0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == cboMarca) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		//variables
		int pos;
		pos = cboMarca.getSelectedIndex();
		switch(pos) {
			case 0://marca 1 pos 0
				txtModelo.setText(String.valueOf(Variables.modelo0));
				cboTipo.setSelectedIndex(Variables.tipo0);
				txtPrecio.setText(String.valueOf(Variables.precio0));
				txtDiametro.setText(String.valueOf(Variables.diametro0));
				txtGrosor.setText(String.valueOf(Variables.grosor0));
				txtResistencia.setText(String.valueOf(Variables.resistencia0));
				break;
			case 1://marca 2 pos 1
				txtModelo.setText(String.valueOf(Variables.modelo1));
				cboTipo.setSelectedIndex(Variables.tipo1);
				txtPrecio.setText(String.valueOf(Variables.precio1));
				txtDiametro.setText(String.valueOf(Variables.diametro1));
				txtGrosor.setText(String.valueOf(Variables.grosor1));
				txtResistencia.setText(String.valueOf(Variables.resistencia1));
				break;
			case 2://marca 3 pos 2
				txtModelo.setText(String.valueOf(Variables.modelo2));
				cboTipo.setSelectedIndex(Variables.tipo2);
				txtPrecio.setText(String.valueOf(Variables.precio2));
				txtDiametro.setText(String.valueOf(Variables.diametro2));
				txtGrosor.setText(String.valueOf(Variables.grosor2));
				txtResistencia.setText(String.valueOf(Variables.resistencia2));
				break;
			case 3://marca 4 pos 3
				txtModelo.setText(String.valueOf(Variables.modelo3));
				cboTipo.setSelectedIndex(Variables.tipo3);
				txtPrecio.setText(String.valueOf(Variables.precio3));
				txtDiametro.setText(String.valueOf(Variables.diametro3));
				txtGrosor.setText(String.valueOf(Variables.grosor3));
				txtResistencia.setText(String.valueOf(Variables.resistencia3));
				break;
			default://marca 4 pos 3
				txtModelo.setText(String.valueOf(Variables.modelo4));
				cboTipo.setSelectedIndex(Variables.tipo4);
				txtPrecio.setText(String.valueOf(Variables.precio4));
				txtDiametro.setText(String.valueOf(Variables.diametro4));
				txtGrosor.setText(String.valueOf(Variables.grosor4));
				txtResistencia.setText(String.valueOf(Variables.resistencia4));
				break;
		
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		//obtener posicion del elemento seleccionado
		int marca;
		marca = cboMarca.getSelectedIndex();
		switch (marca) {
			case 0:
				//actualizando variables globales
				Variables.modelo0 = txtModelo.getText();
				Variables.tipo0 = cboTipo.getSelectedIndex();
				Variables.precio0 = Double.parseDouble(txtPrecio.getText());
				Variables.diametro0 = Double.parseDouble(txtDiametro.getText());
				Variables.grosor0 = Double.parseDouble(txtGrosor.getText());
				Variables.resistencia0 = Integer.parseInt(txtResistencia.getText());
				break;
			case 1:
				//actualizando variables globales
				Variables.modelo1 = txtModelo.getText();
				Variables.tipo1 = cboTipo.getSelectedIndex();
				Variables.precio1 = Double.parseDouble(txtPrecio.getText());
				Variables.diametro1 = Double.parseDouble(txtDiametro.getText());
				Variables.grosor1 = Double.parseDouble(txtGrosor.getText());
				Variables.resistencia1 = Integer.parseInt(txtResistencia.getText());
				break;
			case 2:
				//actualizando variables globales
				Variables.modelo2 = txtModelo.getText();
				Variables.tipo2 = cboTipo.getSelectedIndex();
				Variables.precio2 = Double.parseDouble(txtPrecio.getText());
				Variables.diametro2 = Double.parseDouble(txtDiametro.getText());
				Variables.grosor2 = Double.parseDouble(txtGrosor.getText());
				Variables.resistencia2 = Integer.parseInt(txtResistencia.getText());
				break;
			case 3:
				//actualizando variables globales
				Variables.modelo3 = txtModelo.getText();
				Variables.tipo3 = cboTipo.getSelectedIndex();
				Variables.precio3 = Double.parseDouble(txtPrecio.getText());
				Variables.diametro3 = Double.parseDouble(txtDiametro.getText());
				Variables.grosor3 = Double.parseDouble(txtGrosor.getText());
				Variables.resistencia3 = Integer.parseInt(txtResistencia.getText());
				break;
	
			default:
				Variables.modelo4 = txtModelo.getText();
				Variables.tipo4 = cboTipo.getSelectedIndex();
				Variables.precio4 = Double.parseDouble(txtPrecio.getText());
				Variables.diametro4 = Double.parseDouble(txtDiametro.getText());
				Variables.grosor4 = Double.parseDouble(txtGrosor.getText());
				Variables.resistencia4 = Integer.parseInt(txtResistencia.getText());
				break;
		}
		dispose();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
