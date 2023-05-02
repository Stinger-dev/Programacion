package Boletin_07.Ejercicio_02.Comparadores;

import java.util.Comparator;

import Boletin_07.Ejercicio_02.Vehiculo;

public class CompararMarcaModelo implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado = 0;

		if (v1 != null && v2 != null) {
			resultado = (v1.getMarca().compareTo(v2.getMarca()) == 0) ? v1.getModelo().compareTo(v2.getModelo())
					: v1.getMarca().compareTo(v2.getMarca());
		} else if (v1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}

		return resultado;
	}

}
