package Mock_Exam;

import java.util.Scanner;

public class Ejercicio_02 {

	public static int FCM_GENERAL = 220;

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Introduzca su fecha de nacimiento(dd/mm/yyy): ");
		int edad = Integer.valueOf(teclado.nextLine().substring(6)); // solo nos importa el año de nacimiento, asi que
																		// le hago un substring a los datos de entradas
																		// (que el enunciado dice que son correctos)
		System.out.println(" Introduzca la fecha actual(dd/mm/yyy): ");
		int agnoActual = Integer.valueOf(teclado.nextLine().substring(6));

		System.out.printf(" Su FCM es de %s", frecuenciaMaxima(agnoActual, edad));
	}

	public static float frecuenciaMaxima(int agnoActual, int agnoNacimiento) {
		float resultado = 0;

		int edad = agnoActual - agnoNacimiento;

		resultado = (FCM_GENERAL - edad) * (float) 0.85;

		return resultado;
	}
}
