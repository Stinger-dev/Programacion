package Boletin_02;

public class Boletin_completo {

	public static void main(String[] args) {

		System.out.println(invertirCadena("Hola mundo"));
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
		boolean segura = false;
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

		int k = 1;
		for (int n = 0; n < palabra.length(); n++) {

			resultado += palabra.charAt(k);

			if ((k % 2 == 0 || k == 0) && n + 3 <= palabra.length()) {
				k += 3;
			} else if (k % 2 != 0) {
				k -= 1;
			}
		}
		return resultado;
	}
}
