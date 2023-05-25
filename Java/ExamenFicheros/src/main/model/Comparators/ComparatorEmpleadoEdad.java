package main.model.Comparators;

import java.util.Comparator;

import main.model.Empleado;

public class ComparatorEmpleadoEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado ob1, Empleado ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getEdad() - ob2.getEdad();
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}