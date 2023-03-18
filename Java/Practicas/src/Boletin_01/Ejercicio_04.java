package Boletin_01;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		// esto se que se podria hacer mas facil pero asi practico cosas mas avanzadas y
		// este metodo me hace gracia
		float[] notas = { -1, -1, -1 };
		String[] tipos = { "practica", "problemas", "teorica" };

		for (int i = 0; i < notas.length; i++) {
			do {
				System.err.printf("Indique la nota de %s: ", tipos[i]);
				float nota = Float.valueOf(teclado.nextLine());
				notas[i] = nota;

			} while (!validar(notas[i]));

		}
		System.out.printf("Las notas son %s, %s, %s", notas[0], notas[1], notas[2]);
		System.out.printf("\nLa nota final es %s", (notas[0] * 0.1 + notas[1] * 0.4 + notas[2] * 0.5));

	}

	public static boolean validar(float n) {
		boolean resultado = false;
		if (n >= 0 && n <= 10) {
			resultado = true;
		}
		return resultado;
	}
}
