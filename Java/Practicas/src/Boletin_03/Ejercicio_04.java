package Boletin_03;

public class Ejercicio_04 {

	public static void main(String[] args) {

		System.out.println(empiezaPor("hola", "ho"));
		System.out.println(terminaPor("hola", "la"));
		System.out.println(contiene("hola a todos amigos", "todos"));

	}

	public static boolean empiezaPor(String cadena, String bus) {
		int k = 0;
		boolean encontrada = false;

		while (k < bus.length() && !encontrada) {
			if (bus.charAt(k) == cadena.charAt(k)) {
				k++;
			} else {
				encontrada = true;
			}
		}
		return !encontrada;

	}

	public static boolean contiene(String cadena, String bus) {
		boolean resultado = false;
		for (int i = 0; i < cadena.length() && !resultado; i++) {
			int k = 0, j = i;
			boolean encontrada = false;

			while (k < bus.length() && !encontrada) { // encontrada letra distinta
				if (bus.charAt(k) == cadena.charAt(j)) {
					k++;
					j++;
				} else {
					encontrada = true;
				}
			}
			resultado = !encontrada;
		}
		return resultado;

	}

	public static boolean terminaPor(String cadena, String bus) {
		int k = (cadena.length() - 1), j = (bus.length() - 1);

		boolean encontrada = false;

		while (k >= (k - j) && !encontrada) {
			if (bus.charAt(j) == cadena.charAt(k)) {
				k--;
				j--;
			} else {
				encontrada = true;
			}
		}
		return !encontrada;
	}

}
