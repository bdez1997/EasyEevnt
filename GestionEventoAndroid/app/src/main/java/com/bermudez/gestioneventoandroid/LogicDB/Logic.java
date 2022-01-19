package com.bermudez.gestioneventoandroid.LogicDB;

import android.content.Context;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.models.Evento;


import java.util.ArrayList;

public class Logic {
    EditText txtId;
    TextView txtResultado;
    String hosting = "http://proyectogestioneventos.atwebpages.com/easyevents/";
    Evento evento;
    ArrayList<Evento> lstEvento;

    private void listarEventos() {
        StringBuffer str = new StringBuffer();
        lstEvento.forEach(c -> str.append(c.toString()).append("\n"));
        txtResultado.setText(str);
    }


}
