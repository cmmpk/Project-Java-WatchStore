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
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmVender extends JDialog implements ActionListener {
	//Variables globales
	//Acumuladores
	double aIPVentas;
	//Contadores
	//Variable para contar la cantidad de veces de una venta
	int cVentas;
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender;
	private JButton btnCerrar;
	private JTextArea txtS;
	private JComboBox cboMarca;
	private JLabel lblErrorCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			frmVender dialog = new frmVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public frmVender() {
		setModal(true);
		setTitle("Vender");
		setBounds(100, 100, 539, 503);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Marca");
			lblNewLabel.setBounds(10, 24, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
			lblNewLabel_1.setBounds(10, 56, 65, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Cantidad");
			lblNewLabel_2.setBounds(10, 87, 65, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setEditable(false);
			txtPrecio.setBounds(85, 53, 141, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setBounds(85, 84, 141, 20);
			contentPanel.add(txtCantidad);
			txtCantidad.setColumns(10);
		}
		{
			btnVender = new JButton("Vender");
			btnVender.addActionListener(this);
			btnVender.setBounds(425, 20, 89, 23);
			contentPanel.add(btnVender);
		}
		{
			btnCerrar = new JButton("Cerrrar");
			btnCerrar.addActionListener(this);
			btnCerrar.setBounds(425, 52, 89, 23);
			contentPanel.add(btnCerrar);
		}

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 124, 503, 312);
		contentPanel.add(scrollPane);

		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);

		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] { "Casio", "Seiko", "Hamilton", "Orient", "Tissot" }));
		cboMarca.setBounds(85, 20, 141, 22);
		contentPanel.add(cboMarca);
		
		//Inicializaciones
		txtPrecio.setText(String.valueOf(Variables.precio0));
		{
			lblErrorCantidad = new JLabel("");
			lblErrorCantidad.setVisible(false);
			lblErrorCantidad.setBounds(236, 87, 187, 14);
			contentPanel.add(lblErrorCantidad);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVender) {
			actionPerformedBtnVender(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource() == cboMarca) {
			actionPerformedCboMarca(e);
		}
	}

	protected void actionPerformedCboMarca(ActionEvent e) {
		int pos;
		pos = cboMarca.getSelectedIndex();
		switch (pos) {
			case 0:
				txtPrecio.setText(String.valueOf(Variables.precio0));
				break;
			case 1:
				txtPrecio.setText(String.valueOf(Variables.precio1));
				break;
			case 2:
				txtPrecio.setText(String.valueOf(Variables.precio2));
				break;
			case 3:
				txtPrecio.setText(String.valueOf(Variables.precio3));
				break;
			default:
				txtPrecio.setText(String.valueOf(Variables.precio4));
				break;
		}
		txtCantidad.setText("");
		txtCantidad.requestFocus();
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	protected void actionPerformedBtnVender(ActionEvent e) {
		// Validación
	    boolean cantidadOk	= Validaciones.validarCampoDecimal(txtCantidad,lblErrorCantidad);
	    if (!cantidadOk ) {
	        return;
	    }
	    
		int marca, can;
		double precio,ic,id,ip;
		String obs;
		//entradas
		marca = getMarca();
		can = getCantidad();
		precio = getPrecio();
		//procesos
		ic = getImporteCompra(can, precio);
		id = getImporteDescuento(can, precio);
		ip = ic-id;
		obs = getObsequio(can);
		efectuarIncrementos(ip);
		//salida
		mostrarResultados(can, precio, ic,id, ip, marca,obs);
		mostrarResumen();
	}
	
	//Metodos con retorno
	int getMarca() {
		return cboMarca.getSelectedIndex();
	}
	int getCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}
	double getPrecio() {
		return Double.parseDouble(txtPrecio.getText());
	}

	double getImporteCompra(int can, double precio){
		double ip;
		ip = can*precio;
		return ip;
	}
	
	double getImporteDescuento(int can, double ic){
		double id;
		if(can>=1 && can <=5) 
			id = ic * (Variables.porcentaje1 * 0.01);
		else if(can>=6 && can <=10)
			id = ic * (Variables.porcentaje2* 0.01);
		else if(can>=11 && can<=15) 
			id = ic * (Variables.porcentaje3* 0.01);
		else 
			id = ic * (Variables.porcentaje4* 0.01);

		return id;
	}
	String getObsequio(int can) {
		String obs;
		if(can >= 1 && can <2)
			obs = Variables.obsequio1;
		else if(can>= 2 && can <=5) 
			obs = Variables.obsequio2;
		else
			obs = Variables.obsequio3;
		return obs;
	}
	
	String getMarca(int marca) {
		String sMarca;
		switch (marca) {
			case 0:
				sMarca = Variables.marca0;
				break;
			case 1:
				sMarca = Variables.marca1;
				break;
			case 2:
				sMarca = Variables.marca2;
				break;
			case 3:
				sMarca = Variables.marca3;
				break;
			default:
				sMarca = Variables.marca4;
				break;
		}
		return sMarca;
	}
	
	String getModelo(int marca) {
		String sModelo;
		switch (marca) {
			case 0:
				sModelo = Variables.modelo0;
				break;
			case 1:
				sModelo = Variables.modelo1;
				break;
			case 2:
				sModelo = Variables.modelo2;
				break;
			case 3:
				sModelo = Variables.modelo3;
				break;
			default:
				sModelo = Variables.modelo4;
				break;
		}
		return sModelo;
	}
	
	//Metodos sin retorno
	void efectuarIncrementos(double ip) {
		cVentas++;
		aIPVentas+=ip;
	}
	
	void mostrarResultados(int can, double precio, double ic, double id, double ip, int marca, String obs) {
		String sMarca = getMarca(marca);
		String sModelo = getModelo(marca);
		txtS.setText("BOLETA DE VENTA\n\n");
		txtS.append("Marca \t\t: "+sMarca+"\n");
		txtS.append("Modelo \t\t: "+sModelo+"\n");
		txtS.append("Precio \t\t: "+"S/. "+precio+"\n");
		txtS.append("Cantidad \t\t: "+can+"\n");
		txtS.append("Importe Compra \t: "+"S/. "+ic+"\n");
		txtS.append("Importe Descuento \t: "+"S/. "+id+"\n");
		txtS.append("Importe a Pagar \t: "+"S/. "+ip+"\n");
		txtS.append("Obsequio \t\t: "+obs+"\n\n");
	}
	
	void mostrarResumen() {
		if(cVentas % 5 == 0) {
			frmAvance frm= new frmAvance(cVentas, aIPVentas);
			frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frm.setVisible(true);
		}
	}
}
