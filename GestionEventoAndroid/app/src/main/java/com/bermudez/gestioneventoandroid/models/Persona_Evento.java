package com.bermudez.gestioneventoandroid.models;

import java.util.Objects;

public class Persona_Evento implements IMaxCaracteres{

    private Persona oPersona;
    private Evento oEvento;
    private String sValoracion;

    public String getsValoracion() {
        return sValoracion;
    }

    public void setsValoracion(String sValoracion) {
        if (sValoracion.length() > IMINIMO && sValoracion.length() < IMAXDESCRIPCION) {
            this.sValoracion = sValoracion;
        }
    }

    public Persona_Evento(Persona oPersona, Evento oEvento) {
        oPersona.setsDni(null);
        oEvento.setIdEvento(null);
    }

    public Persona_Evento(Persona oPersona, Evento oEvento, String sValoracion) {
        oPersona.setsDni(null);
        oEvento.setIdEvento(null);
        setsValoracion(sValoracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oEvento, oPersona, sValoracion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona_Evento other = (Persona_Evento) obj;
        return Objects.equals(oEvento, other.oEvento) && Objects.equals(oPersona, other.oPersona)
                && Objects.equals(sValoracion, other.sValoracion);
    }

}
