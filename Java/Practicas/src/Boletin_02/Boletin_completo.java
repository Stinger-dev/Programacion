package Boletin_02;

public class Boletin_completo {

	public static void main(String[] args) {

		System.out.println(toBinary(111));

	}

	public static int numeroSolucionesEcuacionSegundoGrad(float a, float b, float c) {
		int resultado = -1;
		float d = b * b - 4 * a * c;
		if (d > 0) {
			resultado = 2;
		} else if (d == 0) {
			resultado = 1;
		}
		return resultado;
	}

	public static String numeroinverso(int a) {
		String tmp = String.valueOf(a);
		String resultado = "";
		for (int i = tmp.length() - 1; i > -1; i--) {
			resultado += tmp.toCharArray()[i];
		}

		return resultado;
	}

	public static boolean esFuerte(String contra) {
		// (mas de 8, numeros, minusculas, mayusculas, simbolos)
		int[] check = { 0, 0, 0, 0, 0 };

		if (contra.length() >= 8) {
			check[0] = 1;
			if (!contra.toUpperCase().equals(contra)) {
				check[1] = 1;
				if (!contra.toLowerCase().equals(contra)) {
					check[2] = 1;
					for (char i : contra.toCharArray()) {
						switch (i) {
						case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
							check[3]++;
							break;
						case '.', ',', '-', '_', '?', '¿', '¡', '!', '(', ')', '<', '>', '/', '+', '*', '[', ']':
							check[4]++;
						}
					}
				}
			}
		}
		boolean flag = false;
		int k = 0;
		while (!flag && k < check.length) {
			flag = (check[k] == 0 ? true : false);
			k++;
		}
		return flag == true ? false : true;
	}

	public static String invertirCadena(String palabra) {

		String resultado = "";

		int tmp = (palabra.length() % 2 == 0 ? 0 : 1); // Con esto le resto uno al tamaño en el caso que uno de los
														// caracteres este suelto

		int k = 1;
		for (int n = 0; n < palabra.length() - tmp; n++) {

			resultado += palabra.charAt(k);

			if ((k % 2 == 0 || k == 0) && n + 3 <= palabra.length()) {
				k += 3;
			} else if (k % 2 != 0) {
				k -= 1;
			}
		}
		if (palabra.length() % 2 != 0) // si hay un caracter suelto esto lo añade al final
			resultado += palabra.charAt(palabra.length() - 1);

		return resultado;
	}

	public static boolean esMultiplo(int a, int b) {
		return (a % b == 0 ? true : false);
	}

	public static int horaMayor(int[] h1, int[] h2) {

		int resultado = -1000;

		if ((h1[0] > 0 && h1[0] < 24) && (h1[1] > 0 && h1[1] < 60) && (h1[2] > 0 && h1[2] < 60)) {
			if ((h2[0] > 0 && h2[0] < 24) && (h2[1] > 0 && h2[1] < 60) && (h2[2] > 0 && h2[2] < 60)) {

				if (h1[0] > h2[0]) {
					resultado = 1;
				} else if (h1[0] < h2[0]) {
					resultado = 2;
				} else {
					if (h1[1] > h2[1]) {
						resultado = 1;
					} else if (h1[1] < h2[1]) {
						resultado = 2;
					} else {
						if (h1[2] > h2[2]) {
							resultado = 1;
						} else if (h1[2] < h2[2]) {
							resultado = 2;
						} else {
							resultado = 0;
						}
					}
				}
			}
		}
		return resultado;
	}

	public static String toBinary(int a) {

		String resultado1 = "", resultadoF = "";
		while (a > 0) {
			resultado1 += (a % 2);
			a = ((a - (a % 2)) / 2);
		}
		for (int i = resultado1.length() - 1; i >= 0; i--) {
			resultadoF += resultado1.charAt(i);
		}
		return resultadoF;
	}
}