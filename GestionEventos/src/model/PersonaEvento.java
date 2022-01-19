package model;

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

}
