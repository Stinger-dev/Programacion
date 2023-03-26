package Boletin_07.Ejercicio_02.Comparadores;

import java.util.Comparator;

import Boletin_07.Ejercicio_02.Vehiculo;

public class CompararFecha implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo ob1, Vehiculo ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getEntrada().compareTo(ob2.getEntrada());
		} else if (ob1 == null) {
			resultado = 1;
		} else if (ob2 == null) {
			resultado = -1;
		}
		return resultado;
	}

}