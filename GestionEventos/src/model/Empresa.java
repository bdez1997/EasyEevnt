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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {

		String nifRegeXp = "[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]";

		if (Pattern.matches(nifRegeXp, nif)) {
			this.nif = nif;
		}
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {

		String tlfnRegexp = "(\\d{3})\\d{9}";
		if (Pattern.matches(tlfnRegexp, telefono)) {
			this.telefono = telefono;
		}
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {

		String emailRegexp = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
		if (Pattern.matches(emailRegexp, correo)) {
			this.correo = correo;
		}
	}

	public int hashCode() {
		return Objects.hash(nif);
	}

	public boolean equals(Object obj) {
		boolean boEquals = false;
		Empresa eEmpresa = (Empresa) obj;
		if (this.getNif().equals(eEmpresa.getNif())) {
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
