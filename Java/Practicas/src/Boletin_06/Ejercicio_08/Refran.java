package Boletin_06.Ejercicio_08;

import java.util.Objects;

public class Refran {
	private String refran;

	public Refran(String refran) {
		super();
		this.refran = refran;
	}

	public String getRefran() {
		return this.refran;
	}

	@Override
	public int hashCode() {
		return Objects.hash(refran);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		if (!esIgual && obj != null && obj instanceof Refran) {
			Refran casteado = (Refran) obj;

			esIgual = this.refran.equals(casteado.refran);
		}
		return esIgual;
	}

	@Override
	public String toString() {
		return this.refran;
	}

	public boolean estaPalabra(String palabra) {
		return (this.refran.toLowerCase().indexOf(palabra.toLowerCase()) != -1);
	}

}
