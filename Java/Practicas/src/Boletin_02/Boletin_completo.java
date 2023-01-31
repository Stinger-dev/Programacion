package Boletin_02;

public class Boletin_completo {

	public static void main(String[] args) {
		/*
		int[] h1 = { 20, 11, 20 }, h2 = { 20, 10, 20 };
		System.out.println(segundosEntre(h1, h2));
		*/
		System.out.println(esFuerte("vxvzafd_1Avasdfvdfvf"));
	}

//1
	public static int numeroSolucionesEcuacionSegundoGrad(float a, float b, float c) {
		// he calculado el numero de soluciones reales
		int resultado = -1;
		float d = b * b - 4 * a * c;
		if (d > 0) {
			resultado = 2;
		} else if (d == 0) {
			resultado = 1;
		}
		return resultado;
	}

//2
	public static String numeroinverso(int a) {
		String tmp = String.valueOf(a);
		String resultado = "";
		for (int i = tmp.length() - 1; i > -1; i--) {
			resultado += tmp.toCharArray()[i];
		}

		return resultado;
	}

//3
	public static boolean esFuerte(String contra) {
		 			    //{ n > 8, nums , minus, mayus, simbs}
		boolean[] check = { false, false, false, false, false};

		if (contra.length() >= 8) {
			check[0] = true;
			if (!contra.toUpperCase().equals(contra)) {
				check[1] = true;
				if (!contra.toLowerCase().equals(contra)) {
					check[2] = true;
					for (char i : contra.toCharArray()) {
						switch (i) {
						case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
							check[3]= true;
							break;
						case '.', ',', '-', '_', '?', '¿', '¡', '!', '(', ')', '<', '>', '/', '+', '*', '[', ']':
							check[4] = true;
						}
					}
				}
			}
		}
		
		return check[0] && check[1] && check[2] && check[3] && check[4];
	}

//4
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

//5
	public static boolean esMultiplo(int a, int b) {
		return (a % b == 0 ? true : false);
	}

//6
	public static int horaMayor(int[] h1, int[] h2) {

		int resultado = -1000;

		/*if ((h1[0] > 0 && h1[0] < 24) && (h1[1] > 0 && h1[1] < 60) && (h1[2] > 0 && h1[2] < 60)) {
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
		}*/
		if ((h1[0] > 0 && h1[0] < 24) && (h1[1] > 0 && h1[1] < 60) && (h1[2] > 0 && h1[2] < 60)) {
			if ((h2[0] > 0 && h2[0] < 24) && (h2[1] > 0 && h2[1] < 60) && (h2[2] > 0 && h2[2] < 60)) {

				resultado = ((h1[0] * 3600 + h1[1] * 60 + h1[2]) - (h2[0] * 3600 + h2[1] * 60 + h2[2]));
			} 
		}
		if (resultado>0) {
			resultado = 1;
		}else if (resultado == 0) {
			resultado = 0;
		}else {
			resultado = 2;
		}
		
			
		
		return resultado;
	}

//7	
	public static int segundosEntre(int[] h1, int[] h2) {

		int resultado = -1000;

		if ((h1[0] > 0 && h1[0] < 24) && (h1[1] > 0 && h1[1] < 60) && (h1[2] > 0 && h1[2] < 60)) {
			if ((h2[0] > 0 && h2[0] < 24) && (h2[1] > 0 && h2[1] < 60) && (h2[2] > 0 && h2[2] < 60)) {
				resultado = ((h1[0] * 3600 + h1[1] * 60 + h1[2]) - (h2[0] * 3600 + h2[1] * 60 + h2[2]));
			}
		}
		return resultado;
	}

//8
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

//9
	public static int toDecimal(String a) {

		String resultado = "";
		int resultadoF = 0;

		for (int i = a.length() - 1; i >= 0; i--) {
			resultado += a.charAt(i);
		}

		for (int i = 0; i < resultado.length(); i++) {
			if (resultado.charAt(i) == '1') {
				resultadoF += Math.pow(2, i);
			}
		}

		return resultadoF;
	}

//10
	public static int gcd(int a, int b) {

		int tmp = 0;

		while (b > 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}

//11
	public static int minimoComunMultiplo(int a, int b) {
		return ((a * b) / gcd(a, b));
	}
	
	
	
}
