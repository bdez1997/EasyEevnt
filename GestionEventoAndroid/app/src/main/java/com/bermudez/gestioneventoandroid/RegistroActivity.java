package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

public class RegistroActivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtApellidos;
    EditText txtDni;
    EditText txtTelefono;
    EditText txtEmail;
    EditText txtUser;
    EditText txtPass;
    EditText txtInformacion;
    Spinner spinnerRoles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }
}