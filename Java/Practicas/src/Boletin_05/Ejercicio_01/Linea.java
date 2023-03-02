package Boletin_05.Ejercicio_01;

public class Linea {
	
	private Punto a;
	private Punto b;
	
	public Linea(Punto a, Punto b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public Linea() {
		super();
		this.a = new Punto();
		this.b = new Punto();
	}
	
	
	public void moverDerecha(Double desplazamiento) {
		this.a.moverXY(desplazamiento, 0);
		this.b.moverXY(desplazamiento, 0);
	}
	public void moverIzquierda(Double desplazamiento) {
		this.a.moverXY(-desplazamiento, 0);
		this.b.moverXY(-desplazamiento, 0);
	}
	public void moverArriba(Double desplazamiento) {
		this.a.moverXY(0, desplazamiento);
		this.b.moverXY(0, desplazamiento);
	}
	public void moverAbajo(Double desplazamiento) {
		this.a.moverXY(0, -desplazamiento);
		this.b.moverXY(0, -desplazamiento);
	}
	
	
	@Override
	public String toString() {
		return "[" + a.toString() + " , " + b.toString() + "]";
	}

	public boolean equals(Object ob1) {
		boolean igual = this == ob1;
		if (!igual && ob1 != null && ob1 instanceof Linea) {
			Linea ob2 = (Linea)ob1;
			igual = (
						(this.a.equals(ob2.a) && this.b.equals(ob2.b))
											  ||
						(this.a.equals(ob2.b) && this.b.equals(ob2.a))
					);
		}			
		return igual;
	}
	

}
