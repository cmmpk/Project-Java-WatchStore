package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmVender;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmAcercaDeTienda;
	private JMenuItem mntmListar;
	private JMenuItem mntmSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmMenu() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Tienda v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnNewMenu.add(mntmSalir);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mntmConsultar = new JMenuItem("Consultar Relojes");
		mntmConsultar.addActionListener(this);
		mnNewMenu_1.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar Relojes");
		mntmModificar.addActionListener(this);
		mnNewMenu_1.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar Relojes");
		mntmListar.addActionListener(this);
		mnNewMenu_1.add(mntmListar);
		
		JMenu mnNewMenu_2 = new JMenu("Venta");
		menuBar.add(mnNewMenu_2);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnNewMenu_2.add(mntmVender);
		
		JMenu mnNewMenu_3 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_3);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnNewMenu_3.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnNewMenu_3.add(mntmConfigurarObsequios);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		mntmAcercaDeTienda = new JMenuItem("Acerca de Tienda");
		mntmAcercaDeTienda.addActionListener(this);
		mnNewMenu_4.add(mntmAcercaDeTienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmVender) {
			actionPerformedMntmVender(e);
		}
		if (e.getSource() == mntmSalir) {
			actionPerformedMntmSalir(e);
		}
		if (e.getSource() == mntmAcercaDeTienda) {
			actionPerformedMntmAcercaDeTienda(e);
		}
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
		if (e.getSource() == mntmConfigurarObsequios) {
			actionPerformedMntmConfigurarObsequios(e);
		}
		if (e.getSource() == mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(e);
		}
	}
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		frmConsultar frm= new frmConsultar();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		frmModificar frm= new frmModificar();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		//listar productos en formulario
		frmListar frm= new frmListar();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarObsequios(ActionEvent e) {
		frmConfigurarObsequios frm= new frmConfigurarObsequios();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent e) {
		frmConfigurarDescuentos frm= new frmConfigurarDescuentos();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmAcercaDeTienda(ActionEvent e) {
		frmAcercaDeTienda frm= new frmAcercaDeTienda();
		frm.setVisible(true);
	}
	protected void actionPerformedMntmSalir(ActionEvent e) {
		System.exit(0);
	}
	protected void actionPerformedMntmVender(ActionEvent e) {
		frmVender frm= new frmVender();
		frm.setVisible(true);
	}
}
