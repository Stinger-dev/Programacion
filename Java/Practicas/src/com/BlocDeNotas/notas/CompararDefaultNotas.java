package com.BlocDeNotas.notas;

import java.util.Comparator;

public class CompararDefaultNotas implements Comparator<Nota> {

	@Override
	public int compare(Nota ob1, Nota ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getFechaCreacion().compareTo(ob2.getFechaCreacion());
		} else if (ob1 == null) {
			resultado = 1;

		} else {
			resultado = -1;
		}
		return resultado;
	}

}