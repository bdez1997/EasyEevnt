package DBLogic;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.*;

import model.Evento;

public class Logic {
	static final String URI = "https://proyectogestioneventos.atwebpages.com/irene/";
	
	public static void main(String[] args) {
		
	}
	
	/*private static Evento getEvento(int id) throws Exception {
		// TODO Auto-generated method stub
		String sUrl = URI + "lst-eventos.php?id=" + id;
		String requestHttp = peticionHttp(sUrl);
		
		//Evento c = stringToCoche(requestHttp);
		
		return c;
	}*/
	
	private static String peticionHttp(String urlWebService) throws Exception {
		StringBuilder sbResultado = new StringBuilder();
		
		//Realizar peticion HTTP
		URL url = new URL (urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection(); 
		conn.setRequestMethod("GET");
		
		//Recoger datos de respuesta
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String sLinea;
		
		while((sLinea = br.readLine()) != null) {
			sbResultado.append(sLinea);
		}
		
		return sbResultado.toString();
	}
	
	
	
}
