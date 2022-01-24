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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
 
	
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
		setBounds(100, 100, 586, 535);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(33, 74, 57, 17);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(128, 73, 122, 21);
		contentPanel.add(textField);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Arial", Font.PLAIN, 14));
		lblApellidos.setBounds(33, 112, 68, 17);
		contentPanel.add(lblApellidos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 111, 122, 21);
		contentPanel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefono");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(33, 154, 57, 17);
		contentPanel.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(128, 153, 122, 21);
		contentPanel.add(textField_2);
		
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
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(414, 73, 122, 21);
		contentPanel.add(textField_3);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPassword.setBounds(307, 112, 68, 17);
		contentPanel.add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(414, 111, 122, 21);
		contentPanel.add(textField_4);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblCorreo.setBounds(307, 154, 68, 17);
		contentPanel.add(lblCorreo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(414, 153, 122, 21);
		contentPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(128, 205, 122, 21);
		contentPanel.add(textField_6);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDni.setBounds(33, 206, 57, 17);
		contentPanel.add(lblDni);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Arial", Font.PLAIN, 14));
		lblRol.setBounds(307, 206, 57, 17);
		contentPanel.add(lblRol);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(414, 205, 122, 21);
		contentPanel.add(textField_7);
		
		JLabel lblInformacion = new JLabel("Informaci\u00F3n Adiccional");
		lblInformacion.setFont(new Font("Arial", Font.PLAIN, 14));
		lblInformacion.setBounds(33, 263, 171, 17);
		contentPanel.add(lblInformacion);
		
		JTextArea txtInformación = new JTextArea();
		txtInformación.setBounds(33, 290, 503, 113);
		contentPanel.add(txtInformación);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancelar.setBounds(319, 435, 122, 33);
		contentPanel.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("REGISTRAR");
		btnRegistrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnRegistrar.setBounds(115, 435, 122, 33);
		contentPanel.add(btnRegistrar);
		
		
	}
}
