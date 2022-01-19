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
		setBounds (500,200,557,506);
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
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(126, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(225, 227, 89, 23);
		contentPane.add(btnAceptar);
		
		txtUser = new JTextField();
		txtUser.setBounds(282, 99, 142, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(282, 130, 142, 20);
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
		lblNewLabel.setBounds(10, 133, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dni");
		lblNewLabel_1.setBounds(225, 195, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User");
		lblNewLabel_2.setBounds(225, 102, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setBounds(226, 133, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setBounds(226, 164, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Apellidos");
		lblNewLabel_5.setBounds(10, 164, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Telefono");
		lblNewLabel_6.setBounds(10, 195, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(67, 192, 142, 20);
		contentPane.add(txtTelefono);
		
	}
}
