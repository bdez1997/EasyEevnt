package com.bermudez.gestioneventoandroid.controller;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.R;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;
import com.bermudez.gestioneventoandroid.models.Evento;

import org.json.JSONException;
import org.json.JSONObject;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    Context context;
    private View.OnClickListener listener;
    public static String nombre;
    public static String fechaIni ;
    public static String fechaFin;

    public EventosAdapter(Context context){
        inflater=LayoutInflater.from(context);
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    public void onClick(View v){
        if(listener != null){
            listener.onClick(v);
        }
    }

    @NonNull
    @Override
    public EventosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_eventos_adapter, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventosAdapter.ViewHolder holder, int position) {
        holder.imgEvento.setImageResource(R.drawable.user);

        holder.lblNombreEvento.setText(PrincipalFragment.nombre);
        holder.lblFechaInit.setText(PrincipalFragment.fechaIni);
        holder.lblFechaFin.setText(PrincipalFragment.fechaFin);

    }


    @Override
    public int getItemCount() {
        return Store.lstEventos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView lblNombreEvento;
        TextView lblFechaInit;
        TextView lblFechaFin;
        ImageView imgEvento;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgEvento = itemView.findViewById(R.id.imageViewEvento);
            lblNombreEvento = itemView.findViewById(R.id.lblNombreEvento);
            lblFechaInit = itemView.findViewById(R.id.lblFechaInit);
            lblFechaFin = itemView.findViewById(R.id.lblFechaFin);
        }
    }
}