package view;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;

public class DlgCreacionEventos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextArea txtDescripcion;
	public static JTextField txtNombreEvento;
	public static JTextField txtHoraInicio;
	public static JTextField txtHoraFin;
	public static JTextField txtDireccion;
	public static JTextField txtAforo;
	public static String dateIni, dateEnd;
	public static JDateChooser dateInicio;
	public static JDateChooser dateFin;

	private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de imagen", ".png", ".jpg");
	String sRuta = "";

	public DlgCreacionEventos() {
		setTitle("Creación de eventos");
		setBounds(100, 100, 611, 626);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
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

		// CALENDARIO
		dateInicio = new JDateChooser();
		dateInicio.setBounds(28, 139, 194, 20);
		dateIni = ((JTextField) dateInicio.getDateEditor().getUiComponent()).getText();

		dateFin = new JDateChooser();
		dateFin.setBounds(28, 205, 191, 20);
		dateEnd = ((JTextField) dateFin.getDateEditor().getUiComponent()).getText();
		contentPanel.add(dateFin);
		contentPanel.add(dateInicio);

		/////////

		JLabel lblFechaFinEvento = new JLabel("Fecha del final:");
		lblFechaFinEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaFinEvento.setBounds(28, 180, 136, 15);
		contentPanel.add(lblFechaFinEvento);

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

		txtDireccion = new JTextField();
		txtDireccion.setBounds(28, 393, 195, 20);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);

		JLabel lblAforoMax = new JLabel("Aforo:");
		lblAforoMax.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAforoMax.setBounds(28, 423, 67, 19);
		contentPanel.add(lblAforoMax);

		txtAforo = new JTextField();
		txtAforo.setBounds(28, 440, 191, 20);
		contentPanel.add(txtAforo);
		txtAforo.setColumns(10);

		txtDescripcion = new JTextArea();
		txtDescripcion.setBounds(278, 281, 299, 179);
		contentPanel.add(txtDescripcion);

		JLabel lblImgEvento = new JLabel("");
		lblImgEvento.setIcon(new ImageIcon("img/users-icon.png"));
		lblImgEvento.setBounds(294, 61, 143, 137);
		contentPanel.add(lblImgEvento);

		JLabel lblDescripción = new JLabel("Descripci\u00F3n:");
		lblDescripción.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDescripción.setBounds(278, 257, 166, 14);
		contentPanel.add(lblDescripción);

		JButton btnImg = new JButton("SELECCIONAR FOTO:");
		btnImg.setForeground(new Color(255, 255, 255));
		btnImg.setBackground(new Color(65, 105, 225));
		btnImg.setFont(new Font("Arial", Font.BOLD, 12));
		btnImg.setBounds(275, 205, 169, 30);
		contentPanel.add(btnImg);

		btnImg.addActionListener(e -> {
			JFileChooser img = new JFileChooser();
			img.setFileFilter(filtro);

			// ventana de dialogo
			int option = img.showOpenDialog(this);

			if (option == JFileChooser.APPROVE_OPTION) {
				String imgPath = img.getSelectedFile().getPath();
				String imgString = img.getSelectedFile().toString();
				lblImgEvento.setIcon(new ImageIcon(imgPath));
				ImageIcon icon = new ImageIcon(imgPath);
				Image imgIcon = icon.getImage();

				ImageIcon newIcon = new ImageIcon(imgIcon);
				lblImgEvento.setIcon(newIcon);
				lblImgEvento.setSize(155, 155);
			}

		});

		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(65, 105, 225));
		btnGuardar.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardar.setBounds(149, 523, 104, 42);
		contentPanel.add(btnGuardar);

		btnGuardar.addActionListener(e -> {

			try {
				controller.CtrlEvento.insEvento();
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
			}

			dispose();
		});

		JButton btnCancelar = new JButton("CANCELAR");
		btnCancelar.setForeground(new Color(255, 255, 255));
		btnCancelar.setBackground(new Color(65, 105, 225));
		btnCancelar.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancelar.setBounds(317, 523, 109, 42);
		contentPanel.add(btnCancelar);

		btnCancelar.addActionListener(e -> {
			dispose();
		});

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(39, 41, 549, 2);
		contentPanel.add(separator);

		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setFont(new Font("Calibri", Font.BOLD, 25));
		lblEvento.setBounds(39, 10, 125, 33);
		contentPanel.add(lblEvento);

	}
}
