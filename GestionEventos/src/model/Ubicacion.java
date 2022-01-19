package model;

import java.util.Objects;

public class Ubicacion {

	private int id_ubicacion;
	private String sCiudad;
	private String sProvincia;
	private int iCodPostal;
	private String sCalle;
	private int iNumero;

	public Ubicacion(int id_ubicacion, String sCiudad, String sProvincia, int iCodPostal, String sCalle, int iNumero) {

		setId_ubicacion(id_ubicacion);
		setsCiudad(sCiudad);
		setsProvincia(sProvincia);
		setiCodPostal(iCodPostal);
		setsCalle(sCalle);
		setiNumero(iNumero);

	}

	public Ubicacion() {

	}

	public int getId_ubicacion() {
		return id_ubicacion;
	}

	public void setId_ubicacion(int id_ubicacion) {
		if (Integer.toString(id_ubicacion).length() <= 10) {
			this.id_ubicacion = id_ubicacion;
		}
	}

	public String getsCiudad() {
		return sCiudad;
	}

	public void setsCiudad(String sCiudad) {

		if (sCiudad.length() <= 50) {
			this.sCiudad = sCiudad;
		}
	}

	public String getsProvincia() {
		return sProvincia;
	}

	public void setsProvincia(String sProvincia) {
		if (sProvincia.length() <= 50) {
			this.sProvincia = sProvincia;
		}
	}

	public int getiCodPostal() {
		return iCodPostal;
	}

	public void setiCodPostal(int iCodPostal) {
		if (Integer.toString(iCodPostal).length() <= 5) {
			this.iCodPostal = iCodPostal;
		}
	}

	public String getsCalle() {
		return sCalle;
	}

	public void setsCalle(String sCalle) {
		if (sCalle.length() <= 50) {
			this.sCalle = sCalle;
		}
	}

	public int getiNumero() {
		return iNumero;
	}

	public void setiNumero(int iNumero) {
		if (Integer.toString(iNumero).length() <= 4) {
			this.iNumero = iNumero;
		}
	}

	public int hashCode() {
		return Objects.hash(id_ubicacion);
	}

	public boolean equals(Object obj) {

		boolean boEquals = false;
		Ubicacion uUbicacion = (Ubicacion) obj;

		if (uUbicacion.getId_ubicacion() != 0 && this.getId_ubicacion() != 0
				&& this.getId_ubicacion() == uUbicacion.id_ubicacion) {
			boEquals = true;
		}
		return boEquals;
	}

	public String toString() {

		String sResultado;

		sResultado = getId_ubicacion() + "\n";
		sResultado = getsCiudad() + "\n";
		sResultado = getsProvincia() + "\n";
		sResultado = getiCodPostal() + "\n";
		sResultado = getsCalle() + "\n";
		sResultado = getiNumero() + "\n";

		return sResultado;
	}

}
