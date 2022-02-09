package com.bermudez.gestioneventoandroid.models;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

public class Persona implements IMaxCaracteres {
    private String sDni, sNombre, sApellido, sUsername, sPassword, sCorreo, sTelefono, sInformacion, sRol;


    public Persona(String sDni) {
        getsDni();
    }


    public Persona(String sNombre, String sApellido, String sUsername, String sPassword,
                   String sCorreo, String sTelefono, String sInformacion, String sRol) {

        setsNombre(sNombre);
        setsApellido(sApellido);
        setsUsername(sUsername);
        setsPassword(sPassword);
        setsCorreo(sCorreo);
        setsTelefono(sTelefono);
        setsRol(sRol);
        setsInformacion(sInformacion);

    }

    public Persona(String sDni, String sNombre, String sApellido, String sUsername, String sPassword,
                   String sCorreo, String sTelefono, String sRol, String sInformacion) {

        setsDni(sDni);
        setsNombre(sNombre);
        setsApellido(sApellido);
        setsUsername(sUsername);
        setsPassword(sPassword);
        setsCorreo(sCorreo);
        setsTelefono(sTelefono);
        setsRol(sRol);
        setsInformacion(sInformacion);

    }

    public String getsDni() {
        return sDni;
    }

    public void setsDni(String sDni) {
        String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
        if (Pattern.matches(dniRegexp, sDni)) {
            this.sDni = sDni;
        }
    }


    public String getsNombre() {
        return sNombre;
    }


    public void setsNombre(String sNombre) {
        if (sNombre != null && sNombre.length() > IMINIMO && sNombre.length() < IMAXNOMBRE) {
            this.sNombre = sNombre;
        }
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        if (sApellido != null && sApellido.length() > IMINIMO && sApellido.length() < IMAXAPELLIDOS) {
            this.sApellido = sApellido;
        }
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        if (sUsername != null && sUsername.length() < IMAXUSER && sUsername.length() > IMINIMO) {
            this.sUsername = sUsername;
        }
    }

    public String getsPassword() {
        return sPassword;
    }


    public void setsPassword(String sPassword) {
        if (sPassword != null && sPassword.length() < IMAXPASS && sPassword.length() > IMINIMO) {
            this.sPassword = sPassword;
        }
    }


    public String getsCorreo() {
        return sCorreo;
    }


    public void setsCorreo(String sCorreo) {

        if(sCorreo.length()<=35) {this.sCorreo = sCorreo;}

    }

    public String getsTelefono() {
        return sTelefono;
    }

    public void setsTelefono(String sTelefono) {

        if(sTelefono.length()==9){this.sTelefono = sTelefono;}

     }

    public String getsRol() {
        return sRol;
    }

    public void setsRol(String sRol) {
        this.sRol = sRol;
    }

    public String getsInformacion() {
        return sInformacion;
    }

    public void setsInformacion(String sInformacion) {
        if (sInformacion.length() < IMAXDESCRIPCION && sInformacion.length() > IMINIMO) {
            this.sInformacion = sInformacion;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(sApellido, sCorreo, sDni, sInformacion, sNombre, sPassword, sTelefono, sUsername);
    }

    @Override
    public boolean equals(Object obj) {
        boolean bExito = false;
        Persona oPersona = (Persona) obj;
        if (oPersona.getsDni() != null && this.getsDni() != null && this.getsDni() == oPersona.getsDni()) {
            bExito = true;
        }
        return bExito;
    }


    @Override
    public String toString() {
        String sResultado = "";

        sResultado += "DNI: " + getsDni() + "\n";
        sResultado += "Nombre : " + getsNombre() + " " + getsApellido() + "\n";
        sResultado += "Username: " + getsUsername() + "\n";
        sResultado += "Pass: " + "*********" + "\n";
        sResultado += "Correo: " + getsCorreo() + "\n";
        sResultado += "Rol: " + getsRol() + "\n";
        sResultado += "Telefono: " + getsTelefono() + "\n";
        sResultado += "Informacion adiccional: " + getsInformacion();

        return sResultado;
    }


}
