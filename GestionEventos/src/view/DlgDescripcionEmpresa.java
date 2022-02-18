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
import javax.swing.JLabel;

public class DlgDescripcionEmpresa extends JDialog {

	private JPanel contentPane;
	private JButton btnAddEmpresa;
	private JScrollPane scrollPane;
	public static JTable tableEmpresa;

	private JPopupMenu popupMenu;
	private JMenuItem mntmDelete;
	private JMenuItem mntmBorrar;
	private JMenuItem mntmUpdate;

	public static String nif;
	public static String nombre;
	public static String telefono;
	public static String correo;

	public DlgDescripcionEmpresa() {
		this.setResizable(false);
		setModal(true);

		setBackground(new Color(230, 230, 250));
		setBounds(100, 100, 582, 498);
		setTitle("Usuarios");
		getContentPane().setLayout(null);
		crearComponentes();
		setVisible(true);

	}

	public void crearComponentes() {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tableEmpresa = new JTable();

		scrollPane = new JScrollPane(tableEmpresa);
		scrollPane.setBounds(5, 44, 421, 174);
		controller.CtrlEmpresa.getListEmpresa();
		contentPane.add(scrollPane);

		popupMenu = new JPopupMenu();
		popupMenu.setBounds(-10007, -10030, 107, 78);
		contentPane.add(popupMenu);

		mntmBorrar = new JMenuItem("Borrar");
		popupMenu.add(mntmBorrar);

		tableEmpresa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON3) {

					popupMenu.show(DlgDescripcionEmpresa.this, e.getX(), e.getY());
					nif = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 0).toString();
				}
			}
		});

		mntmUpdate = new JMenuItem("Actualizar");

		mntmUpdate.addActionListener(e -> {
			new DlgEditarEmpresa();
		});

		popupMenu.add(mntmUpdate);

		btnAddEmpresa = new JButton("ADD");
		btnAddEmpresa.setBounds(176, 228, 80, 23);
		contentPane.add(btnAddEmpresa);
		btnAddEmpresa.setForeground(new Color(255, 255, 255));
		btnAddEmpresa.setBackground(new Color(65, 105, 225));
		btnAddEmpresa.setFont(new Font("Arial", Font.BOLD, 12));
		
		btnAddEmpresa.addActionListener( e -> {
			new DlgCreacionEmpresa();
		});


		tableEmpresa.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(DlgDescripcionEmpresa.this, e.getX(), e.getY());

				}

				if (e.getButton() == MouseEvent.BUTTON1) {
					nif = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 0).toString();

				}
			}
		});
		

		mntmUpdate.addActionListener(e -> {

			nif = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 0).toString();
			nombre = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 1).toString();
			telefono = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 2).toString();
			correo = tableEmpresa.getValueAt(tableEmpresa.getSelectedRow(), 3).toString();

			controller.CtrlEmpresa.updateEmpresa();
		});
		

	}
}
