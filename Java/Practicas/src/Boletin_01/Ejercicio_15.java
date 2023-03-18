package Boletin_01;

import java.util.Scanner;

public class Ejercicio_15 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String resultado = "0";

		float k = 0;

		do {
			k += Float.valueOf(resultado);
			resultado = String.valueOf(teclado.nextLine());
		} while (!resultado.equalsIgnoreCase("fin"));

		System.out.println(k);

	}

}
