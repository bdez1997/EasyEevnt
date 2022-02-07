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
		List<Persona> lstPersona = stringToListPersona(requesthttp);

		return lstPersona;
	}

	private static List<Persona> stringToListPersona(String requestHttp) throws Exception {
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
			String url = URI + "get-personas.php";
			int numCampos = numColumn;

			tableQuery.addColumn("DNI");
			tableQuery.addColumn("Nombre");
			tableQuery.addColumn("Apellidos");
			tableQuery.addColumn("Username");
			tableQuery.addColumn("Password");
			tableQuery.addColumn("Correo");
			tableQuery.addColumn("Telefono");
			tableQuery.addColumn("Rol");
			tableQuery.addColumn("Informacion");

			for (int i = 0; i < stringToListPersona(url).size(); i++) {
					dataColumn[0] = getAllPersona().get(i).getsDni();
					dataColumn[1] = getAllPersona().get(i).getsNombre();
					dataColumn[2] = getAllPersona().get(i).getsApellido();
					dataColumn[3] = getAllPersona().get(i).getsUsername();
					dataColumn[4] = getAllPersona().get(i).getsPassword();
					dataColumn[5] = getAllPersona().get(i).getsCorreo();
					dataColumn[6] = getAllPersona().get(i).getsTelefono();
					dataColumn[7] = getAllPersona().get(i).getsRol();
					dataColumn[8] = getAllPersona().get(i).getsInformacion();
				
				tableQuery.addRow(dataColumn);

			}
			view.DlgDescripcionPersonas.tablePersona.setModel(tableQuery);
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void updPersona(){
		String sResultado="";
		String persona;
		String url;
		
		try {
			
			url = URI + "upd-persona.php?dni=" +view.DlgDescripcionPersonas.sDni + "&nombre=" + view.DlgDescripcionPersonas.sNombrePersona + "&apellidos=" + view.DlgDescripcionPersonas.sApellidosPersona
				+ "&username=" +view.DlgDescripcionPersonas.sUsername + "&contrasena="
				+ view.DlgDescripcionPersonas.sPass + "&correo="
				+ view.DlgDescripcionPersonas.sCorreo + "&telefono=" + view.DlgDescripcionPersonas.sTelefono + "&rol=" + view.DlgDescripcionPersonas.sRol
				+ "&informacion=" + view.DlgDescripcionPersonas.sInformacion;

		
		sResultado = url.replace(" ", "%20");
		System.out.println(view.DlgDescripcionPersonas.sDni);
		System.out.println(sResultado);
		persona= peticionhttp(sResultado);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	

	public static void delPersona(String sDni)  {
		
		try {
			String sResult;
			String url = URI + "del-persona.php?dni=" + sDni;

			sResult = url.replace(" ", "%20");
			
			String requesthttp = peticionhttp(sResult);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static Persona getPersona() {

		String url = URI + "get-persona.php";
		Persona p = new Persona();
		String requesthttp;
		try {
			requesthttp = peticionhttp(url);
			p = stringToPersona(requesthttp);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return p;
	}
	
}


