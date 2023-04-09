package restaurante;

import java.util.Comparator;

import restaurante.model.Producto;

public class CompararPorAlergenos implements Comparator<Producto> {

	@Override
	public int compare(Producto ob1, Producto ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getAlergeno().compareTo(ob2.getAlergeno());
		} else if (ob1 == null) {
			resultado = 1;
		} else if (ob2 == null) {
			resultado = -1;
		}
		return resultado;
	}

}