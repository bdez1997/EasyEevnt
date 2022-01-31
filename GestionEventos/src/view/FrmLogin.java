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
import java.awt.Font;
import java.awt.Color;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUser;
	public static JPasswordField passwordField;

	public FrmLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 282);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		crearComponentes();

		setVisible(true);
	}

	private void crearComponentes() {

		txtUser = new JTextField();
		txtUser.setToolTipText("");
		txtUser.setBounds(165, 56, 153, 20);

		contentPane.add(txtUser);
		txtUser.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(165, 95, 153, 20);
		contentPane.add(passwordField);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUsername.setBounds(61, 58, 79, 14);
		contentPane.add(lblUsername);

		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setBounds(61, 97, 79, 14);
		contentPane.add(lblNewLabel);

		JButton btnLogin = new JButton("LOGGIN");
		btnLogin.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogin.setBounds(78, 157, 89, 38);
		contentPane.add(btnLogin);

		JButton btnExit = new JButton("CANCELAR");
		btnExit.setFont(new Font("Arial", Font.BOLD, 12));
		btnExit.setBounds(206, 157, 97, 38);
		contentPane.add(btnExit);

	}
}
