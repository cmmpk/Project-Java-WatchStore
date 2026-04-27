package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmAcercaDeTienda extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmAcercaDeTienda dialog = new frmAcercaDeTienda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmAcercaDeTienda() {
		setModal(true);
		setTitle("Acera de Tienda");
		setBounds(100, 100, 452, 348);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 77, 414, 26);
		contentPanel.add(separator);
		
		JLabel lblNewLabel = new JLabel("Tienda 1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(138, 33, 162, 33);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1_4 = new JLabel("Christian Manuel Mozo Pizarro");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(105, 125, 239, 14);
		contentPanel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Autores");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(175, 89, 84, 14);
		contentPanel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Johnny Jhoel Vasquez Cruz");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(117, 150, 239, 14);
		contentPanel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Juan Pablo Navarrete");
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1_1.setBounds(144, 175, 239, 14);
		contentPanel.add(lblNewLabel_1_4_1_1);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Mario Angel Castillo Concha");
		lblNewLabel_1_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_1.setBounds(117, 200, 239, 14);
		contentPanel.add(lblNewLabel_1_4_1_1_1);
		
		JLabel lblNewLabel_1_4_1_1_1_1 = new JLabel("Percy Holguin Pauro");
		lblNewLabel_1_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_1_1.setBounds(144, 225, 239, 14);
		contentPanel.add(lblNewLabel_1_4_1_1_1_1);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(175, 273, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
}
