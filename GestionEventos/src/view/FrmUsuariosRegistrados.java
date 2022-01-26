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
	private JTextField txtNombreList;
	private JTextField txtDniList;
	private JTextField txtCorreoList;
	private JTextField txtPassList;
	private JTextField txtEmpresaList;
	private JTextField txtTelefonoList;
	private JTextField txtUserList;
	private JTextField txtApellidosList;

	
	public FrmUsuariosRegistrados() {
		setBounds (500,200,600,500);
		setTitle("Lista de usuarios");
		getContentPane().setLayout(null);	
		crearComponentes();
		setVisible(true);
	}

	public void crearComponentes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreList = new JLabel("Nombre:");
		lblNombreList.setBounds(10, 26, 69, 14);
		contentPane.add(lblNombreList);
		
		txtNombreList = new JTextField();
		txtNombreList.setBounds(89, 23, 120, 20);
		contentPane.add(txtNombreList);
		txtNombreList.setColumns(10);
		
		JLabel lblDniList = new JLabel("DNI:");
		lblDniList.setBounds(10, 57, 69, 14);
		contentPane.add(lblDniList);
		
		txtDniList = new JTextField();
		txtDniList.setBounds(89, 54, 120, 20);
		contentPane.add(txtDniList);
		txtDniList.setColumns(10);
		
		JLabel lblCorreoList = new JLabel("Correo:");
		lblCorreoList.setBounds(10, 88, 69, 14);
		contentPane.add(lblCorreoList);
		
		txtCorreoList = new JTextField();
		txtCorreoList.setBounds(89, 85, 120, 20);
		contentPane.add(txtCorreoList);
		txtCorreoList.setColumns(10);
		
		JLabel lblPassList = new JLabel("Contrase\u00F1a:");
		lblPassList.setBounds(10, 113, 69, 14);
		contentPane.add(lblPassList);
		
		txtPassList = new JTextField();
		txtPassList.setBounds(89, 116, 120, 20);
		contentPane.add(txtPassList);
		txtPassList.setColumns(10);
		
		JTextPane txtDescripcionList = new JTextPane();
		txtDescripcionList.setText("Informaci\u00F3n adicional:");
		txtDescripcionList.setBounds(98, 147, 245, 76);
		contentPane.add(txtDescripcionList);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(108, 227, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(242, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblUserList = new JLabel("Username:");
		lblUserList.setBounds(226, 57, 63, 14);
		contentPane.add(lblUserList);
		
		JLabel lblTelefonoList = new JLabel("Telefono:");
		lblTelefonoList.setBounds(226, 88, 63, 14);
		contentPane.add(lblTelefonoList);
		
		JLabel lblEmpresaList = new JLabel("Empresa");
		lblEmpresaList.setBounds(226, 113, 63, 14);
		contentPane.add(lblEmpresaList);
		
		txtEmpresaList = new JTextField();
		txtEmpresaList.setColumns(10);
		txtEmpresaList.setBounds(304, 110, 120, 20);
		contentPane.add(txtEmpresaList);
		
		txtTelefonoList = new JTextField();
		txtTelefonoList.setColumns(10);
		txtTelefonoList.setBounds(304, 82, 120, 20);
		contentPane.add(txtTelefonoList);
		
		txtUserList = new JTextField();
		txtUserList.setColumns(10);
		txtUserList.setBounds(304, 51, 120, 20);
		contentPane.add(txtUserList);
		
		txtApellidosList = new JTextField();
		txtApellidosList.setColumns(10);
		txtApellidosList.setBounds(304, 23, 120, 20);
		contentPane.add(txtApellidosList);
		
		JLabel lblApellidosList = new JLabel("Apellidos:");
		lblApellidosList.setBounds(226, 26, 63, 14);
		contentPane.add(lblApellidosList);
	}
}
