package Boletin_01;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float num = -1;
		do {
			System.out.print("Indique un numero: ");
			num = Float.valueOf(teclado.nextLine());
		} while (num < 0);

		float k = 0;
		for (float i = num; i < num + 100; i++) {
			k += i;
		}

		System.out.println(k);
	}

}
