package controller;

import java.awt.Component;
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

import model.Empresa;

public class CtrlEmpresa {

	private static int numColumn;
	private static final String URI = "http://proyectogestioneventos.atwebpages.com/php/";

	public static void insertarEmpresa() throws Exception {

		String resultado;

		String url = URI + "ins-empresa.php?nif=" + view.DlgCreacionEmpresa.txtNIF.getText() + "&"

				+ "nombre=" + view.DlgCreacionEmpresa.txtNombre.getText() + "&" + "correo="
				+ view.DlgCreacionEmpresa.txtCorreo.getText() + "&" + "telefono="
				+ view.DlgCreacionEmpresa.txtTelf.getText();

		resultado = url.replace(" ", "%20");

		String requesthttp = peticionhttp(resultado);
		System.out.println("Insertado correctamente");

	}

	public static void eliminarEmpresa(String NIF) {

		try {
			String resultado;
			String url = URI + "del-empresa.php?NIF=" + NIF;

			resultado = url.replace(" ", "%20");

			String requesthttp = peticionhttp(resultado);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void updateEmpresa() {

		String resultado = "";
		String empresa;
		String url;

		try {

			url = URI + "upd-empresa.php?NIF=" + view.DlgDescripcionEmpresa.nif + "&nombreEmpresa="
					+ view.DlgDescripcionEmpresa.nombre + "&telefono=" + view.DlgDescripcionEmpresa.telefono
					+ "&correo=" + view.DlgDescripcionEmpresa.correo;
			resultado = url.replace(" ", "%20");
			System.out.println(view.DlgDescripcionEmpresa.nif);
			System.out.println(resultado);
			empresa = peticionhttp(resultado);

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

	public static void getListEmpresa() {

		DefaultTableModel tableQuery = new DefaultTableModel();
		String dataColumn[] = new String[4];

		try {
			String url = URI + "get-empresa.php";
			int numCampos = numColumn;

			tableQuery.addColumn("NIF");
			tableQuery.addColumn("NombreEmpresa");
			tableQuery.addColumn("Telefono");
			tableQuery.addColumn("Correo");

			for (int i = 0; i < stringToListEmpresa(url).size(); i++) {
				dataColumn[0] = getAllEmpresa().get(i).getNif();
				dataColumn[1] = getAllEmpresa().get(i).getNombre();
				dataColumn[2] = getAllEmpresa().get(i).getTelefono();
				dataColumn[3] = getAllEmpresa().get(i).getCorreo();

				tableQuery.addRow(dataColumn);

			}
			view.DlgDescripcionEmpresa.tableEmpresa.setModel(tableQuery);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	private static List<Empresa> getAllEmpresa() throws Exception {

		String url = URI + "get-empresa.php";

		String requesthttp = peticionhttp(url);
		ArrayList<Empresa> lstEmpresa = (ArrayList<Empresa>) stringToListEmpresa(requesthttp);

		return lstEmpresa;
	}

	private static List<Empresa> stringToListEmpresa(String requestHttp) throws Exception {
		List<Empresa> lstEmpresa = new ArrayList<>();
		String url = URI + "get-empresa.php";
		JSONArray jsonArr = new JSONArray(peticionhttp(url));

		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObj = jsonArr.getJSONObject(i);

			Empresa p = objJsonToEmpresa(jsonObj);
			lstEmpresa.add(p);
		}

		return lstEmpresa;
	}

	public static Empresa stringToEmpresa(String requesthttp) {

		Empresa p = new Empresa(requesthttp);
		JSONArray jsonArr;
		try {
			jsonArr = new JSONArray(requesthttp);
			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObjct = jsonArr.getJSONObject(i);

				p = objJsonToEmpresa(jsonObjct);

			}
		} catch (JSONException e) {
			System.out.println(e.getMessage());
		}

		return p;
	}

	public static Empresa objJsonToEmpresa(JSONObject jsonObjct) {

		Empresa p = null;
		try {
			String NIF = jsonObjct.getString("NIF");
			String nombre = jsonObjct.getString("NombreEmpresa");
			String correo = jsonObjct.getString("Correo");
			String telefono = jsonObjct.getString("Telefono");

			p = new Empresa(NIF, nombre, correo, telefono);

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return p;
	}

}
