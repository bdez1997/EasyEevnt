package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PerfilActivity extends AppCompatActivity {

    FloatingActionButton btnVolver;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        btnGuardar.findViewById(R.id.btnGuardar);
        btnGuardar.setVisibility(View.GONE);

        findViewById(R.id.btnVolver).setOnClickListener(e ->{
            onBackPressed();
        });

        findViewById(R.id.btnEditar).setOnClickListener(e ->{
            Store.boIsEditing = true;
            btnGuardar.setVisibility(View.VISIBLE);
        });



    }



}