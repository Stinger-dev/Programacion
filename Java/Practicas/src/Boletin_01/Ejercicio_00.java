package Boletin_01;

import java.util.Scanner;

public class Ejercicio_00 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int edad = Integer.valueOf(sc.nextLine());

		if (edad >= 65) {
			System.out.println("Tas viejo");
		} else if (edad >= 18) {
			System.out.println("Mayor de edad ");
		} else {
			System.out.println("Tas chikito");
		}

		int mes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("Que año es?");

		int numero = Integer.valueOf(sc.nextLine());

		if ((numero % 4 == 0) && ((numero % 100 != 0) || (numero % 400 == 0))) {
			mes[1] = 29;
		}

		System.out.println("Que numero de mes es?");
		numero = Integer.valueOf(sc.nextLine());

		System.out.println(mes[numero - 1]);
	}
}