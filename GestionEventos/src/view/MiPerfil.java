package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class MiPerfil extends JFrame {

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

	public MiPerfil () {
		setBounds (500,200,511,335);
		setTitle("Mi Perfil");	
		getContentPane().setLayout(null);
		
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
		btnImgMiPerfil.setBounds(27, 11, 163, 100);
		btnImgMiPerfil.setIcon(icono);
		contentPane.add(btnImgMiPerfil);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBackground(new Color(135, 206, 250));
		btnCancelar.setForeground(new Color(0, 0, 0));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(103, 227, 106, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setBackground(new Color(135, 206, 250));
		btnAceptar.setFont(new Font("Arial", Font.BOLD, 12));
		btnAceptar.setBounds(235, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		txtUser = new JTextField();
		txtUser.setBounds(292, 99, 132, 23);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(292, 130, 132, 23);
		contentPane.add(txtPass);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(282, 192, 142, 20);
		contentPane.add(txtDni);
		
		txtCorreo = new JTextField("");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(282, 161, 142, 20);
		contentPane.add(txtCorreo);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(67, 161, 142, 20);
		contentPane.add(txtApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(67, 130, 142, 20);
		contentPane.add(txtNombre);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dni");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(225, 195, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(225, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(226, 133, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(226, 164, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Apellidos");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 164, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 195, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(67, 192, 142, 20);
		contentPane.add(txtTelefono);
		
	}
}
