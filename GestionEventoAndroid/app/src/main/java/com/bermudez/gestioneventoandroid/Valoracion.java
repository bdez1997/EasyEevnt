package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Valoracion extends AppCompatActivity {

    Button btnEnviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.rtValoracion);

                ratingBar.getRating();



            EditText txtComentario = findViewById(R.id.txtComentario);
            txtComentario.getText();


            findViewById(R.id.btnEnviar);
            btnEnviar.setOnClickListener(view -> {

            });

    }

}