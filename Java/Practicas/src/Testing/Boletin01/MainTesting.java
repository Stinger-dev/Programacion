package Testing.Boletin01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTesting {
	
	@Test
	void tesToMayusculas () {
		CadenaUtils ob1 = new CadenaUtils("buenas");
		assertEquals("BUENAS", ob1.toMayusculas() );
		
		CadenaUtils ob4 = new CadenaUtils("BUENAS");
		assertEquals("BUENAS", ob4.toMayusculas());
		
		CadenaUtils ob2 = new CadenaUtils(null);
		assertEquals(null, ob2.toMayusculas() );
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals("", ob3.toMayusculas() );
	}
	
	@Test
	void tesToMinisculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals("buenas", ob1.toMinusculas() );
		
		CadenaUtils ob4 = new CadenaUtils("buenas");
		assertEquals("buenas", ob4.toMinusculas());
		
		CadenaUtils ob2 = new CadenaUtils(null);
		assertEquals(null, ob2.toMinusculas() );
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals("", ob3.toMinusculas() );
	}
	@Test
	void testEstaEnMayusculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals(true, ob1.estaEnMayusculas() );
		
		CadenaUtils ob4 = new CadenaUtils("buenas");
		assertEquals(false, ob4.estaEnMayusculas());
		
		CadenaUtils ob2 = new CadenaUtils(null);
		assertEquals(false, ob2.estaEnMayusculas());
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals(false, ob3.estaEnMayusculas() );
	}
	@Test
	void testEstaEnMinusculas() {
		CadenaUtils ob1 = new CadenaUtils("BUENAS");
		assertEquals(false, ob1.estaEnMinisculas() );
		
		CadenaUtils ob4 = new CadenaUtils("buenas");
		assertEquals(true, ob4.estaEnMinisculas());
		
		CadenaUtils ob2 = new CadenaUtils(null);
		assertEquals(false, ob2.estaEnMinisculas());
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals(false, ob3.estaEnMinisculas() );
	}

	@Test
	void testEsCapicua() {
		CadenaUtils ob1 = new CadenaUtils("1221");
		assertEquals(true, ob1.esCapicua() );
		
		CadenaUtils ob2 = new CadenaUtils("1261");
		assertEquals(false, ob2.esCapicua() );
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals(false, ob3.esCapicua() );
		
		CadenaUtils ob4 = new CadenaUtils(null);
		assertEquals(false, ob4.esCapicua() );
	}
	
	@Test
	void testEsPalindromo() {
		CadenaUtils ob1 = new CadenaUtils("abc");
		assertEquals(true, ob1.esPalindromo() );
		
		CadenaUtils ob2 = new CadenaUtils("abec");
		assertEquals(false, ob2.esPalindromo() );
		
		CadenaUtils ob3 = new CadenaUtils("");
		assertEquals(false, ob3.esPalindromo() );
		
		CadenaUtils ob4 = new CadenaUtils(null);
		assertEquals(false, ob4.esPalindromo() );
	}
	
	
	
	
}
