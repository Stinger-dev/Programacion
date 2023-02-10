package Boletin_03;

public class Ejercicio_05 {
	public static void main(String[] args) {
		System.out.println(esPalindromo("ligar es ser agil"));
	}

	public static boolean esPalindromo(String cadena) {
		boolean encontrada = false;
		cadena = cadena.replace(" ", "");
		for (int n = 0; n < cadena.length() && !encontrada; n++) {
			if (cadena.charAt(n) != cadena.charAt(cadena.length() - n - 1)) {
				encontrada = true;
			}
		}
		return !encontrada;
	}

}
