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

public class CtrlPersonas {
	private static int numColumn;
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

		URL url = new URL(urlWebService);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");


		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while ((sLinea = br.readLine()) != null) {
			resultado.append(sLinea);
		}

		return resultado.toString();

	}
	
	
	private static List<Persona> getAllPersona() throws Exception {

		String url = URI + "get-personas.php";

		String requesthttp = peticionhttp(url);
		List<Persona> lstPersona = stringToListEvento(requesthttp);

		return lstPersona;
	}

	private static List<Persona> stringToListEvento(String requestHttp) throws Exception {
		List<Persona> lstPersona = new ArrayList();
		String url = URI + "get-personas.php";
		JSONArray jsonArr = new JSONArray(peticionhttp(url));

		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObjct = jsonArr.getJSONObject(i);

			Persona p = objJson2Persona(jsonObjct);
			lstPersona.add(p);
		}

		return lstPersona;
	}
	
	public static Persona stringToPersona(String requesthttp) {

		Persona p = new Persona();
		JSONArray jsonArr;
		try {
			jsonArr = new JSONArray(requesthttp);
			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObjct = jsonArr.getJSONObject(i);

				p = objJson2Persona(jsonObjct);
				System.out.println(p);
			}
		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}

		return p;
	}

	public static Persona objJson2Persona(JSONObject jsonObjct) {

		Persona p = new Persona();
			try {
				String DNI = jsonObjct.getString("DNI");
				String nombre = jsonObjct.getString("Nombre");
				String apellidos = jsonObjct.getString("Apellidos");
				String user = jsonObjct.getString("Username");
				String pass = jsonObjct.getString("Contrasena");
				String correo = jsonObjct.getString("Correo");
				String telefono = jsonObjct.getString("Direccion");
				String rol = jsonObjct.getString("Rol");
				String informacion = jsonObjct.getString("Informacion");
				
				 p = new Persona(DNI, nombre, apellidos, user, pass, correo, telefono, rol, informacion);
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		return p;
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
				
					dataColumn[0]=getAllPersona().get(i).getsNombreEvento();
					dataColumn[1]=getAllPersona().get(i).getFechaInit();
					dataColumn[2]=getAllPersona().get(i).getFechaFin();
					dataColumn[3]=String.valueOf(getAllPersona().get(i).getAforo());
					dataColumn[4]=getAllPersona().get(i).getDescripcion();
					dataColumn[5]=String.valueOf(getAllPersona().get(i).getImagen());
					dataColumn[6]=getAllPersona().get(i).getsDireccion();		
					
				tableQuery.addRow(dataColumn);

			}

			view.DlgDescripcionEventos.tableEventos.setModel(tableQuery);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


