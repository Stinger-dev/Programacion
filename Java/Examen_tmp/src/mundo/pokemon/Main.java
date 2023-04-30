package mundo.pokemon;

import mundo.pokemon.model.Elemento;
import mundo.pokemon.model.Entrenador;
import mundo.pokemon.model.Pokemon;
import mundo.pokemon.model.PokemonException;

public class Main {
	
	public static void main(String[] args) {
		/*
		Entrenador ob1 = new Entrenador("Federico");//Funciona
		System.out.println(ob1.toString()); 
		
		Pokemon ob2 = new Pokemon("charmander", Elemento.FUEGO); //Funciona
		
		System.out.println(ob2.toString());
		ob2.evolucionarTrasBatalla(false);
		System.out.println(ob2.toString()); 
		ob2.evolucionarTrasBatalla(true);//Funciona 
		System.out.println(ob2.toString()); //Funciona
		
		try {
			ob1.addPokemon(ob2); //Funciona
		} catch (PokemonException e) {
			e.printStackTrace();
		}
		try {
			ob1.addPokemon(ob2); //Funciona
		} catch (PokemonException e) {
			System.out.println("Si ves esto, es que ha salido bien ");
		}
		System.out.println(ob1.toString()); //Funciona
		
		
		
		try {
			ob2 = new Pokemon("1", Elemento.FUEGO);
			ob1.addPokemon(ob2); 
			ob2 = new Pokemon("2", Elemento.FUEGO);
			ob1.addPokemon(ob2); 
			ob2 = new Pokemon("3", Elemento.FUEGO);
			ob1.addPokemon(ob2); 
			
			ob2 = new Pokemon("1", Elemento.ACERO);
			ob1.addPokemon(ob2); 
			ob2 = new Pokemon("2", Elemento.ACERO);
			ob1.addPokemon(ob2); 
			ob2 = new Pokemon("3", Elemento.ACERO);
			ob1.addPokemon(ob2); 
		} catch (PokemonException e) {
			
		}
		
		System.out.println(ob1.mostrarPokemons()); //Funciona

		*/
		
		Entrenador ent1 = new Entrenador("Federico");
		Pokemon poke1 = null;
		try {
			poke1 = new Pokemon("1", Elemento.FUEGO);
			ent1.addPokemon(poke1); 
			poke1 = new Pokemon("2", Elemento.FUEGO);
			ent1.addPokemon(poke1); 
			poke1 = new Pokemon("3", Elemento.FUEGO);
			ent1.addPokemon(poke1); 
			
			poke1 = new Pokemon("4", Elemento.ACERO);
			ent1.addPokemon(poke1); 
			poke1 = new Pokemon("5", Elemento.ACERO);
			ent1.addPokemon(poke1); 
			poke1 = new Pokemon("6", Elemento.ACERO);
			ent1.addPokemon(poke1); 
		} catch (PokemonException e) {
			System.out.println("no salio bn");
		}
		
		Entrenador ent2 = new Entrenador("Romualdo");
		

		try {
			poke1 = new Pokemon("7", Elemento.FUEGO);
			ent2.addPokemon(poke1); 
			poke1 = new Pokemon("8", Elemento.FUEGO);
			ent2.addPokemon(poke1); 
			poke1 = new Pokemon("9", Elemento.FUEGO);
			ent2.addPokemon(poke1); 
			
			poke1 = new Pokemon("10", Elemento.ACERO);
			ent2.addPokemon(poke1); 
			poke1 = new Pokemon("11", Elemento.ACERO);
			ent2.addPokemon(poke1); 
			poke1 = new Pokemon("12", Elemento.ACERO);
			ent2.addPokemon(poke1); 
		} catch (PokemonException e) {
			System.out.println("no salio bn");
		}
		
		System.out.println(ent1.toString());
		System.out.println(ent2.toString());

		try {
			ent1.competir(ent2);
		} catch (PokemonException e) {
			System.out.println("esto no deberia salir");
		}
		
		System.out.println(ent1.toString());
		System.out.println(ent2.toString());

	
		try {
			ent1.donar(ent2); //Funciona bien
		} catch (PokemonException e) {
			System.out.println("no deberia salir");
		}
		
		System.out.println(ent1.toString());
		System.out.println(ent2.toString());
		
		
		


	}

}
