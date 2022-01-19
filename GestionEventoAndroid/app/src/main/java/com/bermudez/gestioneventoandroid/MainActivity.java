package com.bermudez.gestioneventoandroid;

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
import android.provider.Contacts;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.bermudez.gestioneventoandroid.controller.*;
import com.bermudez.gestioneventoandroid.fragments.*;
import com.bermudez.gestioneventoandroid.models.*;
import com.google.android.material.navigation.NavigationView;

import java.time.LocalDateTime;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showData();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                0,0);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        openFragment(new AsistenciaFragment());
    }

    private void openFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    private void openPerfil(){
        Intent perfilActivity = new Intent(MainActivity.this, PerfilActivity.class);
        startActivity(perfilActivity);
    }

    private void showData(){
        Store.lstAsistencia.add(new Evento("Mangafest 2022"));
        Store.lstAsistencia.add(new Evento("Ficzone 2021"));
        Store.lstEventos.add(new Evento("Ficzone", LocalDateTime.now(), LocalDateTime.now()));
        Store.lstEventos.add(new Evento("Mangafest 2021", LocalDateTime.now(), LocalDateTime.now()));
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        drawerLayout.closeDrawer(GravityCompat.START);

        switch(item.getItemId()) {
            case R.id.opPerfil: openPerfil(); break;
            case R.id.opHistorial: openFragment(new AsistenciaFragment()); break;
            case R.id.salir: salir(); break;
        }
        return false;
    }


    private void salir() {
        finish();
    }

}