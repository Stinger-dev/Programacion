package Boletin_03;

public class Ejercicio_06 {

	public static void main(String args) {

	}

	public static boolean esCapicua(String cadena) {
		boolean encontrada = false;
		cadena = cadena.replace(" ", "");
		cadena = cadena.replace(".", "");
		cadena = cadena.replace(",", "");
		for (int n = 0; n < cadena.length() && !encontrada; n++) {
			if (cadena.charAt(n) != cadena.charAt(cadena.length() - n - 1)) {
				encontrada = true;
			}
		}
		return !encontrada;
	}
}
