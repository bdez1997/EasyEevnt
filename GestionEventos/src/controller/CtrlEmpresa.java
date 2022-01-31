package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CtrlEmpresa {
	
	static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";
	
	public static void insertarEmpresa() throws Exception {
		String sResult;
		
		String url = URI + "ins-evento.php?nombre="+ view.DlgCreacionEmpresa.txtNIF.getText()+"&"
				
				+ "NIF="+view.DlgCreacionEmpresa.txtNIF.getText()+"&"
				+ "Correo="+view.DlgCreacionEmpresa.txtCorreo.getText()+"&"
				+ "Telefono="+view.DlgCreacionEmpresa.txtTelf.getText() +"&"
				+ "NombreEmpresa="+view.DlgCreacionEmpresa.txtNombre.getText();
				
					
		sResult= url.replace(" ", "%20");
		String requesthttp = peticionhttp(sResult);
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
