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

    public static String sNombre = "no";
    public static int id;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_principal, container, false);

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
            sNombre = Store.lstEventos.get(Store.iEventoSelected).getNombre();

            id = Store.lstEventos.get(Store.iEventoSelected).getIdEvento();
            Log.i("PRUEBA","" + Store.lstEventos.get(Store.iEventoSelected).getIdEvento());

            Intent intent = new Intent(getActivity(), InfoEvento.class);
            startActivity(intent);
        });
    }

}