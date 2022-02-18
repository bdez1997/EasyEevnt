package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgPersonaEvento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTable tblPersonaEvento;
	JScrollPane scrollPane;

	public DlgPersonaEvento() {
		setTitle("Valoración de los usuarios");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {

		tblPersonaEvento = new JTable();
		scrollPane = new JScrollPane(tblPersonaEvento);
		controller.CtrlPersonaEvento.getListPersonaEvento();
		contentPanel.add(scrollPane, BorderLayout.CENTER);

	}

}
