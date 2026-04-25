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
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JComboBox cboModelo;
	private JButton btnGuardar;
	private JButton btnCerrar;

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
		setBounds(100, 100, 450, 199);
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
			JLabel lblNewLabel_1 = new JLabel("Precio");
			lblNewLabel_1.setBounds(10, 50, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Modelo");
			lblNewLabel_2.setBounds(10, 75, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Diametro");
			lblNewLabel_3.setBounds(10, 100, 60, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Resistencia");
			lblNewLabel_4.setBounds(10, 125, 72, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			cboModelo = new JComboBox();
			cboModelo.setModel(new DefaultComboBoxModel(new String[] {"Casio", "Seiko", "Hamilton", "Orient", "Tissot"}));
			cboModelo.addActionListener(this);
			cboModelo.setBounds(80, 21, 138, 22);
			contentPanel.add(cboModelo);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(80, 47, 138, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtAncho = new JTextField();
			txtAncho.setBounds(80, 72, 138, 20);
			contentPanel.add(txtAncho);
			txtAncho.setColumns(10);
		}
		{
			txtAlto = new JTextField();
			txtAlto.setBounds(80, 97, 138, 20);
			contentPanel.add(txtAlto);
			txtAlto.setColumns(10);
		}
		{
			txtFondo = new JTextField();
			txtFondo.setBounds(80, 122, 138, 20);
			contentPanel.add(txtFondo);
			txtFondo.setColumns(10);
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
		
		txtPrecio.setText(String.valueOf(Variables.precio0));
		txtAncho.setText(String.valueOf(Variables.modelo0));
		txtAlto.setText(String.valueOf(Variables.diametro0));
		txtFondo.setText(String.valueOf(Variables.resistencia0));
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == cboModelo) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		//variable
		int pos;
		pos = cboModelo.getSelectedIndex();
		switch(pos) {
			case 0://modelo 1 pos 0
				txtPrecio.setText(String.valueOf(Variables.precio0));
				txtAncho.setText(String.valueOf(Variables.modelo0));
				txtAlto.setText(String.valueOf(Variables.diametro0));
				txtFondo.setText(String.valueOf(Variables.resistencia0));
				break;
			case 1://modelo 2 pos 1
				txtPrecio.setText(String.valueOf(Variables.precio1));
				txtAncho.setText(String.valueOf(Variables.modelo1));
				txtAlto.setText(String.valueOf(Variables.diametro1));
				txtFondo.setText(String.valueOf(Variables.resistencia1));
				break;
			case 2://modelo 3 pos 2
				txtPrecio.setText(String.valueOf(Variables.precio2));
				txtAncho.setText(String.valueOf(Variables.modelo2));
				txtAlto.setText(String.valueOf(Variables.diametro2));
				txtFondo.setText(String.valueOf(Variables.resistencia2));
				break;
			case 3://modelo 4 pos 3
				txtPrecio.setText(String.valueOf(Variables.precio3));
				txtAncho.setText(String.valueOf(Variables.modelo3));
				txtAlto.setText(String.valueOf(Variables.diametro3));
				txtFondo.setText(String.valueOf(Variables.resistencia3));
				break;
			default://modelo 4 pos 3
				txtPrecio.setText(String.valueOf(Variables.precio4));
				txtAncho.setText(String.valueOf(Variables.modelo4));
				txtAlto.setText(String.valueOf(Variables.diametro4));
				txtFondo.setText(String.valueOf(Variables.resistencia4));
				break;
		
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		//obtener posicion del elemento seleccionado
		int marca;
		marca = cboModelo.getSelectedIndex();
		switch (marca) {
			case 0:
				//actualizando variables globales
				Variables.precio0 = Double.parseDouble(txtPrecio.getText());
				Variables.modelo0 = txtAncho.getText();
				Variables.diametro0 = Double.parseDouble(txtAlto.getText());
				Variables.resistencia0 = Integer.parseInt(txtFondo.getText());
				break;
			case 1:
				//actualizando variables globales
				Variables.precio1 = Double.parseDouble(txtPrecio.getText());
				Variables.modelo1 = txtAncho.getText();
				Variables.diametro1 = Double.parseDouble(txtAlto.getText());
				Variables.resistencia1 = Integer.parseInt(txtFondo.getText());
				break;
			case 2:
				//actualizando variables globales
				Variables.precio2 = Double.parseDouble(txtPrecio.getText());
				Variables.modelo2 = txtAncho.getText();
				Variables.diametro2 = Double.parseDouble(txtAlto.getText());
				Variables.resistencia2 = Integer.parseInt(txtFondo.getText());
				break;
			case 3:
				//actualizando variables globales
				Variables.precio3 = Double.parseDouble(txtPrecio.getText());
				Variables.modelo3 = txtAncho.getText();
				Variables.diametro3 = Double.parseDouble(txtAlto.getText());
				Variables.resistencia3 = Integer.parseInt(txtFondo.getText());
				break;
	
			default:
				Variables.precio4 = Double.parseDouble(txtPrecio.getText());
				Variables.modelo4 = txtAncho.getText();
				Variables.diametro4 = Double.parseDouble(txtAlto.getText());
				Variables.resistencia4 = Integer.parseInt(txtFondo.getText());
				break;
		}
		dispose();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
