package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.Evento;
import model.Persona;

public class CtrlPerfil {
	private static int numColumn;
	private static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";

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

	public static void updPersona() {
		String sResultado = "";
		String persona;
		String url;

		try {

			url = URI + "upd-persona.php?dni=" + controller.CtrlLogin.sDni + "&nombre="
					+ view.DlgPerfil.txtNombreP.getText() + "&apellidos=" + view.DlgPerfil.txtApellidosP.getText()
					+ "&username=" + view.DlgPerfil.txtUserP.getText() + "&password="
					+ view.DlgPerfil.txtPassP.getText() + "&correo=" + view.DlgPerfil.txtCorreoP.getText()
					+ "&telefono=" + view.DlgPerfil.txtTelefonoP.getText() + "&rol=" + view.DlgPerfil.txtRolP.getText()
					+ "&informacion=" + view.DlgPerfil.txtInfoP.getText();

			sResultado = url.replace(" ", "%20");
			System.out.println(sResultado);
			persona = peticionhttp(sResultado);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
