package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;

public class ValoracionActivity extends AppCompatActivity {

    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.rtValoracion);
        ratingBar.getOnRatingBarChangeListener().onRatingChanged(ratingBar, 0, true);
        ratingBar.getRating();

        EditText txtComentario = findViewById(R.id.txtComentario);
        txtComentario.getText();


        findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(view -> {

            String dni = Store.miPersona.getsDni();
            String url = "http://proyectogestioneventos.atwebpages.com/php/upd-personaevento.php?dni=" + dni;
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Se ha enviado su valoracion", Toast.LENGTH_SHORT).show();
                    },

                    n -> {
                        Toast.makeText(getApplicationContext(), "No se ha podido podido registrar su valoracion", Toast.LENGTH_SHORT).show();
                    }
            ));
        });


        Toast.makeText(getApplicationContext(), "Gracias por su valoración", Toast.LENGTH_LONG).show();
        onDestroy();
    }

}