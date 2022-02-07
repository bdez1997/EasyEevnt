package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;

public class DlgDescripcionPersonas extends JDialog {

	private JPanel contentPane;
	private JButton btnAddUsuario;
	private JScrollPane scrollPane;
	public static JTable tablePersona;
	
	private JPopupMenu popupMenu;
	private JMenuItem mntmDelete;
	private JMenuItem mntmBorrar;
	private JMenuItem mntmUpdate;
	
	public static String sDni;
	public static String sNombrePersona;
	public static String sApellidosPersona;
	public static String sUsername;
	public static String sPass;
	public static String sCorreo;
	public static String sTelefono;
	public static String sRol;
	public static String sInformacion;

	public DlgDescripcionPersonas() {
		setBackground(new Color(230, 230, 250));
		setBounds(500, 200, 300, 200);
		setTitle("Eventos");
		getContentPane().setLayout(null);
		crearComponentes();
		setVisible(true);

	}

	public void crearComponentes() {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(230, 230, 250));
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnAddUsuario = new JButton("A\u00D1ADIR");
		btnAddUsuario.setForeground(new Color(255, 255, 255));
		btnAddUsuario.setBackground(new Color(65, 105, 225));
		btnAddUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnAddUsuario);
		
		
		////////////////////////////////////////TABLA///////////////////////////////////////////////

		tablePersona = new JTable();

		scrollPane = new JScrollPane(tablePersona);
		controller.CtrlEvento.getList();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		popupMenu = new JPopupMenu();
		contentPane.add(popupMenu, BorderLayout.NORTH);

		mntmDelete = new JMenuItem("Eliminar");
		mntmDelete.addActionListener(e -> {
			controller.CtrlEvento.getList();
		});
		
		
		popupMenu.add(mntmDelete);

		mntmBorrar = new JMenuItem("Borrar");
		popupMenu.add(mntmBorrar);
		
		tablePersona.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if (e.getButton() == MouseEvent.BUTTON3) {
					
					popupMenu.show(DlgDescripcionPersonas.this, e.getX(), e.getY());
					sDni = tablePersona.getValueAt(tablePersona.getSelectedRow(),0).toString();
				}
			}
		});
		
		mntmUpdate = new JMenuItem("Actualizar");
		popupMenu.add(mntmUpdate);
		
		tablePersona.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(DlgDescripcionPersonas.this, e.getX(), e.getY());

				}
				if (e.getButton() == MouseEvent.BUTTON1) {
					sDni = tablePersona.getValueAt(tablePersona.getSelectedRow(), 0).toString();
				}
			}
		});

		mntmUpdate.addActionListener(e ->{
				sNombrePersona = tablePersona.getValueAt(tablePersona.getSelectedRow(), 0).toString();				
				sApellidosPersona = tablePersona.getValueAt(tablePersona.getSelectedRow(), 1).toString();	
				sUsername = tablePersona.getValueAt(tablePersona.getSelectedRow(), 2).toString();	
				sPass = tablePersona.getValueAt(tablePersona.getSelectedRow(), 3).toString();	
				sCorreo = tablePersona.getValueAt(tablePersona.getSelectedRow(), 4).toString();	
				sTelefono = tablePersona.getValueAt(tablePersona.getSelectedRow(), 5).toString();	
				sRol = tablePersona.getValueAt(tablePersona.getSelectedRow(), 6).toString();	
				sInformacion = tablePersona.getValueAt(tablePersona.getSelectedRow(), 7).toString();	
				
				controller.CtrlPersonas.updPersona();
		});
		
		
		
		
	}
}
