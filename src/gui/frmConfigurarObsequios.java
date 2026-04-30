package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Validaciones;
import clases.Variables;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmConfigurarObsequios extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtObsequio1;
	private JTextField txtObsequio2;
	private JTextField txtObsequio3;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblErrorObs1;
	private JLabel lblErrorObs2;
	private JLabel lblErrorObs3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmConfigurarObsequios dialog = new frmConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmConfigurarObsequios() {
		setModal(true);
		setTitle("Configurar Obsequios");
		setBounds(100, 100, 488, 207);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("1 unidad");
			lblNewLabel.setBounds(10, 31, 94, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("2 a 5 unidades");
			lblNewLabel_1.setBounds(10, 77, 111, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("6 a más unidades");
			lblNewLabel_2.setBounds(10, 121, 111, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtObsequio1 = new JTextField();
			txtObsequio1.setBounds(131, 28, 192, 20);
			contentPanel.add(txtObsequio1);
			txtObsequio1.setColumns(10);
		}
		{
			txtObsequio2 = new JTextField();
			txtObsequio2.setBounds(131, 74, 192, 20);
			contentPanel.add(txtObsequio2);
			txtObsequio2.setColumns(10);
		}
		{
			txtObsequio3 = new JTextField();
			txtObsequio3.setBounds(131, 118, 192, 20);
			contentPanel.add(txtObsequio3);
			txtObsequio3.setColumns(10);
		}
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(373, 27, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(373, 61, 89, 23);
		contentPanel.add(btnCancelar);
		
		{
			lblErrorObs1 = new JLabel("");
			lblErrorObs1.setVisible(false);
			lblErrorObs1.setBounds(131, 49, 192, 14);
			contentPanel.add(lblErrorObs1);
		}
		{
			lblErrorObs2 = new JLabel("");
			lblErrorObs2.setVisible(false);
			lblErrorObs2.setBounds(131, 93, 192, 14);
			contentPanel.add(lblErrorObs2);
		}
		{
			lblErrorObs3 = new JLabel("");
			lblErrorObs3.setVisible(false);
			lblErrorObs3.setBounds(131, 139, 192, 14);
			contentPanel.add(lblErrorObs3);
		}
		
		//Inicializacion
		txtObsequio1.setText(String.valueOf(Variables.obsequio1));
		txtObsequio2.setText(String.valueOf(Variables.obsequio2));
		txtObsequio3.setText(String.valueOf(Variables.obsequio3));
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
	    // Validación
	    boolean obs1Ok	= Validaciones.validarCampoTexto(txtObsequio1, lblErrorObs1, 30);
		boolean obs2Ok	= Validaciones.validarCampoTexto(txtObsequio2, lblErrorObs2, 30);
		boolean obs3Ok	= Validaciones.validarCampoTexto(txtObsequio3, lblErrorObs3, 30);
	    if (!obs1Ok|!obs2Ok|!obs3Ok ) {
	        return;
	    }
	    
		Variables.obsequio1 = txtObsequio1.getText();
		Variables.obsequio2 = txtObsequio2.getText();
		Variables.obsequio3 = txtObsequio3.getText();
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
}
