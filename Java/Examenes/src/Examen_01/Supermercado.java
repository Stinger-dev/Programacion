package Examen_01;

import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String departamento = "-1";
		int totalH = 0, totalE = 0, totalA = 0;
		int notaH = 0, notaE = 0, notaA = 0;
		StringBuilder observacionesH = new StringBuilder();
		StringBuilder observacionesE = new StringBuilder();
		StringBuilder observacionesA = new StringBuilder();

		while (!departamento.isEmpty()) {
			do {
				System.out.println(" ¿Que seccion quiere valorar?: ");
				departamento = teclado.nextLine();

			} while (!departamento.equalsIgnoreCase("Hogar") && !departamento.equalsIgnoreCase("Electronica")
					&& !departamento.equalsIgnoreCase("alimentacion") && !departamento.isEmpty());
			if (!departamento.isEmpty()) {
				int nota = 0;
				do {
					System.out.println(" ¿Como calificarias la atencion recibida?");
					nota = (int) (float) Float.valueOf(teclado.nextLine()); // No me deja castear diractamente a int,
																			// asiq eu casteo a float y luego a int
				} while (nota < 0 || nota > 5);
				System.out.println(" Observaciones: ");
				String observacion = teclado.nextLine();

				switch (departamento.toUpperCase()) {
				case "HOGAR":
					notaH += nota;
					totalH++;
					observacionesH.append(observacion);
					observacionesH.append(":");

					break;

				case "ELECTRONICA":
					notaE += nota;
					totalE++;
					observacionesE.append(observacion);
					observacionesE.append(":");

					break;

				case "ALIMENTACION":
					notaA += nota;
					totalA++;
					observacionesA.append(observacion);
					observacionesA.append(":");

					break;
				}

			}
			System.out.println("--------------------------");

		}

		if (totalA + totalE + totalH > 0) {

			System.out.printf("La puntuacion media del supermercado es %s y han dado su opinion %s clientes \n",
					(notaH + notaE + notaA) / (totalH + totalA + totalE), totalA + totalE + totalH);
		}

		if (totalH > 0) {

			System.out.printf("La puntuacion media de la seccion Hogar es de %s y las obervaciones recogidas:\n",
					notaH / totalH);
			for (String n : observacionesH.toString().split(":")) {
				System.out.println(n);
			}
		}

		if (totalE > 0) {

			System.out.printf("La puntuacion media de la seccion Electronica es de %s y las obervaciones recogidas:\n",
					notaE / totalE);
			for (String n : observacionesE.toString().split(":")) {
				System.out.println(n);
			}
		}

		if (totalA > 0) {

			System.out.printf("La puntuacion media de la seccion Alimentcion es de %s y las obervaciones recogidas:\n",
					notaA / totalA);
			for (String n : observacionesA.toString().split(":")) {
				System.out.println(n);
			}
		}
	}

}
