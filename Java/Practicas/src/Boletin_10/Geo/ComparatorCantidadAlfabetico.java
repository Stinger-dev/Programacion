package Boletin_10.Geo;

import java.util.Comparator;

import Boletin_10.Geo.Primitivos.City;

public class ComparatorCantidadAlfabetico implements Comparator<City> {

	@Override
	public int compare(City ob1, City ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = (ob2.getDirecciones().size() - ob1.getDirecciones().size() != 0)? ob2.getDirecciones().size() - ob1.getDirecciones().size() : ob1.getNombre_ciudad().compareToIgnoreCase(ob2.getNombre_ciudad()) ;
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}