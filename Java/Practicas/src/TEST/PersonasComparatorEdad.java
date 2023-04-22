package TEST;

import java.util.Comparator;

import TEST.Persona;

public class PersonasComparatorEdad implements Comparator<Persona> {

	@Override
	public int compare(Persona ob1, Persona ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = Integer.compare(ob2.getEdad(), ob1.getEdad());

		} else if (ob1 == null) {
			resultado = 1;
		} else if (ob2 == null) {
			resultado = -1;
		}
		return resultado;
	}

}