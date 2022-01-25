package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CtrlEasyEvent {
	
	static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";

	
	private static void insPersonas() throws Exception {
		
		String passText = new String(view.DlgCreacionPersona.txtPass);

		String url = URI + "ins-persona.php?dni=4567891b&"
				+ "nombre="+view.DlgCreacionPersona.txtNombre.getText()+"&"
				+ "apellidos="+view.DlgCreacionPersona.txtApellido.getText()+"&"
				+ "username="+view.DlgCreacionPersona.txtUsername.getText()+"&"
				+ "password="+sPass+"&"
				+ "correo="+view.DlgCreacionPersona.txtCorreo+"&"
				+ "telefono=666555444&"
				+ "rol=admin&"
				+ "informacion=testeo";

		String requesthttp = peticionhttp(url);

		return lstCoches;
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
