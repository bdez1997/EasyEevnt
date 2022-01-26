package com.bermudez.gestioneventoandroid.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bermudez.gestioneventoandroid.InfoEvento;
import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;
import com.bermudez.gestioneventoandroid.controller.Store;

public class PrincipalFragment extends Fragment {

    RecyclerView rvEventos;
    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_principal, container, false);

        rvEventos= view.findViewById(R.id.rvEventos);
        rvEventos.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        EventosAdapter adapter = new EventosAdapter(getActivity().getApplicationContext());
        rvEventos.setAdapter(adapter);

        showData();

        return view;
    }

    public void showData(){
        RecyclerView recyclerView = view.findViewById(R.id.rvEventos);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        EventosAdapter adaptador = new EventosAdapter(getContext());
        recyclerView.setAdapter(adaptador);

        adaptador.setOnClickListener( view ->{
            Store.iEventoSelected = recyclerView.getChildAdapterPosition(view);

            Intent intent = new Intent(getActivity(), InfoEvento.class);
            startActivity(intent);
            //((Activity) getActivity()).overridePendingTransition(0, 0);
        });
    }


}