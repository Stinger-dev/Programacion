package Boletin_03.Ejercicio_04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class test {

	@Test
	void testAgnadiryLimpiar() {
		int cantidad = 10;
		Historial histo = new Historial("asdj");
		for (int i = 0; i < cantidad; i++) {
			histo.newPaginaVisitada("lgagkjadg");
		}
		assert (histo.getHistorialCompleto().split("->").length - 1 == cantidad);
		histo.clearHistorial();
		assert (histo.getHistorialCompleto().isBlank());
	}


	@ParameterizedTest
	@ValueSource(ints = {1, 3, 5, 15})
	void testBorrarUrl(int a) {
		int b = 3;
		Historial histo = new Historial("asdj");

		for (int i = 0; i < a; i++) {
			histo.newPaginaVisitada("a");
		}
		for (int i = 0; i < b; i++) {
			histo.newPaginaVisitada("b");
		}
		assert (histo.getHistorialCompleto().split("->").length - 1 == a + b);
		histo.rmVisitasUrl("a");
		assert (histo.getHistorialCompleto().split("->").length - 1 == b);
	}
	

}
