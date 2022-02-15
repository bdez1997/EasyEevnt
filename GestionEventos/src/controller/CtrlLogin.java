package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONException;
import org.json.JSONObject;

import model.Persona;

public class CtrlLogin {
	
	static String pass = new String(view.FrmLogin.passwordField.getPassword());
	private static final String URI = "http://proyectogestioneventos.atwebpages.com/php/sel-user.php?user="+view.FrmLogin.txtUser.getText()+"&contrasena="+pass;
	
	private static String readAll(Reader rd) throws IOException {
	    StringBuilder sb = new StringBuilder();
	    int cp;
	    while ((cp = rd.read()) != -1) {
	      sb.append((char) cp);
	    }
	    return sb.toString();
	  }
	
	public static boolean Login() {
       boolean login = false; 
       
       	JSONObject jsonObj = new JSONObject();
        String sUser = null ;
        String sContrasena = null;
        
        
		try {
			jsonObj=readJsonFromUrl(URI);
			sUser = jsonObj.getString("Username");
			sContrasena = jsonObj.getString("Contrasena");
			System.out.println(sUser);
		} catch (JSONException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (view.FrmLogin.txtUser.getText().equals(sUser)&&pass.equals(sContrasena)) {
			login=true;
		} else {
			System.out.println("Contraseña incorrecta");
		}
		
		return login;
      
    }
	
	 public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }
	
	
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
