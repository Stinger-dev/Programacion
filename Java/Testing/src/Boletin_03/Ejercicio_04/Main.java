package Boletin_03.Ejercicio_04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Historial ob1 = new Historial("Gon");
		menu(ob1);

	}

	public static void menu(Historial histo) {
		System.out.println("""
				1. Nueva página consultada
				2. Consultar historial completo
				3. Consultar historial de un dia
				4. Borrar todo el historial
				5. Borrar todas las visitas de una pagina
				6. Salir
				""");
		String opcion = teclado.nextLine();
		switch (opcion) {
		case "1":
			System.out.println("Indique la url");
			histo.newPaginaVisitada(teclado.nextLine());

			menu(histo);
			break;

		case "2":
			System.out.println(histo.getHistorialCompleto());

			menu(histo);
			break;

		case "3":
			System.out.println("Indique el dia");
			try {

				System.out.println(histo.getHistorialDia(LocalDate.parse(teclado.nextLine())));

			} catch (Exception e) {
				System.out.println("El formato debe ser como \"2007-12-03\" ");
			}

			menu(histo);
			break;

		case "4":
			histo.clearHistorial();

			menu(histo);
			break;

		case "5":
			System.out.println("Indique la url");
			histo.rmVisitasUrl(teclado.nextLine());

			menu(histo);
			break;

		case "6":
			System.out.println("Saliendo");

			break;

		default:
			System.out.println("Opcion incorrecta");
			menu(histo);
			break;
		}

	}

}
