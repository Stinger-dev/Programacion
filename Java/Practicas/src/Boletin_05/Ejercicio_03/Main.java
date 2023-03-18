package Boletin_05.Ejercicio_03;

import java.util.Scanner;

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Jarra a = new Jarra(7), b = new Jarra(4);
		menu(a, b);

	}

	public static void menu(Jarra a, Jarra b) {
		System.out.println("1. Llenar jarra \n" + "2. Vaciar jarra \n" + "3. Volcar jarra A en B. \n"
				+ "4. Volcar jarra B en A. \n" + "5. Ver estado de las jarras: \n" + "6. Salir: \n");
		System.out.println(" Indique la opcion: ");
		String tmp;
		switch (teclado.nextLine()) {
		case "1":

			System.out.print("¿Qué jarra desea llenar(a/b)?: ");
			tmp = teclado.nextLine();

			if (tmp.equalsIgnoreCase("a"))
				a.llenar();
			else if (tmp.equalsIgnoreCase("b"))
				b.llenar();
			else
				System.out.println("Opcion no valida");

			menu(a, b);
			break;

		case "2":

			System.out.print("¿Qué jarra desea vaciar(a/b)?: ");
			tmp = teclado.nextLine();

			if (tmp.equalsIgnoreCase("a"))
				a.vaciarCompleto();
			else if (tmp.equalsIgnoreCase("b"))
				b.vaciarCompleto();
			else
				System.out.println("Opcion no valida");

			menu(a, b);
			break;

		case "3":

			a.volcarEn(b);

			menu(a, b);
			break;

		case "4":
			b.volcarEn(a);

			menu(a, b);
			break;
		case "5":
			System.out.println("A:" + a.toString());
			System.out.println("b:" + b.toString());
			menu(a, b);
			break;

		case "6":
			System.out.printf("El total de agua usada para llenar es %s", Jarra.totalLlenado);
			break;

		default:
			System.out.println("Opcion no valida");
			menu(a, b);
			break;
		}
	}
}
