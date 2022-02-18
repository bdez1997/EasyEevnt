package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.bermudez.gestioneventoandroid.models.Persona;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class InfoEvento extends AppCompatActivity {

    Toolbar toolbar;

    TextView lblInformacionEvent;
    TextView lblFechaIniEvent;
    TextView lblFechaFinEvent;
    TextView lblDireccionEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_evento);
        /////////////////////////////////////////////////////
        extraerInformacion();
        //////////////////////////////////////////////////////
       lblInformacionEvent = findViewById(R.id.lblInformacionEvent);
        lblFechaIniEvent = findViewById(R.id.lblFechaIniEvent);
        lblFechaFinEvent = findViewById(R.id.lblFechaFinEvent);
        lblDireccionEvent = findViewById(R.id.lblDireccionEvent);

        ///////////////////////////////////////////////////////



        findViewById(R.id.btnAsistirEvento).setOnClickListener(e -> {

            String dni = Store.miPersona.getsDni();
            //String fecha = Store.miEvento.getFechaIni();

            int id = PrincipalFragment.id;

            String url = "http://proyectogestioneventos.atwebpages.com/php/ins-personaevento.php?dni=" + dni + "&idevento=" + id;
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Se ha dado de alta correctamente", Toast.LENGTH_SHORT).show();

                       /*
                        Intent i = new Intent(this, ConfirmacionActivity.class);
                        startActivity(i);

                        */
                    },

                    n -> {
                        Toast.makeText(getApplicationContext(), "No se ha podido completar el registro", Toast.LENGTH_SHORT).show();
                    }
            ));


        });


        findViewById(R.id.btnBajaEvento).setOnClickListener(e -> {

            String dni = Store.miPersona.getsDni();
            String url = "http://proyectogestioneventos.atwebpages.com/php/baja.php?eventoid="+Store.miEvento.getIdEvento();
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Se ha dado de baja correctamente", Toast.LENGTH_SHORT).show();
                    },

                    n -> {
                        Toast.makeText(getApplicationContext(), "No se ha podido completar el registro", Toast.LENGTH_SHORT).show();
                    }
            ));


        });

    }


    public void extraerInformacion() {
        String nombre = PrincipalFragment.sNombre;

        String url = "http://proyectogestioneventos.atwebpages.com/php/select-evento.php?nombre=" + nombre;
        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    try {
                        JSONObject json = new JSONObject(s);
                        jsonToEvento(json);
                        lblInformacionEvent.setText(Store.miEvento.getDescripcion());
                        lblFechaIniEvent.setText(Store.miEvento.getFechaIni());
                        lblFechaFinEvent.setText(Store.miEvento.getFechaFin());
                        lblDireccionEvent.setText(Store.miEvento.getDireccion());

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                },
                r -> {

                }

        ));
    }

    private void jsonToEvento(JSONObject json) throws JSONException {
        int id = json.getInt("idEvento");
        String nombre = json.getString("Nombre");
        String fechaini = json.getString("FechaIni");
        String fechafin = json.getString("FechaFin");
        int aforo = json.getInt("Aforo");
        String descripcion = json.getString("Descripcion");
        String direccion = json.getString("Direccion");
        Log.i("JSON", json + "");
        Log.i("DESCRIPCION",descripcion);

        Evento jsonEvento = new Evento(id, nombre, fechaini, fechafin, aforo, descripcion, direccion);
        Store.miEvento = jsonEvento;

        Log.i("MI EVENTO", Store.miEvento.toString());

        Store.lstEventosAsistidos.add(jsonEvento);

    }




}
