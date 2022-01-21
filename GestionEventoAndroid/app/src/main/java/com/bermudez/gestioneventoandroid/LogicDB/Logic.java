package com.bermudez.gestioneventoandroid.LogicDB;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

public class Logic extends AppCompatActivity {
/*
    EditText txtId;
    TextView txtResultado;
    String hosting = "http://proyectogestioneventos.atwebpages.com/php/";
    Evento evento;
    ArrayList<Evento> lstEvento;


    private void obtenerTodos() {
        String sURL = hosting + "eventos.php";

        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sURL,
                s -> {
                    if(s.equals("null")){
                        Toast.makeText(this, "No se ha encontrado", Toast.LENGTH_SHORT).show();
                    }else{

                        try {
                            JSONObject json = new JSONObject(s);
                            jsonToEvent(json);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        listarEventos();
                    }

                }
                , volleyError -> {}
        ));
    }

    private void jsonToEvent(JSONObject json) throws JSONException {
        //Hay que crear nombre de evento en base de datos
        int id_evento = json.getInt("id_evento");
        String sNombreEvento=json.getString("Nombre_Evento");
        String FechaIni = json.getString("FechaIni");
        String FechaFin = json.getString("FechaFin");
        int Aforo = json.getInt("Aforo");
        String Descripcion = json.getString("Descripcion");
        //Preguntar  migue moreno como coger imagenes con PHP
        String Imagen = json.getString("Imagen");

        /*
        * int idEvento,String sNombreEvento, LocalDateTime fechaInit, LocalDateTime fechaFin, int aforo,
                  String descripcion, ImageView imagen)
        *
        *


        Evento jsonEvento = new Evento(id_evento, sNombreEvento,FechaIni,FechaFin,Aforo, Descripcion, Imagen);
        Store.miEvento = jsonEvento;
        Log.i("MI Evento", Store.miEvento.toString());
    }

    private void listarEventos() {
        StringBuffer str = new StringBuffer();
        lstEvento.forEach(c -> str.append(c.toString()).append("\n"));
        txtResultado.setText(str);
    }
*/
}
