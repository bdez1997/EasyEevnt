package model;

import java.util.Objects;

public class PersonaEvento implements IMaxCaracteres{
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
    
    public PersonaEvento(Persona oPersona, Evento oEvento) {
    	oPersona.setsDni(null);
    	oEvento.setIdEvento(0);
    }
    
    public PersonaEvento(Persona oPersona, Evento oEvento, String sValoracion) {
    	oPersona.setsDni(null);
    	oEvento.setIdEvento(0);
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
		PersonaEvento other = (PersonaEvento) obj;
		return Objects.equals(oEvento, other.oEvento) && Objects.equals(oPersona, other.oPersona)
				&& Objects.equals(sValoracion, other.sValoracion);
	}
    
}
