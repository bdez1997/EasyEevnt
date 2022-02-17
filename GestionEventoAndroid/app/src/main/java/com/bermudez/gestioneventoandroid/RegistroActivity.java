package com.bermudez.gestioneventoandroid;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


public class RegistroActivity extends AppCompatActivity {

    EditText txtDni, txtNombre, txtApellidos, txtUser, txtPass, txtTelefono, txtEmail, txtInformacion;
    Spinner sPinnerRoles;
    Button btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        sPinnerRoles = (Spinner) findViewById(R.id.spinnerRoles);
        txtDni = (EditText)findViewById(R.id.txtDni);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtUser = findViewById(R.id.txtUser);
        txtPass = findViewById(R.id.txtPass);
        txtTelefono =  findViewById(R.id.txtTelefono);
        txtEmail = findViewById(R.id.txtEmail);
        txtInformacion = findViewById(R.id.txtInformacion);

           findViewById(R.id.btnRegistro).setOnClickListener(e ->{
            registrarUsuario();
        });

    }

    private void registrarUsuario() {

        String sUrl = "http://proyectogestioneventos.atwebpages.com/php/ins-persona.php?dni="+txtDni.getText()+"&nombre="+txtNombre.getText()+
                "&apellidos="+txtApellidos.getText()+"&username="+txtUser.getText()+"&password="+txtPass.getText()+"&correo="+txtEmail.getText()+"&telefono="+txtTelefono.getText()+
                "&rol="+sPinnerRoles.getSelectedItem().toString() +"&informacion="+txtInformacion.getText();
        String sResultado=sUrl.replace(" ","%20");

        if(txtDni.getText().equals("")
                ||txtNombre.getText().equals("")
                ||txtApellidos.getText().equals("")
                ||txtUser.getText().equals("")
                ||txtPass.getText().equals("")
                ||txtEmail.getText().equals("")
                ||txtTelefono.getText().equals("")
                ){
                Toast.makeText(getApplicationContext(), "Todo excepto la info es un campo obligatorio", Toast.LENGTH_SHORT).show();

        }else{
            Volley.newRequestQueue(this).add(new StringRequest(Request.Method.GET, sResultado,
                    s -> {
                        Toast.makeText(getApplicationContext(), "Usuraio registrado con éxito", Toast.LENGTH_SHORT).show();
                        finish();
                    },

                    r-> {
                        Toast.makeText(getApplicationContext(), "Algo ha ido mal", Toast.LENGTH_SHORT).show();
                    }
            ));
        }


    }


}