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
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmListar;
	private JMenuItem mntmNewMenuItem;

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
		
		JMenu mnNewMenu = new JMenu("Archivos");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mantenimiento");
		menuBar.add(mnNewMenu_1);
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(this);
		mnNewMenu_1.add(mntmConsultar);
		
		mntmModificar = new JMenuItem("Modificar");
		mntmModificar.addActionListener(this);
		mnNewMenu_1.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(this);
		mnNewMenu_1.add(mntmListar);
		
		JMenu mnNewMenu_2 = new JMenu("Venta");
		menuBar.add(mnNewMenu_2);
		
		mntmNewMenuItem_1 = new JMenuItem("Vender");
		mnNewMenu_2.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_3 = new JMenu("Configuracion");
		menuBar.add(mnNewMenu_3);
		
		mntmNewMenuItem_2 = new JMenuItem("Configurar Descuentos");
		mnNewMenu_3.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Configurar Obsequios");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_4 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_4);
		
		mntmNewMenuItem_4 = new JMenuItem("Acerca de Tienda");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mntmListar) {
			actionPerformedMntmListar(e);
		}
		if (e.getSource() == mntmModificar) {
			actionPerformedMntmModificar(e);
		}
		if (e.getSource() == mntmConsultar) {
			actionPerformedMntmConsultar(e);
		}
	}
	protected void actionPerformedMntmConsultar(ActionEvent e) {
		//crear objeto (variable) del formulario frmConsultar
		frmConsultar frm= new frmConsultar();
		//mostrar objeto(variable) frm
		frm.setVisible(true);
	}
	protected void actionPerformedMntmModificar(ActionEvent e) {
		//crear objeto (variable) del formulario frmConsultar
		frmModificar frm= new frmModificar();
		//mostrar objeto(variable) frm
		frm.setVisible(true);
	}
	protected void actionPerformedMntmListar(ActionEvent e) {
		//listar productos en formulario
		frmListar frm= new frmListar();
		frm.setVisible(true);
	}
}
