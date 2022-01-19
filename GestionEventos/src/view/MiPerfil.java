package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;


public class MiPerfil extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPass;
	private JTextField txtDni;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField txtApellidos;
	private JTextField txtNombre;

	public MiPerfil () {
		setBounds (500,200,300,200);
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
		btnImgMiPerfil.setBounds(27, 11, 119, 90);
		btnImgMiPerfil.setIcon(icono);
		contentPane.add(btnImgMiPerfil);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(126, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(225, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(225, 91, 199, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPass = new JTextField();
		txtPass.setText("Pass");
		txtPass.setColumns(10);
		txtPass.setBounds(225, 122, 199, 20);
		contentPane.add(txtPass);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(225, 184, 199, 20);
		contentPane.add(txtDni);
		
		txtCorreo = new JTextField("Correo");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(225, 153, 199, 20);
		contentPane.add(txtCorreo);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(10, 184, 199, 20);
		contentPane.add(txtTelefono);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(10, 153, 199, 20);
		contentPane.add(txtApellidos);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(10, 122, 199, 20);
		contentPane.add(txtNombre);
		
	}
}
