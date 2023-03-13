package Examen_01;

public class ADNUtil_Ampliacion {

	public static String VALIDOS_SIN_COMPRIMIR = "ATCG";
	public static String VALIDOS_COMPRIMIDO = "ATGC12345678901";

	public static void main(String[] args) {

		System.out.println(contarPalabra("CGTTAGTCGTACGTTGCATGCTAGCGTTCTAGCTAGCTACGTTGCTAGCCGTT", "CGTT")); // he añadido 5

		System.out.println(descomprimeADN("A3G2T1C3"));

		System.out.println(descomprimeADNextendido("A10T2"));

	}

	public static int contarPalabra(String cadena, String elemento) {
		int resultado = -1;
		if (validarAdn(cadena, false) && validarAdn(elemento, false)) {
			cadena = cadena.toUpperCase();
			elemento = elemento.toUpperCase();
			int k = 0;
			resultado = 0;

			while (cadena.indexOf(elemento, k) != -1) {
				k = cadena.indexOf(elemento, k) + elemento.length();
				resultado++;
			}
		}
		return resultado;
	}

	public static String descomprimeADN(String cadena) {
		StringBuilder resultado_ = new StringBuilder("No valido");
		if (validarAdn(cadena, true)) {
			resultado_.delete(0, resultado_.length());
			for (int i = 0; i < cadena.length(); i += 2) {
				for (int j = 0; j < Character.getNumericValue(cadena.charAt(i + 1)); j++) {
					resultado_.append(cadena.charAt(i));
				}
			}
		}
		return resultado_.toString();
	}

	public static String descomprimeADNextendido(String cadena) {
		StringBuilder tmp = new StringBuilder();
		StringBuilder tmp2 = new StringBuilder();
		for (char k : cadena.toCharArray()) {

			if (!Character.isDigit(k)) {
				tmp.append(":");
				tmp.append(k);
				tmp.append(":");
			}

			if (Character.isDigit(k)) {
				tmp.append(k);
			}
		}

		String tmp3[] = tmp.toString().split(":");

		for (int n = 1; n < tmp3.length; n += 2) {
			for (int j = 0; j < Integer.valueOf(tmp3[n + 1]); j++) {
				tmp2.append(tmp3[n]);
			}
		}
		return tmp2.toString();
	}

	public static boolean validarAdn(String cadena, boolean comprimido) {
		String validos = comprimido ? VALIDOS_COMPRIMIDO : VALIDOS_SIN_COMPRIMIR;
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
}
