package com.bermudez.gestioneventoandroid;

import static com.bermudez.gestioneventoandroid.LoginActivity.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bermudez.gestioneventoandroid.controller.Store;
import com.bermudez.gestioneventoandroid.fragments.*;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    EditText txtUsernameLogin;
    DrawerLayout drawerLayout;
    TextView lblName,txtUsername;
    String sUserHeader;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Eventos");
        Log.d("Prueba","Entra1");

        openFragment(new PrincipalFragment());

        if(login){
            Toast.makeText(this,"Usuario logueado con éxito",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }


          sUserHeader = getIntent().getStringExtra("UserName");


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.navigationView);


        View header = navigationView.getHeaderView(0);
        txtUsername = header.findViewById(R.id.txtUsernameHeader);
        txtUsername.setText(sUserHeader);
        navigationView.setNavigationItemSelectedListener(this);


        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                0,0);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();







    }

    private void openFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);

        fragmentTransaction.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);

        switch(item.getItemId()) {
            case R.id.opPerfil: openFragment(new PerfilFragment()); setTitle("Perfil");; break;
            case R.id.opEventos: openFragment(new PrincipalFragment()); setTitle("Eventos"); break;
            case R.id.opHistorial: openFragment(new AsistenciaFragment()); setTitle("Asistencia"); break;
            case R.id.logout:
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            case R.id.salir: salir(); break;
        }
        return false;
    }


    private void salir() {
        MainActivity.this.finishAffinity();
        System.exit(0);
    }

}