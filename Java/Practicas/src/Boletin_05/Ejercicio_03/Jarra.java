package Boletin_05.Ejercicio_03;

public class Jarra {
	private double capacidadMaxima;
	private double actualL;
	public static double totalLlenado = 0;

	public Jarra(double capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.actualL = capacidadMaxima;
		totalLlenado += capacidadMaxima;
	}

	public void llenar() {
		totalLlenado += (capacidadMaxima - actualL);
		actualL = capacidadMaxima;
	}

	public void volcarEn(Jarra ob1) {
		ob1.actualL += this.actualL;

		if (ob1.actualL - ob1.capacidadMaxima >= 0) {
			this.actualL = ob1.actualL - ob1.capacidadMaxima;
		} else {
			this.actualL = 0;
		}

		ob1.actualL -= this.actualL;
	}

	public void vaciarCompleto() {
		this.actualL = 0;
	}

	@Override
	public String toString() {
		return "Capacidad maxima =" + capacidadMaxima + ", cantidad actual =" + actualL + ", Agua usada para llenar = "
				+ totalLlenado;
	}

}
