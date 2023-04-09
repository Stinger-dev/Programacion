package Boletin_07.Ejercicio_02.Comparadores;

import java.util.Comparator;

import Boletin_07.Ejercicio_02.Vehiculo;

public class CompararTipoyCombustible implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado = 0;

		if (v1 != null && v2 != null) {
			resultado = (v1.getTipoVehiculo().compareTo(v2.getTipoVehiculo()) == 0)
					? v1.getCombustible().compareTo(v2.getCombustible())
					: v1.getTipoVehiculo().compareTo(v2.getTipoVehiculo());
		} else if (v1 == null) {
			resultado = 1;
		} else if (v2 == null) {
			resultado = -1;
		}

		return resultado;
	}

}
