package Boletin_03;

public class Ejercicio_09 {

	public static void main(String[] args) {

		// En el propio nombre del metodo esta indicado el nombre del metodo
		for (int i : contarPalaFraSaltos("Hola a todos. Encantado de conoceros.\n Buenos dias.")) {
			System.out.println(i);
			System.out.println("abcdefghijklmnñopqrstuvwxyz".toUpperCase());
		}
	}

	public static int contarFrases(String texto) {
		int resultado = 0;

		for (char i : texto.toCharArray()) {
			if (i == '.') {
				resultado++;
			}
		}
		return resultado;
	}

	public static int contarSaltos(String texto) {
		String[] lines = texto.split("\r\n|\r|\n");
		return lines.length;
	}

	public static int contarPalab(String texto) {
		int resultado = 0;
		boolean anteEspacio = true;

		for (char i : texto.strip().toCharArray()) {
			if (i != ' ' && anteEspacio) {
				resultado++;
				anteEspacio = false;
			} else if (i == ' ') {
				anteEspacio = true;
			}
		}
		return resultado;
	}

	public static int[] contarPalaFraSaltos(String texto) {
		int[] resultado = { contarPalab(texto), contarFrases(texto), contarSaltos(texto) };
		return resultado;
	}

}