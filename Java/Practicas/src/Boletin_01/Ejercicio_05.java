package Boletin_01;

public class Ejercicio_05 {

	public static void main(String[] args) {

		System.out.printf(tarde(12));

	}

	public static String tarde(float n) {
		String resultado = "";
		if (n >= 6 && n <= 13) {
			resultado = "Buenos dias";
		} else if (n >= 13 && n <= 20) {
			resultado = "Buenas tardes";
		} else {
			resultado = "Buenas noches";
		}
		return resultado;
	}

}
