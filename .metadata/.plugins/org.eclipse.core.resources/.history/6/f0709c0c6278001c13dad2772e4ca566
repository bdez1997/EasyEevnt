package model;

import java.awt.Image;
<<<<<<< HEAD
import java.time.LocalDate;

=======
import java.util.Date;
import java.util.Objects;
>>>>>>> main

public class Evento {

	private String nombre;
	private int idEvento;
	private LocalDate fechaInit;
	private LocalDate fechaFin;
	private LocalDate HoraInit;
	private LocalDate HoraFin;
	private int aforo;
	private String descripcion;
	private Image imagen;
	private int idUbicacion;

	public Evento(int idEvento, LocalDate fechaInit, LocalDate fechaFin, LocalDate horaInit, LocalDate horaFin, int aforo,
			String descripcion, Image imagen, int idUbicacion,String nombre) {
		
<<<<<<< HEAD
		this.nombre = nombre;
		this.idEvento = idEvento;
		this.fechaInit = fechaInit;
		this.fechaFin = fechaFin;
		this.HoraInit = horaInit;
		this.HoraFin = horaFin;
		this.aforo = aforo;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.idUbicacion = idUbicacion;
=======
		setIdEvento(idEvento);
        setFechaInit(fechaInit);
        setFechaFin(fechaFin);
        setHoraInit(horaInit);
        setHoraFin(horaFin);
        setAforo(aforo);
        setDescripcion(descripcion);
        setImagen(imagen);
        setIdEvento(idUbicacion);
>>>>>>> main
	}
	
	public void getNombre(String nombre) {
		if (nombre.length() <= 250) {
			this.nombre = nombre;
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		if (Integer.toString(idEvento).length() <= 16) {
			this.idEvento = idEvento;
		}
	}

	public LocalDate getFechaInit() {
		return fechaInit;
	}

	public void setFechaInit(LocalDate fechaInit) {
		this.fechaInit = fechaInit;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public LocalDate getHoraInit() {
		return HoraInit;
	}

	public void setHoraInit(LocalDate horaInit) {
		HoraInit = horaInit;
	}

	public LocalDate getHoraFin() {
		return HoraFin;
	}

	public void setHoraFin(LocalDate horaFin) {
		HoraFin = horaFin;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		if (Integer.toString(aforo).length() <= 10) {
			this.aforo = aforo;
		}
	}

	public void getDescripcion(String description) {
		if (descripcion.length() <= 250) {
			this.descripcion = descripcion;
		}
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public int getidUbicacion() {
		return idUbicacion;
	}

	public void setidUbicacion(int idUbicacion) {
		if (Integer.toString(idUbicacion).length() <= 10) {
			this.idUbicacion = idUbicacion;
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

		sResultado = getIdEvento() + "\n";
		sResultado = getFechaInit() + "\n";
		sResultado = getFechaFin() + "\n";
		sResultado = getHoraInit() + "\n";
		sResultado = getHoraFin() + "\n";
		sResultado = getAforo() + "\n";
		sResultado = getImagen() + "\n";
		sResultado = getidUbicacion() + "\n";
		sResultado = getIdEvento() + "\n";
		sResultado = getidUbicacion() + "\n";
		return sResultado;
	}

}
