package Examen_14F;

public class ADNUtil {

	public static String VALIDOS = "ATGC";
	public static String VALIDOS_COMPRIMIDO = "ATGC12345678901";

	public static void main(String[] args) {

		System.out.println(descomprimeADN("a3g2t1c3"));
		System.out.println(comprimeADN(""));

	}

	public static int obstenerNumeroPalabras(String cadena) {
		// La cantidad de veces que sale TAA o ATT en la cadena, y si no termina por
		// eso, cuenta una palabra mas
		int resultado = 0, k = 0;
		cadena = cadena.toUpperCase();
		if (validarAdn(cadena, false)) {
			while (cadena.indexOf("TAA", k) != -1) {
				k += cadena.indexOf("TAA", k) + 1;
				resultado++;
			}
			k = 0;
			while (cadena.indexOf("ATT", k) != -1) {
				k += cadena.indexOf("ATT", k) + 1;
				resultado++;
			}
			if (!cadena.endsWith("ATT") && !cadena.endsWith("TAA")) {
				resultado++;
			}
		} else {
			resultado = -1;
		}
		return resultado;
	}

	public static boolean validarAdn(String cadena, boolean comprimido) {
		/**
		 * Devuelve false si la cadena de adn no es valida, es nula o esta vacia En caso
		 * contrario, devulve true
		 * 
		 * Si se le pasa un true por parametro, tambien validara los valores numericos
		 * ya que se considera que esta comprimida
		 */
		String validos = comprimido ? VALIDOS_COMPRIMIDO : VALIDOS;
		boolean resultado = true;
		if (cadena != null && !cadena.isEmpty()) {
			for (int i = 0; i < cadena.length() && resultado; i++) {
				if (-1 == validos.indexOf(cadena.toUpperCase().charAt(i))) {
					resultado = false;
				}
			}
		} else {
			resultado = false;
		}
		return resultado;
	}

	public static String descomprimeADN(String cadena) {
		StringBuilder cadena_ = new StringBuilder(cadena);

		if (validarAdn(cadena, true)) {
			int posicion = 0;

			for (int i = 0; i < cadena_.length() - 1; i++) {

				if (Character.isDigit(cadena_.charAt(i + 1))) {
					int cantidad = Character.getNumericValue(cadena_.charAt(i + 1));
					cadena_.delete(i + 1, i + 2);
					for (int k = 0; k < cantidad - 1; k++) {
						cadena_.insert(i, cadena_.charAt(i));
					}
				}
			}

		} else {
			cadena_.replace(0, cadena.length(), " Cadena no valida");
		}

		return cadena_.toString().toUpperCase();

	}
	/*
	 * Se sale de rango en la ultima posicion, no me ha dado tiempo a teminarlo
	 * 
	 * 
	 * public static String descomprimeADN2(String cadena) { StringBuilder cadena_ =
	 * new StringBuilder(cadena);
	 * 
	 * if (validarAdn(cadena, true)) { int posicion = 0;
	 * 
	 * for (int i = 0; i < cadena_.length() - 1; i++) {
	 * 
	 * if (Character.isDigit(cadena_.charAt(i + 1))) { posicion = i + 1; while
	 * (posicion < cadena_.length() - 1 &&
	 * Character.isDigit(cadena_.charAt(posicion))) { posicion++; } int cantidad =
	 * Integer.valueOf(cadena_.substring(i + 1, posicion)); cadena_.delete(i + 1,
	 * posicion); for (int k = 0; k < cantidad - 1; k++) { cadena_.insert(i,
	 * cadena_.charAt(i)); } } }
	 * 
	 * } else { cadena_.replace(0, cadena.length(), " Cadena no valida"); }
	 * 
	 * return cadena_.toString().toUpperCase();
	 * 
	 * }
	 */

	public static String comprimeADN(String cadena) {
		StringBuilder resultado = new StringBuilder();
		cadena = cadena.toUpperCase();

		if (validarAdn(cadena, false)) {

			int k = 0;
			while (k < cadena.length()) {
				int j = 0;

				resultado.append(cadena.charAt(k));
				while (k < cadena.length() && cadena.charAt(k) == resultado.charAt(resultado.length() - 1)) {
					k++;
					j++;
				}
				resultado.append(j);
			}
		} else {

		}

		return resultado.toString();
	}

}
