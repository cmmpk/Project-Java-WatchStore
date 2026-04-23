package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Variables;

import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmListar extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextArea txtS;
	private JButton btnListar;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmListar dialog = new frmListar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmListar() {
		setModal(true);
		setTitle("Listado de Productos");
		setBounds(100, 100, 475, 503);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 439, 381);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(128, 416, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(254, 416, 89, 23);
		contentPanel.add(btnListar);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("LISTADO DE PRODUCTOS\n\n");
		txtS.append("Modelo \t: "+Variables.modelo0+"\n");
		txtS.append("Precio \t: "+Variables.precio0+"\n");
		txtS.append("Profundidad \t: "+Variables.fondo0+"\n");
		txtS.append("Ancho \t: "+Variables.ancho0+"\n");
		txtS.append("Alto \t: "+Variables.alto0+"\n\n");
		
		txtS.append("Modelo \t: "+Variables.modelo1+"\n");
		txtS.append("Precio \t: "+Variables.precio1+"\n");
		txtS.append("Profundidad \t: "+Variables.fondo1+"\n");
		txtS.append("Ancho \t: "+Variables.ancho1+"\n");
		txtS.append("Alto \t: "+Variables.alto1+"\n\n");
		
		txtS.append("Modelo \t: "+Variables.modelo2+"\n");
		txtS.append("Precio \t: "+Variables.precio2+"\n");
		txtS.append("Profundidad \t: "+Variables.fondo2+"\n");
		txtS.append("Ancho \t: "+Variables.ancho2+"\n");
		txtS.append("Alto \t: "+Variables.alto2+"\n\n");
		
		txtS.append("Modelo \t: "+Variables.modelo3+"\n");
		txtS.append("Precio \t: "+Variables.precio3+"\n");
		txtS.append("Profundidad \t: "+Variables.fondo3+"\n");
		txtS.append("Ancho \t: "+Variables.ancho3+"\n");
		txtS.append("Alto \t: "+Variables.alto3+"\n\n");
		
		txtS.append("Modelo \t: "+Variables.modelo4+"\n");
		txtS.append("Precio \t: "+Variables.precio4+"\n");
		txtS.append("Profundidad \t: "+Variables.fondo4+"\n");
		txtS.append("Ancho \t: "+Variables.ancho4+"\n");
		txtS.append("Alto \t: "+Variables.alto4+"\n\n");
	}
}
