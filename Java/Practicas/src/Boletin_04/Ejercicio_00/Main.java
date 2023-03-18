package Boletin_04.Ejercicio_00;

import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0;
		do {
			System.out.println(
					"1- Crear avion solo con identificador " + "\n2- Crear avion con el identificador y la compañia");
			opcion = Integer.valueOf(teclado.nextLine());
		} while (opcion != 1 && opcion != 2);

		int capacidad;
		do {
			System.out.println("Indique la capacidad");
			capacidad = Integer.valueOf(teclado.nextLine());
		} while (capacidad <= 0);

		System.out.println("Indique el id: ");
		String idAvion = teclado.nextLine();

		Avion ob1;

		if (opcion == 1) {
			ob1 = new Avion(idAvion, capacidad);

		} else {
			System.out.println("Indique la compañia del avion: ");
			ob1 = new Avion(idAvion, capacidad, teclado.nextLine());

		}
		menu(ob1);

	}

	public static void menu(Avion ob1) {

		System.out.println("a) Asignar Vuelo\n" + "b) Obtener Numero Vuelos\n" + "c) Obtener el numero de km\n"
				+ "d) Media de km por vuelos\n" + "e) Cambiar compañia \n" + "f) Mostrar info avion\n" + "g) Salir\n");
		String op = teclado.nextLine().toUpperCase();

		switch (op) {
		case "A":

			if (asignarVuelo(ob1))
				System.out.println(" Se ha asignado satisfactoriamente\n");
			else
				System.out.println(" NO se ha asignado satisfactoriamente\n");

			menu(ob1);
			break;

		case "B":

			System.out.println(ob1.getNumeroVuelos());
			menu(ob1);
			break;

		case "C":
			System.out.println(ob1.getKmVolados());

			menu(ob1);
			break;

		case "D":
			System.out.println(ob1.getMediaKm());

			menu(ob1);
			break;

		case "E":

			if (cambiarCompania(ob1))
				System.out.println(" Se ha cambiado satisfactoriamente\n");
			else
				System.out.println(" NO se ha cambiado satisfactoriamente\n");

			menu(ob1);
			break;

		case "F":

			System.out.println(ob1.toString());

			menu(ob1);
			break;
		case "G":

			break;

		default:
			System.out.println("Opcion no valida, pruebe de nuevo");

			menu(ob1);
			break;
		}
	}

	public static boolean asignarVuelo(Avion ob1) {

		System.out.println(" Indique la capacidad: ");
		int capacidad = Integer.valueOf(teclado.nextLine());
		System.out.println(" Indique la cantidad de km:");
		float km = Float.valueOf(teclado.nextLine());

		return ob1.asignarVuelo(capacidad, km);
	}

	public static boolean cambiarCompania(Avion ob1) {
		System.out.println("indique el nombre de la compañia:");
		return ob1.cambiarCompannia(teclado.nextLine());
	}

}
