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
import java.util.List;
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

	private static List<Evento> getTodosLosEventos() throws Exception {

		String url = URI + "get-evento.php";

		String requesthttp = peticionhttp(url);
		List<Evento> lstCoches = stringToListEvento(requesthttp);

		return lstCoches;
	}

	private static List<Evento> stringToListEvento(String requestHttp) throws Exception {
		List<Evento> lstCoche = new ArrayList();
		String url = URI + "get-evento.php";
		JSONArray jsonArr = new JSONArray(peticionhttp(url));

		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObjct = jsonArr.getJSONObject(i);

			Evento c = objJson2Evento(jsonObjct);
			lstCoche.add(c);
		}

		return lstCoche;
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
			System.out.println(e.getMessage());
		}

		return c;
	}

	public static Evento objJson2Evento(JSONObject jsonObjct) {

		Evento e = new Evento();

		// Extraer valores del objeto JSON

			int id;
			try {
				id = jsonObjct.getInt("idEvento");
				String sNombre = jsonObjct.getString("Nombre");
				String sFechaIni = jsonObjct.getString("FechaIni");
				String sFechaFin = jsonObjct.getString("FechaFin");
				int iAforo = jsonObjct.getInt("Aforo");
				String sDescripcion = jsonObjct.getString("Descripcion");
				String sDireccion = jsonObjct.getString("Direccion");
				
				 e = new Evento(id, sNombre, sFechaIni, sFechaFin, iAforo, sDescripcion, null, sDireccion);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		return e;
	}
	

	public static void getList() {
		DefaultTableModel tableQuery = new DefaultTableModel();
		String dataColumn[] = new String[7];
		try {
			String url = URI + "get-evento.php";
			int numCampos = numColumn;

			tableQuery.addColumn("Nombre");
			tableQuery.addColumn("Fecha de Inicio");
			tableQuery.addColumn("Fecha de finalización");
			tableQuery.addColumn("Aforo");
			tableQuery.addColumn("Descripción");
			tableQuery.addColumn("Imagen");
			tableQuery.addColumn("Direccion");

			for (int i = 0; i < stringToListEvento(url).size(); i++) {
				
					dataColumn[0]=getTodosLosEventos().get(i).getsNombreEvento();
					dataColumn[1]=getTodosLosEventos().get(i).getFechaInit();
					dataColumn[2]=getTodosLosEventos().get(i).getFechaFin();
					dataColumn[3]=String.valueOf(getTodosLosEventos().get(i).getAforo());
					dataColumn[4]=getTodosLosEventos().get(i).getDescripcion();
					dataColumn[5]=String.valueOf(getTodosLosEventos().get(i).getImagen());
					dataColumn[6]=getTodosLosEventos().get(i).getsDireccion();		
					
				tableQuery.addRow(dataColumn);

			}

			view.DlgDescripcionEventos.tableEventos.setModel(tableQuery);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void delEvento(String sEventName)  {
		
		try {
			String sResult;
			String url = URI + "del-evento.php?nombre=" + sEventName;

			sResult = url.replace(" ", "%20");
			
			String requesthttp = peticionhttp(sResult);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	
	public static void updEvento(){
		String sResultado="";
		String pepe;
		String url;
		
		try {
			
			url = URI + "upd-evento.php?nombre=" +view.DlgDescripcionEventos.sEventName + "&"
				+ "fechaini=" + view.DlgDescripcionEventos.sStartDate + "&" + "fechafin=" + view.DlgDescripcionEventos.sEndDate
				+ "&" + "direccion=" +view.DlgDescripcionEventos.sAddress + "&" + "aforo="
				+ view.DlgDescripcionEventos.iMaxPeople + "&" + "descripcion="
				+ view.DlgDescripcionEventos.sDescription+"&"+" nombreantiguo="+view.DlgDescripcionEventos.sEventNameAux;

		
		sResultado = url.replace(" ", "%20");
		System.out.println(view.DlgDescripcionEventos.sEventNameAux);
		System.out.println(sResultado);
		pepe= peticionhttp(sResultado);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
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
