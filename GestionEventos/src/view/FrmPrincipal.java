package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;


	public FrmPrincipal() {
		setTitle("EasyEvents");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		crearComponentes();
		setVisible(true);
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
		
	}
}
