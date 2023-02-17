package Mock_Exam;

import java.util.Scanner;

public class Ejercicio_01 {
	public static final float GENERAL = 8;
	public static final float DTO_TARJETA = (float) 0.9;
	public static final float DIA_ESPECTADOR = 5;
	public static final float PACK_JUEVES_PAREJA = 11;
	public static final String DIAS_VALIDOS = "LMXJVSD";

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int entradas = 1;
		do {
			System.out.println(" Número de entradas: ");
			entradas = Integer.valueOf(teclado.nextLine());

			if (entradas > 0) {
				String dia = "";
				do {
					System.out.println(" Día de la semana (L,M,X,J,V,S,D):");
					dia = teclado.nextLine();
				} while (DIAS_VALIDOS.indexOf(dia.toUpperCase()) == -1);
				String tarjeta = "";
				do {
					System.out.println(" ¿Tienes tarjeta CineJacaranda(S/N)?:");
					tarjeta = teclado.nextLine();
				} while ("SN".indexOf(tarjeta.toUpperCase()) == -1);
				System.out.printf(" El precio de su compra es %s euros\n",
						calcularPrecio(entradas, dia, tarjeta.equalsIgnoreCase("s") == true ? true : false));
			} else {
				System.out.println(" Adios");
			}

		} while (entradas > 0);
	}

	private static float calcularPrecio(int nPersonas, String dia, boolean tarjeta) {
		float total = 0;
		if (dia.equalsIgnoreCase("J")) {
			total = nPersonas % 2 == 0 ? nPersonas * PACK_JUEVES_PAREJA / 2
					: (((nPersonas - 1) * PACK_JUEVES_PAREJA) / 2) + GENERAL;
		} else {
			total = dia.equalsIgnoreCase("X") ? nPersonas * GENERAL * DTO_TARJETA : nPersonas * GENERAL;
		}
		if (tarjeta) {
			total = total * DTO_TARJETA;
		}
		return total;
	}
}