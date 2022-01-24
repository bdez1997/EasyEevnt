package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import com.toedter.components.JLocaleChooser;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;

public class DlgCreacionEventos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextField txtNombreEvento;
	public static JTextField txtHoraInicio;
	public static JTextField txtHoraFin;
	public static JTextField txtUbicacion;
	public static JTextField txtAforo;

	public DlgCreacionEventos() {
		setTitle("Creación de eventos");
		setBounds(100, 100, 647, 626);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {
		txtNombreEvento = new JTextField();
		txtNombreEvento.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombreEvento.setBounds(28, 85, 191, 20);
		contentPanel.add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		
		JLabel lblNombreEvento = new JLabel("Nombre del evento:");
		lblNombreEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombreEvento.setBounds(28, 61, 136, 14);
		contentPanel.add(lblNombreEvento);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaInicio.setBounds(28, 115, 136, 14);
		contentPanel.add(lblFechaInicio);
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.setBounds(28, 139, 194, 20);
		contentPanel.add(dateInicio);
		
		JLabel lblFechaFinEvento = new JLabel("Fecha del final:");
		lblFechaFinEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaFinEvento.setBounds(28, 180, 136, 15);
		contentPanel.add(lblFechaFinEvento);
		
		JDateChooser dateFin = new JDateChooser();
		dateFin.setBounds(28, 205, 191, 20);
		contentPanel.add(dateFin);
		
		JLabel lblHoraInicio = new JLabel("Hora de apertura:");
		lblHoraInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHoraInicio.setBounds(28, 244, 125, 15);
		contentPanel.add(lblHoraInicio);
		
		txtHoraInicio = new JTextField();
		txtHoraInicio.setBounds(28, 269, 191, 20);
		contentPanel.add(txtHoraInicio);
		txtHoraInicio.setColumns(10);
		
		JLabel lblHoraFin = new JLabel("Hora de finalizaci\u00F3n:");
		lblHoraFin.setFont(new Font("Arial", Font.PLAIN, 12));
		lblHoraFin.setBounds(28, 306, 149, 15);
		contentPanel.add(lblHoraFin);
		
		txtHoraFin = new JTextField();
		txtHoraFin.setBounds(28, 325, 191, 20);
		contentPanel.add(txtHoraFin);
		txtHoraFin.setColumns(10);
		
		JLabel lblUbicacion = new JLabel("Direcci\u00F3n:");
		lblUbicacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUbicacion.setBounds(28, 369, 149, 14);
		contentPanel.add(lblUbicacion);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setBounds(28, 393, 195, 20);
		contentPanel.add(txtUbicacion);
		txtUbicacion.setColumns(10);
		
		JLabel lblAforoMax = new JLabel("Aforo:");
		lblAforoMax.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAforoMax.setBounds(28, 423, 67, 19);
		contentPanel.add(lblAforoMax);
		
		txtAforo = new JTextField();
		txtAforo.setBounds(28, 440, 191, 20);
		contentPanel.add(txtAforo);
		txtAforo.setColumns(10);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(324, 281, 299, 220);
		contentPanel.add(textAreaDescripcion);
		
		JLabel lblImgEvento = new JLabel("");
		lblImgEvento.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\descarga.png"));
		lblImgEvento.setBounds(389, 53, 143, 137);
		contentPanel.add(lblImgEvento);
		
		JLabel lblDescripción = new JLabel("Descripci\u00F3n:");
		lblDescripción.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripción.setBounds(324, 259, 166, 14);
		contentPanel.add(lblDescripción);
		
		JButton btnImg = new JButton("SELECCIONAR FOTO:");
		btnImg.setFont(new Font("Arial", Font.BOLD, 12));
		btnImg.setBounds(366, 195, 202, 30);
		contentPanel.add(btnImg);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(177, 537, 104, 42);
		contentPanel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(366, 537, 109, 42);
		contentPanel.add(btnCancelar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(39, 41, 549, 2);
		contentPanel.add(separator);
		
		JLabel lblNewLabel = new JLabel("EVENTO");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(39, 10, 125, 33);
		contentPanel.add(lblNewLabel);
		
		
		
		
	}
}
