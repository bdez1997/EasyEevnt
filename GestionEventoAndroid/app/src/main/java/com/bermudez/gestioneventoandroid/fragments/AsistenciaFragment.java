package com.bermudez.gestioneventoandroid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.InfoEvento;
import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.ValoracionActivity;
import com.bermudez.gestioneventoandroid.controller.AsistenciaAdapter;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;


public class AsistenciaFragment extends Fragment {


    RecyclerView rvHistorial;
    View view;


    public AsistenciaFragment() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_asistencia, container, false);

        rvHistorial= vista.findViewById(R.id.rvHistorial);
        rvHistorial.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        AsistenciaAdapter AsistenciaAdapter = new AsistenciaAdapter(getActivity().getApplicationContext());
        rvHistorial.setAdapter(AsistenciaAdapter);

        String url = "http://proyectogestioneventos.atwebpages.com/php/get-eventosasistidos.php?dnipersona="+Store.miPersona.getsDni();
        Volley.newRequestQueue(getContext()).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    Store.lstEventosAsistidos = new Gson().fromJson(s, new TypeToken<List<Evento>>() {}.getType());
                    AsistenciaAdapter.notifyDataSetChanged();
                },
                r ->{
                }
        ));
        AsistenciaAdapter.setOnClickListener(e->{
            Intent i = new Intent(getActivity(), ValoracionActivity.class);
            Store.login=true;
            startActivity(i);

        });
        return vista;
    }

}