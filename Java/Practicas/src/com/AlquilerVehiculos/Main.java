package com.AlquilerVehiculos;

import java.util.Scanner;

public class Main {
	public static Alquileres principal = new Alquileres();
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("1. Alta de vehiculo. \n" + "2. Calculo de precio de alquiler. \n" + "3. Salir.");

		switch (teclado.nextLine()) {
		case "1":
			altaVehiculo();
			menu();
			break;

		case "2":
			int dias = 0;
			do {
				System.out.println("Indique cuantos dias se va a alquilar.");
				try {
					dias = Integer.valueOf(teclado.nextLine());
				} catch (Exception e) {
					System.out.println("Valor no valido, debe ser mayor que 0.");
				}
			} while (dias < 1);
			System.out.println("Indique la matricula del coche que desea alquilar:");
			String matricula = teclado.nextLine();

			double precio = principal.getPrecio(matricula, dias);
			System.out.println((precio != -1) ? precio : "El vehiculo no existe");

			menu();
			break;

		case "3":
			break;

		default:
			System.out.println("Opcion no valida, volviendo al menu");
			menu();
			break;
		}
	}

	public static void altaVehiculo() {
		System.out.println("Indique la matricula del vehiculo");
		String matricula = teclado.nextLine();
		if (!principal.existeVehiculo(matricula)) {
			Gama gama = null;
			do {
				System.out.println("Indique la gama del vehiculo:");
				try {
					gama = Gama.valueOf(teclado.nextLine().toUpperCase());
				} catch (Exception e) {
					System.out.println("Gama incorrecta");
				}
			} while (gama == null);

			Tipo tipo = null;
			do {
				System.out.println("Indique el tipo del vehiculo:");
				try {
					tipo = Tipo.valueOf(teclado.nextLine().toUpperCase());
				} catch (Exception e) {
					System.out.println("Tipo incorrecto");
				}

			} while (tipo == null);

			switch (tipo) {
			case COCHE:
				altaCoche(matricula, gama, tipo);
				break;

			case MICROBUS:
				altaMicrobus(matricula, gama, tipo);
				break;
			case FURGONETADECARGA:
				altaFurgoneta(matricula, gama, tipo);
				break;
			}

		} else {
			System.out.println("El vehiculo ya esta guardado");
		}
	}

	public static void altaCoche(String matricula, Gama gama, Tipo tipos) {
		CombustibleCoche combustible = null;
		do {
			System.out.println("Indique el combustible del coche:");
			try {
				combustible = CombustibleCoche.valueOf(teclado.nextLine().toUpperCase());
			} catch (Exception e) {
				System.out.println("Combustible incorrecto");
			}
		} while (combustible == null);

		principal.addCoche(gama, tipos, matricula, combustible);
	}

	public static void altaFurgoneta(String matricula, Gama gama, Tipo tipos) {
		double PMA = 0.0;
		do {
			System.out.println("Indique el PMA de la furgoneta:");
			try {
				PMA = Double.valueOf(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("Valor incorrecto");
			}
		} while (PMA == 0.0);

		principal.addFurgonetaDeCarga(gama, tipos, matricula, PMA);
	}

	public static void altaMicrobus(String matricula, Gama gama, Tipo tipos) {
		int plazas = 0;
		do {
			System.out.println("Indique el PMA de la furgoneta:");
			try {
				plazas = Integer.valueOf(teclado.nextLine());
			} catch (Exception e) {
				System.out.println("Valor incorrecto");
			}
		} while (plazas == 0);

		principal.addMicroBus(gama, tipos, matricula, plazas);
	}

}
