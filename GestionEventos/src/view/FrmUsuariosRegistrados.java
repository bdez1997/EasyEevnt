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

public class FrmUsuariosRegistrados extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescrpPerfil;
	private JButton btnCancelarDescrpPerfil;
	private JButton btnAceptarDescrpPerfil;

	
		public FrmUsuariosRegistrados() {
		
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnCancelarDescrpPerfil = new JButton("CANCELAR");
		btnCancelarDescrpPerfil.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelarDescrpPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnCancelarDescrpPerfil);
		
		btnAceptarDescrpPerfil = new JButton("ACEPTAR");
		btnAceptarDescrpPerfil.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnAceptarDescrpPerfil);
		
		txtDescrpPerfil = new JTextField();
		contentPane.add(txtDescrpPerfil, BorderLayout.CENTER);
		txtDescrpPerfil.setColumns(10);
	}

}
