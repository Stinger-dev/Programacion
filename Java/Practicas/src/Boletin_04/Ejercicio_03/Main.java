package Boletin_04.Ejercicio_03;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Cafetera ob1 = new Cafetera();
		menu(ob1);
	}

	public static void menu(Cafetera ob1) {
		System.out.println("1. Servir café solo (1€)\n" + "2. Servir leche (0.8€)\n"
				+ "3. Servir café con leche (1.5€)\n" + "4. Estado de la maquina\n" + "5. Apagar y salir");
		String opcion = teclado.nextLine();

		switch (opcion.toUpperCase()) {
		case "1":
			System.out.println("Introduzca la cantidad de dinero:");
			System.out.println(ob1.servirCafe(Double.valueOf(teclado.nextLine())));

			menu(ob1);
			break;
		case "2":
			System.out.println("Introduzca la cantidad de dinero:");
			System.out.println(ob1.servirLeche(Double.valueOf(teclado.nextLine())));

			menu(ob1);
			break;
		case "3":
			System.out.println("Introduzca la cantidad de dinero:");
			System.out.println(ob1.servirCafeLeche(Double.valueOf(teclado.nextLine())));

			menu(ob1);
			break;
		case "4":
			System.out.println(ob1.getEstado());

			menu(ob1);
			break;

		case "5":
			System.out.println("Saliendo...");
			break;

		default:
			menu(ob1);
			break;
		}
	}

}
