package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmLogin extends JFrame {

	private JPanel contentPane;
	public static JTextField txtUser;
	public static JPasswordField passwordField;

	public FrmLogin() {
		this.setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 357, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));

		crearComponentes();

		setVisible(true);
	}

	private void crearComponentes() {

		txtUser = new JTextField();
		txtUser.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUser.setToolTipText("");
		txtUser.setBounds(165, 121, 124, 20);

		contentPane.add(txtUser);
		txtUser.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordField.setBounds(165, 166, 124, 20);
		contentPane.add(passwordField);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 12));
		lblUsername.setBounds(49, 124, 79, 14);
		contentPane.add(lblUsername);

		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(49, 169, 79, 14);
		contentPane.add(lblNewLabel);

		JButton btnLogin = new JButton("LOGGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(controller.CtrlLogin.Login()) {					
					new FrmPrincipal();
					dispose();
				}
			}
		});
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(65, 105, 225));
		btnLogin.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogin.setBounds(49, 247, 101, 30);
		contentPane.add(btnLogin);

		JButton btnExit = new JButton("CANCELAR");
		btnExit.setBackground(new Color(65, 105, 225));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Arial", Font.BOLD, 12));
		btnExit.setBounds(188, 247, 101, 30);
		contentPane.add(btnExit);
		
		JLabel lblimg = new JLabel(new ImageIcon("img/easyevents.png"));
		lblimg.setBounds(105, 10, 115, 101);
		contentPane.add(lblimg);
		
		

	}
}
