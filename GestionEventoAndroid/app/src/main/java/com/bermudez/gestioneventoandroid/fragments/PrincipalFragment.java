package com.bermudez.gestioneventoandroid.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;

public class PrincipalFragment extends Fragment {

    RecyclerView rvEventos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_principal, container, false);

        rvEventos= view.findViewById(R.id.rvEventos);
        rvEventos.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        EventosAdapter adapter = new EventosAdapter(getActivity().getApplicationContext());
        rvEventos.setAdapter(adapter);

        return view;
    }


}