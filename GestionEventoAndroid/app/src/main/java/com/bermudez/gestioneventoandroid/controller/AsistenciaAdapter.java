package com.bermudez.gestioneventoandroid.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bermudez.gestioneventoandroid.R;

public class AsistenciaAdapter extends RecyclerView.Adapter<AsistenciaAdapter.ViewHolder> implements View.OnClickListener {

    LayoutInflater inflater;
    Context context;
    private View.OnClickListener listener;
    public static String nombreEvento;
    //public static String fechaIni ;


    public AsistenciaAdapter(Context context){
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
    public AsistenciaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.asistencia_list, parent, false);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AsistenciaAdapter.ViewHolder holder, int position) {
        holder.imgAsistencia.setImageResource(R.drawable.eventscardview);
        holder.lblNombreEventoAsistencia.setText(Store.lstEventosAsistidos.get(position).getNombre());
        /*holder.lblFechaInit.setText(Store.lstEventos.get(position).getFechaIni());
        holder.lblFechaFin.setText(Store.lstEventos.get(position).getFechaFin());*/

    }


    @Override
    public int getItemCount() {
        return Store.lstEventos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView lblNombreEventoAsistencia;
        //TextView lblFechaInit;

        ImageView imgAsistencia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAsistencia = itemView.findViewById(R.id.imgAsistencia);
            lblNombreEventoAsistencia = itemView.findViewById(R.id.txtNombreAsistencia);
            //lblFechaInit = itemView.findViewById(R.id.lblFechaInicio);
        }
    }
}