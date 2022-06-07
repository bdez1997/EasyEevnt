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
import model.PersonaEvento;

public class CtrlPersonaEvento {
	static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";

	private static List<PersonaEvento> stringToListPersonaEvento(String requestHttp) throws Exception {
		List<PersonaEvento> lstPersonas = new ArrayList<>();
		String url = URI + "get-personaeventoid.php";
		JSONArray jsonArr = new JSONArray(peticionhttp(url));
		
		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObj = jsonArr.getJSONObject(i);

			PersonaEvento p = objJsonToPersonaEvento(jsonObj);
			lstPersonas.add(p);
		}

		return lstPersonas;
	}

	private static List<PersonaEvento> getAllPersonaEvento() throws Exception {

		String url = URI + "get-personaeventoid.php";

		String requesthttp = peticionhttp(url);
		ArrayList<PersonaEvento> lstPersona = (ArrayList<PersonaEvento>) stringToListPersonaEvento(requesthttp);

		return lstPersona;
	}

	public static PersonaEvento objJsonToPersonaEvento(JSONObject jsonObjct) {

		PersonaEvento pe = null;
		try {
			String PersonaDni = jsonObjct.getString("PersonasDNI");
			int EventoId = jsonObjct.getInt("EventoId");
			String sValoracion = jsonObjct.getString("Valoracion");
			float fPuntuacion = (float) jsonObjct.getDouble("Puntuacion");

			pe = new PersonaEvento(PersonaDni, EventoId, sValoracion, fPuntuacion);

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return pe;
	}

	public static PersonaEvento stringToPersonaEvento(String requesthttp) {

		PersonaEvento pe = new PersonaEvento();
		JSONArray jsonArr;
		try {
			jsonArr = new JSONArray(requesthttp);
			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObjct = jsonArr.getJSONObject(i);

				pe = objJsonToPersonaEvento(jsonObjct);
			}
		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}

		return pe;
	}

	public static void getListPersonaEvento() {

		DefaultTableModel tableQuery = new DefaultTableModel();
		String dataColumn[] = new String[4];

		try {
			String url = URI + "get-personaeventoid.php";

			tableQuery.addColumn("DNI");
			tableQuery.addColumn("EventoId");
			tableQuery.addColumn("Valoracion");
			tableQuery.addColumn("Puntuacion");

			for (int i = 0; i <stringToListPersonaEvento(url).size(); i++) {
				System.out.println("Entra cabeza");
				dataColumn[0] = getAllPersonaEvento().get(i).getsDni();
				dataColumn[1] = String.valueOf(getAllPersonaEvento().get(i).getiEventoId());
				dataColumn[2] = getAllPersonaEvento().get(i).getsValoracion();
				dataColumn[3] = String.valueOf(getAllPersonaEvento().get(i).getfPuntuacion());
				
				tableQuery.addRow(dataColumn);

			}
			//view.DlgPersonaEvento.tblPersonaEvento.setModel(tableQuery);
		} catch (Exception e) {

			e.printStackTrace();
		}
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
