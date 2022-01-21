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
	private JTextField txtTelf;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgCreacionEmpresa dialog = new DlgCreacionEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgCreacionEmpresa() {
		setBounds(100, 100, 446, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(135, 206, 235));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelBotones = new JPanel();
			panelBotones.setBackground(new Color(248, 248, 255));
			panelBotones.setBounds(33, 291, 358, 59);
			contentPanel.add(panelBotones);
			panelBotones.setLayout(null);
			
			JButton btnGuardar = new JButton("GUARDAR");
			btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
			btnGuardar.setBounds(32, 10, 116, 38);
			panelBotones.add(btnGuardar);
			
			btnGuardar.addActionListener(e -> {
				dispose();
			});
			
			JButton btnCancelar = new JButton("CANCELAR");
			btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
			btnCancelar.setBounds(217, 10, 116, 38);
			panelBotones.add(btnCancelar);
			
			btnCancelar.addActionListener(e -> {
				dispose();
			});
			
		}
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBackground(new Color(255, 250, 250));
		panelDatos.setBounds(33, 22, 358, 242);
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
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(128, 56, 106, 24);
		panelDatos.add(textField_4);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(128, 138, 106, 24);
		panelDatos.add(textField_2);
		
		JLabel lblCrearEmpresa = new JLabel("EMPRESA");
		lblCrearEmpresa.setFont(new Font("Arial", Font.PLAIN, 24));
		lblCrearEmpresa.setBounds(16, 10, 124, 33);
		panelDatos.add(lblCrearEmpresa);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNombre.setBounds(28, 95, 56, 24);
		panelDatos.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(128, 96, 106, 24);
		panelDatos.add(textField);
	}
}
