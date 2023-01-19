package Boletin_01;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String resultado;

		float k = 0;

		do {

			resultado = String.valueOf(teclado.nextLine());

			if (!resultado.equalsIgnoreCase("fin"))
				k += Float.valueOf(resultado);

		} while (!resultado.equalsIgnoreCase("fin"));

		System.out.println(k);

	}

}
