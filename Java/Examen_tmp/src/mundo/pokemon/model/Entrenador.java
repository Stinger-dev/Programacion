package mundo.pokemon.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Entrenador {

	private String nombre;
	private int batallasGanadas;
	private Set<Pokemon> equipo; //Un set ya que no se pueden tener elementos repetidos, el orden es igual en la mayoria de los casos  y no se necesita usar acceso aleatorio frecuentemente
	
	
	public Entrenador(String nombre) {
		this.nombre = nombre;
		this.batallasGanadas = 0;
		this.equipo = new HashSet<>();
	}
	
	protected Pokemon obtenerMasFuerte() {
		Pokemon tmp = null;
		for(Pokemon poke: this.equipo) {
			if(tmp == null || poke.fuerza>tmp.fuerza) {
				tmp = new Pokemon(poke);
			}
		}
		
		return tmp;
	}
	
	
	
	
	
	public void addPokemon(Pokemon newPoke ) throws PokemonException {
		/**
		 * Intenta añadirlo, si el tamaño del set no ha cambiado, entonces es que salio mal y lanza excepcion
		 * 
		 */
		boolean tmp = this.equipo.add(newPoke);
		if(!tmp) {
			throw new PokemonException("No se ha añadir");
		}
	}
	public void addPokemon(String nombre, Elemento tipo) throws PokemonException {
		/**
		 * Llama a addPokemon(Pokemon newPoke )
		 * 
		 */
		addPokemon(new Pokemon(nombre, tipo));
	}
	
	
	public void competir(Entrenador rival) throws PokemonException {
		
		Pokemon tmp = new Pokemon(this.obtenerMasFuerte().luchar(rival.obtenerMasFuerte()));
		//Disculpas de antemano por esta solucion que se que no te va a gustar, pero es la forma mas rapida y ya perdi mucho tiempo en el resto de cosas
		try {
			rival.addPokemon(tmp);
			this.eliminarPokemon(tmp);
			rival.batallasGanadas++;
		} catch (PokemonException e) {
			try {
				this.addPokemon(tmp);
				rival.eliminarPokemon(tmp);
				this.batallasGanadas++;

			} catch (PokemonException p) {		
				throw new PokemonException("No se ha podido hacer la transaccion");
			}
		}
		
		
		
	}
	
	
	public boolean eliminarPokemon(Pokemon poke) throws PokemonException {
		/**
		 * En caso de que pueda eliminarlo, devulve true, si no, lanza excepcion
		 */
		
		boolean resultado = this.equipo.remove(poke);
		if(!resultado) {
			throw new PokemonException("No se ha podido eliminar");
		}
		return resultado;
	}
	
	public boolean eliminarPokemon(String nombre, Elemento elem) throws PokemonException {
		/**
		 * llama a  eliminarPokemon(Pokemon poke)
		 */
		return eliminarPokemon(new Pokemon(nombre, elem));
	}
	
	public void vaciar() {
		this.equipo.clear();
	}

	public boolean donar(Entrenador donado) throws PokemonException {
		boolean resultado = false;
		Set<Pokemon> tmp = new HashSet<>(this.equipo); 
		tmp.removeAll(donado.equipo); 
		if(tmp.size() == this.equipo.size()) { //Si el tamaño despues de haberle borrado los comunes es igual, significa que no tienen nada en comun y por tanto si se puede fusionar
			donado.equipo.addAll(this.equipo);
			vaciar();
		}else {
			throw new PokemonException("No se puede donar, tienen pokemons en comun");
		}
		
		return resultado;
	}
	
	
	
	public String mostrarPokemons() {
		StringBuilder resultado = new StringBuilder();
		Map<Elemento, Set<Pokemon>> tmp = new HashMap<>();
		
		for(Pokemon poke : this.equipo) {
			if(!tmp.containsKey(poke.getElemento())) {
				tmp.put(poke.getElemento(),  new HashSet<>());
			}
			tmp.get(poke.getElemento()).add(poke);
		}

		for (Elemento ele : tmp.keySet()) {
			resultado.append(ele).append("\n");
			for(Pokemon poke: tmp.get(ele)) {
				resultado.append("\t").append(poke.toString()).append("\n");
			}
		}
		
		
		return resultado.toString();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Entrenador) {
			Entrenador casteado = (Entrenador) obj;
	
			esIgual = this.nombre.equals(casteado.nombre);
		}
		return esIgual;
	}
	
	@Override
	public String toString() {
		StringBuilder resultado = new StringBuilder(String.format("El entrenador %s tiene %s batallas ganadas %n", this.nombre, this.batallasGanadas));
		
		for(Pokemon poke : this.equipo) {
			resultado.append("\t").append(poke.toString()).append("\n");
		}
		
		return resultado.toString();
	}
	
	
}
