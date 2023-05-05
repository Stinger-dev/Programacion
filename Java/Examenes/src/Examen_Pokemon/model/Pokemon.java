package Examen_Pokemon.model;

import java.util.Objects;
import java.util.Random;

public class Pokemon {
	private static final int GANANCIA_NIVEL = 1;
	private static final int PERDIDA_NIVEL = 1;
	private static final int GANANCIA_FUERZA = 10;
	private static final int PERDIDA_FUERZA = 5;
	
	
	private String nombre;
	private Elemento elemento;
	protected int fuerza;
	private int nivel;
	
	public Pokemon(String nombre, Elemento elemento) {
		this.nombre = nombre;
		this.elemento = elemento;
		this.nivel = 3;
		this.fuerza = obtenerFuerzaInicial();
	} 
	
	protected Pokemon(Pokemon tmp) { //Con esto es mas facil aislar los permisos, porque creo nuevas instancias en lugar de devolover el objeto entero, asi no pueden operar sobre el original, sino la copia
		/**
		 * Crea un objeto igual que el pasado por parametro
		 */
		this.nombre = tmp.nombre;
		this.elemento = tmp.elemento;
		this.nivel = tmp.nivel;
		this.fuerza = tmp.fuerza;		
		
	}
	
	
	private int obtenerFuerzaInicial() {
		return new Random().nextInt(1,80);	
	}
	
	public Pokemon luchar(Pokemon rival) {
		/**
		 * devuelve el ganador ?
		 * en caso de empate se soluciona aleatoriamente
		 */
		Pokemon tmp ;
		if(this.fuerza > rival.fuerza) {
			rival.evolucionarTrasBatalla(false);
			tmp = new Pokemon(rival);

		} else if( this.fuerza < rival.fuerza) {
			this.evolucionarTrasBatalla(false);
			rival.evolucionarTrasBatalla(true);
			tmp = new Pokemon(this);
		}else {
			
			if(obtenerFuerzaInicial()%2 == 0) { // en caso de que sea empate es al azar
				rival.evolucionarTrasBatalla(false);
				this.evolucionarTrasBatalla(true);
				tmp = new Pokemon(rival);
			}else {
				this.evolucionarTrasBatalla(false);
				rival.evolucionarTrasBatalla(true);
				tmp = new Pokemon(this);
			}
		}
		
		
		return tmp;	
	}
		
	public void evolucionarTrasBatalla(boolean victoria) {
		if(victoria) {		
			this.nivel += GANANCIA_NIVEL;
			this.fuerza += GANANCIA_FUERZA;
			
		}else {	
			if(this.nivel>PERDIDA_NIVEL) {
				this.nivel -= PERDIDA_NIVEL;
			}
			if(this.fuerza>PERDIDA_FUERZA) { //Puede yener reduccion de daño sin reduccion de nivel
				this.fuerza -= PERDIDA_FUERZA;
			}
			
		}
	} 
	public String getNombre() {
		return nombre;
	}
	
	public Elemento getElemento() {
		return elemento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(elemento, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Pokemon) {
			Pokemon casteado = (Pokemon) obj;

			esIgual = this.nombre.equals(casteado.nombre) && this.elemento.equals(casteado.elemento);
		}
		return esIgual;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s: tipo %s, nivel %s y fuerza %s", this.nombre,this.elemento, this.nivel, this.fuerza); //El %n es para que funcione en cualquier consola, inutil aqui, pero buena practica
	}


}
