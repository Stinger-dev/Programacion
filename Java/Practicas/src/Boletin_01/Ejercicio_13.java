package Boletin_01;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float max = 0, min = 0;

		max = min = Float.valueOf(teclado.nextLine());

		for (int i = 0; i < 9; i++) {
			float n = Float.valueOf(teclado.nextLine());

			if (n > max)
				max = n;
			if (n < min)
				min = n;

		}

		System.out.printf("El menor es %s y el mayor es %s", min, max);

	}

}
