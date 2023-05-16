package Mock_Ficheros.PlataformaOnline.jacaranda.com;

import java.util.Comparator;

public class ComparatorTemporadaNotaMedia implements Comparator<Temporada> {

	@Override
	public int compare(Temporada ob1, Temporada ob2) {
		int resultado = 0;

		if (ob1 != null && ob2 != null) {
			resultado = (int)((ob1.getNotaMedia() - ob2.getNotaMedia())*10); //Le añado el x10 para asegurarme que el truncamiento del cast no dañe la comparacion
		} else if (ob1 == null) {
			resultado = 1;
		} else {
			resultado = -1;
		}
		return resultado;
	}

}
