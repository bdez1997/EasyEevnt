package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;


	public FrmPrincipal() {
		setTitle("EasyEvents");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);		
		crearComponentes();
		setVisible(true);
		
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
	}

	private void crearComponentes() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEditar = new JMenu("Editar");
		mnEditar.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEditar.setForeground(new Color(0, 0, 0));
		menuBar.add(mnEditar);
		
		JMenuItem mntEvento = new JMenuItem("Evento");
		mntEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEditar.add(mntEvento);
		
		JMenuItem mntmPersonas = new JMenuItem("Personas");
		mntmPersonas.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEditar.add(mntmPersonas);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Empresa");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEditar.add(mntmNewMenuItem);
		
		JSeparator separator = new JSeparator();
		mnEditar.add(separator);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 12));
		mnEditar.add(mntmNewMenuItem_1);
		
		JMenu mnMostrar = new JMenu("Mostrar");
		mnMostrar.setFont(new Font("Arial", Font.PLAIN, 12));
		mnMostrar.setForeground(new Color(0, 0, 0));
		menuBar.add(mnMostrar);
		
		JMenuItem mntmListarEventos = new JMenuItem("Eventos");
		mntmListarEventos.setFont(new Font("Arial", Font.PLAIN, 12));
		mnMostrar.add(mntmListarEventos);
		
		JMenuItem mntmListarUsuarios = new JMenuItem("Usuarios");
		mntmListarUsuarios.setFont(new Font("Arial", Font.PLAIN, 12));
		mnMostrar.add(mntmListarUsuarios);
		
		JMenuItem mntmEmpresas = new JMenuItem("Empresas");
		mntmEmpresas.setFont(new Font("Arial", Font.PLAIN, 12));
		mnMostrar.add(mntmEmpresas);
		
		JMenu mnUsuario = new JMenu("Usuario");
		mnUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		mnUsuario.setForeground(new Color(0, 0, 0));
		menuBar.add(mnUsuario);
		
		JMenuItem mntmPerfil = new JMenuItem("Mi Perfil");
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
		lblImgUser.setBounds(28, 38, 97, 89);
		contentPane.add(lblImgUser);
		
		JLabel lblImgEmpresa= new JLabel(new ImageIcon("img/business-icon.png"));
		lblImgEmpresa.setBounds(159, 38, 97, 89);
		contentPane.add(lblImgEmpresa);
		
		JLabel lblImgEvent= new JLabel(new ImageIcon("img/calendar-icon.png"));
		lblImgEvent.setBounds(286, 38, 97, 89);
		contentPane.add(lblImgEvent);
		
		JButton btnAddUser = new JButton("A\u00D1ADIR\r");
		btnAddUser.setForeground(new Color(0, 0, 0));
		btnAddUser.setBackground(new Color(135, 206, 250));
		btnAddUser.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddUser.setBounds(37, 150, 88, 32);
		contentPane.add(btnAddUser);
		
		btnAddUser.addActionListener(e -> {
			new DlgCreacionPersona();
		});
		
		JButton btnAddBusiness = new JButton("A\u00D1ADIR\r");
		btnAddBusiness.setForeground(Color.BLACK);
		btnAddBusiness.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddBusiness.setBackground(new Color(135, 206, 250));
		btnAddBusiness.setBounds(168, 150, 88, 32);
		contentPane.add(btnAddBusiness);
		
		btnAddBusiness.addActionListener(e -> {
			new DlgCreacionEmpresa();
		});
		
		JButton btnAddEvent = new JButton("A\u00D1ADIR\r");
		btnAddEvent.setForeground(Color.BLACK);
		btnAddEvent.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddEvent.setBackground(new Color(135, 206, 250));
		btnAddEvent.setBounds(295, 150, 88, 32);
		contentPane.add(btnAddEvent);
		
		btnAddEvent.addActionListener(e -> {
			new DlgCreacionEventos();
		});
		
	}
}
