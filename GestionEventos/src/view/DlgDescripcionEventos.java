package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import java.awt.Color;

public class DlgDescripcionEventos extends JDialog {

	private JPanel contentPane;
	private JButton btnAnnadirUsuario;
	private JList lstUsuario;
	
	
	public DlgDescripcionEventos() {
		setBackground(new Color(230, 230, 250));
		
		setBounds (500,200,300,200);
		setTitle("Doble");
		getContentPane().setLayout(null);
		
		crearComponentes();
		setVisible(true);
		
	}
	
	
	
	public void crearComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAnnadirUsuario = new JButton("A\u00D1ADIR");
		btnAnnadirUsuario.setForeground(new Color(255, 255, 255));
		btnAnnadirUsuario.setBackground(new Color(65, 105, 225));
		btnAnnadirUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnAnnadirUsuario);
		
		lstUsuario = new JList();
		lstUsuario.setBackground(new Color(230, 230, 250));
		contentPane.add(lstUsuario, BorderLayout.CENTER);
	}

}
