package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

public class DlgPersonaEvento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblImgProgress;

	public DlgPersonaEvento() {
		setTitle("Valoración de los usuarios");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblImgProgress = new JLabel(new ImageIcon("img/workinprogress.png"));
		lblImgProgress.setBounds(34, 34, 372, 189);
		contentPanel.add(lblImgProgress);
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {
		controller.CtrlPersonaEvento.getListPersonaEvento();

	}

}
