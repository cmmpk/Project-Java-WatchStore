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
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JComboBox cboModelo;
	private JTextField txtPrecio;
	private JButton btnCerrar;

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
		setBounds(100, 100, 450, 229);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 24, 46, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(10, 56, 46, 14);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ancho");
		lblNewLabel_2.setBounds(10, 87, 46, 14);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alto");
		lblNewLabel_3.setBounds(10, 118, 46, 14);
		contentPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fondo");
		lblNewLabel_4.setBounds(10, 153, 46, 14);
		contentPanel.add(lblNewLabel_4);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 20, 89, 23);
		contentPanel.add(btnCerrar);
		
		cboModelo = new JComboBox();
		cboModelo.addActionListener(this);
		cboModelo.setModel(new DefaultComboBoxModel(new String[] {"LG LTCS20020W", "Samsung RB195ACRS", "Whirlpool WRT318FZDM", "Bosch B36BT930NS", "LG LSXS26366S"}));
		cboModelo.setBounds(80, 20, 155, 22);
		contentPanel.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(80, 53, 155, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(80, 84, 155, 20);
		contentPanel.add(txtAncho);
		txtAncho.setColumns(10);
		
		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(80, 115, 155, 20);
		contentPanel.add(txtAlto);
		txtAlto.setColumns(10);
		
		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(80, 150, 155, 20);
		contentPanel.add(txtFondo);
		txtFondo.setColumns(10);
		
		//variables inciales para el cboModelo
		txtPrecio.setText(String.valueOf(Variables.precio0));
		txtAncho.setText(String.valueOf(Variables.ancho0));
		txtAlto.setText(String.valueOf(Variables.alto0));
		txtFondo.setText(String.valueOf(Variables.fondo0));
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
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
				txtAncho.setText(String.valueOf(Variables.ancho0));
				txtAlto.setText(String.valueOf(Variables.alto0));
				txtFondo.setText(String.valueOf(Variables.fondo0));
				break;
			case 1://modelo 2 pos 1
				txtPrecio.setText(String.valueOf(Variables.precio1));
				txtAncho.setText(String.valueOf(Variables.ancho1));
				txtAlto.setText(String.valueOf(Variables.alto1));
				txtFondo.setText(String.valueOf(Variables.fondo1));
				break;
			case 2://modelo 3 pos 2
				txtPrecio.setText(String.valueOf(Variables.precio2));
				txtAncho.setText(String.valueOf(Variables.ancho2));
				txtAlto.setText(String.valueOf(Variables.alto2));
				txtFondo.setText(String.valueOf(Variables.fondo2));
				break;
			case 3://modelo 4 pos 3
				txtPrecio.setText(String.valueOf(Variables.precio3));
				txtAncho.setText(String.valueOf(Variables.ancho3));
				txtAlto.setText(String.valueOf(Variables.alto3));
				txtFondo.setText(String.valueOf(Variables.fondo3));
				break;
			default://modelo 4 pos 3
				txtPrecio.setText(String.valueOf(Variables.precio4));
				txtAncho.setText(String.valueOf(Variables.ancho4));
				txtAlto.setText(String.valueOf(Variables.alto4));
				txtFondo.setText(String.valueOf(Variables.fondo4));
				break;
		
		}
		
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
