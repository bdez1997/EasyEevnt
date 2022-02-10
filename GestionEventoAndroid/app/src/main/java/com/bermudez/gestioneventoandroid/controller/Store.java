package com.bermudez.gestioneventoandroid.controller;

import android.view.View;

import com.bermudez.gestioneventoandroid.LoginActivity;
import com.bermudez.gestioneventoandroid.models.Evento;
import com.bermudez.gestioneventoandroid.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class Store {

    //Eventos
    public static List<Evento> lstEventos = new ArrayList<Evento>();
    public static int iEventoSelected;

    public static List<Evento> lstEventosAsistidos = new ArrayList<Evento>();

    //View login
    public static LoginActivity loginView;

    //Historial asistencia
    public static List<Evento> lstAsistencia = new ArrayList<Evento>();
    public static int iAsistenciaSelected;

    //Perfil
    public static boolean boIsEditing = false;

    //Mi usuario
    public static Persona miPersona;

    //Evento
    public static Evento miEvento;

}
