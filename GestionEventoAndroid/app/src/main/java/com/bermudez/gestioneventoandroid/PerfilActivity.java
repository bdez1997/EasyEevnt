package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PerfilActivity extends AppCompatActivity {

    Button btnGuardar;

    EditText txtUserProfile;
    EditText txtPassProfile;
    EditText txtEmailProfile;
    EditText txtTlfnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        setTitle("Perfil");

        findViewById(R.id.btnGuardar).setOnClickListener(e -> {

        });


        findViewById(R.id.btnVolver).setOnClickListener(e ->{
            onBackPressed();
        });

    }

    public void updateProfile(){

    }



}