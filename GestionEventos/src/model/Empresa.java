package model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Empresa {

	private String nif;
	private String nombre;

	private String telefono;
	private String correo;

	public Empresa(String nif, String nombre, String telefono, String correo) {

		setNif(nif);
		setNombre(nombre);
		setTelefono(telefono);
		setCorreo(correo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Empresa(String nif) {
		this.nif = nif;
	}

	public Empresa() {

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {

		this.nif = nif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {

		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {

		this.correo = correo;

	}

	public int hashCode() {
		return Objects.hash(nif, nombre, telefono, correo);
	}

	public boolean equals(Object obj) {
		boolean boEquals = false;
		Empresa Empresa = (Empresa) obj;
		if (this.getNif().equals(Empresa.getNif())) {
			boEquals = true;
		}
		return boEquals;
	}

	public String toString() {

		String sResultado;

		sResultado = "NIF: " + getNif() + "\n";
		sResultado = "Nombre: " + getNombre() + "\n";
		sResultado += "Teléfono: " + getTelefono() + "\n";
		sResultado += "Correo: " + getCorreo();

		return sResultado;
	}

}
