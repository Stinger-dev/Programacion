package Boletin_03.Ejercicio_06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testHashEqual() {
		Palabra ob1 = new Palabra("perro", "sdfkj");
		Palabra ob2 = new Palabra("PERRO", "lsiu34gbsfklgb");

		assert (ob1.hashCode() == ob2.hashCode()); // Esto es para probar si lo de la minuscula funciona como creo que
													// funciona
	}

	@Test
	void testBuscarInicial() {
		Diccionario ob1 = new Diccionario("rae");

		ob1.addPalabra("perro", "añdsjkl");
		ob1.addPalabra("perra", "añdsjkl");
		ob1.addPalabra("perre", "añdsjkl");
		ob1.addPalabra("perru", "añdsjkl");
		ob1.addPalabra("perri", "añdsjkl");
		ob1.addPalabra("queso", "añdsjkl");

		System.out.println(ob1.getEmpiezanPor("per"));
	}

}
