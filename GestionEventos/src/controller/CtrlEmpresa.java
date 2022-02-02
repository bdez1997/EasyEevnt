package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CtrlEmpresa {

	private static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";
	
	public static void insetarEmpresa() throws Exception{
		
		String resultado;
		
		String url = URI + "ins-empresa.php?nif="+ view.DlgCreacionEmpresa.txtNIF.getText()+"&"
				
				+ "nombre="+view.DlgCreacionEmpresa.txtNombre.getText() +"&"
				+ "correo="+view.DlgCreacionEmpresa.txtCorreo+"&"
				+ "telefono="+view.DlgCreacionEmpresa.txtTelf.getText();
		
		resultado = url.replace(" ", "%20");
		
		String requesthttp = peticionhttp(resultado);		
		System.out.println("Insertado correctamente");
		
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
