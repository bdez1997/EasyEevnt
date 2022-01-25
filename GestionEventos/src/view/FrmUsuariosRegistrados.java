package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class FrmUsuariosRegistrados extends JDialog {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtCorreo;
	private JTextField txtPass;
	private JTextField txtEmpresa;
	private JTextField txtTelefono;
	private JTextField txtUser;
	private JTextField txtApellidos;

	
	public static void main(String[] args) {
		try {
			DlgCreacionPersona dialog = new DlgCreacionPersona();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
		
	public void crearComponentes() {
		
		setBounds (500,200,600,500);
		setTitle("Doble");
		getContentPane().setLayout(null);
		
		crearComponentes();
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 26, 69, 14);
		contentPane.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(89, 23, 120, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("DNI:");
		lblNewLabel_1.setBounds(10, 57, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDni = new JTextField();
		txtDni.setBounds(89, 54, 120, 20);
		contentPane.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Correo:");
		lblNewLabel_2.setBounds(10, 88, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(89, 85, 120, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_3.setBounds(10, 113, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		txtPass = new JTextField();
		txtPass.setBounds(89, 116, 120, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		JTextPane txtDescripcion = new JTextPane();
		txtDescripcion.setText("Informaci\u00F3n adicional:");
		txtDescripcion.setBounds(98, 147, 245, 76);
		contentPane.add(txtDescripcion);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(108, 227, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(242, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_5 = new JLabel("Username:");
		lblNewLabel_5.setBounds(226, 57, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono:");
		lblNewLabel_6.setBounds(226, 88, 63, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Empresa");
		lblNewLabel_7.setBounds(226, 113, 63, 14);
		contentPane.add(lblNewLabel_7);
		
		txtEmpresa = new JTextField();
		txtEmpresa.setColumns(10);
		txtEmpresa.setBounds(304, 110, 120, 20);
		contentPane.add(txtEmpresa);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(304, 82, 120, 20);
		contentPane.add(txtTelefono);
		
		txtUser = new JTextField();
		txtUser.setColumns(10);
		txtUser.setBounds(304, 51, 120, 20);
		contentPane.add(txtUser);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(304, 23, 120, 20);
		contentPane.add(txtApellidos);
		
		JLabel lblNewLabel_5_1 = new JLabel("Apellidos:");
		lblNewLabel_5_1.setBounds(226, 26, 63, 14);
		contentPane.add(lblNewLabel_5_1);
	}
}
