package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CtrlPersonas {
	
private static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";
	
public static void insPersonas() throws Exception {
		
		String sPass = new String(view.DlgCreacionPersona.txtPass.getPassword());
		String sResult;
		
		String url = URI + "ins-persona.php?dni="+view.DlgCreacionPersona.txtDni.getText()+"&"
				+ "nombre="+view.DlgCreacionPersona.txtNombre.getText()+"&"
				+ "apellidos="+view.DlgCreacionPersona.txtApellido.getText()+"&"
				+ "username="+view.DlgCreacionPersona.txtUsername.getText()+"&"
				+ "password="+sPass+"&"
				+ "correo="+view.DlgCreacionPersona.txtCorreo.getText()+"&"
				+ "telefono="+view.DlgCreacionPersona.txtTelf.getText()+"&"
				+ "rol="+view.DlgCreacionPersona.txtRol.getText()+"+&"
				+ "informacion="+view.DlgCreacionPersona.txtInformacion.getText();
		
		sResult= url.replace(" ", "%20");

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
