package com.jacaranda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jacaranda.usuario.Usuario;

class TestsUnitario {

	@Test
	void testUsuario() {
		Usuario ob1 = new Usuario("abc", "123");
		Usuario ob2 = new Usuario("abd", "123");

		assertEquals(true, ob1.checkPass("123"));
		assertEquals(false, ob1.checkPass(""));
		assertEquals(false, ob1.checkPass(null));

		assertEquals(true, ob1.equals(ob1));
		assertEquals(false, ob1.equals(ob2));
		assertEquals(false, ob1.equals(null));

		assertEquals("abc", ob1.getLogin());
		assertNotEquals("abc", ob2.getLogin());

		
		assertEquals(false, ob1.setPass("1234", "1234"));
		assertEquals(true, ob1.setPass("123", "1234"));
		assertEquals(true, ob1.checkPass("1234"));

	
	}
	
}
