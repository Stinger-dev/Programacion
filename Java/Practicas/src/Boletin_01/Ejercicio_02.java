package Boletin_01;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {

		String[][] horario = { { "Entorno", "Programacion", "Programacion", "Sistemas", "Sistemas", "FOL" }, // Lunes
				{ "FOL", "FOL", "Programacion", "Programacion", "BBDD", "BBDD" }, // Martes
				{ "Sistemas", "Sistemas", "Lenguaje", "Lenguaje", "BBDD", "BBDD" }, // Miercoles
				{ "BBDD", "BBDD", "Lenguaje", "Lenguaje", "Programacion", "Programacion" }, // Jueves
				{ "Sistemas", "Sistemas", "Entorno", "Entorno", "Programacion", "Programacion" } // Viernes
		};
		String[] dias = { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES" };

		Scanner sc = new Scanner(System.in);

		System.out.println("Que dia es:");
		String dia = sc.nextLine();

		dia = dia.toUpperCase();
		int k = 0;
		boolean encontrado = false;
		while (k < dias.length && encontrado == false) {
			if (!dia.equals(dias[k])) {
				k++;
			} else {
				encontrado = true;
			}
		}

		if (k == -1) {
			System.err.println("Dia no valido");
		} else {
			System.out.println("Hora del dia(n de la hora):");
			int hora = Integer.valueOf(sc.nextLine());

			System.out.println(horario[k][hora - 1]);

		}

	}

}
