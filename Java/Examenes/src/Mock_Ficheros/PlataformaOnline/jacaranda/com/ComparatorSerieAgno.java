package Mock_Ficheros.PlataformaOnline.jacaranda.com;

import java.util.Comparator;

public class ComparatorSerieAgno implements Comparator<Serie> {

	@Override
	public int compare(Serie ob1, Serie ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getAnno() - (ob2.getAnno());
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}