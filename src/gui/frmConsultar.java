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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConsultar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtModelo;
	private JTextField txtDiametro;
	private JTextField txtTipo;
	private JComboBox cboMarca;
	private JTextField txtPrecio;
	private JButton btnCerrar;
	private JTextField txtGrosor;
	private JTextField txtResistencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmConsultar dialog = new frmConsultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmConsultar() {
		setTitle("Consultar");
		setModal(true);
		setBounds(100, 100, 449, 284);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(10, 24, 95, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(10, 117, 82, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		lblNewLabel_2.setBounds(10, 55, 82, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Diametro (mm)");
		lblNewLabel_3.setBounds(10, 148, 95, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo");
		lblNewLabel_4.setBounds(10, 86, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 20, 89, 23);
		contentPanel.add(btnCerrar);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Casio", "Seiko", "Hamilton", "Orient", "Tissot"}));
		cboMarca.setBounds(115, 20, 155, 22);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(115, 114, 155, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setEditable(false);
		txtModelo.setBounds(115, 52, 155, 20);
		contentPanel.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtDiametro = new JTextField();
		txtDiametro.setEditable(false);
		txtDiametro.setBounds(115, 145, 155, 20);
		contentPanel.add(txtDiametro);
		txtDiametro.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setEditable(false);
		txtTipo.setBounds(115, 83, 155, 20);
		contentPanel.add(txtTipo);
		txtTipo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Grosor (mm)");
		lblNewLabel_5.setBounds(10, 179, 82, 14);
		contentPanel.add(lblNewLabel_5);
		
		txtGrosor = new JTextField();
		txtGrosor.setEditable(false);
		txtGrosor.setBounds(115, 176, 155, 20);
		contentPanel.add(txtGrosor);
		txtGrosor.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Res. al Agua (m)");
		lblNewLabel_6.setBounds(10, 210, 95, 14);
		contentPanel.add(lblNewLabel_6);
		
		txtResistencia = new JTextField();
		txtResistencia.setEditable(false);
		txtResistencia.setBounds(115, 207, 155, 20);
		contentPanel.add(txtResistencia);
		txtResistencia.setColumns(10);
		
		//variables inciales
		txtModelo.setText(String.valueOf(Variables.modelo0));
		txtTipo.setText(String.valueOf(Variables.tipo0));
		txtPrecio.setText(String.valueOf(Variables.precio0));
		txtDiametro.setText(String.valueOf(Variables.diametro0));
		txtGrosor.setText(String.valueOf(Variables.grosor0));
		txtResistencia.setText(String.valueOf(Variables.resistencia0));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboMarca) {
			actionPerformedCboModelo(e);
		}
	}
	protected void actionPerformedCboModelo(ActionEvent e) {
		//variable
		int pos;
		pos = cboMarca.getSelectedIndex();
		switch(pos) {
			case 0://marca 1 pos 0
				txtModelo.setText(String.valueOf(Variables.modelo0));
				txtTipo.setText(String.valueOf(Variables.tipo0));
				txtPrecio.setText(String.valueOf(Variables.precio0));
				txtDiametro.setText(String.valueOf(Variables.diametro0));
				txtGrosor.setText(String.valueOf(Variables.grosor0));
				txtResistencia.setText(String.valueOf(Variables.resistencia0));
				break;
			case 1://marca 2 pos 1
				txtModelo.setText(String.valueOf(Variables.modelo1));
				txtTipo.setText(String.valueOf(Variables.tipo1));
				txtPrecio.setText(String.valueOf(Variables.precio1));
				txtDiametro.setText(String.valueOf(Variables.diametro1));
				txtGrosor.setText(String.valueOf(Variables.grosor1));
				txtResistencia.setText(String.valueOf(Variables.resistencia1));
				break;
			case 2://marca 3 pos 2
				txtModelo.setText(String.valueOf(Variables.modelo2));
				txtTipo.setText(String.valueOf(Variables.tipo2));
				txtPrecio.setText(String.valueOf(Variables.precio2));
				txtDiametro.setText(String.valueOf(Variables.diametro2));
				txtGrosor.setText(String.valueOf(Variables.grosor2));
				txtResistencia.setText(String.valueOf(Variables.resistencia2));
				break;
			case 3://marca 4 pos 3
				txtModelo.setText(String.valueOf(Variables.modelo3));
				txtTipo.setText(String.valueOf(Variables.tipo3));
				txtPrecio.setText(String.valueOf(Variables.precio3));
				txtDiametro.setText(String.valueOf(Variables.diametro3));
				txtGrosor.setText(String.valueOf(Variables.grosor3));
				txtResistencia.setText(String.valueOf(Variables.resistencia3));
				break;
			default://marca 4 pos 3
				txtModelo.setText(String.valueOf(Variables.modelo4));
				txtTipo.setText(String.valueOf(Variables.tipo4));
				txtPrecio.setText(String.valueOf(Variables.precio4));
				txtDiametro.setText(String.valueOf(Variables.diametro4));
				txtGrosor.setText(String.valueOf(Variables.grosor4));
				txtResistencia.setText(String.valueOf(Variables.resistencia4));
				break;
		}
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
