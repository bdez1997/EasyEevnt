package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Evento;

import org.json.JSONException;
import org.json.JSONObject;

public class InfoEvento extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_evento);



        findViewById(R.id.btnAsistirEvento).setOnClickListener( e -> {
            String url = "http://proyectogestioneventos.atwebpages.com/php/select-dni.php?username=%22" + Store.sUsernameActual + "%22";

            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,
                    s -> {

                    },

                    n ->{

                    }
                    ));
        });


        findViewById(R.id.btnBajaEvento).setOnClickListener( e -> {

        });



    }


}