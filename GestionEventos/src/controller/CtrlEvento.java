package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.awt.Image;

import javax.swing.table.DefaultTableModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;

import model.Evento;

public class CtrlEvento {
	private static int numColumn;
	static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";

	public static void insEvento() throws Exception {
		String sResult;

		String url = URI + "ins-evento.php?nombre=" + view.DlgCreacionEventos.txtNombreEvento.getText() + "&"

				+ "fechaini=" + view.DlgCreacionEventos.dateIni + "&" + "fechafin=" + view.DlgCreacionEventos.dateEnd
				+ "&" + "direccion=" + view.DlgCreacionEventos.txtDireccion.getText() + "&" + "aforo="
				+ view.DlgCreacionEventos.txtAforo.getText() + "+&" + "descripcion="
				+ view.DlgCreacionEventos.txtDescripcion.getText();

		System.out.println(url);
		sResult = url.replace(" ", "%20");
		String requesthttp = peticionhttp(sResult);

	}

	public static Evento stringToEvento(String requesthttp) {

		Evento c = new Evento();
		JSONArray jsonArr;
		try {
			jsonArr = new JSONArray(requesthttp);
			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObjct = jsonArr.getJSONObject(i);

				c = objJson2Evento(jsonObjct);
				System.out.println(c);
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	private static Evento objJson2Evento(JSONObject jsonObjct) {

		Evento c = new Evento();

		// Extraer valores del objeto JSON

		try {
			int id = jsonObjct.getInt("idEvento");
			String sNombre = jsonObjct.getString("Nombre");
			String sFechaIni = jsonObjct.getString("FechaIni");
			String sFechaFin = jsonObjct.getString("FechaFin");
			int iAforo = jsonObjct.getInt("Aforo");
			String sDescripcion = jsonObjct.getString("Descrripcion");
			String sDireccion = jsonObjct.getString("Direccion");

			Evento e = new Evento(id, sNombre, sFechaIni, sFechaFin, iAforo, sDescripcion, null, sDireccion);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	/*
	 * public static void getList() { DefaultTableModel tableQuery = new
	 * DefaultTableModel();
	 * 
	 * try {
	 * 
	 * int numCampos = numColumn;
	 * 
	 * tableQuery.addColumn("Nombre"); tableQuery.addColumn("Fecha de Inicio");
	 * tableQuery.addColumn("Fecha de finalización"); tableQuery.addColumn("Aforo");
	 * tableQuery.addColumn("Descripción"); tableQuery.addColumn("Imagen");
	 * tableQuery.addColumn("Direccion");
	 * 
	 * String[] sShowDataColumn = new String[7];
	 * 
	 * ArrayList<Evento> eventList = jsonToEvent(URI + "get-evento.php"); for (int i
	 * = 0; i < eventList.size(); i++) {
	 * 
	 * sShowDataColumn[0] = eventList.get(i).getsNombreEvento(); sShowDataColumn[1]
	 * = eventList.get(i).getFechaInit(); sShowDataColumn[2] =
	 * eventList.get(i).getFechaFin(); sShowDataColumn[3] =
	 * String.valueOf(eventList.get(i).getAforo()); sShowDataColumn[4] =
	 * eventList.get(i).getDescripcion(); sShowDataColumn[5]
	 * =String.valueOf(eventList.get(i).getImagen()); sShowDataColumn[6] =
	 * eventList.get(i).getsDireccion();
	 * 
	 * } tableQuery.addRow(sShowDataColumn);
	 * 
	 * view.DescripcionEventos.tableEventos.setModel(tableQuery); } catch (Exception
	 * e) { e.printStackTrace(); } }
	 */

	public static void delEvento() throws Exception {
		String sResult;
		String url = URI + "del-evento.php?nombre=" + view.DlgCreacionEventos.txtNombreEvento.getText();

		sResult = url.replace(" ", "%20");
		String requesthttp = peticionhttp(sResult);
	}

	private static Evento getEvento() {

		String url = URI + "get-evento.php";
		Evento c = new Evento();
		String requesthttp;
		try {
			requesthttp = peticionhttp(url);
			c = stringToEvento(requesthttp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
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
