package Boletin_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
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
		
		System.out.println(Mapeando.mapearPersonasPorGenero(nombre).toString());
		
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(1);
		numeros.add(1);
		
		numeros.add(7);
		numeros.add(7);

		System.out.println(Mapeando.contarNumeros(Mapeando.generarNumerosAleatoriosEntre0y20(100000000)).toString());
		
		
		
	}

}
