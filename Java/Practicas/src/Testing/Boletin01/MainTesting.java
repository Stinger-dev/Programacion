package Testing.Boletin01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTesting {

	@Test
	void tesToMayusculas() {
		CadenaUtils ob1 = new CadenaUtils("buenas");
		assertEquals("BUENAS", ob1.toMayusculas());

		ob1 = new CadenaUtils("BUENAS");
		assertEquals("BUENAS", ob1.toMayusculas());

		ob1 = new CadenaUtils(null);
		assertEquals(null, ob1.toMayusculas());

		ob1 = new CadenaUtils("");
		assertEquals("", ob1.toMayusculas());
	}

	@Test
	void tesToMinisculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals("buenas", ob1.toMinusculas());

		ob1 = new CadenaUtils("buenas");
		assertEquals("buenas", ob1.toMinusculas());

		ob1 = new CadenaUtils(null);
		assertEquals(null, ob1.toMinusculas());

		ob1 = new CadenaUtils("");
		assertEquals("", ob1.toMinusculas());
	}

	@Test
	void testEstaEnMayusculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals(true, ob1.estaEnMayusculas());

		ob1 = new CadenaUtils("buenas");
		assertEquals(false, ob1.estaEnMayusculas());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.estaEnMayusculas());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.estaEnMayusculas());
	}

	@Test
	void testEstaEnMinusculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals(false, ob1.estaEnMinisculas());

		ob1 = new CadenaUtils("buenas");
		assertEquals(true, ob1.estaEnMinisculas());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.estaEnMinisculas());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.estaEnMinisculas());
	}

	@Test
	void testEsCapicua() {
		CadenaUtils ob1 = new CadenaUtils("12121");
		assertEquals(true, ob1.esCapicua());

		ob1 = new CadenaUtils("1261");
		assertEquals(false, ob1.esCapicua());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.esCapicua());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.esCapicua());
	}

	@Test
	void testEsPalindromo() {
		CadenaUtils ob1 = new CadenaUtils("abc");
		assertEquals(false, ob1.esPalindromo());

		ob1 = new CadenaUtils("abec");
		assertEquals(false, ob1.esPalindromo());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.esPalindromo());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.esPalindromo());

		ob1 = new CadenaUtils("aba");
		assertEquals(true, ob1.esPalindromo());

		ob1 = new CadenaUtils("abba");
		assertEquals(true, ob1.esPalindromo());

		ob1 = new CadenaUtils("111");
		assertEquals(false, ob1.esPalindromo());
	}

	@Test
	void testEsDecimal() {
		CadenaUtils ob1 = new CadenaUtils("123.2");
		assertEquals(true, ob1.esDecimal());

		ob1 = new CadenaUtils("12");
		assertEquals(false, ob1.esDecimal());

		ob1 = new CadenaUtils("12.0");
		assertEquals(false, ob1.esDecimal());

		ob1 = new CadenaUtils("12.19273486");
		assertEquals(true, ob1.esDecimal());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.esDecimal());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.esDecimal());
	}

	@Test
	void testEsEntero() {
		CadenaUtils ob1 = new CadenaUtils("123.2");
		assertEquals(false, ob1.esEntero());

		ob1 = new CadenaUtils("12");
		assertEquals(true, ob1.esEntero());

		ob1 = new CadenaUtils("12.0");
		assertEquals(true, ob1.esEntero());

		ob1 = new CadenaUtils("12.19273486");
		assertEquals(false, ob1.esEntero());

		ob1 = new CadenaUtils(null);
		assertEquals(false, ob1.esEntero());

		ob1 = new CadenaUtils("");
		assertEquals(false, ob1.esEntero());
	}

}
