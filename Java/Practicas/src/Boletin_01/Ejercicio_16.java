package Boletin_01;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float suma = 0, k = 0, n = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Introduzca un valor: ");

			n = Float.valueOf(teclado.nextLine());

			suma += n;

			if (n > 1000)
				k++;

		}
		System.out.printf("La suma total es de %s y hay %s empleados con sueldo superior a 1000€", suma, k);

	}

}
