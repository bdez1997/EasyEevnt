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

public class DlgCreacionEventos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombreEvento;
	private JTextField txtHoraInicio;
	private JTextField txtHoraFin;
	private JTextField txtUbicacion;
	private JTextField txtAforo;

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
		txtNombreEvento.setBounds(28, 61, 191, 20);
		contentPanel.add(txtNombreEvento);
		txtNombreEvento.setColumns(10);
		
		JLabel lblNombreEvento = new JLabel("Nombre del evento:");
		lblNombreEvento.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNombreEvento.setBounds(28, 39, 136, 14);
		contentPanel.add(lblNombreEvento);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio del evento:");
		lblFechaInicio.setBounds(28, 92, 191, 14);
		contentPanel.add(lblFechaInicio);
		
		JDateChooser dateInicio = new JDateChooser();
		dateInicio.setBounds(28, 117, 194, 20);
		contentPanel.add(dateInicio);
		
		JLabel lblFechaFinEvento = new JLabel("Fecha del final del evento:");
		lblFechaFinEvento.setBounds(28, 148, 191, 14);
		contentPanel.add(lblFechaFinEvento);
		
		JDateChooser dateFin = new JDateChooser();
		dateFin.setBounds(28, 173, 191, 20);
		contentPanel.add(dateFin);
		
		JLabel lblHoraInicio = new JLabel("Hora en la que se iniciar\u00E1 el evento:");
		lblHoraInicio.setBounds(28, 203, 191, 14);
		contentPanel.add(lblHoraInicio);
		
		txtHoraInicio = new JTextField();
		txtHoraInicio.setBounds(28, 228, 191, 20);
		contentPanel.add(txtHoraInicio);
		txtHoraInicio.setColumns(10);
		
		JLabel lblHoraFin = new JLabel("Hora en la que finalizar\u00E1 el evento:");
		lblHoraFin.setBounds(28, 259, 191, 14);
		contentPanel.add(lblHoraFin);
		
		txtHoraFin = new JTextField();
		txtHoraFin.setBounds(28, 284, 191, 20);
		contentPanel.add(txtHoraFin);
		txtHoraFin.setColumns(10);
		
		JLabel lblUbicacion = new JLabel("Indique donde se realizar\u00E1 el evento:");
		lblUbicacion.setBounds(28, 312, 191, 14);
		contentPanel.add(lblUbicacion);
		
		txtUbicacion = new JTextField();
		txtUbicacion.setBounds(28, 336, 195, 20);
		contentPanel.add(txtUbicacion);
		txtUbicacion.setColumns(10);
		
		JLabel lblAforoMax = new JLabel("Indique cuantas personas asistir\u00E1n al evento:");
		lblAforoMax.setBounds(28, 367, 226, 14);
		contentPanel.add(lblAforoMax);
		
		txtAforo = new JTextField();
		txtAforo.setBounds(28, 396, 191, 20);
		contentPanel.add(txtAforo);
		txtAforo.setColumns(10);
		
		JTextArea textAreaDescripcion = new JTextArea();
		textAreaDescripcion.setBounds(322, 60, 299, 220);
		contentPanel.add(textAreaDescripcion);
		
		JLabel lblImgEvento = new JLabel("");
		lblImgEvento.setIcon(new ImageIcon("C:\\Users\\Usuario\\Desktop\\descarga.png"));
		lblImgEvento.setBounds(409, 284, 149, 151);
		contentPanel.add(lblImgEvento);
		
		JLabel lblDescripción = new JLabel("A\u00F1ada una descripci\u00F3n al evento:");
		lblDescripción.setBounds(392, 39, 166, 14);
		contentPanel.add(lblDescripción);
		
		JButton btnImg = new JButton("Cambiar foto de perfil");
		btnImg.setBounds(409, 440, 149, 23);
		contentPanel.add(btnImg);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(165, 541, 89, 23);
		contentPanel.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(338, 541, 89, 23);
		contentPanel.add(btnCancelar);
		
		
		
		
	}
}
