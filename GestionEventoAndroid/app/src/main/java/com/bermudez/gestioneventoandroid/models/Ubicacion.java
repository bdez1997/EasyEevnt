package com.bermudez.gestioneventoandroid.models;

public class Ubicacion {

    private int id_Ubicacion;
    private String sCiudad;
    private int iCodPostal;
    private String sCalle;
    private int iNumero;


    public Ubicacion(int id_Ubicacion) {
        this.id_Ubicacion = id_Ubicacion;
    }

    public Ubicacion(int id_Ubicacion, String sCiudad, int iCodPostal, String sCalle, int iNumero) {
        this.id_Ubicacion = id_Ubicacion;
        this.sCiudad = sCiudad;
        this.iCodPostal = iCodPostal;
        this.sCalle = sCalle;
        this.iNumero = iNumero;
    }

    public int getId_Ubicacion() {
        return id_Ubicacion;
    }

    public void setId_Ubicacion(int id_Ubicacion) {
        this.id_Ubicacion = id_Ubicacion;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public int getiCodPostal() {
        return iCodPostal;
    }

    public void setiCodPostal(int iCodPostal) {
        this.iCodPostal = iCodPostal;
    }

    public String getsCalle() {
        return sCalle;
    }

    public void setsCalle(String sCalle) {
        this.sCalle = sCalle;
    }

    public int getiNumero() {
        return iNumero;
    }

    public void setiNumero(int iNumero) {
        this.iNumero = iNumero;
    }


    public String toString() {
        String sResultado;

        sResultado ="id_Ubicación: "+getId_Ubicacion()+"\n";
        sResultado+="Ciudad: "+getsCiudad()+"\n";
        sResultado+="Código postal: "+getiCodPostal()+"\n";
        sResultado+="Nombre de la calle: "+getsCalle()+"\n";
        sResultado+="Número del inmueble: "+getiNumero();


        return sResultado;
    }
}
