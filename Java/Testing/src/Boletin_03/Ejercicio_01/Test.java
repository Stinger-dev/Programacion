package Boletin_03.Ejercicio_01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		Integer[] numeros = {1,2,3,4,5};
		Integer[] reverNumeros = {5,4,3,2,1};	
		assert(Arrays.equals(Ejercicio_01.reverse(numeros), reverNumeros));
		
		String[] nombre = {"ana", "juan"};
		String[] reverNombre = {"juan", "ana"};	
		assert(Arrays.equals(Ejercicio_01.reverse(nombre), reverNombre));
	}

}
