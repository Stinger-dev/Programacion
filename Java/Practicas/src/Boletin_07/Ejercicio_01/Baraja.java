package Boletin_07.Ejercicio_01;

import java.util.Arrays;
import java.util.Random;

public class Baraja {

	private int numCartas;
	private int siguiente;// Esto es para coger la siguiente de la baraja y realmente es el puntero actual
	private Carta[] cartas; 
	private final int NUMERO_CARTAS = 40;

	public Baraja() {
		super();
		this.numCartas = NUMERO_CARTAS;
		this.siguiente = 0;
		this.cartas = new Carta[numCartas];
		generarBaraja();
		this.barajarA();
		this.barajarB();
		this.barajarC();
		this.barajarD();// ahi bien barajaó tó 
	}

	private void generarBaraja() {
		for (Palos p : Palos.values()) {
			for (int i = 1; i < 8; i++) {
				cartas[siguiente] = new Carta(i, p);
				this.siguiente++;
			}
			for (int i = 10; i <= 12; i++) {

				cartas[siguiente] = new Carta(i, p);
				this.siguiente++;
			}
		}
		this.siguiente = 0;
	}

	/**
	 * Metodo intercambio de dos posiciones aleatorias
	 */
	public void barajarA() {
		int permutaciones = 100;
		Random r = new Random();

		for (int i = 0; i < permutaciones; i++) {
			intercambioCarta(r.nextInt(0, this.cartas.length), r.nextInt(0, this.cartas.length));
		}

	}

	/**
	 * Metodo intercambio de cada posicion
	 */
	public void barajarB() {
		Random r = new Random();

		for (int i = 0; i < this.cartas.length; i++) {
			intercambioCarta(i, r.nextInt(0, this.cartas.length));
		}

	}

	private void intercambioCarta(int a, int b) {
		Carta tmp = this.cartas[a];
		this.cartas[a] = this.cartas[b];
		this.cartas[b] = tmp;

	}

	/**
	 * Metodo de jose
	 */
	public void barajarC() {
		Carta[] tmp = new Carta[this.cartas.length];
		int contador = 0;
		Random r = new Random();

		while (this.cartas.length > 0) {
			int n = r.nextInt(0, this.cartas.length);
			tmp[contador] = this.cartas[n];
			borrarIndice(n);
			contador++;
		}
		this.cartas = Arrays.copyOf(tmp, tmp.length);

	}

	private void borrarIndice(int a) {
		this.cartas[a] = this.cartas[cartas.length - 1];
		this.cartas = Arrays.copyOf(this.cartas, this.cartas.length - 1);
	}

	/**
	 * Metodo de fuerza bruta
	 */
	public void barajarD() {
		Random r = new Random();
		Carta[] tmp = new Carta[this.cartas.length];

		for (int i = 0; i < tmp.length; i++) {
			int numero;
			do {
				numero = r.nextInt(0, tmp.length);
			} while (cartas[numero] == null);
			tmp[i] = cartas[numero];
			cartas[numero] = null;
		}
		this.cartas = Arrays.copyOf(tmp, tmp.length);
	}

	public Carta getSiguiente() {
		Carta resultado = this.cartas[siguiente];
		siguiente++;
		return resultado;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		for (Carta c : cartas) {
			result.append(c.toString());
			result.append("\n");
		}

		return result.toString();
	}

}
