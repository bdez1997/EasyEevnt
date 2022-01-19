package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField passwordField;


	public FrmLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		txtUser = new JTextField();
		txtUser.setToolTipText("");
		txtUser.setBounds(127, 87, 174, 20);
		
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 143, 174, 20);
		contentPane.add(passwordField);
		
		JLabel lblUsername = new JLabel("Nombre de Usuario:");
		lblUsername.setBounds(127, 61, 103, 14);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(127, 118, 58, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnLogin = new JButton("Ingresar:");
		btnLogin.setBounds(96, 204, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Cancelar");
		btnExit.setBounds(250, 204, 89, 23);
		contentPane.add(btnExit);
		
		setVisible(true);
	}
}
