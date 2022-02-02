package com.bermudez.gestioneventoandroid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.MainActivity;
import com.bermudez.gestioneventoandroid.PerfilActivity;
import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Persona;

import org.json.JSONException;
import org.json.JSONObject;


public class PerfilFragment extends Fragment {
    View view;
    Button btnEditarProfile;
    String dni, nombre, apellido, username, password, correo, telefono, rol , informacio;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_perfil, container, false);

        Button btnEditarProfile = (Button) view.findViewById(R.id.btnEditarProfile);
        btnEditarProfile.setOnClickListener(e ->{
            Intent perfilActivity = new Intent( view.getContext(), PerfilActivity.class);
            startActivity(perfilActivity);
        });


        return view;
    }

    private void jsonToUser(JSONObject json) throws JSONException {
        String dni = json.getString("DNI");
        String nombre = json.getString("Nombre");
        String apellidos = json.getString("Apellidos");
        String username = json.getString("Username");
        String password = json.getString("Contrasena");
        String correo = json.getString("Correo");
        String telefono = json.getString("Telefono");
        String rol = json.getString("Rol");
        String informacion = json.getString("Informacion");
        Persona jsonPersona = new Persona(dni, nombre, apellidos, username, password, correo, telefono, informacion);
        Store.miPersona = jsonPersona;
        Log.i("MI USUARIO", Store.miPersona.toString());
    }

}