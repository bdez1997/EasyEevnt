package view;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
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

public class DlgDescripcionEventos extends JDialog {

	private JPanel contentPane;
	private JButton btnAddEvento;
	private JScrollPane scrollPane;
	public static JTable tableEventos;
	private JPopupMenu popupMenu;
	private JMenuItem mntmNewDelete;
	private JMenuItem mntmUpdate;
	public static String sEventName;
	public static String sEventNameAux;
	public static String sStartDate;
	public static String sEndDate;
	public static String iMaxPeople;
	public static String iImage;
	public static String sAddress;
	public static String sDescription;
	public static String idEvento;
	

	public DlgDescripcionEventos() {
		setBackground(new Color(230, 230, 250));
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
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

		btnAddEvento = new JButton("Add");
		btnAddEvento.setForeground(new Color(255, 255, 255));
		btnAddEvento.setBackground(new Color(65, 105, 225));
		btnAddEvento.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnAddEvento);
		
		btnAddEvento.addActionListener( e -> {
			new DlgCreacionEventos();
		});

		tableEventos = new JTable();

		scrollPane = new JScrollPane(tableEventos);
		controller.CtrlEvento.getList();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		popupMenu = new JPopupMenu();
		contentPane.add(popupMenu, BorderLayout.NORTH);

		mntmNewDelete = new JMenuItem("Eliminar");
		mntmNewDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("entra");
				controller.CtrlEvento.delEvento(sEventName);
				controller.CtrlEvento.getList();
			}
		});

		popupMenu.add(mntmNewDelete);

		mntmUpdate = new JMenuItem("Actualizar");
		popupMenu.add(mntmUpdate);
		tableEventos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (e.getButton() == MouseEvent.BUTTON3) {
					popupMenu.show(DlgDescripcionEventos.this, e.getX(), e.getY());

				}
				if (e.getButton() == MouseEvent.BUTTON1) {
					// El nombre antiguo para usar en el where
					sEventNameAux = tableEventos.getValueAt(tableEventos.getSelectedRow(), 0).toString();
				}
			}
		});

		mntmUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				idEvento = tableEventos.getValueAt(tableEventos.getSelectedRow(), 0).toString();
				sEventName = tableEventos.getValueAt(tableEventos.getSelectedRow(), 1).toString();				
				sStartDate = tableEventos.getValueAt(tableEventos.getSelectedRow(), 2).toString();	
				sEndDate = tableEventos.getValueAt(tableEventos.getSelectedRow(), 3).toString();	
				iMaxPeople = tableEventos.getValueAt(tableEventos.getSelectedRow(), 4).toString();	
				sDescription = tableEventos.getValueAt(tableEventos.getSelectedRow(), 5).toString();	
				iImage = tableEventos.getValueAt(tableEventos.getSelectedRow(), 6).toString();	
				sAddress = tableEventos.getValueAt(tableEventos.getSelectedRow(), 7).toString();	
				new DlgEditarEventos();
				
			}
		});

	}
}
