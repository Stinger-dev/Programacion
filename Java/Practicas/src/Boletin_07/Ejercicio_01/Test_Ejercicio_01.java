package Boletin_07.Ejercicio_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_Ejercicio_01 {

	@Test
	void test() {
		assertEquals(Palos.BASTOS, Palos.valueOf("bastos"));
		assertEquals(Palos.BASTOS, Palos.valueOf("bastos"));

	}

	void testCarta() {
		Carta ob1 = new Carta(1, Palos.BASTOS);
		assertEquals(1, ob1.getNumber());
		assertEquals(Palos.BASTOS, ob1.getPalo());
		assertEquals(1, ob1.getValor());

	}

	void testCarta2() {
		Carta ob1 = new Carta(10, Palos.BASTOS);
		assertEquals(1, ob1.getNumber());
		assertEquals(Palos.BASTOS, ob1.getPalo());
		assertEquals(0.5, ob1.getValor());

	}

}
