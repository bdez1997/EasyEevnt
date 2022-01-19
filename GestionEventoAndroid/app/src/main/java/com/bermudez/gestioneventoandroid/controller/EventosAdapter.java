package com.bermudez.gestioneventoandroid.controller;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bermudez.gestioneventoandroid.R;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    Context context;
    private View.OnClickListener listener;

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
        holder.lblNombreEvento.setText(Store.lstEventos.get(position).getsNombreEvento() + "");
        holder.lblFechaFin.setText(Store.lstEventos.get(position).getFechaFin() + "");
        holder.lblFechaInit.setText(Store.lstEventos.get(position).getFechaInit() + "");

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