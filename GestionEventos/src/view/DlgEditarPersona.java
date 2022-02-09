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
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgEditarPersona extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtTelf;
	public static JTextField txtApellido;
	public static JTextField txtNombre;
	public static JTextField txtUsername;
	public static JPasswordField txtPass;
	public static JTextField txtCorreo;
	public static JTextField txtRol;
	public static JTextArea txtInformacion;
	private JTextField txtDni;
	

	
	
	public DlgEditarPersona() {
		setBounds(100, 100, 582, 498);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		crearComponentes();
		setVisible(true);
		
	}

	private void crearComponentes() {
		
			JPanel panelBotones = new JPanel();
			panelBotones.setBackground(new Color(230, 230, 250));
			panelBotones.setBounds(10, 380, 539, 58);
			contentPanel.add(panelBotones);
			panelBotones.setLayout(null);
			
			JButton btnActualizar = new JButton("ACTUALIZAR");
			btnActualizar.setForeground(new Color(255, 255, 255));
			btnActualizar.setBackground(new Color(65, 105, 225));
			
			btnActualizar.setFont(new Font("Arial", Font.BOLD, 14));
			btnActualizar.setBounds(133, 10, 125, 38);
			panelBotones.add(btnActualizar);
			
			btnActualizar.addActionListener(e -> {
				try {
					controller.CtrlPersonas.updPersona();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				dispose();
			});
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.setForeground(new Color(255, 255, 255));
			btnCancelar.setBackground(new Color(65, 105, 225));
			btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
			btnCancelar.setBounds(299, 10, 116, 38);
			panelBotones.add(btnCancelar);
			
			btnCancelar.addActionListener(e -> {
				dispose();
			});
			
		
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(230, 230, 250));
		panelDatos.setBounds(0, 10, 549, 360);
		contentPanel.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombre.setBounds(28, 60, 56, 16);
		panelDatos.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 12));
		lblApellidos.setBounds(28, 97, 68, 16);
		panelDatos.add(lblApellidos);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsername.setBounds(295, 59, 73, 19);
		panelDatos.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		lblPassword.setBounds(295, 97, 73, 16);
		panelDatos.add(lblPassword);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTelefono.setBounds(28, 138, 68, 16);
		panelDatos.add(lblTelefono);
		
		txtTelf = new JTextField();
		txtTelf.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTelf.setColumns(10);
		txtTelf.setBounds(106, 135, 106, 24);
		panelDatos.add(txtTelf);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(295, 140, 60, 13);
		panelDatos.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(28, 37, 416, 2);
		panelDatos.add(separator);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Arial", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBounds(106, 94, 106, 24);
		panelDatos.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBounds(106, 57, 106, 24);
		panelDatos.add(txtNombre);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setColumns(10);
		txtUsername.setBounds(403, 56, 106, 24);
		panelDatos.add(txtUsername);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPass.setColumns(10);
		txtPass.setBounds(403, 93, 106, 24);
		panelDatos.add(txtPass);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(403, 134, 106, 24);
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
		txtRol.setBounds(403, 175, 106, 24);
		panelDatos.add(txtRol);
		
		JLabel lblInformacinAdicciona = new JLabel("Informaci\u00F3n adiccional");
		lblInformacinAdicciona.setFont(new Font("Arial", Font.BOLD, 14));
		lblInformacinAdicciona.setBounds(28, 225, 172, 24);
		panelDatos.add(lblInformacinAdicciona);
		
		txtInformacion = new JTextArea();
		txtInformacion.setFont(new Font("Arial", Font.PLAIN, 14));
		txtInformacion.setBounds(28, 259, 481, 85);
		panelDatos.add(txtInformacion);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDni.setBounds(28, 181, 68, 16);
		panelDatos.add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDni.setColumns(10);
		txtDni.setBounds(106, 178, 106, 24);
		panelDatos.add(txtDni);
		
		btnActualizar.addActionListener(e -> {
			try {
				controller.CtrlPersonas.insPersonas();
				System.out.println(txtTelf.getText()+txtApellido.getText()+ txtNombre.getText()+ txtUsername.getText()
				+txtPass.getPassword()+txtCorreo.getText()+txtRol.getText()+txtInformacion.getText());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		});
		
		
	}
}
