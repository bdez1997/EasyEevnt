package com.bermudez.gestioneventoandroid.controller;

import com.bermudez.gestioneventoandroid.models.Evento;
import com.bermudez.gestioneventoandroid.models.Persona;

import java.util.ArrayList;
import java.util.List;

public class Store {

    //Eventos
    public static List<Evento> lstEventos = new ArrayList<Evento>();
    public static int iEventoSelected;

    //Historial asistencia
    public static List<Evento> lstAsistencia = new ArrayList<Evento>();
    public static int iAsistenciaSelected;

    //Perfil
    public static boolean boIsEditing = false;

    //Mi usuario
    public static Persona miPersona;
}
