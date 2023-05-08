package Boletin_10.Euromillones;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class TestCombinaciones {


	@ParameterizedTest
	@CsvSource({"12,13,14,15,16,1,2,5",
				"40,41,2,3,4,1,3,3",
				"12,1,19,15,30,7,10,1" // el minimo numero de numeros es 1, es decir, uno mismo
				})
	void testCalcularMaximoNumerosConsecutivos(int n1, int n2, int n3, int n4, int n5,
			int e1, int e2, int resultado) {
		try {
			Combinacion ob1 = new Combinacion(n1, n2, n3, n4, n5, e1, e2);

			assertEquals(resultado, ob1.getMayorConsecutivo());
		} catch (CombinacionExeption e) {
			assert(false);
		}
	}
	
	@ParameterizedTest
	@CsvSource({"12,13,14,15,16,1,2,7",
				"12,1,14,15,16,1,2,6",
				"12,1,14,15,16,6,2,5",
				"12,1,14,15,16,7,10,4"
				})
	void testComprobarCombinacion(int n1, int n2, int n3, int n4, int n5,
			int e1, int e2, int resultado) {
		try {
			Combinacion ob1 = new Combinacion(n1, n2, n3, n4, n5, e1, e2);
			Combinacion principal = new Combinacion(12,13,14,15,16,1, 2);

			assertEquals(resultado, ob1.comprobarCombinacion(principal));
		} catch (CombinacionExeption e) {
			assert(false);
		}
	}
	
	

}
