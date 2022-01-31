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

import org.json.JSONException;
import org.json.JSONObject;

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

    private void obtenerTodos() {
        String url = "http://proyectogestioneventos.atwebpages.com/php/get-evento.php";
        Volley.newRequestQueue(getContext()).add(new StringRequest(Request.Method.GET, url,
                s -> {
                    try {
                        JSONObject json = new JSONObject(s);
                        jsonToEvent(json);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                },
                r ->{

                }

        ));
    }

    private void jsonToEvent(JSONObject json) throws JSONException {

        int id = json.getInt("idEvento");
        String nombre = json.getString("Nombre");
        String fechaIni = json.getString("FechaIni");
        String fechaFin = json.getString("FechaFin");
        int aforo = json.getInt("Aforo");
        String descripcion = json.getString("Descripcion");
        //String imagen = json.getString("Imagen");
        String direccion = json.getString("Direccion");

        Evento jsonEvento = new Evento(id,nombre, fechaIni, fechaFin, aforo, descripcion, direccion);
        Store.miEvento = jsonEvento;
        Log.i("MI USUARIO", Store.miEvento.toString());
    }




}