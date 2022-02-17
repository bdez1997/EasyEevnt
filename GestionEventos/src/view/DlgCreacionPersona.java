package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgCreacionPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtTelf;
	public static JTextField txtApellido;
	public static JTextField txtNombre;
	public static JTextField txtDni;
	public static JTextField txtUsername;
	public static JPasswordField txtPass;
	public static JTextField txtCorreo;
	public static JTextField txtRol;
	public static JTextArea txtInformacion;
	

	
	
	public DlgCreacionPersona() {
		setBounds(100, 100, 582, 498);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
		contentPanel.setLayout(null);
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		
			JPanel panelBotones = new JPanel();
			panelBotones.setBackground(new Color(230, 230, 250));
			panelBotones.setBounds(55, 380, 437, 58);
			contentPanel.add(panelBotones);
			panelBotones.setLayout(null);
			
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.setForeground(new Color(255, 255, 255));
			btnGuardar.setBackground(new Color(65, 105, 225));
			
			btnGuardar.setFont(new Font("Arial", Font.BOLD, 14));
			btnGuardar.setBounds(84, 10, 116, 38);
			panelBotones.add(btnGuardar);
			
			btnGuardar.addActionListener(e -> {
				try {
					controller.CtrlPersonas.insPersonas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			});
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.setForeground(new Color(255, 255, 255));
			btnCancelar.setBackground(new Color(65, 105, 225));
			btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
			btnCancelar.setBounds(244, 10, 116, 38);
			panelBotones.add(btnCancelar);
			
			btnCancelar.addActionListener(e -> {
				dispose();
			});
			
		
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(230, 230, 250));
		panelDatos.setBounds(0, 10, 558, 360);
		contentPanel.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(40, 60, 56, 16);
		panelDatos.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidos.setBounds(40, 97, 68, 16);
		panelDatos.add(lblApellidos);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsername.setBounds(294, 59, 73, 19);
		panelDatos.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(294, 97, 73, 16);
		panelDatos.add(lblPassword);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(40, 138, 68, 16);
		panelDatos.add(lblTelefono);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDNI.setBounds(40, 175, 56, 24);
		panelDatos.add(lblDNI);
		
		txtTelf = new JTextField();
		txtTelf.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTelf.setColumns(10);
		txtTelf.setBounds(129, 134, 106, 24);
		panelDatos.add(txtTelf);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(291, 140, 60, 13);
		panelDatos.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(28, 37, 416, 2);
		panelDatos.add(separator);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(129, 93, 106, 24);
		panelDatos.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBounds(129, 56, 106, 24);
		panelDatos.add(txtNombre);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDni.setColumns(10);
		txtDni.setBounds(129, 175, 106, 24);
		panelDatos.add(txtDni);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setColumns(10);
		txtUsername.setBounds(412, 56, 106, 24);
		panelDatos.add(txtUsername);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPass.setColumns(10);
		txtPass.setBounds(412, 93, 106, 24);
		panelDatos.add(txtPass);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(412, 134, 106, 24);
		panelDatos.add(txtCorreo);
		
		JLabel lblCrearUser = new JLabel("USUARIOS");
		lblCrearUser.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblCrearUser.setBounds(28, 10, 124, 33);
		panelDatos.add(lblCrearUser);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Arial", Font.PLAIN, 12));
		lblRol.setBounds(295, 175, 56, 24);
		panelDatos.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setFont(new Font("Arial", Font.PLAIN, 12));
		txtRol.setColumns(10);
		txtRol.setBounds(412, 175, 106, 24);
		panelDatos.add(txtRol);
		
		JLabel lblInformacinAdicciona = new JLabel("Informaci\u00F3n adiccional");
		lblInformacinAdicciona.setFont(new Font("Arial", Font.BOLD, 14));
		lblInformacinAdicciona.setBounds(40, 225, 172, 24);
		panelDatos.add(lblInformacinAdicciona);
		
		txtInformacion = new JTextArea();
		txtInformacion.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInformacion.setBounds(40, 259, 478, 85);
		panelDatos.add(txtInformacion);
		
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controller.CtrlPersonas.insPersonas();
					System.out.println(txtTelf.getText()+txtApellido.getText()+ txtNombre.getText()+ txtDni.getText()+txtUsername.getText()+txtPass.getPassword()+txtCorreo.getText()+txtRol.getText()+txtInformacion.getText());
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
	}
}
