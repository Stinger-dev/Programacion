package Boletin_05.Ejercicio_01;

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

	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Punto) {
			Punto ob2 = (Punto) ob1;
			igual = this.x != ob2.x && this.y != ob2.y;
		}
		return igual;
	}

}
