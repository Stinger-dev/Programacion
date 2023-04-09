package restaurante;

import java.util.Comparator;

import restaurante.model.Cliente;

public class CompararAlergiaEdad implements Comparator<Cliente> {

	@Override
	public int compare(Cliente ob1, Cliente ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = (ob1.getAlergia().compareTo(ob2.getAlergia()) == 0) ? ob1.getEdadActual() - ob2.getEdadActual()
					: ob1.getAlergia().compareTo(ob2.getAlergia());
		} else if (ob1 == null) {
			resultado = 1;
		} else if (ob2 == null) {
			resultado = -1;
		}
		return resultado;
	}

}