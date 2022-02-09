package com.bermudez.gestioneventoandroid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    TextView  lblNombreBD,lblUserBD,lblEmailBD,lblTelefonoBD,lblRolBD,lblInfoBD;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_perfil, container, false);


        Button btnEditarProfile = (Button) view.findViewById(R.id.btnEditarProfile);
        btnEditarProfile.setOnClickListener(e ->{
            Intent perfilActivity = new Intent( view.getContext(), PerfilActivity.class);
            startActivity(perfilActivity);
        });

        lblNombreBD=view.findViewById(R.id.lblNombreBD);
        lblUserBD=view.findViewById(R.id.lblUserDB);
        lblEmailBD=view.findViewById(R.id.lblEmailDB);
        lblTelefonoBD=view.findViewById(R.id.lblTlfnDB);
        lblRolBD=view.findViewById(R.id.lblRolDB);
        lblInfoBD=view.findViewById(R.id.lblInfoBD);

        /////////////////////////////////////////////////

        lblNombreBD.setText(Store.miPersona.getsNombre());
        lblUserBD.setText(Store.miPersona.getsUsername());
        lblEmailBD.setText(Store.miPersona.getsCorreo());
        lblTelefonoBD.setText(Store.miPersona.getsTelefono());
        lblRolBD.setText(Store.miPersona.getsRol());
        lblInfoBD.setText(Store.miPersona.getsInformacion());


        return view;
    }





}