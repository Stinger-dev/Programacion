package Boletin_08.Ejercicio_06;

import java.util.Comparator;

public class ComparatorAlfebeticamente implements Comparator<Palabra> {

	@Override
	public int compare(Palabra ob1, Palabra ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getPalabra().compareTo(ob2.getPalabra());
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}