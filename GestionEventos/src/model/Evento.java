package model;

import java.awt.Image;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class Evento {

	private int idEvento;
	
	private String sNombreEvento;
	private String fechaInit;
	private String fechaFin;
	private int aforo;
	private String descripcion;
	private String sDireccion;
	private Image imagen;
	

	
	public Evento() {
		
	}
	public Evento(int idEvento,String sNombreEvento, String fechaInit, String fechaFin,  int aforo,
			String descripcion, Image imagen,String sDireccion) {
		
		setIdEvento(idEvento);
		setsNombreEvento(sNombreEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setAforo(aforo);
        setDescripcion(descripcion);
        setImagen(imagen);
        setsDireccion(sDireccion);
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		if (Integer.toString(idEvento).length() <= 16) {
			this.idEvento = idEvento;
		}
	}
	
	public String getsNombreEvento() {
		return sNombreEvento;
	}

	public void setsNombreEvento(String sNombreEvento) {
		if(sNombreEvento.length()<=50) {this.sNombreEvento = sNombreEvento;}
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
	


	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		if (Integer.toString(aforo).length() <= 10) {
			this.aforo = aforo;
		}
	}

	public String getDescripcion() {		
			return this.descripcion;
	}

	public void setDescripcion(String descripcion) {	
		if (descripcion.length() <= 250) {
		this.descripcion = descripcion;
		}
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	
	
	public String getsDireccion() {
		return sDireccion;
	}

	public void setsDireccion(String sDireccion) {
		this.sDireccion = sDireccion;
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

	public String toString() {

		String sResultado;

		sResultado = getIdEvento() + "\n";
		sResultado += getFechaInit() + "\n";
		sResultado += getFechaFin() + "\n";
		sResultado += getAforo() + "\n";
		sResultado += getImagen() + "\n";
		sResultado += getIdEvento() + "\n";
		sResultado += getsDireccion();
		return sResultado;
	}
}
