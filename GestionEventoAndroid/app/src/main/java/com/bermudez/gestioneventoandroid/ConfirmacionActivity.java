package com.bermudez.gestioneventoandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.PrincipalFragment;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.bermudez.gestioneventoandroid.models.Persona_Evento;

import java.util.Calendar;

public class ConfirmacionActivity extends AppCompatActivity {


    CalendarView cldConfir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        cldConfir = findViewById(R.id.cldConfir);

        cldConfir.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1+1) + "/" + i2 + "/" + i;

            }
        });

            findViewById(R.id.btnAceptar).setOnClickListener(e -> {
            String dni = Store.miPersona.getsDni();
            int id = PrincipalFragment.id;
            String url = "http://proyectogestioneventos.atwebpages.com/php/ins-personaevento.php?dni=" +
                    dni +
                    "&dia"+ cldConfir.toString() +
                    "&idevento=" ;
            String sResultado = url.replace(" ", "%20");
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Se ha dado de alta correctamente", Toast.LENGTH_SHORT).show();
                    },

                    n -> {
                        Toast.makeText(getApplicationContext(), "No se ha podido completar el registro", Toast.LENGTH_SHORT).show();
                    }
            ));
        });

        findViewById(R.id.btnCancelar).setOnClickListener(e ->{
            finish();
        });

    }


}