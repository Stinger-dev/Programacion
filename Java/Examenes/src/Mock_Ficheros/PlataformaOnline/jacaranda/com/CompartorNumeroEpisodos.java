package Mock_Ficheros.PlataformaOnline.jacaranda.com;

import java.util.Comparator;

public class CompartorNumeroEpisodos implements Comparator<Temporada> {

	@Override
	public int compare(Temporada ob1, Temporada ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = ob1.getNumeroCapitulos() - ob2.getNumeroCapitulos();
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}
