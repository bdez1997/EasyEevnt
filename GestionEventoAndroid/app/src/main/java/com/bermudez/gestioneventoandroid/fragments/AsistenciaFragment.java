package com.bermudez.gestioneventoandroid.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.controller.AsistenciaAdapter;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;
import com.bermudez.gestioneventoandroid.controller.Store;


public class AsistenciaFragment extends Fragment {


    RecyclerView rvHistorial;

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

        return vista;
    }
}