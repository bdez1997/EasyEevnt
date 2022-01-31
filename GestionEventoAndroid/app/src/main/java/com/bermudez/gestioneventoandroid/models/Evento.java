package com.bermudez.gestioneventoandroid.models;

import android.net.Uri;
import android.widget.ImageView;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Evento implements IMaxCaracteres{

    private String sNombreEvento;
    private int idEvento;
    private String fechaInit;
    private String fechaFin;
    private int iAforo;
    private String sDescripcion;
    private ImageView imagen;
    private String sUbicacion;


    public Evento(String sNombreEvento){
        setsNombreEvento(sNombreEvento);
    }

    public Evento(String sNombre,String fechaInit,String fechaFin){
        setsNombreEvento(sNombre);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);

    }

    public Evento(String sNombre,ImageView imgEvento,String fechaInit,String fechaFin){
        setsNombreEvento(sNombre);
        setImagen(imgEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);

    }

    public Evento(int idEvento,String sNombreEvento, String fechaInit, String fechaFin, int iAforo,
                  String sDescripcion, String sUbicacion) {

        setIdEvento(idEvento);
        setsNombreEvento(sNombreEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setiAforo(iAforo);
        setsDescripcion(sDescripcion);
        setsUbicacion(sUbicacion);
    }

    public Evento(int idEvento,String sNombreEvento, String fechaInit, String fechaFin, int iAforo,
                  String sDescripcion, ImageView imagen, String sUbicacion) {

        setIdEvento(idEvento);
        setsNombreEvento(sNombreEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setiAforo(iAforo);
        setsDescripcion(sDescripcion);
        setImagen(imagen);
        setsUbicacion(sUbicacion);
    }

    public String getsNombreEvento() {
        return sNombreEvento;
    }

    public void setsNombreEvento(String sNombreEvento) {
        if (sNombreEvento.length() > IMINIMO && sNombreEvento.length()< IMAXNOMBRE){
            this.sNombreEvento = sNombreEvento;
        }

    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
            this.idEvento = idEvento;
    }

    public String getFechaInit() {
        return fechaInit;
    }

    public void setFechaInit(String fechaInit) {
        this.fechaInit = fechaInit;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }



    public int getiAforo() {
        return iAforo;
    }

    public void setiAforo(int iAforo) {
            this.iAforo = iAforo;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        if (sDescripcion.length() < IMAXDESCRIPCION) {
            this.sDescripcion = sDescripcion;
        }
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public String getsUbicacion() {
        return sUbicacion;
    }

    public void setsUbicacion(String sUbicacion) {
        if (sUbicacion.length() > IMINIMO && sUbicacion.length() < IMAXDIRECCION) {
            this.sUbicacion = sUbicacion;
        }
    }

    public int hashCode() {
        return Objects.hash(idEvento);
    }

    public boolean equals(Object obj) {

        boolean boEquals = false;
        Evento oEvento = (Evento)obj;
        if(oEvento.getIdEvento()!=0 &&this.getIdEvento()!=0
                && this.getIdEvento()==oEvento.idEvento) {

            boEquals=true;
        }

        return boEquals;
    }

    @Override
    public String toString() {
        String sResultado;

        sResultado = getsNombreEvento() + "\n";
        sResultado += getFechaInit() + "\n";
        sResultado += getFechaFin() + "\n";
        sResultado += getiAforo() + "\n";
        sResultado += getsUbicacion() + "\n";
        sResultado += getImagen() + "\n";

        return sResultado;
    }

}
