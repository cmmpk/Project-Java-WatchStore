package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import clases.Variables;

import javax.swing.JLabel;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAvance extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton btnAceptar;
	private JLabel lblIconoInformacion;
	private JLabel lblImporteTotal;
	private JLabel lblPorcentajeCuota;
	private JLabel lblBase;
	private JLabel lblVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmAvance dialog = new frmAvance(0,0);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmAvance(int cVentas, double aIPVentas) {
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Avance de Ventas");
		setBounds(100, 100, 395, 182);
		getContentPane().setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(140, 95, 89, 23);
		getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel_1 = new JLabel("Importe total generado : S/.");
		lblNewLabel_1.setBounds(74, 40, 155, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Porcentaje de la cuota diaria :");
		lblNewLabel_2.setBounds(74, 57, 169, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblIconoInformacion = new JLabel("");
		lblIconoInformacion.setBounds(26, 26, 38, 37);
		getContentPane().add(lblIconoInformacion);
		
		lblIconoInformacion.setIcon(UIManager.getIcon("OptionPane.informationIcon"));
		
		lblImporteTotal = new JLabel("");
		lblImporteTotal.setBounds(235, 40, 134, 14);
		getContentPane().add(lblImporteTotal);
		
		lblPorcentajeCuota = new JLabel("");
		lblPorcentajeCuota.setBounds(242, 57, 127, 14);
		getContentPane().add(lblPorcentajeCuota);
		
		lblBase = new JLabel("Venta Nro. ");
		lblBase.setBounds(74, 26, 76, 14);
		getContentPane().add(lblBase);
		
		lblVentas = new JLabel("");
		lblVentas.setBounds(136, 26, 46, 14);
		getContentPane().add(lblVentas);
		
		lblVentas.setText(String.valueOf(cVentas));
		lblImporteTotal.setText(String.format("%.2f%%", aIPVentas)); //con formateo a 2 decimales
		lblPorcentajeCuota.setText(String.format("%.2f%%", getPorcentaje(aIPVentas))); //con formateo a 2 decimales
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		dispose();
	}
	
	double getPorcentaje(double ip) {
		return (ip/Variables.cuotaDiaria)*100;
	}
}
