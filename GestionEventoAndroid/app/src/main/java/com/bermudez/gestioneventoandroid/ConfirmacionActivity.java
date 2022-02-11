package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;

import java.util.Calendar;

public class ConfirmacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        View cldConfir = findViewById(R.id.cldConfir);

        cldConfir.setOnClickListener(view -> {



        });

        findViewById(R.id.btnAceptar).setOnClickListener(e -> {
            String dni = Store.miPersona.getsDni();
            int id = PrincipalFragment.id;
            String url = "http://proyectogestioneventos.atwebpages.com/php/ins-personaevento.php?dni=" + dni + "&idevento=" + id;
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Se ha dado de alta correctamente", Toast.LENGTH_SHORT).show();
                    },

                    n -> {
                        Toast.makeText(getApplicationContext(), "No se ha podido completar el registro", Toast.LENGTH_SHORT).show();
                    }
            ));
        });

    }
}