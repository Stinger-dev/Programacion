package Boletin_01;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int k = 0;

		System.out.print("Indique un numero:");
		while (Float.valueOf(teclado.nextLine()) > 0) {
			System.out.print("Indique un numero:");

			k++;

		}
		;
		System.out.println(k);
	}

}
