package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.bermudez.gestioneventoandroid.models.Persona;

import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class RegistroActivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtApellidos;
    EditText txtDni;
    EditText txtTelefono;
    EditText txtEmail;
    EditText txtUser;
    EditText txtPass;
    EditText txtInformacion;
    Spinner spinnerRoles;

    EditText txtId;
    String hosting = "http://proyectogestioneventos.atwebpages.com/irene/";
    Evento evento;
    ArrayList<Evento> lstEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    private void obtenerTodos() {
        String url = "http://proyectogestioneventos.atwebpages.com/php/get-evento.php";
        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    try {
                        JSONObject json = new JSONObject(s);
                        jsonToEvent(json);
                        finish();

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                },
                r ->{

                }

        ));
    }

    private void jsonToEvent(JSONObject json) throws JSONException {

        int id = json.getInt("idEvento");
        String nombre = json.getString("Nombre");
        String fechaIni = json.getString("FechaIni");
        String fechaFin = json.getString("FechaFin");
        int aforo = json.getInt("Aforo");
        String descripcion = json.getString("Descripcion");
        //String imagen = json.getString("Imagen");
        String direccion = json.getString("Direccion");

        Evento jsonEvento = new Evento(id,nombre, fechaIni, fechaFin, aforo, descripcion, direccion);
        Store.miEvento = jsonEvento;
        Log.i("MI USUARIO", Store.miEvento.toString());
    }

}