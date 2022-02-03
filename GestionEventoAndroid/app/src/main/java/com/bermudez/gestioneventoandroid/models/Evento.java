package com.bermudez.gestioneventoandroid.models;

import android.widget.ImageView;

import java.util.Objects;

public class Evento implements IMaxCaracteres{

    private String Nombre;
    private int idEvento;
    private String FechaIni;
    private String FechaFin;
    private int Aforo;
    private String Descripcion;
    private ImageView imagen;
    private String Direccion;


    public Evento(String Nombre){
        setNombre(Nombre);
    }

    public Evento(String Nombre,String FechaIni,String FechaFin){
        setNombre(Nombre);
        setFechaIni(FechaIni);
        setFechaFin(FechaFin);

    }

    public Evento(String Nombre,ImageView imgEvento,String FechaIni,String FechaFin){
        setNombre(Nombre);
        setImagen(imgEvento);
        setFechaIni(FechaIni);
        setFechaFin(FechaFin);

    }

    public Evento(int idEvento, String Nombre, String FechaIni, String FechaFin, int Aforo,
                  String Descripcion, String Direccion) {

        setIdEvento(idEvento);
        setNombre(Nombre);
        setFechaIni(FechaIni);
        setFechaFin(FechaFin);
        setAforo(Aforo);
        setDescripcion(Descripcion);
        setDireccion(Direccion);
    }

    public Evento(int idEvento, String Nombre, String FechaIni, String FechaFin, int Aforo,
                  String Descripcion, ImageView imagen, String Direccion) {

        setIdEvento(idEvento);
        setNombre(Nombre);
        setFechaIni(FechaIni);
        setFechaFin(FechaFin);
        setAforo(Aforo);
        setDescripcion(Descripcion);
        setImagen(imagen);
        setDireccion(Direccion);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > IMINIMO && nombre.length()< IMAXNOMBRE){
            this.Nombre = nombre;
        }

    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
            this.idEvento = idEvento;
    }

    public String getFechaIni() {
        return FechaIni;
    }

    public void setFechaIni(String FechaIni) {
        this.FechaIni = FechaIni;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String FechaFin) {
        this.FechaFin = FechaFin;
    }



    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int Aforo) {
            this.Aforo = Aforo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.length() < IMAXDESCRIPCION) {
            this.Descripcion = descripcion;
        }
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        if (Direccion.length() > IMINIMO && Direccion.length() < IMAXDIRECCION) {
            this.Direccion = Direccion;
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

        sResultado = getNombre() + "\n";
        sResultado += getFechaIni() + "\n";
        sResultado += getFechaFin() + "\n";
        sResultado += getAforo() + "\n";
        sResultado += getDireccion() + "\n";
        sResultado += getImagen() + "\n";

        return sResultado;
    }

}
