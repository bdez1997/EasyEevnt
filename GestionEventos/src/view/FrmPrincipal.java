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

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;


	public FrmPrincipal() {
		setTitle("WELCOME");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);		
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("A\u00F1adir");
		mnNewMenu.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntEvento = new JMenuItem("Evento");
		mnNewMenu.add(mntEvento);
		
		JMenuItem mntmPersonas = new JMenuItem("Personas");
		mnNewMenu.add(mntmPersonas);
		
		JMenu mnMostrar = new JMenu("Mostrar");
		mnMostrar.setForeground(new Color(0, 0, 0));
		menuBar.add(mnMostrar);
		
		JMenuItem mntmEventoMostrar = new JMenuItem("Evento");
		mnMostrar.add(mntmEventoMostrar);
		
		JMenuItem mntmPersonasMostrar = new JMenuItem("Mostrar");
		mnMostrar.add(mntmPersonasMostrar);
		
		JMenu mnUsuario = new JMenu("Usuario");
		mnUsuario.setForeground(new Color(0, 0, 0));
		menuBar.add(mnUsuario);
		
		JMenuItem mntmPerfil = new JMenuItem("Mi Perfil");
		mnUsuario.add(mntmPerfil);
		
		JMenuItem mntmDesconectar = new JMenuItem("Desconectar");
		mnUsuario.add(mntmDesconectar);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("EasyEvent");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
	}

}
