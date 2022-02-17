package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgEditarEventos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static JTextArea txtDescripcionEdit;
	public static JTextField txtNombreEventoEdit;
	public static JTextField txtDireccionEdit;
	public static JTextField txtAforoEdit;
	public static String dateIniEdit, dateEndEdit;
	public static JDateChooser dateInicioEdit;
	public static Date dateTest;
	public static JDateChooser dateFinEdit;
	
	private FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de imagen", ".png" , ".jpg");
	String sRuta="";

	public DlgEditarEventos() {
		setModal(true);

		this.setResizable(false);
		setTitle("Editar eventos");
		setBounds(100, 100, 611, 626);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(230, 230, 250));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		setIconImage(Toolkit.getDefaultToolkit().createImage("img/easyeventgrande.png"));
		contentPanel.setLayout(null);
		crearComponentes();
		setVisible(true);
	}

	private void crearComponentes() {
		
		
		txtNombreEventoEdit = new JTextField();
		txtNombreEventoEdit.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNombreEventoEdit.setBounds(28, 108, 191, 20);
		txtNombreEventoEdit.setText(view.DlgDescripcionEventos.sEventName);
		contentPanel.add(txtNombreEventoEdit);
		txtNombreEventoEdit.setColumns(10);
		
		
		JLabel lblNombreEvento = new JLabel("Nombre del evento:");
		lblNombreEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNombreEvento.setBounds(28, 84, 136, 14);
		contentPanel.add(lblNombreEvento);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio:");
		lblFechaInicio.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaInicio.setBounds(28, 150, 136, 14);
		
		contentPanel.add(lblFechaInicio);
		
		
		//CALENDARIO
		
		dateInicioEdit = new JDateChooser();		
		dateInicioEdit.setDate(null);
		dateInicioEdit.setBounds(28, 178, 194, 20);
		
	
		dateFinEdit = new JDateChooser();
		dateFinEdit.setBounds(28, 251, 191, 20);
		
		contentPanel.add(dateFinEdit);
		contentPanel.add(dateInicioEdit);
		
		/////////
		
		JLabel lblFechaFinEvento = new JLabel("Fecha del final:");
		lblFechaFinEvento.setFont(new Font("Arial", Font.PLAIN, 12));
		lblFechaFinEvento.setBounds(28, 226, 136, 15);
		contentPanel.add(lblFechaFinEvento);
		
		JLabel lblUbicacion = new JLabel("Direcci\u00F3n:");
		lblUbicacion.setFont(new Font("Arial", Font.PLAIN, 12));
		lblUbicacion.setBounds(28, 304, 149, 14);
		contentPanel.add(lblUbicacion);
		
		txtDireccionEdit = new JTextField();
		txtDireccionEdit.setBounds(28, 328, 195, 20);
		txtDireccionEdit.setText(view.DlgDescripcionEventos.sAddress);
		contentPanel.add(txtDireccionEdit);
		txtDireccionEdit.setColumns(10);
		
		JLabel lblAforoMax = new JLabel("Aforo:");
		lblAforoMax.setFont(new Font("Arial", Font.PLAIN, 12));
		lblAforoMax.setBounds(28, 379, 67, 19);
		contentPanel.add(lblAforoMax);
		
		txtAforoEdit = new JTextField();
		txtAforoEdit.setBounds(28, 408, 191, 20);
		txtAforoEdit.setText(view.DlgDescripcionEventos.iMaxPeople);
		contentPanel.add(txtAforoEdit);
		txtAforoEdit.setColumns(10);
		
		txtDescripcionEdit = new JTextArea();
		txtDescripcionEdit.setBounds(278, 281, 299, 179);
		txtDescripcionEdit.setText(view.DlgDescripcionEventos.sDescription);
		contentPanel.add(txtDescripcionEdit);
		
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
			
			//ventana de dialogo
			int option = img.showOpenDialog(this);
			
			if(option == JFileChooser.APPROVE_OPTION) {
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
		
		JButton btnGuardarEvento = new JButton("GUARDAR");
		
		btnGuardarEvento.setForeground(new Color(255, 255, 255));
		btnGuardarEvento.setBackground(new Color(65, 105, 225));
		btnGuardarEvento.setFont(new Font("Arial", Font.BOLD, 12));
		btnGuardarEvento.setBounds(149, 523, 104, 42);
		contentPanel.add(btnGuardarEvento);
		
		
		btnGuardarEvento.addActionListener(e -> {
			
			
			try {
				controller.CtrlEvento.insEvento();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
		
		btnGuardarEvento.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				String startDateStringInit = dateFormat.format(dateInicioEdit.getDate());
				String startDateStringFin = dateFormat.format(dateFinEdit.getDate());
				dateIniEdit = startDateStringInit;
				dateEndEdit = startDateStringFin;
				
				controller.CtrlEvento.updEvento();
				
			}
			
		});
		
	}
}
