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
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextArea;

public class DlgPerfil extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtCorreo;
	private JTextField txtDni;
	private JTextField txtRol;
 
	
	public static void main(String[] args) {
		try {
			DlgPerfil dialog = new DlgPerfil();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgPerfil() {
		setBounds(100, 100, 582, 498);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(33, 74, 57, 17);
		contentPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(128, 73, 122, 21);
		contentPanel.add(txtNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidos.setBounds(33, 112, 68, 17);
		contentPanel.add(lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(128, 111, 122, 21);
		contentPanel.add(txtApellidos);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono.setBounds(33, 154, 57, 17);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(128, 153, 122, 21);
		contentPanel.add(txtTelefono);
		
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
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(414, 73, 122, 21);
		contentPanel.add(txtUser);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(307, 112, 68, 17);
		contentPanel.add(lblPassword);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(414, 111, 122, 21);
		contentPanel.add(txtPass);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCorreo.setBounds(307, 154, 68, 17);
		contentPanel.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(414, 153, 122, 21);
		contentPanel.add(txtCorreo);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(128, 205, 122, 21);
		contentPanel.add(txtDni);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni.setBounds(33, 206, 57, 17);
		contentPanel.add(lblDni);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRol.setBounds(307, 206, 57, 17);
		contentPanel.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setColumns(10);
		txtRol.setBounds(414, 205, 122, 21);
		contentPanel.add(txtRol);
		
		JLabel lblInformacion = new JLabel("Informaci\u00F3n Adiccional");
		lblInformacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformacion.setBounds(33, 263, 171, 17);
		contentPanel.add(lblInformacion);
		
		JTextArea txtInformacion = new JTextArea();
		txtInformacion.setBounds(33, 290, 503, 81);
		contentPanel.add(txtInformacion);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(65, 105, 225));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBounds(381, 406, 122, 33);
		contentPanel.add(btnCancelar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setForeground(new Color(255, 255, 255));
		btnEditar.setBackground(new Color(65, 105, 225));
		btnEditar.setFont(new Font("Arial", Font.BOLD, 14));
		btnEditar.setBounds(62, 406, 122, 33);
		contentPanel.add(btnEditar);
		
		txtNombre.setEditable(false);
		txtApellidos.setEditable(false);
		txtDni.setEditable(false);
		txtTelefono.setEditable(false);
		txtCorreo.setEditable(false);
		txtUser.setEditable(false);
		txtPass.setEditable(false);
		txtInformacion.setEditable(false);
		txtRol.setEditable(false);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(65, 105, 225));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
		btnGuardar.setBounds(223, 406, 122, 33);
		contentPanel.add(btnGuardar);
		
		btnGuardar.setVisible(false);
		
		btnGuardar.addActionListener(e -> {
			
		});
		
		btnEditar.addActionListener(e -> {
			txtNombre.setEditable(true);
			txtApellidos.setEditable(true);
			txtDni.setEditable(true);
			txtTelefono.setEditable(true);
			txtCorreo.setEditable(true);
			txtUser.setEditable(true);
			txtPass.setEditable(true);
			txtInformacion.setEditable(true);
			txtRol.setEditable(true);
			btnGuardar.setVisible(true);
		});
		
		
	}
}
