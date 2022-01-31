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

public class DlgCreacionEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtTelf;
	public static JTextField txtNIF;
	public static JTextField txtCorreo;
	public static JTextField txtNombre;


	public DlgCreacionEmpresa() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 421, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBotones = new JPanel();
			panelBotones.setBackground(new Color(230, 230, 250));
			panelBotones.setBounds(35, 290, 320, 59);
			contentPanel.add(panelBotones);
			panelBotones.setLayout(null);
			
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.setForeground(new Color(255, 255, 255));
			btnGuardar.setBackground(new Color(65, 105, 225));
			btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
			btnGuardar.setBounds(23, 11, 116, 38);
			panelBotones.add(btnGuardar);
			
			btnGuardar.addActionListener(e -> {
				dispose();
			});
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.setBackground(new Color(65, 105, 225));
			btnCancelar.setForeground(new Color(255, 255, 255));
			btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
			btnCancelar.setBounds(168, 11, 116, 38);
			panelBotones.add(btnCancelar);
			
			btnCancelar.addActionListener(e -> {
				dispose();
			});
			
		}
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(230, 230, 250));
		panelDatos.setBounds(34, 22, 338, 242);
		contentPanel.add(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 14));
		lblTelefono.setBounds(28, 186, 68, 16);
		panelDatos.add(lblTelefono);
		
		JLabel lblNIF = new JLabel("NIF");
		lblNIF.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNIF.setBounds(28, 55, 56, 24);
		panelDatos.add(lblNIF);
		
		txtTelf = new JTextField();
		txtTelf.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTelf.setColumns(10);
		txtTelf.setBounds(128, 183, 106, 24);
		panelDatos.add(txtTelf);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 143, 60, 13);
		panelDatos.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(16, 43, 305, 2);
		panelDatos.add(separator);
		
		txtNIF = new JTextField();
		txtNIF.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNIF.setColumns(10);
		txtNIF.setBounds(128, 56, 106, 24);
		panelDatos.add(txtNIF);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Arial", Font.PLAIN, 14));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(128, 138, 106, 24);
		panelDatos.add(txtCorreo);
		
		JLabel lblCrearEmpresa = new JLabel("EMPRESA");
		lblCrearEmpresa.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCrearEmpresa.setBounds(16, 10, 124, 33);
		panelDatos.add(lblCrearEmpresa);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(28, 95, 56, 24);
		panelDatos.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombre.setColumns(10);
		txtNombre.setBounds(128, 96, 106, 24);
		panelDatos.add(txtNombre);
		
		setVisible(true);
	}
}
