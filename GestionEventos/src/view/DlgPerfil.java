package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextArea;

public class DlgPerfil extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtNombreP;
	public static  JTextField txtApellidosP;
	public static  JTextField txtTelefonoP;
	public static  JTextField txtUserP;
	public static  JTextField txtPassP;
	public static  JTextField txtCorreoP;
	public static  JTextField txtDniP;
	public static  JTextField txtRolP;
	public static JTextArea txtInfoP = new JTextArea();
	
	
 
	
	public DlgPerfil() {
		setBounds(100, 100, 582, 498);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(33, 74, 57, 17);
		contentPanel.add(lblNombre);
		
		txtNombreP = new JTextField();
		txtNombreP.setColumns(10);
		txtNombreP.setBounds(128, 73, 122, 21);
		contentPanel.add(txtNombreP);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidos.setBounds(33, 112, 68, 17);
		contentPanel.add(lblApellidos);
		
		txtApellidosP = new JTextField();
		txtApellidosP.setColumns(10);
		txtApellidosP.setBounds(128, 111, 122, 21);
		contentPanel.add(txtApellidosP);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono.setBounds(33, 154, 57, 17);
		contentPanel.add(lblTelefono);
		
		txtTelefonoP = new JTextField();
		txtTelefonoP.setColumns(10);
		txtTelefonoP.setBounds(128, 153, 122, 21);
		contentPanel.add(txtTelefonoP);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(22, 50, 462, 2);
		contentPanel.add(separator);
		
		JLabel lblPerfil = new JLabel("PERFIL");
		lblPerfil.setFont(new Font("Arial", Font.PLAIN, 24));
		lblPerfil.setBounds(22, 10, 91, 33);
		contentPanel.add(lblPerfil);
		
		JLabel lblUser = new JLabel("Username");
		lblUser.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUser.setBounds(307, 74, 68, 17);
		contentPanel.add(lblUser);
		
		txtUserP = new JTextField();
		txtUserP.setColumns(10);
		txtUserP.setBounds(414, 73, 122, 21);
		contentPanel.add(txtUserP);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(307, 112, 68, 17);
		contentPanel.add(lblPassword);
		
		txtPassP = new JTextField();
		txtPassP.setColumns(10);
		txtPassP.setBounds(414, 111, 122, 21);
		contentPanel.add(txtPassP);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCorreo.setBounds(307, 154, 68, 17);
		contentPanel.add(lblCorreo);
		
		txtCorreoP = new JTextField();
		txtCorreoP.setColumns(10);
		txtCorreoP.setBounds(414, 153, 122, 21);
		contentPanel.add(txtCorreoP);
		
		txtDniP = new JTextField();
		txtDniP.setColumns(10);
		txtDniP.setBounds(128, 205, 122, 21);
		contentPanel.add(txtDniP);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni.setBounds(33, 206, 57, 17);
		contentPanel.add(lblDni);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRol.setBounds(307, 206, 57, 17);
		contentPanel.add(lblRol);
		
		txtRolP = new JTextField();
		txtRolP.setColumns(10);
		txtRolP.setBounds(414, 205, 122, 21);
		contentPanel.add(txtRolP);
		
		JLabel lblInformacion = new JLabel("Informacion Adiccional");
		lblInformacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformacion.setBounds(33, 263, 171, 17);
		contentPanel.add(lblInformacion);
		
		
		txtInfoP.setBounds(33, 290, 503, 81);
		contentPanel.add(txtInfoP);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(65, 105, 225));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBounds(381, 406, 122, 33);
		contentPanel.add(btnCancelar);
		
		btnCancelar.addActionListener(e -> {
			dispose();
		});
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setForeground(new Color(255, 255, 255));
		btnEditar.setBackground(new Color(65, 105, 225));
		btnEditar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEditar.setBounds(62, 406, 122, 33);
		contentPanel.add(btnEditar);
		
		txtNombreP.setEditable(false);
		txtApellidosP.setEditable(false);
		txtDniP.setEditable(false);
		txtTelefonoP.setEditable(false);
		txtCorreoP.setEditable(false);
		txtUserP.setEditable(false);
		txtPassP.setEditable(false);
txtInfoP.setEditable(false);
		txtRolP.setEditable(false);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(65, 105, 225));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
		btnGuardar.setBounds(223, 406, 122, 33);
		contentPanel.add(btnGuardar);
		
		btnGuardar.setVisible(false);
		
		btnGuardar.addActionListener(e -> {
			
			controller.CtrlPerfil.updPersona();
			dispose();
		});
		
		btnEditar.addActionListener(e -> {
			txtNombreP.setEditable(true);
			txtApellidosP.setEditable(true);
			txtDniP.setEditable(true);
			txtTelefonoP.setEditable(true);
			txtCorreoP.setEditable(true);
			txtUserP.setEditable(true);
			txtPassP.setEditable(true);
			txtInfoP.setEditable(true);
			txtRolP.setEditable(true);
			btnGuardar.setVisible(true);
		});
		
		setVisible(true);
	}
}
