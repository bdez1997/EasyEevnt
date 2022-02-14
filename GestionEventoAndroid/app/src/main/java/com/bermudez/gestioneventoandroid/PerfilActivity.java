package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PerfilActivity extends AppCompatActivity {

    Button btnGuardar;
    String id;
    EditText txtUserProfile,txtPassProfile,txtEmailProfile,txtTlfnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        setTitle("Perfil");

        txtUserProfile =findViewById(R.id.txtUserProfile);
        txtPassProfile=findViewById(R.id.txtPassProfile);
        txtEmailProfile=findViewById(R.id.txtEmailProfile);
        txtTlfnProfile=findViewById(R.id.txtTlfnProfile);

        findViewById(R.id.btnGuardar).setOnClickListener(e -> {
            if(txtUserProfile.getText().equals("")||
                    txtPassProfile.getText().equals("")||
                    txtEmailProfile.getText().equals("")||
                    txtTlfnProfile.getText().equals("")
            ){
                Toast.makeText(this,"Todos los campos son obligatorios",Toast.LENGTH_SHORT).show();
            }else{
                updateProfile();
            }

        });


        findViewById(R.id.btnVolver).setOnClickListener(e ->{
            onBackPressed();
        });

    }

    public void updateProfile() {

        id = Store.miPersona.getsDni();
        txtUserProfile.getText();
        txtPassProfile.getText();
        txtEmailProfile.getText();
        txtTlfnProfile.getText();
        String sUrl = "";

        sUrl = "http://proyectogestioneventos.atwebpages.com/php/upd-personaAndroid.php?" +
                "username=" + txtUserProfile.getText() +
                "&password=" + txtPassProfile.getText() +
                "&correo=" + txtEmailProfile.getText() +
                "&telefono=" + txtTlfnProfile.getText() +
                "&dni=" + id;


        String sResult = sUrl.replace(" ", "%20");
        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResult,
                s -> {
                    Toast.makeText(this, "Perfil Actualizado", Toast.LENGTH_SHORT).show();
                }, r -> {
            Toast.makeText(this, "Error al modificar el perfil", Toast.LENGTH_SHORT).show();
        }));


    }
}