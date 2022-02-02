package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Calendar;

public class Confirmacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        View cldConfir = findViewById(R.id.cldConfir);

        cldConfir.setOnClickListener(view -> {
            
        });

    }
}