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
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class FrmUsuariosRegistrados extends JFrame {

	private JPanel contentPane;
	private JButton btnAnnadirEvento;
	private JList lstUsuarios;

	
		public FrmUsuariosRegistrados() {
		
		setBounds (500,200,300,200);
		setTitle("Doble");
		getContentPane().setLayout(null);
		
		crearComponentes();
		setVisible(true);
		
	}
	
	public void crearComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAnnadirEvento = new JButton("A\u00D1ADIR");
		btnAnnadirEvento.setFont(new Font("Arial", Font.BOLD, 12));
		panel.add(btnAnnadirEvento);
		
		lstUsuarios = new JList();
		lstUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstUsuarios.setModel(new AbstractListModel() {
			String[] values = new String[] {""};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(lstUsuarios, BorderLayout.CENTER);
	}

}
