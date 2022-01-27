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

	public static void main(String[] args) {

		
	}

	public static void insEvento() throws Exception {
		String sResult;
		
		String sfecha ="";
		
		
		//String sDescripcion  = view.DlgCreacionEventos
		
		
		
		String url = URI + "ins-persona.php?dni="+ view.DlgCreacionEventos.txtNombreEvento.getText()+"&"
				
				+ "nombre="+view.DlgCreacionEventos.txtNombreEvento.getText()+"&"
				+ "fechaIni="+view.DlgCreacionEventos.dateIni+"&"
				+ "fechaFin="+view.DlgCreacionEventos.dateEnd+"&"
				+ "horaIni="+view.DlgCreacionEventos.txtHoraInicio.getText()+"&"
				+ "horaFin="+view.DlgCreacionEventos.txtHoraFin.getText()+"&"
				+ "direccion="+view.DlgCreacionEventos.txtDireccion.getText()+"&"
				+ "aforo="+view.DlgCreacionEventos.txtAforo.getText()+"+&"
				+ "descripcion="+view.DlgCreacionEventos.txtDescripcion.getText();
		
		sResult= url.replace(" ", "%20");
		
		System.out.println(url);

		String requesthttp = peticionhttp(sResult);
	}
	
	private static String peticionhttp(String urlWebService) throws Exception {
		String sLinea;

		StringBuilder resultado = new StringBuilder();

		// Realizar petición http

		URL url = new URL(urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");

		// Recoger datos de respuesta

		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while ((sLinea = br.readLine()) != null) {
			resultado.append(sLinea);
		}

		return resultado.toString();

	}
	
}
