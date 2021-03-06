package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;

	public FrmPrincipal() {
		this.setResizable(false);
		setTitle("EasyEvents");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 504, 561);
		crearComponentes();
		setVisible(true);

		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
	}

	private void crearComponentes() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnAnnadir = new JMenu("A\u00F1adir");
		mnAnnadir.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAnnadir.setForeground(new Color(0, 0, 0));
		menuBar.add(mnAnnadir);

		JMenuItem mntEvento = new JMenuItem("Evento");
		mntEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAnnadir.add(mntEvento);

		mntEvento.addActionListener(e -> {
			new DlgDescripcionEventos();
		});

		JMenuItem mntmPersonas = new JMenuItem("Personas");
		mntmPersonas.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAnnadir.add(mntmPersonas);

		mntEvento.addActionListener(e -> {
			new DlgDescripcionPersonas();
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Empresa");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAnnadir.add(mntmNewMenuItem);
		
		mntEvento.addActionListener(e -> {
			new DlgDescripcionEmpresa();
		});

		JSeparator separator = new JSeparator();
		mnAnnadir.add(separator);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mnAnnadir.add(mntmNewMenuItem_1);

		mntmNewMenuItem_1.addActionListener(e -> {
			System.exit(0);
		});

		JMenu mnListar = new JMenu("Listar");
		mnListar.setFont(new Font("Arial", Font.PLAIN, 12));
		mnListar.setForeground(new Color(0, 0, 0));
		menuBar.add(mnListar);

		JMenuItem mntmListarEventos = new JMenuItem("Eventos");
		mntmListarEventos.setFont(new Font("Arial", Font.PLAIN, 12));
		mnListar.add(mntmListarEventos);

		mntmListarEventos.addActionListener(e -> {
			new DlgDescripcionEventos();
			// new DlgListarEventos();
		});

		JMenuItem mntmListarUsuarios = new JMenuItem("Usuarios");
		mntmListarUsuarios.setFont(new Font("Arial", Font.PLAIN, 12));
		mnListar.add(mntmListarUsuarios);

		mntmListarUsuarios.addActionListener(e -> {
			new DlgDescripcionPersonas();
		});

		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mntmEmpresas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DlgDescripcionEmpresa();
			}
		});
		mntmEmpresas.setFont(new Font("Arial", Font.PLAIN, 12));
		mnListar.add(mntmEmpresas);

		JMenuItem mntmValoraciones = new JMenuItem("Valoraciones");
		mntmValoraciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DlgPersonaEvento();
			}
		});
		mnListar.add(mntmValoraciones);

		JMenu mnUsuario = new JMenu("Usuario");
		mnUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		mnUsuario.setForeground(new Color(0, 0, 0));
		menuBar.add(mnUsuario);

		JMenuItem mntmPerfil = new JMenuItem("Mi Perfil");
		mntmPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DlgPerfil();
			}
		});
		mntmPerfil.setFont(new Font("Arial", Font.PLAIN, 12));
		mnUsuario.add(mntmPerfil);

		JSeparator separator_1 = new JSeparator();
		mnUsuario.add(separator_1);

		JMenuItem mntmDesconectar = new JMenuItem("Desconectar");
		mntmDesconectar.setFont(new Font("Arial", Font.PLAIN, 12));
		mnUsuario.add(mntmDesconectar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblImgUser = new JLabel(new ImageIcon("img/users-icon.png"));
		lblImgUser.setBackground(new Color(255, 255, 255));
		lblImgUser.setBounds(37, 267, 97, 89);
		contentPane.add(lblImgUser);

		JLabel lblImgEmpresa = new JLabel(new ImageIcon("img/business-icon.png"));
		lblImgEmpresa.setBackground(new Color(255, 255, 255));
		lblImgEmpresa.setBounds(200, 267, 97, 89);
		contentPane.add(lblImgEmpresa);

		JLabel lblImgEvent = new JLabel(new ImageIcon("img/calendar-icon.png"));
		lblImgEvent.setBounds(349, 267, 97, 89);
		contentPane.add(lblImgEvent);

		JButton btnAddUser = new JButton("A\u00D1ADIR\r");
		btnAddUser.setForeground(new Color(255, 255, 255));
		btnAddUser.setBackground(new Color(65, 105, 225));
		btnAddUser.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddUser.setBounds(46, 394, 88, 32);
		contentPane.add(btnAddUser);

		btnAddUser.addActionListener(e -> {
			new DlgCreacionPersona();
		});

		JButton btnAddBusiness = new JButton("A\u00D1ADIR\r");
		btnAddBusiness.setForeground(new Color(255, 255, 255));
		btnAddBusiness.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddBusiness.setBackground(new Color(65, 105, 225));
		btnAddBusiness.setBounds(200, 394, 88, 32);
		contentPane.add(btnAddBusiness);

		btnAddBusiness.addActionListener(e -> {
			new DlgCreacionEmpresa();
		});

		JButton btnAddEvent = new JButton("A\u00D1ADIR\r");
		btnAddEvent.setForeground(new Color(255, 255, 255));
		btnAddEvent.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddEvent.setBackground(new Color(65, 105, 225));
		btnAddEvent.setBounds(349, 394, 88, 32);
		contentPane.add(btnAddEvent);

		JLabel lblTitulo = new JLabel("EasyEvents");
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 40));
		lblTitulo.setBounds(33, 35, 209, 59);
		contentPane.add(lblTitulo);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(37, 92, 409, 12);
		contentPane.add(separator_2);

		JLabel lblNewLabel = new JLabel(new ImageIcon("img/easyevents.png"));
		lblNewLabel.setBounds(349, 10, 97, 77);
		contentPane.add(lblNewLabel);

		btnAddEvent.addActionListener(e -> {
			new DlgCreacionEventos();
		});

	}
}
