package main.model.Comparators;

import java.util.Comparator;

import main.model.Departamento;

public class ComparatorCodigoDepartamento implements Comparator<Departamento> {

	@Override
	public int compare(Departamento ob1, Departamento ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getCodigoDepartamento().compareTo(ob2.getCodigoDepartamento());
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}
