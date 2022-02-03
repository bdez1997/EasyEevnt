package com.bermudez.gestioneventoandroid.models;

import android.widget.ImageView;

import java.util.Objects;

public class Evento implements IMaxCaracteres{

    private String Nombre;
    private int idEvento;
    private String FechaInit;
    private String FechaFin;
    private int Aforo;
    private String Descripcion;
    private ImageView imagen;
    private String Direccion;


    public Evento(String Nombre){
        setNombre(Nombre);
    }

    public Evento(String sNombre,String fechaInit,String fechaFin){
        setNombre(sNombre);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);

    }

    public Evento(String sNombre,ImageView imgEvento,String fechaInit,String fechaFin){
        setNombre(sNombre);
        setImagen(imgEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);

    }

    public Evento(int idEvento, String Nombre, String fechaInit, String fechaFin, int Aforo,
                  String Descripcion, String Direccion) {

        setIdEvento(idEvento);
        setNombre(Nombre);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setAforo(Aforo);
        setDescripcion(Descripcion);
        setDireccion(Direccion);
    }

    public Evento(int idEvento, String Nombre, String fechaInit, String fechaFin, int Aforo,
                  String Descripcion, ImageView imagen, String Direccion) {

        setIdEvento(idEvento);
        setNombre(Nombre);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
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

    public String getFechaInit() {
        return FechaInit;
    }

    public void setFechaInit(String fechaInit) {
        this.FechaInit = fechaInit;
    }

    public String getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.FechaFin = fechaFin;
    }



    public int getAforo() {
        return Aforo;
    }

    public void setAforo(int aforo) {
            this.Aforo = aforo;
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

    public void setDireccion(String direccion) {
        if (direccion.length() > IMINIMO && direccion.length() < IMAXDIRECCION) {
            this.Direccion = direccion;
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
        sResultado += getFechaInit() + "\n";
        sResultado += getFechaFin() + "\n";
        sResultado += getAforo() + "\n";
        sResultado += getDireccion() + "\n";
        sResultado += getImagen() + "\n";

        return sResultado;
    }

}
