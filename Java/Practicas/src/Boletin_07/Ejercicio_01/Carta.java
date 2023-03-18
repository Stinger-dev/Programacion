package Boletin_07.Ejercicio_01;

import java.util.Objects;

public class Carta {
	private int number;
	private Palos palo;

	public Carta(int number, Palos palo) {
		this.number = number;
		this.palo = palo;
	}

	public double getValor() {
		return (this.number >= 10) ? 0.5 : this.number;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Carta) {
			Carta casteado = (Carta) obj;

			esIgual = this.number == casteado.number && this.palo.equals(casteado.palo);
		}
		return esIgual;
	}

	public int getNumber() {
		return number;
	}

	public Palos getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "La carta es un " + number + " de " + palo;
	}

}
