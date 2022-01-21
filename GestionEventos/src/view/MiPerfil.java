package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class MiPerfil extends JDialog {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtDni;
	private JTextField txtCorreo;
	private JTextField txtApellidos;
	private JTextField txtNombre;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtTelefono;

	Spublic MiPerfil () {
		setBounds (100, 100, 718, 576);
		setTitle("Mi Perfil");	
		getContentPane().setLayout(null);
		setResizable(true);
		crearComponentes();
		setVisible(true);
		
	}
	
	public void crearComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnImgMiPerfil = new JButton("");
		ImageIcon icono = new ImageIcon("stromp.png");
		btnImgMiPerfil.setBounds(10, 24, 163, 100);
		btnImgMiPerfil.setIcon(icono);
		contentPane.add(btnImgMiPerfil);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBackground(new Color(135, 206, 250));
		btnCancelar.setForeground(new Color(0, 0, 0));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(87, 219, 116, 34);
		contentPane.add(btnCancelar);
		
		btnCancelar.addActionListener(e -> {
			dispose();
		});
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBackground(new Color(135, 206, 250));
		btnAceptar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAceptar.setBounds(235, 219, 99, 34);
		contentPane.add(btnAceptar);
		
		btnAceptar.addActionListener(e -> {
			dispose();
		});
		
		txtUser = new JTextField();
		txtUser.setBounds(292, 24, 132, 23);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(292, 62, 132, 23);
		contentPane.add(txtPass);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(310, 161, 116, 20);
		contentPane.add(txtDni);
		
		txtCorreo = new JTextField("");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(292, 104, 132, 20);
		contentPane.add(txtCorreo);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(87, 161, 122, 20);
		contentPane.add(txtApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(87, 131, 122, 20);
		contentPane.add(txtNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 133, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dni");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(254, 162, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(235, 24, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(213, 66, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(225, 104, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Apellidos");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 164, 67, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 195, 67, 14);
		contentPane.add(lblNewLabel_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(87, 192, 122, 20);
		contentPane.add(txtTelefono);
		
	}
}
