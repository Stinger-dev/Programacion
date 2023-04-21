package Boletin_09;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TestMapeando {

	private Set<Persona> valores(){
		Set<Persona> nombre = new HashSet<>();
		Persona ob1 = new Persona("a", "a", Genero.FEMENINO);
		nombre.add(ob1);
		ob1 = new Persona("b", "a", Genero.MASCULINO);
		nombre.add(ob1);
		ob1 = new Persona("c", "a", Genero.NEUTRO);
		nombre.add(ob1);
		ob1 = new Persona("d", "a", Genero.MASCULINO);
		nombre.add(ob1);
		ob1 = new Persona("3", "a", Genero.DESCONOCIDO);
		nombre.add(ob1);
		ob1 = new Persona("2", "a", Genero.NEUTRO);
		nombre.add(ob1);
		ob1 = new Persona("1", "a", Genero.DESCONOCIDO);
		nombre.add(ob1);
		return nombre;
	}
	
	@Test
	void testMapearPersonasPorGenero() {
		Set<Persona> valores = new HashSet<>(valores());
		


		
	}

}
