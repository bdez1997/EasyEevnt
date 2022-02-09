package com.bermudez.gestioneventoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.models.Persona;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView txtUser = findViewById(R.id.txtUsernameLogin);
        TextView txtPassword = findViewById(R.id.txtPasswordLogin);


        findViewById(R.id.btnRegistrarse).setOnClickListener(e ->{
            Intent RegistroActivity = new Intent(LoginActivity.this, RegistroActivity.class);
            startActivity(RegistroActivity);
        });

        findViewById(R.id.btnLogin).setOnClickListener(l -> {
            String username = txtUser.getText() + "";
            String password = txtPassword.getText() + "";

            String url = "http://proyectogestioneventos.atwebpages.com/php/login.php?username=%22" + username + "%22&password=%22" + password + "%22";
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, url,
                    s -> {
                        try {
                            JSONObject json = new JSONObject(s);
                            jsonToUser(json);
                            finish();

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    },
                    r ->{

                    }

            ));
        });


    }
    @Override
    public void onBackPressed(){

    }

    private void jsonToUser(JSONObject json) throws JSONException {
        String dni = json.getString("DNI");
        String nombre = json.getString("Nombre");
        String apellidos = json.getString("Apellidos");
        String username = json.getString("Username");
        String password = json.getString("Contrasena");
        String correo = json.getString("Correo");
        String telefono = json.getString("Telefono");
        String rol = json.getString("Rol");
        String informacion = json.getString("Informacion");
        Persona jsonPersona = new Persona(dni, nombre, apellidos, username, password, correo, telefono, informacion);
        Store.miPersona = jsonPersona;
        Log.i("MI USUARIO", Store.miPersona.toString());
    }
}