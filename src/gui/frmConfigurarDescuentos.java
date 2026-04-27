package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Variables;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConfigurarDescuentos extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JButton btnAceptar;
	private JTextField txtPorcentaje4;
	private JButton btnCancelar;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmConfigurarDescuentos dialog = new frmConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmConfigurarDescuentos() {
		setModal(true);
		setTitle("Configuración de descuentos");
		setBounds(100, 100, 494, 202);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("1 a 5 unidades");
			lblNewLabel.setBounds(10, 36, 111, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			txtPorcentaje1 = new JTextField();
			txtPorcentaje1.setBounds(131, 33, 161, 20);
			contentPanel.add(txtPorcentaje1);
			txtPorcentaje1.setColumns(10);
		}
		{
			txtPorcentaje2 = new JTextField();
			txtPorcentaje2.setBounds(131, 64, 161, 20);
			contentPanel.add(txtPorcentaje2);
			txtPorcentaje2.setColumns(10);
		}
		{
			txtPorcentaje3 = new JTextField();
			txtPorcentaje3.setBounds(131, 95, 161, 20);
			contentPanel.add(txtPorcentaje3);
			txtPorcentaje3.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("6 a 10 unidades");
			lblNewLabel_1.setBounds(10, 67, 111, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("11 a 15 unidades");
			lblNewLabel_2.setBounds(10, 98, 111, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(377, 32, 89, 23);
			contentPanel.add(btnAceptar);
		}
		{
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(377, 63, 89, 23);
			contentPanel.add(btnCancelar);
		}
		{
			txtPorcentaje4 = new JTextField();
			txtPorcentaje4.setBounds(131, 126, 161, 20);
			contentPanel.add(txtPorcentaje4);
			txtPorcentaje4.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Más de 15 unidades");
			lblNewLabel_3.setBounds(10, 129, 111, 14);
			contentPanel.add(lblNewLabel_3);
		}
		//Inicializacion
		txtPorcentaje1.setText(String.valueOf(Variables.porcentaje1));
		txtPorcentaje2.setText(String.valueOf(Variables.porcentaje2));
		txtPorcentaje3.setText(String.valueOf(Variables.porcentaje3));
		txtPorcentaje4.setText(String.valueOf(Variables.porcentaje4));
		{
			lblNewLabel_4 = new JLabel("%");
			lblNewLabel_4.setBounds(302, 36, 46, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("%");
			lblNewLabel_5.setBounds(302, 67, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("%");
			lblNewLabel_6.setBounds(302, 98, 46, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			lblNewLabel_7 = new JLabel("%");
			lblNewLabel_7.setBounds(302, 129, 46, 14);
			contentPanel.add(lblNewLabel_7);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		Variables.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());
		Variables.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());
		Variables.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
		Variables.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
