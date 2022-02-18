package model;

import java.util.Objects;

public class PersonaEvento implements IMaxCaracteres{
    private Persona oPersona;
    private Evento oEvento;
    private String sValoracion;
    private float fPuntuacion;
    private String sDni;
    private int iEventoId;
    
    
    
    public PersonaEvento() {
    	
	}
    
    public PersonaEvento(String sDni, int iEventoId, String sValoracion, float fPuntuacion ) {
    	
    	setsDni(sDni);   
    	setiEventoId(iEventoId);
    	setsValoracion(sValoracion);
    	setfPuntuacion(fPuntuacion);
   	}

	
	public String getsDni() {
		return sDni;
	}

	public void setsDni(String sDni) {
		this.sDni = sDni;
	}

	public int getiEventoId() {
		return iEventoId;
	}

	public void setiEventoId(int iEventoId) {
		this.iEventoId = iEventoId;
	}

	public Persona getoPersona() {
		return oPersona;
	}

	public void setoPersona(Persona oPersona) {
		this.oPersona = oPersona;
	}

	public Evento getoEvento() {
		return oEvento;
	}

	public void setoEvento(Evento oEvento) {
		this.oEvento = oEvento;
	}

	public float getfPuntuacion() {
		return fPuntuacion;
	}

	public void setfPuntuacion(float fPuntuacion) {
		this.fPuntuacion = fPuntuacion;
	}

	public String getsValoracion() {
        return sValoracion;
    }

    public void setsValoracion(String sValoracion) {
        if (sValoracion.length() > IMINIMO && sValoracion.length() < IMAXDESCRIPCION) {
            this.sValoracion = sValoracion;
        }
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
		PersonaEvento other = (PersonaEvento) obj;
		return Objects.equals(oEvento, other.oEvento) && Objects.equals(oPersona, other.oPersona)
				&& Objects.equals(sValoracion, other.sValoracion);
	}

	@Override
	public String toString() {
		return "PersonaEvento [sValoracion=" + sValoracion
				+ ", fPuntuacion=" + fPuntuacion + ", sDni=" + sDni + ", iEventoId=" + iEventoId + "]";
	}

	
	
    
}
