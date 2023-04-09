package Mock_exam_opp;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Plato tmpPlato = new Plato();

	public static void main(String[] args) {

		Plato[] platos = crearCarta();

		menu(platos);
	}

	public static void menu(Plato[] platos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Dar de alta un plato\n" + "2. Modificar precio plato\n" + "3. Asignar vino a un plato\n"
				+ "4. Mostrar informacion del plato\n" + "5. Mostrar info de todos los platos\n" + "6. Salir\n"
				+ "Elija la opcion: ");
		String opcion = teclado.nextLine();
		String nombre;
		double precio;
		Plato tmp2;
		switch (opcion) {
		case "1":
			System.out.println("Indique el nombre del Plato");
			nombre = teclado.nextLine();
			System.out.println("Indique el precio del Plato");
			precio = Double.valueOf(teclado.nextLine());
			tmp2 = new Plato(nombre, precio);
			if (numeroPlato(platos, tmp2) == -1 && precio > 0) {
				agnadirPlato(platos, tmp2);
			} else {
				System.out.println(
						"Habido un error añadiendo el plato, el plato esta ya en la carta o el precio es invalido");
			}

			menu(platos);
			break;

		case "2":
			System.out.println("Indique el nombre del Plato");
			nombre = teclado.nextLine();
			tmp2 = new Plato(nombre);

			if (numeroPlato(platos, tmp2) == -1) {
				System.out.println("El plato no existe");
			} else {
				System.out.println("Indique el nuevo precio");
				precio = Double.valueOf(teclado.nextLine());
				if (precio > 0)
					platos[numeroPlato(platos, tmp2)].setPrecio(precio);
				else
					System.out.println("Precio no valido, no se haran cambios");
			}

			menu(platos);
			break;
		case "3":

			menu(platos);
			break;
		case "4":

			menu(platos);
			break;
		case "5":
			for (int i = 0; i < platos.length; i++) {
				if (!platos[i].equals(tmpPlato)) {
					System.out.println(platos[i].toString());
				}
			}

			menu(platos);
			break;
		case "6":

			System.out.println("Saliendo");
			break;

		default:
			menu(platos);
			break;
		}

	}

	public static void agnadirPlato(Plato[] platos, Plato plato) {
		if (numeroPlato(platos, plato) == -1) {
			if (numeroPlato(platos, tmpPlato) == -1) {

				System.out.println(" No hay espacio en la carta");
			} else {
				platos[numeroPlato(platos, tmpPlato)] = plato;
				System.out.println("Plato añadido satisfactoriamente");
			}

		} else {
			System.out.println("El plato ya esta añadido");
		}

	}

	public static int numeroPlato(Plato[] platos, Plato plato) {
		int resultado = -1;
		for (int i = 0; i < platos.length && resultado == -1; i++) {
			if (platos[i].equals(plato)) {
				resultado = i;
			}
		}
		return resultado;

	}

	public static Plato[] prepararArray(Plato[] platos) {
		for (int i = 0; i < platos.length; i++) {
			platos[i] = tmpPlato;
		}

		return platos;
	}

	public static Plato[] crearCarta() {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Indique el tamaño maximo de la carta:");
		int tamano = Integer.valueOf(teclado.nextLine());

		if (tamano < 0) {
			System.out.println("Error al fijar el tamaño de la carta, se creara con 10 platos.");
			tamano = 10;
		}

		return prepararArray(new Plato[tamano]);
	}

}
