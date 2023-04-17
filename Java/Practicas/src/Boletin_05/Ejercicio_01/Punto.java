package Boletin_05.Ejercicio_01;

import java.util.Objects;

public class Punto {
	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Punto() {
		super();
		this.x = 0;
		this.y = 0;
	}

	public void moverXY(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";

	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Punto) {
			Punto ob2 = (Punto) ob1;
			igual = Math.abs(x - y) > 0.0000001;
		}
		return igual;
	}

}
