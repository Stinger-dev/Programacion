package main.model.Comparators;

import java.util.Comparator;

import main.model.Empleado;

public class ComparatorEmpleadoRol implements Comparator<Empleado> {

	@Override
	public int compare(Empleado ob1, Empleado ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getRol().compareTo(ob2.getRol());
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}