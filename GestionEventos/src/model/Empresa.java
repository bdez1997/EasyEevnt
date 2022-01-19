package model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Empresa {

	private String sNif;
	private String sTelefono;
	private String sCorreo;

	public Empresa(String sNif, String sTelefono, String sCorreo) {

		setsNif(sNif);
		setsTelefono(sTelefono);
		setsCorreo(sCorreo);
	}

	public Empresa(String sNif) {
		this.sNif = sNif;
	}

	public String getsNif() {
		return sNif;
	}

	public void setsNif(String sNif) {

		String nifRegeXp = "[[A-H][J-N][P-S]UVW][0-9]{7}[0-9A-J]";

		if (Pattern.matches(nifRegeXp, sNif)) {
			this.sNif = sNif;
		}
	}

	public String getsTelefono() {
		return sTelefono;
	}

	public void setsTelefono(String sTelefono) {

		String tlfnRegexp = "(\\d{3})\\d{9}";
		if (Pattern.matches(tlfnRegexp, sTelefono)) {
			this.sTelefono = sTelefono;
		}
	}

	public String getsCorreo() {
		return sCorreo;
	}

	public void setsCorreo(String sCorreo) {

		String emailRegexp = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
		if (Pattern.matches(emailRegexp, sCorreo)) {
			this.sCorreo = sCorreo;
		}
	}

	public int hashCode() {
		return Objects.hash(sNif);
	}

	public boolean equals(Object obj) {
		boolean boEquals = false;
		Empresa eEmpresa = (Empresa) obj;
		if (this.getsNif().equals(eEmpresa.getsNif())) {
			boEquals = true;
		}
		return boEquals;
	}

	public String toString() {

		String sResultado;

		sResultado = "NIF: " + getsNif() + "\n";
		sResultado += "Teléfono: " + getsTelefono() + "\n";
		sResultado += "Correo: " + getsCorreo();

		return sResultado;
	}

}
