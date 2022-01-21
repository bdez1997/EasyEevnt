package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;

public class DlgCreacionPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtTelf;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtUsername;
	private JTextField txtPass;
	private JTextField txtCorreo;

	
	public static void main(String[] args) {
		try {
			DlgCreacionPersona dialog = new DlgCreacionPersona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCreacionPersona() {
		setBounds(100, 100, 595, 396);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(135, 206, 235));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBotones = new JPanel();
			panelBotones.setBackground(new Color(248, 248, 255));
			panelBotones.setBounds(33, 291, 520, 58);
			contentPanel.add(panelBotones);
			panelBotones.setLayout(null);
			
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
			btnGuardar.setBounds(109, 10, 116, 38);
			panelBotones.add(btnGuardar);
			
			btnGuardar.addActionListener(e -> {
				dispose();
			});
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
			btnCancelar.setBounds(305, 10, 116, 38);
			panelBotones.add(btnCancelar);
			
			btnCancelar.addActionListener(e -> {
				dispose();
			});
			
		}
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(255, 250, 250));
		panelDatos.setBounds(33, 10, 520, 251);
		contentPanel.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(28, 60, 56, 16);
		panelDatos.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidos.setBounds(28, 97, 68, 16);
		panelDatos.add(lblApellidos);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		lblUsername.setBounds(242, 60, 73, 19);
		panelDatos.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(242, 98, 73, 16);
		panelDatos.add(lblPassword);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono.setBounds(28, 138, 68, 16);
		panelDatos.add(lblTelefono);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDNI.setBounds(28, 175, 56, 24);
		panelDatos.add(lblDNI);
		
		txtTelf = new JTextField();
		txtTelf.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTelf.setColumns(10);
		txtTelf.setBounds(94, 138, 106, 24);
		panelDatos.add(txtTelf);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(242, 141, 60, 13);
		panelDatos.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(28, 37, 462, 2);
		panelDatos.add(separator);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 14));
		txtApellido.setColumns(10);
		txtApellido.setBounds(94, 97, 106, 24);
		panelDatos.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(94, 60, 106, 24);
		panelDatos.add(txtNombre);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Arial", Font.PLAIN, 14));
		txtDni.setColumns(10);
		txtDni.setBounds(94, 179, 106, 24);
		panelDatos.add(txtDni);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUsername.setColumns(10);
		txtUsername.setBounds(325, 60, 106, 24);
		panelDatos.add(txtUsername);
		
		txtPass = new JTextField();
		txtPass.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPass.setColumns(10);
		txtPass.setBounds(325, 94, 106, 24);
		panelDatos.add(txtPass);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(325, 138, 106, 24);
		panelDatos.add(txtCorreo);
		
		JLabel lblCrearUser = new JLabel("USUARIOS");
		lblCrearUser.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCrearUser.setBounds(28, 10, 124, 33);
		panelDatos.add(lblCrearUser);
	}
}
