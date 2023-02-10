package Boletin_03;

public class Ejercicio_03 {

	public static void main(String[] args) {

		System.out.println(contarLetra("Hola o no", 'o'));

	}

	public static int contarLetra(String cadena, char letra) {
		int resultado = 0;
		for (char i : cadena.toCharArray()) {
			if (i == letra) {
				resultado++;
			}
		}
		return resultado;
	}
}
