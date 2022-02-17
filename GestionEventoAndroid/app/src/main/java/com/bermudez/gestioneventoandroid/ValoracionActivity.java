package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.EventosAdapter;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;

public class ValoracionActivity extends AppCompatActivity {


    RatingBar rtValoracion;
    float iValoracion;
    EditText txtComentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoracion);

        rtValoracion = findViewById(R.id.rtValoracion);
        rtValoracion.setOnClickListener(e -> {


        });


        txtComentario = findViewById(R.id.txtComentario);

        findViewById(R.id.btnEnviar).setOnClickListener(view -> {

            int eventoID = Store.lstEventosAsistidos.get(Store.iEventoSelected).getIdEvento();
            String url = "http://proyectogestioneventos.atwebpages.com/php/ins-valoracion.php?eventoid="
                    + eventoID +
                    "&puntuacion=" + rtValoracion.getRating() +
                    "&valoracion=" + txtComentario.getText() +
                    "&personadni=" + Store.miPersona.getsDni();
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Log.i("Valoracion", rtValoracion.getRating() + "");
                        Toast.makeText(getApplicationContext(), "Se ha enviado su valoracion", Toast.LENGTH_SHORT).show();
                    },

                    n -> {

                        Toast.makeText(getApplicationContext(), "No se ha podido podido registrar su valoracion", Toast.LENGTH_SHORT).show();
                    }
            ));
            Toast.makeText(getApplicationContext(), "Gracias por su valoración", Toast.LENGTH_LONG).show();
            finish();
        });


    }

}