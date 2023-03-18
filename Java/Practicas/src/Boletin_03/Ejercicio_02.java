package Boletin_03;

public class Ejercicio_02 {

	public static void main(String[] args) {

		System.out.println(esDivisibleEntreTres(156));

	}

	public static boolean esDivisibleEntreTres(int a) {
		boolean esDivi = false;

		while (a > 10) {
			a = sumarDigitos(a);
		}
		switch (a) {
		case 3, 6, 9:
			esDivi = true;
			break;
		}

		return esDivi;
	}

	public static int sumarDigitos(int a) {

		String tmp = String.valueOf(a);
		int resultado = 0;
		for (char i : tmp.toCharArray()) {
			resultado += Character.getNumericValue(i);
		}
		return resultado;
	}
}
