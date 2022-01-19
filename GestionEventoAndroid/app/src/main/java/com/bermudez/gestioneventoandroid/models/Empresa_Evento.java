package com.bermudez.gestioneventoandroid.models;

import java.util.Objects;

public class Empresa_Evento {

    private Empresa oEmpresa;
    private Evento oEvento;


    public Empresa getoEmpresa() {
        return oEmpresa;
    }
    public void setoEmpresa(Empresa oEmpresa) {
        this.oEmpresa = oEmpresa;
    }
    public Evento getoEvento() {
        return oEvento;
    }
    public void setoEvento(Evento oEvento) {
        this.oEvento = oEvento;
    }

    public boolean checkEmpresa_Evento() {
        boolean bExito=false;

        if(this.getoEmpresa()!=null&&this.getoEvento()!=null) {
            bExito=true;
        }

        return bExito;
    }



    public int hashCode() {
        return Objects.hash(oEmpresa, oEvento);
    }

    public boolean equals(Object obj) {
        boolean boEquals=false;
        if(oEmpresa!=null&&this.oEmpresa.equals(obj)&&oEvento!=null&&this.oEvento.equals(obj)) {
            boEquals=true;
        }

        return boEquals;
    }
    public String toString() {

        String sResultado;

        sResultado="{ "+getoEmpresa()+" }\n";
        sResultado+="{ "+getoEvento()+" }";

        return sResultado;
    }

}
