package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;

public class CtrlEvento {
	
	static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";


	public static void insEvento() throws Exception {
		String sResult;
		
		String url = URI + "ins-evento.php?nombre="+ view.DlgCreacionEventos.txtNombreEvento.getText()+"&"
				
				+ "fechaini="+view.DlgCreacionEventos.dateIni +"&"
				+ "fechafin="+view.DlgCreacionEventos.dateEnd+"&"
				+ "direccion="+view.DlgCreacionEventos.txtDireccion.getText()+"&"
				+ "aforo="+view.DlgCreacionEventos.txtAforo.getText()+"+&"
				+ "descripcion="+view.DlgCreacionEventos.txtDescripcion.getText();

		System.out.println(url);
		sResult= url.replace(" ", "%20");
		String requesthttp = peticionhttp(sResult);
		
	}
	
	
	public static void delEvento() throws Exception {
		String sResult;
		String url = URI + "del-evento.php?nombre="+ view.DlgCreacionEventos.txtNombreEvento.getText();
		
		sResult= url.replace(" ", "%20");
		String requesthttp = peticionhttp(sResult);
	}
	
	
	private static String peticionhttp(String urlWebService) throws Exception {
		String sLinea;

		StringBuilder resultado = new StringBuilder();

		URL url = new URL(urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");


		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while ((sLinea = br.readLine()) != null) {
			resultado.append(sLinea);
		}

		return resultado.toString();

	}
	
}
