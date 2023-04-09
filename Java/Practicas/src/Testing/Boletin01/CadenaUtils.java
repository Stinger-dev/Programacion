package Testing.Boletin01;

public class CadenaUtils {

	private String cadena;

	public CadenaUtils(String cadena) {
		super();
		this.cadena = cadena;
	}

	public String toMayusculas() {
		if (this.cadena != null && !this.cadena.isEmpty()) {
			this.cadena = cadena.toUpperCase();
		}
		return this.cadena;
	}

	public String toMinusculas() {
		if (this.cadena != null && !this.cadena.isEmpty()) {
			this.cadena = cadena.toLowerCase();
		}
		return this.cadena;
	}

	public boolean estaEnMayusculas() {
		boolean resultado = false;
		if (this.cadena != null && !this.cadena.isEmpty()) {
			resultado = this.cadena == this.cadena.toUpperCase();
		}
		return resultado;
	}

	public boolean estaEnMinisculas() {
		boolean resultado = false;
		if (this.cadena != null && !this.cadena.isEmpty()) {
			resultado = this.cadena == this.cadena.toLowerCase();
		}
		return resultado;
	}

	public boolean esCapicua() {
		boolean resultado = false;
		if (this.cadena != null && !this.cadena.isEmpty()) { // Esto seria mas rapido si diractamente pongo una exepcion
																// a todo y si peta devuelvo false, pero dudo que eso
																// sea lo que se pide
			boolean esNumero;
			try {
				double tmp = Double.valueOf(this.cadena);
				esNumero = true; // Usarlo como flag
			} catch (Exception e) {
				esNumero = false;
			}
			if (esNumero) {
				boolean encontrado = false; // encontada diferencia
				for (int i = 0; i < this.cadena.length() && !encontrado; i++) {
					encontrado = this.cadena.charAt(i) != this.cadena.charAt(this.cadena.length() - i - 1);
				}
				resultado = !encontrado;
			}
		}
		return resultado;
	}

	public boolean esPalindromo() {
		boolean resultado = false, esNumero = false;
		if (this.cadena != null && !this.cadena.isEmpty()) {
			try {
				double tmp = Double.valueOf(this.cadena); // esto es mas rapido
				esNumero = true;
			} catch (Exception e) {
				esNumero = false;
			}
			if (!esNumero) {
				String tmp = this.cadena.toUpperCase().replace(" ", "");
				boolean encontrado = false; // encontada diferencia

				for (int i = 0; i < tmp.length() && !encontrado; i++) {
					encontrado = tmp.charAt(i) != tmp.charAt(tmp.length() - i - 1);
				}
				resultado = !encontrado;
			}
		}
		return resultado;
	}

	public boolean esDecimal() {
		boolean resultado = false;
		if (this.cadena != null && !this.cadena.isEmpty()) {
			Double tmp, tmp2;
			try {
				tmp = Double.valueOf(this.cadena);
				tmp2 = Double.valueOf(tmp.intValue());
				resultado = !tmp.equals(Double.valueOf(tmp2));
			} catch (Exception e) {
			}
		}
		return resultado;
	}

	public boolean esEntero() {
		boolean resultado = false;
		if (this.cadena != null && !this.cadena.isEmpty()) {
			Double tmp, tmp2;
			try {
				tmp = Double.valueOf(this.cadena);
				tmp2 = Double.valueOf(tmp.intValue());
				resultado = tmp.equals(Double.valueOf(tmp2));
			} catch (Exception e) {
			}
		}
		return resultado;
	}

}
