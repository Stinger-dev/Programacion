package Boletin_03.Ejercicio_08;

import java.util.Comparator;

public class ComparatorEdadAlumno implements Comparator<Alumno> {

	@Override
	public int compare(Alumno ob1, Alumno ob2) {
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
