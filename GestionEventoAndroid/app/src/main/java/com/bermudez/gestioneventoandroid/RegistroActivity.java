package com.bermudez.gestioneventoandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class RegistroActivity extends AppCompatActivity {

    EditText txtDni, txtNombre, txtApellidos, txtUser, txtPass, txtTelefono, txtEmail, txtInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        findViewById(R.id.btnRegistro).setOnClickListener(e ->{
            registrarUsuario();
        });

    }

    private void registrarUsuario() {
        String sUrl = "proyectogestioneventos.atwebpages.com/php/ins-persona.php";
        Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sUrl,
                s -> {
                    
                },

                r-> {

                }
        ));
    }


}