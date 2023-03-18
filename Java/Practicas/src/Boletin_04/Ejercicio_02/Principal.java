package Boletin_04.Ejercicio_02;

import java.util.Scanner;

public class Principal {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Cuenta ob1 = new Cuenta(1000);
		menu(ob1);

	}

	public static void menu(Cuenta ob1) {
		String opcion;
		System.out.println("1. Hacer un reintegro, se pedirá la cantidad a retirar.\r\n"
				+ "2. Hacer un ingreso, se pedirá la cantidad a ingresar.\r\n"
				+ "3. Consultar el saldo y el número de reintegros e ingresos realizados.\r\n"
				+ "4. Finalizar las operaciones. Debe confirmar si realmente desea salir informar del saldo al final de todas las operaciones. ");
		opcion = teclado.nextLine();
		switch (opcion) {
		case "1":
			System.out.println(" Indique cuanto quiere retirar: ");
			ob1.reintegro(Double.valueOf(teclado.nextLine()));

			menu(ob1);
			break;
		case "2":
			System.out.println(" Indique cuanto quiere ingresar: ");
			ob1.ingreso(Double.valueOf(teclado.nextLine()));

			menu(ob1);
			break;
		case "3":
			System.out.println(ob1.toString());

			menu(ob1);
			break;
		case "4":
			System.out.printf(" Estas seguro que quiere salir con un saldo de %s€?(Y/N)", ob1.getSaldo());
			if (teclado.nextLine().equalsIgnoreCase("y")) {
				break;
			} else {
				menu(ob1);
				break;
			}
		default:
			System.out.println(" Opcion no valida");

			menu(ob1);
			break;

		}
	}

}
