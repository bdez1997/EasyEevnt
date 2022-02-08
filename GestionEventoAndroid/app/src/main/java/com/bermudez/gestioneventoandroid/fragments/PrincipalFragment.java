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

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.InfoEvento;
import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class PrincipalFragment extends Fragment {

    RecyclerView rvEventos;
    View view;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_principal, container, false);
        Log.d("Prueba","Entra3");
        rvEventos= view.findViewById(R.id.rvEventos);
        rvEventos.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        EventosAdapter adapter = new EventosAdapter(getActivity().getApplicationContext());
        rvEventos.setAdapter(adapter);

        String url = "http://proyectogestioneventos.atwebpages.com/php/get-evento.php";
        Volley.newRequestQueue(getContext()).add(new StringRequest(Request.Method.GET, url,
                s -> {

            Store.lstEventos = new Gson().fromJson(s, new TypeToken<List<Evento>>() {}.getType());
            adapter.notifyDataSetChanged();

                },
                r ->{
                    Log.d("Prueba","Entra4");
                }

        ));

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
        });
    }


    private void jsonToEvent(JSONArray json) throws JSONException {
        /*nombre = json.getString("Nombre");
        fechaIni = json.getString("FechaIni");
        fechaFin = json.getString("FechaFin");

        Evento jsonEvento = new Evento(nombre, fechaIni, fechaFin);
        Store.lstEventos.add(jsonEvento);*/
        //Store.miEvento = jsonEvento;

        for(int i = 0; i < json.length(); i++){
            Log.d("Prueba", json.get(i).toString());
            Object jsonObject = json.get(i);
        }
    }




}